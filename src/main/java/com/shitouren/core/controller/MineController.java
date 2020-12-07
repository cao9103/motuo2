package com.shitouren.core.controller;

import com.shitouren.core.annotation.Access;
import com.shitouren.core.annotation.GetLoginUser;
import com.shitouren.core.autogenerate.dao.UsersDao;
import com.shitouren.core.bean.param.SysUserParam;
import com.shitouren.core.service.MineService;
import com.shitouren.core.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@Api(value = "我的", tags = "我的")
public class MineController {
    @Autowired
    MineService mineService;
    @Autowired
    UserService userService;
    @Autowired(required = false)
    UsersDao usersDao;

    @PostMapping("/mine/mine")
    @ApiOperation("我的信息")
    @GetLoginUser
    @Access
    public Map<String, Object> mine(SysUserParam sysUserParam) {
        Integer userId = sysUserParam.getLogUserPid();
        return mineService.getMineInfo(userId);
    }

//    @PostMapping("/mine/addrealname")
//    @ApiOperation("添加实名认证")
//    @GetLoginUser
//    @Access
//    public void addRealName(SysUserParam userParam, RealNameParam realNameParam) {
//        Integer userId = userParam.getLogUserPid();
//        realNameService.addRealName(realNameParam, userId);
//    }

//    @PostMapping("/mine/getrealname")
//    @ApiOperation("获取实名认证信息")
//    @GetLoginUser
//    @Access
//    public RealNameVo getRealName(SysUserParam userParam) {
//        return realNameService.getRealName(userParam);
//    }


//    @PostMapping("/mine/updateUserInfo")
//    @ApiOperation("修改头像+昵称+性别+城市+个性签名")
//    @GetLoginUser
//    @Access
//    @ApiImplicitParams({
//            @ApiImplicitParam(name = "avatar", value = "头像"),
//            @ApiImplicitParam(name = "nickname", value = "昵称"),
//            @ApiImplicitParam(name = "gender", value = "性别(传值：1.男,2.女)"),
//            @ApiImplicitParam(name = "autograph", value = "个性签名")
//    })
//    public void updateAvatar(SysUserParam sysUserParam, String avatar, String nickname, String gender, @Valid CityParam param, String autograph) {
//        Integer userId = sysUserParam.getLogUserPid();
//        if (!StringUtils.isEmpty(avatar)) {
//            userService.updateAvatar(userId, avatar);
//        }
//        if (!StringUtils.isEmpty(nickname)) {
//            userService.updateNickname(userId, nickname);
//        }
//        if (!StringUtils.isEmpty(gender)) {
//            userService.updategender(userId, gender);
//        }
//        if (!StringUtils.isEmpty(param)) {
//            userService.updatecity(userId, param);
//        }
//        if (!StringUtils.isEmpty(autograph)) {
//            userService.updateautograph(userId, autograph);
//        }
//    }


//    @PostMapping("/mine/inviteInfo")
//    @ApiOperation("获取邀请信息")
//    @GetLoginUser
//    @Access
//    public Map<String, Object> inviteInfo(SysUserParam userParam) {
//        return mineService.getInviteInfo(userParam);
//    }

//    @PostMapping("/mine/myTaem")
//    @ApiOperation("我的团队")
//    @GetLoginUser
//    @Access
//    public Map<String, Object> myTaem(SysUserParam userParam) {
//        return mineService.myTeam(userParam);
//    }

    @PostMapping("/mine/updatetradepassword")
    @ApiOperation("修改交易密码")
    @GetLoginUser
    @Access
    public void updateTradePassWord(SysUserParam sysUserParam, String phone, String code, String newTradePassWord, String newTradePassWord2) {
        userService.updateTradePassWord(sysUserParam, phone, code, newTradePassWord, newTradePassWord2);
    }


//    @PostMapping("/realName/pass")
//    @ApiOperation("实名审核通过")
//    @Access(value = false)
//    public void myCart(Integer realNameId) {
//        mineService.realNamePass(realNameId);
//    }


//    @PostMapping("/mine/massage")
//    @ApiOperation("系统消息")
//    @Access(value = false)
//    public List getMassageList() {
//        return massageService.Massagelist();
//    }
//
//    @PostMapping("/mine/massagedetails")
//    @ApiOperation("系统消息详情")
//    @Access(value = false)
//    public Map massagedetails(int id) {
//        return massageService.Massagedetails(id);
//    }

}
