package com.shitouren.core.controller;

import com.shitouren.core.annotation.Access;
import com.shitouren.core.annotation.GetLoginUser;
import com.shitouren.core.autogenerate.bean.Users;
import com.shitouren.core.autogenerate.dao.UsersDao;
import com.shitouren.core.bean.param.SysUserParam;
import com.shitouren.core.bean.param.system.VerificationCodeParam;
import com.shitouren.core.config.redis.CloudRedisTemplate;

import com.shitouren.core.service.*;
import com.shitouren.core.utils.SMSUtils;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.log4j.Log4j2;
import org.apache.commons.lang.RandomStringUtils;
import org.aspectj.bridge.MessageWriter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@Api(value = "系统管理", tags = "系统管理")
@Log4j2
public class SystemController {
    private static Map<String, String> tempMap = new HashMap<>();

    static {
        tempMap.put("real_name_", "【水果世界】终于等到你了！您的手机验证码：%s，有效期5分钟，请勿泄露。如非本人操作，请忽略此短信。 ");
        tempMap.put("forget_pwd_code_", "【水果世界】终于等到你了！您的手机验证码：%s，有效期5分钟，请勿泄露。如非本人操作，请忽略此短信。 ");
        tempMap.put("reg_code_", "【水果世界】终于等到你了！您的手机验证码：%s，有效期5分钟，请勿泄露。如非本人操作，请忽略此短信。");
        tempMap.put("modify_pwd_code_", "【水果世界】终于等到你了！您的手机验证码：%s，有效期5分钟，请勿泄露。如非本人操作，请忽略此短信。");
        tempMap.put("update_trade_pwd_", "【水果世界】您正在修改密码！您的手机验证码：%s，有效期5分钟，请勿泄露。如非本人操作，请忽略此短信。");
    }

    @Autowired
    private CloudRedisTemplate cloudRedisTemplate;

    @PostMapping(value = "/system/get/verification/code")
    @ApiOperation(value = "获取手机验证码")
    @Access(value = false)
    public String getPhoneCode(@Validated VerificationCodeParam param) {

        String code = RandomStringUtils.randomNumeric(6);
        String temp = tempMap.get(param.getType());
        /**
         * 这里需要加发送短信的相关逻辑
         */
        SMSUtils.send(param.getPhone(), String.format(temp, code));

        log.info("手机验证码为：{}，类型为：{}", code, param.getType());
        String key = param.getType() + param.getPhone();
        cloudRedisTemplate.set(key, code, 30 * 60);

        return code;

    }


}