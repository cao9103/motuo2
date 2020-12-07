package com.shitouren.core.autogenerate.bean;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class UsersExample {
    /**
     * sg_users
     */
    protected String orderByClause;

    /**
     * sg_users
     */
    protected boolean distinct;

    /**
     * sg_users
     */
    protected List<Criteria> oredCriteria;

    /**
     * sg_users
     */
    protected Integer pageNo = 1;

    /**
     * sg_users
     */
    protected Integer startRow;

    /**
     * sg_users
     */
    protected Integer pageSize = 10;

    public UsersExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    public void setPageNo(Integer pageNo) {
        this.pageNo=pageNo;
        this.startRow = (pageNo-1)*this.pageSize;
    }

    public Integer getPageNo() {
        return pageNo;
    }

    public void setStartRow(Integer startRow) {
        this.startRow=startRow;
    }

    public Integer getStartRow() {
        return startRow;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize=pageSize;
        this.startRow = (pageNo-1)*this.pageSize;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    /**
     * sg_users 
     */
    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andUserIdIsNull() {
            addCriterion("user_id is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("user_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(Integer value) {
            addCriterion("user_id =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(Integer value) {
            addCriterion("user_id <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(Integer value) {
            addCriterion("user_id >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("user_id >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(Integer value) {
            addCriterion("user_id <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(Integer value) {
            addCriterion("user_id <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<Integer> values) {
            addCriterion("user_id in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<Integer> values) {
            addCriterion("user_id not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(Integer value1, Integer value2) {
            addCriterion("user_id between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(Integer value1, Integer value2) {
            addCriterion("user_id not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andHeadPrtraitsIsNull() {
            addCriterion("head_prtraits is null");
            return (Criteria) this;
        }

        public Criteria andHeadPrtraitsIsNotNull() {
            addCriterion("head_prtraits is not null");
            return (Criteria) this;
        }

        public Criteria andHeadPrtraitsEqualTo(String value) {
            addCriterion("head_prtraits =", value, "headPrtraits");
            return (Criteria) this;
        }

        public Criteria andHeadPrtraitsNotEqualTo(String value) {
            addCriterion("head_prtraits <>", value, "headPrtraits");
            return (Criteria) this;
        }

        public Criteria andHeadPrtraitsGreaterThan(String value) {
            addCriterion("head_prtraits >", value, "headPrtraits");
            return (Criteria) this;
        }

        public Criteria andHeadPrtraitsGreaterThanOrEqualTo(String value) {
            addCriterion("head_prtraits >=", value, "headPrtraits");
            return (Criteria) this;
        }

        public Criteria andHeadPrtraitsLessThan(String value) {
            addCriterion("head_prtraits <", value, "headPrtraits");
            return (Criteria) this;
        }

        public Criteria andHeadPrtraitsLessThanOrEqualTo(String value) {
            addCriterion("head_prtraits <=", value, "headPrtraits");
            return (Criteria) this;
        }

        public Criteria andHeadPrtraitsLike(String value) {
            addCriterion("head_prtraits like", value, "headPrtraits");
            return (Criteria) this;
        }

        public Criteria andHeadPrtraitsNotLike(String value) {
            addCriterion("head_prtraits not like", value, "headPrtraits");
            return (Criteria) this;
        }

        public Criteria andHeadPrtraitsIn(List<String> values) {
            addCriterion("head_prtraits in", values, "headPrtraits");
            return (Criteria) this;
        }

        public Criteria andHeadPrtraitsNotIn(List<String> values) {
            addCriterion("head_prtraits not in", values, "headPrtraits");
            return (Criteria) this;
        }

        public Criteria andHeadPrtraitsBetween(String value1, String value2) {
            addCriterion("head_prtraits between", value1, value2, "headPrtraits");
            return (Criteria) this;
        }

        public Criteria andHeadPrtraitsNotBetween(String value1, String value2) {
            addCriterion("head_prtraits not between", value1, value2, "headPrtraits");
            return (Criteria) this;
        }

        public Criteria andAccountnameIsNull() {
            addCriterion("accountname is null");
            return (Criteria) this;
        }

        public Criteria andAccountnameIsNotNull() {
            addCriterion("accountname is not null");
            return (Criteria) this;
        }

        public Criteria andAccountnameEqualTo(String value) {
            addCriterion("accountname =", value, "accountname");
            return (Criteria) this;
        }

        public Criteria andAccountnameNotEqualTo(String value) {
            addCriterion("accountname <>", value, "accountname");
            return (Criteria) this;
        }

        public Criteria andAccountnameGreaterThan(String value) {
            addCriterion("accountname >", value, "accountname");
            return (Criteria) this;
        }

        public Criteria andAccountnameGreaterThanOrEqualTo(String value) {
            addCriterion("accountname >=", value, "accountname");
            return (Criteria) this;
        }

        public Criteria andAccountnameLessThan(String value) {
            addCriterion("accountname <", value, "accountname");
            return (Criteria) this;
        }

        public Criteria andAccountnameLessThanOrEqualTo(String value) {
            addCriterion("accountname <=", value, "accountname");
            return (Criteria) this;
        }

        public Criteria andAccountnameLike(String value) {
            addCriterion("accountname like", value, "accountname");
            return (Criteria) this;
        }

        public Criteria andAccountnameNotLike(String value) {
            addCriterion("accountname not like", value, "accountname");
            return (Criteria) this;
        }

        public Criteria andAccountnameIn(List<String> values) {
            addCriterion("accountname in", values, "accountname");
            return (Criteria) this;
        }

        public Criteria andAccountnameNotIn(List<String> values) {
            addCriterion("accountname not in", values, "accountname");
            return (Criteria) this;
        }

        public Criteria andAccountnameBetween(String value1, String value2) {
            addCriterion("accountname between", value1, value2, "accountname");
            return (Criteria) this;
        }

        public Criteria andAccountnameNotBetween(String value1, String value2) {
            addCriterion("accountname not between", value1, value2, "accountname");
            return (Criteria) this;
        }

        public Criteria andNickNameIsNull() {
            addCriterion("nick_name is null");
            return (Criteria) this;
        }

        public Criteria andNickNameIsNotNull() {
            addCriterion("nick_name is not null");
            return (Criteria) this;
        }

        public Criteria andNickNameEqualTo(String value) {
            addCriterion("nick_name =", value, "nickName");
            return (Criteria) this;
        }

        public Criteria andNickNameNotEqualTo(String value) {
            addCriterion("nick_name <>", value, "nickName");
            return (Criteria) this;
        }

        public Criteria andNickNameGreaterThan(String value) {
            addCriterion("nick_name >", value, "nickName");
            return (Criteria) this;
        }

        public Criteria andNickNameGreaterThanOrEqualTo(String value) {
            addCriterion("nick_name >=", value, "nickName");
            return (Criteria) this;
        }

        public Criteria andNickNameLessThan(String value) {
            addCriterion("nick_name <", value, "nickName");
            return (Criteria) this;
        }

        public Criteria andNickNameLessThanOrEqualTo(String value) {
            addCriterion("nick_name <=", value, "nickName");
            return (Criteria) this;
        }

        public Criteria andNickNameLike(String value) {
            addCriterion("nick_name like", value, "nickName");
            return (Criteria) this;
        }

        public Criteria andNickNameNotLike(String value) {
            addCriterion("nick_name not like", value, "nickName");
            return (Criteria) this;
        }

        public Criteria andNickNameIn(List<String> values) {
            addCriterion("nick_name in", values, "nickName");
            return (Criteria) this;
        }

        public Criteria andNickNameNotIn(List<String> values) {
            addCriterion("nick_name not in", values, "nickName");
            return (Criteria) this;
        }

        public Criteria andNickNameBetween(String value1, String value2) {
            addCriterion("nick_name between", value1, value2, "nickName");
            return (Criteria) this;
        }

        public Criteria andNickNameNotBetween(String value1, String value2) {
            addCriterion("nick_name not between", value1, value2, "nickName");
            return (Criteria) this;
        }

        public Criteria andPhoneNumberIsNull() {
            addCriterion("phone_number is null");
            return (Criteria) this;
        }

        public Criteria andPhoneNumberIsNotNull() {
            addCriterion("phone_number is not null");
            return (Criteria) this;
        }

        public Criteria andPhoneNumberEqualTo(String value) {
            addCriterion("phone_number =", value, "phoneNumber");
            return (Criteria) this;
        }

        public Criteria andPhoneNumberNotEqualTo(String value) {
            addCriterion("phone_number <>", value, "phoneNumber");
            return (Criteria) this;
        }

        public Criteria andPhoneNumberGreaterThan(String value) {
            addCriterion("phone_number >", value, "phoneNumber");
            return (Criteria) this;
        }

        public Criteria andPhoneNumberGreaterThanOrEqualTo(String value) {
            addCriterion("phone_number >=", value, "phoneNumber");
            return (Criteria) this;
        }

        public Criteria andPhoneNumberLessThan(String value) {
            addCriterion("phone_number <", value, "phoneNumber");
            return (Criteria) this;
        }

        public Criteria andPhoneNumberLessThanOrEqualTo(String value) {
            addCriterion("phone_number <=", value, "phoneNumber");
            return (Criteria) this;
        }

        public Criteria andPhoneNumberLike(String value) {
            addCriterion("phone_number like", value, "phoneNumber");
            return (Criteria) this;
        }

        public Criteria andPhoneNumberNotLike(String value) {
            addCriterion("phone_number not like", value, "phoneNumber");
            return (Criteria) this;
        }

        public Criteria andPhoneNumberIn(List<String> values) {
            addCriterion("phone_number in", values, "phoneNumber");
            return (Criteria) this;
        }

        public Criteria andPhoneNumberNotIn(List<String> values) {
            addCriterion("phone_number not in", values, "phoneNumber");
            return (Criteria) this;
        }

        public Criteria andPhoneNumberBetween(String value1, String value2) {
            addCriterion("phone_number between", value1, value2, "phoneNumber");
            return (Criteria) this;
        }

        public Criteria andPhoneNumberNotBetween(String value1, String value2) {
            addCriterion("phone_number not between", value1, value2, "phoneNumber");
            return (Criteria) this;
        }

        public Criteria andPasswdIsNull() {
            addCriterion("passwd is null");
            return (Criteria) this;
        }

        public Criteria andPasswdIsNotNull() {
            addCriterion("passwd is not null");
            return (Criteria) this;
        }

        public Criteria andPasswdEqualTo(String value) {
            addCriterion("passwd =", value, "passwd");
            return (Criteria) this;
        }

        public Criteria andPasswdNotEqualTo(String value) {
            addCriterion("passwd <>", value, "passwd");
            return (Criteria) this;
        }

        public Criteria andPasswdGreaterThan(String value) {
            addCriterion("passwd >", value, "passwd");
            return (Criteria) this;
        }

        public Criteria andPasswdGreaterThanOrEqualTo(String value) {
            addCriterion("passwd >=", value, "passwd");
            return (Criteria) this;
        }

        public Criteria andPasswdLessThan(String value) {
            addCriterion("passwd <", value, "passwd");
            return (Criteria) this;
        }

        public Criteria andPasswdLessThanOrEqualTo(String value) {
            addCriterion("passwd <=", value, "passwd");
            return (Criteria) this;
        }

        public Criteria andPasswdLike(String value) {
            addCriterion("passwd like", value, "passwd");
            return (Criteria) this;
        }

        public Criteria andPasswdNotLike(String value) {
            addCriterion("passwd not like", value, "passwd");
            return (Criteria) this;
        }

        public Criteria andPasswdIn(List<String> values) {
            addCriterion("passwd in", values, "passwd");
            return (Criteria) this;
        }

        public Criteria andPasswdNotIn(List<String> values) {
            addCriterion("passwd not in", values, "passwd");
            return (Criteria) this;
        }

        public Criteria andPasswdBetween(String value1, String value2) {
            addCriterion("passwd between", value1, value2, "passwd");
            return (Criteria) this;
        }

        public Criteria andPasswdNotBetween(String value1, String value2) {
            addCriterion("passwd not between", value1, value2, "passwd");
            return (Criteria) this;
        }

        public Criteria andLevelIsNull() {
            addCriterion("level is null");
            return (Criteria) this;
        }

        public Criteria andLevelIsNotNull() {
            addCriterion("level is not null");
            return (Criteria) this;
        }

        public Criteria andLevelEqualTo(Integer value) {
            addCriterion("level =", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelNotEqualTo(Integer value) {
            addCriterion("level <>", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelGreaterThan(Integer value) {
            addCriterion("level >", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelGreaterThanOrEqualTo(Integer value) {
            addCriterion("level >=", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelLessThan(Integer value) {
            addCriterion("level <", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelLessThanOrEqualTo(Integer value) {
            addCriterion("level <=", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelIn(List<Integer> values) {
            addCriterion("level in", values, "level");
            return (Criteria) this;
        }

        public Criteria andLevelNotIn(List<Integer> values) {
            addCriterion("level not in", values, "level");
            return (Criteria) this;
        }

        public Criteria andLevelBetween(Integer value1, Integer value2) {
            addCriterion("level between", value1, value2, "level");
            return (Criteria) this;
        }

        public Criteria andLevelNotBetween(Integer value1, Integer value2) {
            addCriterion("level not between", value1, value2, "level");
            return (Criteria) this;
        }

        public Criteria andTradePassWordIsNull() {
            addCriterion("trade_pass_word is null");
            return (Criteria) this;
        }

        public Criteria andTradePassWordIsNotNull() {
            addCriterion("trade_pass_word is not null");
            return (Criteria) this;
        }

        public Criteria andTradePassWordEqualTo(String value) {
            addCriterion("trade_pass_word =", value, "tradePassWord");
            return (Criteria) this;
        }

        public Criteria andTradePassWordNotEqualTo(String value) {
            addCriterion("trade_pass_word <>", value, "tradePassWord");
            return (Criteria) this;
        }

        public Criteria andTradePassWordGreaterThan(String value) {
            addCriterion("trade_pass_word >", value, "tradePassWord");
            return (Criteria) this;
        }

        public Criteria andTradePassWordGreaterThanOrEqualTo(String value) {
            addCriterion("trade_pass_word >=", value, "tradePassWord");
            return (Criteria) this;
        }

        public Criteria andTradePassWordLessThan(String value) {
            addCriterion("trade_pass_word <", value, "tradePassWord");
            return (Criteria) this;
        }

        public Criteria andTradePassWordLessThanOrEqualTo(String value) {
            addCriterion("trade_pass_word <=", value, "tradePassWord");
            return (Criteria) this;
        }

        public Criteria andTradePassWordLike(String value) {
            addCriterion("trade_pass_word like", value, "tradePassWord");
            return (Criteria) this;
        }

        public Criteria andTradePassWordNotLike(String value) {
            addCriterion("trade_pass_word not like", value, "tradePassWord");
            return (Criteria) this;
        }

        public Criteria andTradePassWordIn(List<String> values) {
            addCriterion("trade_pass_word in", values, "tradePassWord");
            return (Criteria) this;
        }

        public Criteria andTradePassWordNotIn(List<String> values) {
            addCriterion("trade_pass_word not in", values, "tradePassWord");
            return (Criteria) this;
        }

        public Criteria andTradePassWordBetween(String value1, String value2) {
            addCriterion("trade_pass_word between", value1, value2, "tradePassWord");
            return (Criteria) this;
        }

        public Criteria andTradePassWordNotBetween(String value1, String value2) {
            addCriterion("trade_pass_word not between", value1, value2, "tradePassWord");
            return (Criteria) this;
        }

        public Criteria andQrCodeUrlIsNull() {
            addCriterion("qr_code_url is null");
            return (Criteria) this;
        }

        public Criteria andQrCodeUrlIsNotNull() {
            addCriterion("qr_code_url is not null");
            return (Criteria) this;
        }

        public Criteria andQrCodeUrlEqualTo(String value) {
            addCriterion("qr_code_url =", value, "qrCodeUrl");
            return (Criteria) this;
        }

        public Criteria andQrCodeUrlNotEqualTo(String value) {
            addCriterion("qr_code_url <>", value, "qrCodeUrl");
            return (Criteria) this;
        }

        public Criteria andQrCodeUrlGreaterThan(String value) {
            addCriterion("qr_code_url >", value, "qrCodeUrl");
            return (Criteria) this;
        }

        public Criteria andQrCodeUrlGreaterThanOrEqualTo(String value) {
            addCriterion("qr_code_url >=", value, "qrCodeUrl");
            return (Criteria) this;
        }

        public Criteria andQrCodeUrlLessThan(String value) {
            addCriterion("qr_code_url <", value, "qrCodeUrl");
            return (Criteria) this;
        }

        public Criteria andQrCodeUrlLessThanOrEqualTo(String value) {
            addCriterion("qr_code_url <=", value, "qrCodeUrl");
            return (Criteria) this;
        }

        public Criteria andQrCodeUrlLike(String value) {
            addCriterion("qr_code_url like", value, "qrCodeUrl");
            return (Criteria) this;
        }

        public Criteria andQrCodeUrlNotLike(String value) {
            addCriterion("qr_code_url not like", value, "qrCodeUrl");
            return (Criteria) this;
        }

        public Criteria andQrCodeUrlIn(List<String> values) {
            addCriterion("qr_code_url in", values, "qrCodeUrl");
            return (Criteria) this;
        }

        public Criteria andQrCodeUrlNotIn(List<String> values) {
            addCriterion("qr_code_url not in", values, "qrCodeUrl");
            return (Criteria) this;
        }

        public Criteria andQrCodeUrlBetween(String value1, String value2) {
            addCriterion("qr_code_url between", value1, value2, "qrCodeUrl");
            return (Criteria) this;
        }

        public Criteria andQrCodeUrlNotBetween(String value1, String value2) {
            addCriterion("qr_code_url not between", value1, value2, "qrCodeUrl");
            return (Criteria) this;
        }

        public Criteria andRegisterCodeIsNull() {
            addCriterion("register_code is null");
            return (Criteria) this;
        }

        public Criteria andRegisterCodeIsNotNull() {
            addCriterion("register_code is not null");
            return (Criteria) this;
        }

        public Criteria andRegisterCodeEqualTo(String value) {
            addCriterion("register_code =", value, "registerCode");
            return (Criteria) this;
        }

        public Criteria andRegisterCodeNotEqualTo(String value) {
            addCriterion("register_code <>", value, "registerCode");
            return (Criteria) this;
        }

        public Criteria andRegisterCodeGreaterThan(String value) {
            addCriterion("register_code >", value, "registerCode");
            return (Criteria) this;
        }

        public Criteria andRegisterCodeGreaterThanOrEqualTo(String value) {
            addCriterion("register_code >=", value, "registerCode");
            return (Criteria) this;
        }

        public Criteria andRegisterCodeLessThan(String value) {
            addCriterion("register_code <", value, "registerCode");
            return (Criteria) this;
        }

        public Criteria andRegisterCodeLessThanOrEqualTo(String value) {
            addCriterion("register_code <=", value, "registerCode");
            return (Criteria) this;
        }

        public Criteria andRegisterCodeLike(String value) {
            addCriterion("register_code like", value, "registerCode");
            return (Criteria) this;
        }

        public Criteria andRegisterCodeNotLike(String value) {
            addCriterion("register_code not like", value, "registerCode");
            return (Criteria) this;
        }

        public Criteria andRegisterCodeIn(List<String> values) {
            addCriterion("register_code in", values, "registerCode");
            return (Criteria) this;
        }

        public Criteria andRegisterCodeNotIn(List<String> values) {
            addCriterion("register_code not in", values, "registerCode");
            return (Criteria) this;
        }

        public Criteria andRegisterCodeBetween(String value1, String value2) {
            addCriterion("register_code between", value1, value2, "registerCode");
            return (Criteria) this;
        }

        public Criteria andRegisterCodeNotBetween(String value1, String value2) {
            addCriterion("register_code not between", value1, value2, "registerCode");
            return (Criteria) this;
        }

        public Criteria andInvitationIdIsNull() {
            addCriterion("invitation_id is null");
            return (Criteria) this;
        }

        public Criteria andInvitationIdIsNotNull() {
            addCriterion("invitation_id is not null");
            return (Criteria) this;
        }

        public Criteria andInvitationIdEqualTo(Integer value) {
            addCriterion("invitation_id =", value, "invitationId");
            return (Criteria) this;
        }

        public Criteria andInvitationIdNotEqualTo(Integer value) {
            addCriterion("invitation_id <>", value, "invitationId");
            return (Criteria) this;
        }

        public Criteria andInvitationIdGreaterThan(Integer value) {
            addCriterion("invitation_id >", value, "invitationId");
            return (Criteria) this;
        }

        public Criteria andInvitationIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("invitation_id >=", value, "invitationId");
            return (Criteria) this;
        }

        public Criteria andInvitationIdLessThan(Integer value) {
            addCriterion("invitation_id <", value, "invitationId");
            return (Criteria) this;
        }

        public Criteria andInvitationIdLessThanOrEqualTo(Integer value) {
            addCriterion("invitation_id <=", value, "invitationId");
            return (Criteria) this;
        }

        public Criteria andInvitationIdIn(List<Integer> values) {
            addCriterion("invitation_id in", values, "invitationId");
            return (Criteria) this;
        }

        public Criteria andInvitationIdNotIn(List<Integer> values) {
            addCriterion("invitation_id not in", values, "invitationId");
            return (Criteria) this;
        }

        public Criteria andInvitationIdBetween(Integer value1, Integer value2) {
            addCriterion("invitation_id between", value1, value2, "invitationId");
            return (Criteria) this;
        }

        public Criteria andInvitationIdNotBetween(Integer value1, Integer value2) {
            addCriterion("invitation_id not between", value1, value2, "invitationId");
            return (Criteria) this;
        }

        public Criteria andAdacurrencyIsNull() {
            addCriterion("ADAcurrency is null");
            return (Criteria) this;
        }

        public Criteria andAdacurrencyIsNotNull() {
            addCriterion("ADAcurrency is not null");
            return (Criteria) this;
        }

        public Criteria andAdacurrencyEqualTo(BigDecimal value) {
            addCriterion("ADAcurrency =", value, "adacurrency");
            return (Criteria) this;
        }

        public Criteria andAdacurrencyNotEqualTo(BigDecimal value) {
            addCriterion("ADAcurrency <>", value, "adacurrency");
            return (Criteria) this;
        }

        public Criteria andAdacurrencyGreaterThan(BigDecimal value) {
            addCriterion("ADAcurrency >", value, "adacurrency");
            return (Criteria) this;
        }

        public Criteria andAdacurrencyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("ADAcurrency >=", value, "adacurrency");
            return (Criteria) this;
        }

        public Criteria andAdacurrencyLessThan(BigDecimal value) {
            addCriterion("ADAcurrency <", value, "adacurrency");
            return (Criteria) this;
        }

        public Criteria andAdacurrencyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("ADAcurrency <=", value, "adacurrency");
            return (Criteria) this;
        }

        public Criteria andAdacurrencyIn(List<BigDecimal> values) {
            addCriterion("ADAcurrency in", values, "adacurrency");
            return (Criteria) this;
        }

        public Criteria andAdacurrencyNotIn(List<BigDecimal> values) {
            addCriterion("ADAcurrency not in", values, "adacurrency");
            return (Criteria) this;
        }

        public Criteria andAdacurrencyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ADAcurrency between", value1, value2, "adacurrency");
            return (Criteria) this;
        }

        public Criteria andAdacurrencyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ADAcurrency not between", value1, value2, "adacurrency");
            return (Criteria) this;
        }

        public Criteria andSaplingIsNull() {
            addCriterion("sapling is null");
            return (Criteria) this;
        }

        public Criteria andSaplingIsNotNull() {
            addCriterion("sapling is not null");
            return (Criteria) this;
        }

        public Criteria andSaplingEqualTo(BigDecimal value) {
            addCriterion("sapling =", value, "sapling");
            return (Criteria) this;
        }

        public Criteria andSaplingNotEqualTo(BigDecimal value) {
            addCriterion("sapling <>", value, "sapling");
            return (Criteria) this;
        }

        public Criteria andSaplingGreaterThan(BigDecimal value) {
            addCriterion("sapling >", value, "sapling");
            return (Criteria) this;
        }

        public Criteria andSaplingGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("sapling >=", value, "sapling");
            return (Criteria) this;
        }

        public Criteria andSaplingLessThan(BigDecimal value) {
            addCriterion("sapling <", value, "sapling");
            return (Criteria) this;
        }

        public Criteria andSaplingLessThanOrEqualTo(BigDecimal value) {
            addCriterion("sapling <=", value, "sapling");
            return (Criteria) this;
        }

        public Criteria andSaplingIn(List<BigDecimal> values) {
            addCriterion("sapling in", values, "sapling");
            return (Criteria) this;
        }

        public Criteria andSaplingNotIn(List<BigDecimal> values) {
            addCriterion("sapling not in", values, "sapling");
            return (Criteria) this;
        }

        public Criteria andSaplingBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("sapling between", value1, value2, "sapling");
            return (Criteria) this;
        }

        public Criteria andSaplingNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("sapling not between", value1, value2, "sapling");
            return (Criteria) this;
        }

        public Criteria andLeijiRewardIsNull() {
            addCriterion("leiji_reward is null");
            return (Criteria) this;
        }

        public Criteria andLeijiRewardIsNotNull() {
            addCriterion("leiji_reward is not null");
            return (Criteria) this;
        }

        public Criteria andLeijiRewardEqualTo(BigDecimal value) {
            addCriterion("leiji_reward =", value, "leijiReward");
            return (Criteria) this;
        }

        public Criteria andLeijiRewardNotEqualTo(BigDecimal value) {
            addCriterion("leiji_reward <>", value, "leijiReward");
            return (Criteria) this;
        }

        public Criteria andLeijiRewardGreaterThan(BigDecimal value) {
            addCriterion("leiji_reward >", value, "leijiReward");
            return (Criteria) this;
        }

        public Criteria andLeijiRewardGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("leiji_reward >=", value, "leijiReward");
            return (Criteria) this;
        }

        public Criteria andLeijiRewardLessThan(BigDecimal value) {
            addCriterion("leiji_reward <", value, "leijiReward");
            return (Criteria) this;
        }

        public Criteria andLeijiRewardLessThanOrEqualTo(BigDecimal value) {
            addCriterion("leiji_reward <=", value, "leijiReward");
            return (Criteria) this;
        }

        public Criteria andLeijiRewardIn(List<BigDecimal> values) {
            addCriterion("leiji_reward in", values, "leijiReward");
            return (Criteria) this;
        }

        public Criteria andLeijiRewardNotIn(List<BigDecimal> values) {
            addCriterion("leiji_reward not in", values, "leijiReward");
            return (Criteria) this;
        }

        public Criteria andLeijiRewardBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("leiji_reward between", value1, value2, "leijiReward");
            return (Criteria) this;
        }

        public Criteria andLeijiRewardNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("leiji_reward not between", value1, value2, "leijiReward");
            return (Criteria) this;
        }

        public Criteria andAssetsHeldIsNull() {
            addCriterion("assets_held is null");
            return (Criteria) this;
        }

        public Criteria andAssetsHeldIsNotNull() {
            addCriterion("assets_held is not null");
            return (Criteria) this;
        }

        public Criteria andAssetsHeldEqualTo(BigDecimal value) {
            addCriterion("assets_held =", value, "assetsHeld");
            return (Criteria) this;
        }

        public Criteria andAssetsHeldNotEqualTo(BigDecimal value) {
            addCriterion("assets_held <>", value, "assetsHeld");
            return (Criteria) this;
        }

        public Criteria andAssetsHeldGreaterThan(BigDecimal value) {
            addCriterion("assets_held >", value, "assetsHeld");
            return (Criteria) this;
        }

        public Criteria andAssetsHeldGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("assets_held >=", value, "assetsHeld");
            return (Criteria) this;
        }

        public Criteria andAssetsHeldLessThan(BigDecimal value) {
            addCriterion("assets_held <", value, "assetsHeld");
            return (Criteria) this;
        }

        public Criteria andAssetsHeldLessThanOrEqualTo(BigDecimal value) {
            addCriterion("assets_held <=", value, "assetsHeld");
            return (Criteria) this;
        }

        public Criteria andAssetsHeldIn(List<BigDecimal> values) {
            addCriterion("assets_held in", values, "assetsHeld");
            return (Criteria) this;
        }

        public Criteria andAssetsHeldNotIn(List<BigDecimal> values) {
            addCriterion("assets_held not in", values, "assetsHeld");
            return (Criteria) this;
        }

        public Criteria andAssetsHeldBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("assets_held between", value1, value2, "assetsHeld");
            return (Criteria) this;
        }

        public Criteria andAssetsHeldNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("assets_held not between", value1, value2, "assetsHeld");
            return (Criteria) this;
        }

        public Criteria andTuijianRewardIsNull() {
            addCriterion("tuijian_reward is null");
            return (Criteria) this;
        }

        public Criteria andTuijianRewardIsNotNull() {
            addCriterion("tuijian_reward is not null");
            return (Criteria) this;
        }

        public Criteria andTuijianRewardEqualTo(BigDecimal value) {
            addCriterion("tuijian_reward =", value, "tuijianReward");
            return (Criteria) this;
        }

        public Criteria andTuijianRewardNotEqualTo(BigDecimal value) {
            addCriterion("tuijian_reward <>", value, "tuijianReward");
            return (Criteria) this;
        }

        public Criteria andTuijianRewardGreaterThan(BigDecimal value) {
            addCriterion("tuijian_reward >", value, "tuijianReward");
            return (Criteria) this;
        }

        public Criteria andTuijianRewardGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("tuijian_reward >=", value, "tuijianReward");
            return (Criteria) this;
        }

        public Criteria andTuijianRewardLessThan(BigDecimal value) {
            addCriterion("tuijian_reward <", value, "tuijianReward");
            return (Criteria) this;
        }

        public Criteria andTuijianRewardLessThanOrEqualTo(BigDecimal value) {
            addCriterion("tuijian_reward <=", value, "tuijianReward");
            return (Criteria) this;
        }

        public Criteria andTuijianRewardIn(List<BigDecimal> values) {
            addCriterion("tuijian_reward in", values, "tuijianReward");
            return (Criteria) this;
        }

        public Criteria andTuijianRewardNotIn(List<BigDecimal> values) {
            addCriterion("tuijian_reward not in", values, "tuijianReward");
            return (Criteria) this;
        }

        public Criteria andTuijianRewardBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("tuijian_reward between", value1, value2, "tuijianReward");
            return (Criteria) this;
        }

        public Criteria andTuijianRewardNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("tuijian_reward not between", value1, value2, "tuijianReward");
            return (Criteria) this;
        }

        public Criteria andTeamRewardIsNull() {
            addCriterion("team_reward is null");
            return (Criteria) this;
        }

        public Criteria andTeamRewardIsNotNull() {
            addCriterion("team_reward is not null");
            return (Criteria) this;
        }

        public Criteria andTeamRewardEqualTo(BigDecimal value) {
            addCriterion("team_reward =", value, "teamReward");
            return (Criteria) this;
        }

        public Criteria andTeamRewardNotEqualTo(BigDecimal value) {
            addCriterion("team_reward <>", value, "teamReward");
            return (Criteria) this;
        }

        public Criteria andTeamRewardGreaterThan(BigDecimal value) {
            addCriterion("team_reward >", value, "teamReward");
            return (Criteria) this;
        }

        public Criteria andTeamRewardGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("team_reward >=", value, "teamReward");
            return (Criteria) this;
        }

        public Criteria andTeamRewardLessThan(BigDecimal value) {
            addCriterion("team_reward <", value, "teamReward");
            return (Criteria) this;
        }

        public Criteria andTeamRewardLessThanOrEqualTo(BigDecimal value) {
            addCriterion("team_reward <=", value, "teamReward");
            return (Criteria) this;
        }

        public Criteria andTeamRewardIn(List<BigDecimal> values) {
            addCriterion("team_reward in", values, "teamReward");
            return (Criteria) this;
        }

        public Criteria andTeamRewardNotIn(List<BigDecimal> values) {
            addCriterion("team_reward not in", values, "teamReward");
            return (Criteria) this;
        }

        public Criteria andTeamRewardBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("team_reward between", value1, value2, "teamReward");
            return (Criteria) this;
        }

        public Criteria andTeamRewardNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("team_reward not between", value1, value2, "teamReward");
            return (Criteria) this;
        }

        public Criteria andLivenessIsNull() {
            addCriterion("liveness is null");
            return (Criteria) this;
        }

        public Criteria andLivenessIsNotNull() {
            addCriterion("liveness is not null");
            return (Criteria) this;
        }

        public Criteria andLivenessEqualTo(BigDecimal value) {
            addCriterion("liveness =", value, "liveness");
            return (Criteria) this;
        }

        public Criteria andLivenessNotEqualTo(BigDecimal value) {
            addCriterion("liveness <>", value, "liveness");
            return (Criteria) this;
        }

        public Criteria andLivenessGreaterThan(BigDecimal value) {
            addCriterion("liveness >", value, "liveness");
            return (Criteria) this;
        }

        public Criteria andLivenessGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("liveness >=", value, "liveness");
            return (Criteria) this;
        }

        public Criteria andLivenessLessThan(BigDecimal value) {
            addCriterion("liveness <", value, "liveness");
            return (Criteria) this;
        }

        public Criteria andLivenessLessThanOrEqualTo(BigDecimal value) {
            addCriterion("liveness <=", value, "liveness");
            return (Criteria) this;
        }

        public Criteria andLivenessIn(List<BigDecimal> values) {
            addCriterion("liveness in", values, "liveness");
            return (Criteria) this;
        }

        public Criteria andLivenessNotIn(List<BigDecimal> values) {
            addCriterion("liveness not in", values, "liveness");
            return (Criteria) this;
        }

        public Criteria andLivenessBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("liveness between", value1, value2, "liveness");
            return (Criteria) this;
        }

        public Criteria andLivenessNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("liveness not between", value1, value2, "liveness");
            return (Criteria) this;
        }

        public Criteria andShareIsNull() {
            addCriterion("share is null");
            return (Criteria) this;
        }

        public Criteria andShareIsNotNull() {
            addCriterion("share is not null");
            return (Criteria) this;
        }

        public Criteria andShareEqualTo(BigDecimal value) {
            addCriterion("share =", value, "share");
            return (Criteria) this;
        }

        public Criteria andShareNotEqualTo(BigDecimal value) {
            addCriterion("share <>", value, "share");
            return (Criteria) this;
        }

        public Criteria andShareGreaterThan(BigDecimal value) {
            addCriterion("share >", value, "share");
            return (Criteria) this;
        }

        public Criteria andShareGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("share >=", value, "share");
            return (Criteria) this;
        }

        public Criteria andShareLessThan(BigDecimal value) {
            addCriterion("share <", value, "share");
            return (Criteria) this;
        }

        public Criteria andShareLessThanOrEqualTo(BigDecimal value) {
            addCriterion("share <=", value, "share");
            return (Criteria) this;
        }

        public Criteria andShareIn(List<BigDecimal> values) {
            addCriterion("share in", values, "share");
            return (Criteria) this;
        }

        public Criteria andShareNotIn(List<BigDecimal> values) {
            addCriterion("share not in", values, "share");
            return (Criteria) this;
        }

        public Criteria andShareBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("share between", value1, value2, "share");
            return (Criteria) this;
        }

        public Criteria andShareNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("share not between", value1, value2, "share");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andRealNameTypeIsNull() {
            addCriterion("real_name_type is null");
            return (Criteria) this;
        }

        public Criteria andRealNameTypeIsNotNull() {
            addCriterion("real_name_type is not null");
            return (Criteria) this;
        }

        public Criteria andRealNameTypeEqualTo(Integer value) {
            addCriterion("real_name_type =", value, "realNameType");
            return (Criteria) this;
        }

        public Criteria andRealNameTypeNotEqualTo(Integer value) {
            addCriterion("real_name_type <>", value, "realNameType");
            return (Criteria) this;
        }

        public Criteria andRealNameTypeGreaterThan(Integer value) {
            addCriterion("real_name_type >", value, "realNameType");
            return (Criteria) this;
        }

        public Criteria andRealNameTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("real_name_type >=", value, "realNameType");
            return (Criteria) this;
        }

        public Criteria andRealNameTypeLessThan(Integer value) {
            addCriterion("real_name_type <", value, "realNameType");
            return (Criteria) this;
        }

        public Criteria andRealNameTypeLessThanOrEqualTo(Integer value) {
            addCriterion("real_name_type <=", value, "realNameType");
            return (Criteria) this;
        }

        public Criteria andRealNameTypeIn(List<Integer> values) {
            addCriterion("real_name_type in", values, "realNameType");
            return (Criteria) this;
        }

        public Criteria andRealNameTypeNotIn(List<Integer> values) {
            addCriterion("real_name_type not in", values, "realNameType");
            return (Criteria) this;
        }

        public Criteria andRealNameTypeBetween(Integer value1, Integer value2) {
            addCriterion("real_name_type between", value1, value2, "realNameType");
            return (Criteria) this;
        }

        public Criteria andRealNameTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("real_name_type not between", value1, value2, "realNameType");
            return (Criteria) this;
        }

        public Criteria andStatusIdIsNull() {
            addCriterion("status_id is null");
            return (Criteria) this;
        }

        public Criteria andStatusIdIsNotNull() {
            addCriterion("status_id is not null");
            return (Criteria) this;
        }

        public Criteria andStatusIdEqualTo(String value) {
            addCriterion("status_id =", value, "statusId");
            return (Criteria) this;
        }

        public Criteria andStatusIdNotEqualTo(String value) {
            addCriterion("status_id <>", value, "statusId");
            return (Criteria) this;
        }

        public Criteria andStatusIdGreaterThan(String value) {
            addCriterion("status_id >", value, "statusId");
            return (Criteria) this;
        }

        public Criteria andStatusIdGreaterThanOrEqualTo(String value) {
            addCriterion("status_id >=", value, "statusId");
            return (Criteria) this;
        }

        public Criteria andStatusIdLessThan(String value) {
            addCriterion("status_id <", value, "statusId");
            return (Criteria) this;
        }

        public Criteria andStatusIdLessThanOrEqualTo(String value) {
            addCriterion("status_id <=", value, "statusId");
            return (Criteria) this;
        }

        public Criteria andStatusIdLike(String value) {
            addCriterion("status_id like", value, "statusId");
            return (Criteria) this;
        }

        public Criteria andStatusIdNotLike(String value) {
            addCriterion("status_id not like", value, "statusId");
            return (Criteria) this;
        }

        public Criteria andStatusIdIn(List<String> values) {
            addCriterion("status_id in", values, "statusId");
            return (Criteria) this;
        }

        public Criteria andStatusIdNotIn(List<String> values) {
            addCriterion("status_id not in", values, "statusId");
            return (Criteria) this;
        }

        public Criteria andStatusIdBetween(String value1, String value2) {
            addCriterion("status_id between", value1, value2, "statusId");
            return (Criteria) this;
        }

        public Criteria andStatusIdNotBetween(String value1, String value2) {
            addCriterion("status_id not between", value1, value2, "statusId");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * sg_users 
     */
    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}