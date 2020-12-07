package com.shitouren.core.bean.param.user;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotBlank;

/**
 * @Autho： 王涛
 * @DATE： 2019/11/29 11:35
 */
@Data
public class UserLoginParam {

//    @NotBlank(message = "请输入账号")
//    private String userAccount;//登录账户

    @NotBlank(message = "请输入账户名")
    @ApiModelProperty("账户名")
    private String userAccount;//登录账户名

    @NotBlank(message = "请输入密码")
    @ApiModelProperty("密码")
    private String userPassword;//用户密码

//    @NotBlank(message = "微信的access_token")
//    @ApiModelProperty("微信的access_token")
//    private String access_token;
//
//    @ApiModelProperty("微信的openid")
//    @NotBlank(message = "openid")
//    private String openId;
//
//    @ApiModelProperty("邀请人id")
//    private String invitationId;

//    @ApiModelProperty("用户设备IP")
//    @NotBlank(message = "用户设备IP")
//    private String userIp;

}
