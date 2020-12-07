package com.shitouren.core.autogenerate.bean;

import java.math.BigDecimal;
import java.util.Date;

public class Users {
    /**
     * 用户ID从10001自增长
     */
    private Integer userId;

    /**
     * 头像
     */
    private String headPrtraits;

    /**
     * 账户名
     */
    private String accountname;

    /**
     * 昵称
     */
    private String nickName;

    /**
     * 手机号
     */
    private String phoneNumber;

    /**
     * 密码
     */
    private String passwd;

    /**
     * 等级
     */
    private Integer level;

    /**
     * 交易密码
     */
    private String tradePassWord;

    /**
     * 邀请码图片
     */
    private String qrCodeUrl;

    /**
     * 邀请码
     */
    private String registerCode;

    /**
     * 邀请人Id
     */
    private Integer invitationId;

    /**
     * ADA币
     */
    private BigDecimal adacurrency;

    /**
     * 种子
     */
    private BigDecimal sapling;

    /**
     * 累计收益
     */
    private BigDecimal leijiReward;

    /**
     * 持有资产
     */
    private BigDecimal assetsHeld;

    /**
     * 推荐收益
     */
    private BigDecimal tuijianReward;

    /**
     * 团队收益
     */
    private BigDecimal teamReward;

    /**
     * 活跃值
     */
    private BigDecimal liveness;

    /**
     * 分享值
     */
    private BigDecimal share;

    /**
     * 账号创建时间
     */
    private Date createTime;

    /**
     * 0.未实名,1.已实名
     */
    private Integer realNameType;

    /**
     * 状态：0启用，1禁用
     */
    private String statusId;

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getHeadPrtraits() {
        return headPrtraits;
    }

    public void setHeadPrtraits(String headPrtraits) {
        this.headPrtraits = headPrtraits == null ? null : headPrtraits.trim();
    }

    public String getAccountname() {
        return accountname;
    }

    public void setAccountname(String accountname) {
        this.accountname = accountname == null ? null : accountname.trim();
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName == null ? null : nickName.trim();
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber == null ? null : phoneNumber.trim();
    }

    public String getPasswd() {
        return passwd;
    }

    public void setPasswd(String passwd) {
        this.passwd = passwd == null ? null : passwd.trim();
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public String getTradePassWord() {
        return tradePassWord;
    }

    public void setTradePassWord(String tradePassWord) {
        this.tradePassWord = tradePassWord == null ? null : tradePassWord.trim();
    }

    public String getQrCodeUrl() {
        return qrCodeUrl;
    }

    public void setQrCodeUrl(String qrCodeUrl) {
        this.qrCodeUrl = qrCodeUrl == null ? null : qrCodeUrl.trim();
    }

    public String getRegisterCode() {
        return registerCode;
    }

    public void setRegisterCode(String registerCode) {
        this.registerCode = registerCode == null ? null : registerCode.trim();
    }

    public Integer getInvitationId() {
        return invitationId;
    }

    public void setInvitationId(Integer invitationId) {
        this.invitationId = invitationId;
    }

    public BigDecimal getAdacurrency() {
        return adacurrency;
    }

    public void setAdacurrency(BigDecimal adacurrency) {
        this.adacurrency = adacurrency;
    }

    public BigDecimal getSapling() {
        return sapling;
    }

    public void setSapling(BigDecimal sapling) {
        this.sapling = sapling;
    }

    public BigDecimal getLeijiReward() {
        return leijiReward;
    }

    public void setLeijiReward(BigDecimal leijiReward) {
        this.leijiReward = leijiReward;
    }

    public BigDecimal getAssetsHeld() {
        return assetsHeld;
    }

    public void setAssetsHeld(BigDecimal assetsHeld) {
        this.assetsHeld = assetsHeld;
    }

    public BigDecimal getTuijianReward() {
        return tuijianReward;
    }

    public void setTuijianReward(BigDecimal tuijianReward) {
        this.tuijianReward = tuijianReward;
    }

    public BigDecimal getTeamReward() {
        return teamReward;
    }

    public void setTeamReward(BigDecimal teamReward) {
        this.teamReward = teamReward;
    }

    public BigDecimal getLiveness() {
        return liveness;
    }

    public void setLiveness(BigDecimal liveness) {
        this.liveness = liveness;
    }

    public BigDecimal getShare() {
        return share;
    }

    public void setShare(BigDecimal share) {
        this.share = share;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Integer getRealNameType() {
        return realNameType;
    }

    public void setRealNameType(Integer realNameType) {
        this.realNameType = realNameType;
    }

    public String getStatusId() {
        return statusId;
    }

    public void setStatusId(String statusId) {
        this.statusId = statusId == null ? null : statusId.trim();
    }
}