package com.shitouren.core.service;


import com.shitouren.core.autogenerate.bean.*;
import com.shitouren.core.autogenerate.dao.UsersDao;
import com.shitouren.core.bean.eums.EumUser;
import com.shitouren.core.bean.eums.ImgEnum;
import com.shitouren.core.bean.param.SysUserParam;
import com.shitouren.core.bean.param.user.UserLoginParam;
import com.shitouren.core.bean.param.user.UserRegisterParam;
import com.shitouren.core.bean.param.user.UserRestPwdParam;
import com.shitouren.core.config.exception.CloudException;
import com.shitouren.core.config.exception.ExceptionConstant;
import com.shitouren.core.config.redis.CloudRedisTemplate;
import com.shitouren.core.utils.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.io.File;
import java.util.*;

/**
 * @Autho： 王涛
 * @DATE： 2020/8/1 21:53
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class UserServiceImpl implements UserService {

    @Autowired(required = false)
    UsersDao usersDao;
    @Autowired
    private CloudRedisTemplate cloudRedisTemplate;

    @Override
    public Users userLogin(UserLoginParam param) {
        UsersExample query = new UsersExample();
//        query.createCriteria().andPhoneNumberEqualTo(param.getUserAccount());
        query.createCriteria().andAccountnameEqualTo(param.getUserAccount());
        List<Users> userList = usersDao.selectByExample(query);
        if (!ListUtil.isValidateList(userList)) {
            throw new CloudException(ExceptionConstant.账户名不存在);
        }
        Users user = userList.get(0);
        if (!user.getPasswd().equals(MD5Util.MD5Encode(param.getUserPassword()))) {
            throw new CloudException(ExceptionConstant.账号或密码错误);
        }
        if (EumUser.UserStatus.禁用.getValue() == Integer.parseInt(user.getStatusId())) {
            throw new CloudException(ExceptionConstant.账号已被禁用);
        }
//        user.setUserIp(param.getUserIp());
        usersDao.updateByPrimaryKeySelective(user);
        return user;
    }

    @Override
    public void userRegister(UserRegisterParam param) {
        //校验密码
        if (!param.getPassword().equals(param.getPassword2())) {
            throw new CloudException(ExceptionConstant.两次密码不一致);
        }
        if (!param.getTradePassword().equals(param.getTradePassword2())) {
            throw new CloudException(ExceptionConstant.两次密码不一致);
        }
        //验证码校验
        String loginCodekey = EumUser.CellVerifyCodeType.注册.getValue() + param.getPhone();
        String str = cloudRedisTemplate.get(loginCodekey);
        if (!StringUtil.isValidStr(str) || !param.getCode().equals(str)) {
            throw new CloudException(ExceptionConstant.手机验证码错误);
        }
        //删除已用验证码
        cloudRedisTemplate.delete(loginCodekey);
        UsersExample query = new UsersExample();
//        query.createCriteria().andPhoneNumberEqualTo(param.getPhone());
        query.createCriteria().andAccountnameEqualTo(param.getAccountname());
        if (usersDao.countByExample(query) != 0) {
            List<Users> userList = usersDao.selectByExample(query);
            if (ListUtil.isValidateList(userList)) {
                throw new CloudException(ExceptionConstant.账户名已存在);
            }
        }
        /**
         * 注册用户
         */
        Users user = new Users();
        user.setHeadPrtraits("mrtx.jpg");//头像
        user.setAccountname(param.getAccountname());//账户名
        user.setNickName("无名氏");//昵称
        user.setPhoneNumber(param.getPhone());//手机号
        user.setPasswd(MD5Util.MD5Encode(param.getPassword()));//密码
        user.setTradePassWord(MD5Util.MD5Encode(param.getTradePassword()));//交易密码
        user.setRegisterCode(createRegisterCode());//邀请码
        System.out.println("user.getRegisterCode()=" + user.getRegisterCode());
        user.setQrCodeUrl(createUserShareImg(user.getRegisterCode()));
        user.setCreateTime(new Date());//创建时间
        //查询激活码对应的用户
        if (StringUtil.isValidStr(param.getRegisterCode())) {//邀请码不为空
            query = new UsersExample();
            query.createCriteria().andRegisterCodeEqualTo(param.getRegisterCode());
            List<Users> registerCodeUserList = usersDao.selectByExample(query);
            if (ListUtil.isValidateList(registerCodeUserList)) {
                user.setInvitationId(registerCodeUserList.get(0).getUserId());//邀请人id
            }
        }
        usersDao.insertSelective(user);//创建用户
