package com.shitouren.core.config.exception;

/**
 * @Autho： 王涛
 * @DATE： 2019/1/19 9:37
 */
@SuppressWarnings("ALL")
public enum ExceptionConstant {


    处理成功("10000", "处理成功！"),
    参数异常("400", "参数异常"),
    登录失效("401", "登录失效或登录token为空！"),
    签名错误("402", "签名错误！"),
    请求不存在("404", "请求不存在"),
    账号在其他设备登录("403", "账号在其他设备登录"),
    退出失败("405", "退出失败！"),
    没有权限访问("407", "没有权限请求资源，请联系管理员"),
    上传失败("408", "上传失败"),
    请求失败("00001", "请求失败！"),
    服务器错误("00002", "服务器错误！"),
    请求错误("00003", "请求错误"),
    参数解析错误("00004", "请检查参数格式和参数类型"),
    服务不可用("00006", "服务不可用"),

    账户酒滴余额不足("12001", "账户酒滴余额不足"),
    挂单数量应大于最小挂单数量("12002", "挂单数量应大于最小挂单数量"),
    挂单数量应小于最大挂单数量("12000", "挂单数量应小于最大挂单数量"),
    无可用通行证("12003", "无可用通行证"),
    请先进行实名认证("12004", "请先进行实名认证"),
    活跃度不足("12005", "活跃度不足"),
    该手机号码已认证("12006", "该手机号码已认证"),
    通行证数量不足("12007", "通行证数量不足"),
    该账号已实名或正在审核中("12008", "该账号已实名或正在审核中"),
    已成为城市节点或正在审核中("12009", "已成为城市节点或正在审核中"),
    任务重复兑换("12010", "任务已经兑换，请勿重复兑换"),
    高级任务条件未达标("12011", "直推人数、团队人数、交易额度您有一项或多选未达标"),
    点赞任务重复("12012", "今天已点赞3次，请明天继续"),
    设备IP占用("12013", "您的设备IP已被占用，请使用其他设备进行注册"),
    原密码错误("19001", "原密码错误"),
    今日撤单次数超限("13001", "今日撤单次数超限"),
    未设置当前付款方式("13002", "未设置当前付款方式"),
    未设置当前收款方式("13003", "未设置当前收款方式"),
    积分不足已抵扣("13004", "积分不足已抵扣"),
    您已存入过酒窖("13005", "您已存入过酒窖"),
    您的酒滴不足("13006", "您的酒滴不足"),
    直推人数未达到("13007", "直推人数未达到"),
    直推人数或活跃度不足("13008", "直推人数或活跃度不足"),
    此身份已实名不可重复("13009", "此身份已实名不可重复"),


    //---------------------------------账号相关---------------------------------------------//
    获取token失败("110001", "获取token失败，请重新登录"),
    发送短信失败("11002", "发送短信失败"),
    手机验证码错误("11003", "手机验证码错误"),
    更换账号("11004", "更换账号，请重新登录"),
    账号不存在("11005", "账号不存在"),
    账户名不存在("21005", "账户名不存在"),
    账号或密码错误("11006", "账号或密码错误"),
    账号已被禁用("11007", "账号已被禁用"),
    账号已存在("11008", "账号已存在，可以直接登录"),
    账户名已存在("21008", "账号已存在，账户名已存在"),
    两次密码不一致("11006", "两次密码不一致"),
    请前往APP注册或实名("11009", "请前往APP注册或实名"),
    点赞任务已做完("11010", "这个任务已经被别人做完啦"),
    积分不足("10011", "积分不足"),
    该购物车持有数量已达上限("10012", "该购物车持有数量已达上限"),
    购物车数量不足("10013", "购物车数量不足"),
    今日任务已完成("10014", "今日任务已完成"),
    任务不存在("10015", "该任务不存在"),
    酒滴不足("10016", "酒滴不足"),
    未实名不能兑换("10030", "未实名不能兑换"),
    该酒坊采购已达上限("10017", "该酒坊采购已达上限"),
    直推活跃未达到("10019", "直推活跃未达到"),
    求购单价区间不符合("10016", "求购单价应符合单价区间"),
    交易密码错误("10018", "交易密码错误"),
    实名未通过("10025", "实名审核未通过");


    ExceptionConstant(String code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public String getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    private String code;
    private String msg;

}