//        //创建团队
//        if (StringUtil.isValidStr(param.getRegisterCode())) {
//
//        }
    }

    @Override
    public void userRestPwd(UserRestPwdParam param) {
        //校验密码
        if (!param.getPassword().equals(param.getPassword2())) {
            throw new CloudException(ExceptionConstant.两次密码不一致);
        }
        //验证码校验
        String loginCodekey = EumUser.CellVerifyCodeType.忘记密码.getValue() + param.getPhone();
        String str = cloudRedisTemplate.get(loginCodekey);
        if (!StringUtil.isValidStr(str) || !param.getCode().equals(str)) {
            throw new CloudException(ExceptionConstant.手机验证码错误);
        }
        //删除已用验证码
        cloudRedisTemplate.delete(loginCodekey);
        UsersExample query = new UsersExample();
        query.createCriteria().andPhoneNumberEqualTo(param.getPhone());
        List<Users> userList = usersDao.selectByExample(query);
        if (!ListUtil.isValidateList(userList)) {
            throw new CloudException(ExceptionConstant.账号不存在);
        }
        Users user = userList.get(0);
        user.setPasswd(MD5Util.MD5Encode(param.getPassword()));
        usersDao.updateByPrimaryKeySelective(user);
    }

    /**
     * 创建邀请码
     */
    private String createRegisterCode() {
        String idKey = "incr_register_code";
        //如果key 不存在 初始化一个值，从10000000开始
        if (!cloudRedisTemplate.hasKey(idKey)) {
            cloudRedisTemplate.set(idKey, 10000000);
        }
        return cloudRedisTemplate.incr(idKey, 1) + "";
    }

    public void updateAvatar(Integer userId, String avatar) {
        Users user = usersDao.selectByPrimaryKey(userId);
        user.setHeadPrtraits(avatar);
        usersDao.updateByPrimaryKeySelective(user);
    }

    /**
     * 生成邀请二维码
     *
     * @param registerCode
     * @return
     */
    public String createUserShareImg(String registerCode) {
        String fileName = "InvQRCode" + registerCode + ".jpg";
        File QrCodeFile = new File(ImgEnum.QrCode.getPath() + fileName);//生成图片位置
        String url = "http://192.168.1.132:8600/web/#/?registerCode=" + registerCode;
        boolean falg = QRcode.CreatQRCode(QrCodeFile, 200, 200, url);
        if (falg) {
            return ImgEnum.QrCode.getSrc() + fileName;
        } else {
            return null;
        }
    }

    @Override
    public void createimg() {
        for (int i = 10000001; i < 10000121; i++) {
            String fileName = "InvQRCode" + i + ".jpg";
            File QrCodeFile = new File(ImgEnum.QrCode.getPath() + fileName);//生成图片位置
            String url = "http://47.242.152.9:8600/web/#/?registerCode=" + i;
            boolean falg = QRcode.CreatQRCode(QrCodeFile, 200, 200, url);
        }
    }

    /**
     * 修改交易密码
     *
     * @param sysUserParam
     * @param phone
     * @param code
     * @param newTradePassWord
     * @param newTradePassWord2
     */
    public void updateTradePassWord(SysUserParam sysUserParam, String phone, String code, String newTradePassWord, String newTradePassWord2) {
        Users user = usersDao.selectByPrimaryKey(sysUserParam.getLogUserPid());
        if (!newTradePassWord.equals(newTradePassWord2)) {
            throw new CloudException(ExceptionConstant.两次密码不一致);
        }
        //验证码校验
        String loginCodekey = EumUser.CellVerifyCodeType.交易密码.getValue() + phone;
        String str = cloudRedisTemplate.get(loginCodekey);
        if (!StringUtil.isValidStr(str) || !code.equals(str)) {
            throw new CloudException(ExceptionConstant.手机验证码错误);
        }
        user.setTradePassWord(MD5Util.MD5Encode(newTradePassWord));
        usersDao.updateByPrimaryKeySelective(user);
    }

    public void updateNickname(Integer userId, String nickname) {
        Users user = usersDao.selectByPrimaryKey(userId);
        user.setNickName(nickname);
        usersDao.updateByPrimaryKeySelective(user);
    }

}
