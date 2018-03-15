package com.wuhenjian.aurora.utils.entity.dao;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SysUserCriteria {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected Integer limitStart;

    protected Integer limitEnd;

    public SysUserCriteria() {
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

    public void setLimitStart(Integer limitStart) {
        this.limitStart=limitStart;
    }

    public Integer getLimitStart() {
        return limitStart;
    }

    public void setLimitEnd(Integer limitEnd) {
        this.limitEnd=limitEnd;
    }

    public Integer getLimitEnd() {
        return limitEnd;
    }

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

        public Criteria andSuIdIsNull() {
            addCriterion("suId is null");
            return (Criteria) this;
        }

        public Criteria andSuIdIsNotNull() {
            addCriterion("suId is not null");
            return (Criteria) this;
        }

        public Criteria andSuIdEqualTo(Long value) {
            addCriterion("suId =", value, "suId");
            return (Criteria) this;
        }

        public Criteria andSuIdNotEqualTo(Long value) {
            addCriterion("suId <>", value, "suId");
            return (Criteria) this;
        }

        public Criteria andSuIdGreaterThan(Long value) {
            addCriterion("suId >", value, "suId");
            return (Criteria) this;
        }

        public Criteria andSuIdGreaterThanOrEqualTo(Long value) {
            addCriterion("suId >=", value, "suId");
            return (Criteria) this;
        }

        public Criteria andSuIdLessThan(Long value) {
            addCriterion("suId <", value, "suId");
            return (Criteria) this;
        }

        public Criteria andSuIdLessThanOrEqualTo(Long value) {
            addCriterion("suId <=", value, "suId");
            return (Criteria) this;
        }

        public Criteria andSuIdIn(List<Long> values) {
            addCriterion("suId in", values, "suId");
            return (Criteria) this;
        }

        public Criteria andSuIdNotIn(List<Long> values) {
            addCriterion("suId not in", values, "suId");
            return (Criteria) this;
        }

        public Criteria andSuIdBetween(Long value1, Long value2) {
            addCriterion("suId between", value1, value2, "suId");
            return (Criteria) this;
        }

        public Criteria andSuIdNotBetween(Long value1, Long value2) {
            addCriterion("suId not between", value1, value2, "suId");
            return (Criteria) this;
        }

        public Criteria andUacctountIsNull() {
            addCriterion("uacctount is null");
            return (Criteria) this;
        }

        public Criteria andUacctountIsNotNull() {
            addCriterion("uacctount is not null");
            return (Criteria) this;
        }

        public Criteria andUacctountEqualTo(String value) {
            addCriterion("uacctount =", value, "uacctount");
            return (Criteria) this;
        }

        public Criteria andUacctountNotEqualTo(String value) {
            addCriterion("uacctount <>", value, "uacctount");
            return (Criteria) this;
        }

        public Criteria andUacctountGreaterThan(String value) {
            addCriterion("uacctount >", value, "uacctount");
            return (Criteria) this;
        }

        public Criteria andUacctountGreaterThanOrEqualTo(String value) {
            addCriterion("uacctount >=", value, "uacctount");
            return (Criteria) this;
        }

        public Criteria andUacctountLessThan(String value) {
            addCriterion("uacctount <", value, "uacctount");
            return (Criteria) this;
        }

        public Criteria andUacctountLessThanOrEqualTo(String value) {
            addCriterion("uacctount <=", value, "uacctount");
            return (Criteria) this;
        }

        public Criteria andUacctountLike(String value) {
            addCriterion("uacctount like", value, "uacctount");
            return (Criteria) this;
        }

        public Criteria andUacctountNotLike(String value) {
            addCriterion("uacctount not like", value, "uacctount");
            return (Criteria) this;
        }

        public Criteria andUacctountIn(List<String> values) {
            addCriterion("uacctount in", values, "uacctount");
            return (Criteria) this;
        }

        public Criteria andUacctountNotIn(List<String> values) {
            addCriterion("uacctount not in", values, "uacctount");
            return (Criteria) this;
        }

        public Criteria andUacctountBetween(String value1, String value2) {
            addCriterion("uacctount between", value1, value2, "uacctount");
            return (Criteria) this;
        }

        public Criteria andUacctountNotBetween(String value1, String value2) {
            addCriterion("uacctount not between", value1, value2, "uacctount");
            return (Criteria) this;
        }

        public Criteria andUpasswordIsNull() {
            addCriterion("upassword is null");
            return (Criteria) this;
        }

        public Criteria andUpasswordIsNotNull() {
            addCriterion("upassword is not null");
            return (Criteria) this;
        }

        public Criteria andUpasswordEqualTo(String value) {
            addCriterion("upassword =", value, "upassword");
            return (Criteria) this;
        }

        public Criteria andUpasswordNotEqualTo(String value) {
            addCriterion("upassword <>", value, "upassword");
            return (Criteria) this;
        }

        public Criteria andUpasswordGreaterThan(String value) {
            addCriterion("upassword >", value, "upassword");
            return (Criteria) this;
        }

        public Criteria andUpasswordGreaterThanOrEqualTo(String value) {
            addCriterion("upassword >=", value, "upassword");
            return (Criteria) this;
        }

        public Criteria andUpasswordLessThan(String value) {
            addCriterion("upassword <", value, "upassword");
            return (Criteria) this;
        }

        public Criteria andUpasswordLessThanOrEqualTo(String value) {
            addCriterion("upassword <=", value, "upassword");
            return (Criteria) this;
        }

        public Criteria andUpasswordLike(String value) {
            addCriterion("upassword like", value, "upassword");
            return (Criteria) this;
        }

        public Criteria andUpasswordNotLike(String value) {
            addCriterion("upassword not like", value, "upassword");
            return (Criteria) this;
        }

        public Criteria andUpasswordIn(List<String> values) {
            addCriterion("upassword in", values, "upassword");
            return (Criteria) this;
        }

        public Criteria andUpasswordNotIn(List<String> values) {
            addCriterion("upassword not in", values, "upassword");
            return (Criteria) this;
        }

        public Criteria andUpasswordBetween(String value1, String value2) {
            addCriterion("upassword between", value1, value2, "upassword");
            return (Criteria) this;
        }

        public Criteria andUpasswordNotBetween(String value1, String value2) {
            addCriterion("upassword not between", value1, value2, "upassword");
            return (Criteria) this;
        }

        public Criteria andUemailIsNull() {
            addCriterion("uemail is null");
            return (Criteria) this;
        }

        public Criteria andUemailIsNotNull() {
            addCriterion("uemail is not null");
            return (Criteria) this;
        }

        public Criteria andUemailEqualTo(String value) {
            addCriterion("uemail =", value, "uemail");
            return (Criteria) this;
        }

        public Criteria andUemailNotEqualTo(String value) {
            addCriterion("uemail <>", value, "uemail");
            return (Criteria) this;
        }

        public Criteria andUemailGreaterThan(String value) {
            addCriterion("uemail >", value, "uemail");
            return (Criteria) this;
        }

        public Criteria andUemailGreaterThanOrEqualTo(String value) {
            addCriterion("uemail >=", value, "uemail");
            return (Criteria) this;
        }

        public Criteria andUemailLessThan(String value) {
            addCriterion("uemail <", value, "uemail");
            return (Criteria) this;
        }

        public Criteria andUemailLessThanOrEqualTo(String value) {
            addCriterion("uemail <=", value, "uemail");
            return (Criteria) this;
        }

        public Criteria andUemailLike(String value) {
            addCriterion("uemail like", value, "uemail");
            return (Criteria) this;
        }

        public Criteria andUemailNotLike(String value) {
            addCriterion("uemail not like", value, "uemail");
            return (Criteria) this;
        }

        public Criteria andUemailIn(List<String> values) {
            addCriterion("uemail in", values, "uemail");
            return (Criteria) this;
        }

        public Criteria andUemailNotIn(List<String> values) {
            addCriterion("uemail not in", values, "uemail");
            return (Criteria) this;
        }

        public Criteria andUemailBetween(String value1, String value2) {
            addCriterion("uemail between", value1, value2, "uemail");
            return (Criteria) this;
        }

        public Criteria andUemailNotBetween(String value1, String value2) {
            addCriterion("uemail not between", value1, value2, "uemail");
            return (Criteria) this;
        }

        public Criteria andUphoneIsNull() {
            addCriterion("uphone is null");
            return (Criteria) this;
        }

        public Criteria andUphoneIsNotNull() {
            addCriterion("uphone is not null");
            return (Criteria) this;
        }

        public Criteria andUphoneEqualTo(String value) {
            addCriterion("uphone =", value, "uphone");
            return (Criteria) this;
        }

        public Criteria andUphoneNotEqualTo(String value) {
            addCriterion("uphone <>", value, "uphone");
            return (Criteria) this;
        }

        public Criteria andUphoneGreaterThan(String value) {
            addCriterion("uphone >", value, "uphone");
            return (Criteria) this;
        }

        public Criteria andUphoneGreaterThanOrEqualTo(String value) {
            addCriterion("uphone >=", value, "uphone");
            return (Criteria) this;
        }

        public Criteria andUphoneLessThan(String value) {
            addCriterion("uphone <", value, "uphone");
            return (Criteria) this;
        }

        public Criteria andUphoneLessThanOrEqualTo(String value) {
            addCriterion("uphone <=", value, "uphone");
            return (Criteria) this;
        }

        public Criteria andUphoneLike(String value) {
            addCriterion("uphone like", value, "uphone");
            return (Criteria) this;
        }

        public Criteria andUphoneNotLike(String value) {
            addCriterion("uphone not like", value, "uphone");
            return (Criteria) this;
        }

        public Criteria andUphoneIn(List<String> values) {
            addCriterion("uphone in", values, "uphone");
            return (Criteria) this;
        }

        public Criteria andUphoneNotIn(List<String> values) {
            addCriterion("uphone not in", values, "uphone");
            return (Criteria) this;
        }

        public Criteria andUphoneBetween(String value1, String value2) {
            addCriterion("uphone between", value1, value2, "uphone");
            return (Criteria) this;
        }

        public Criteria andUphoneNotBetween(String value1, String value2) {
            addCriterion("uphone not between", value1, value2, "uphone");
            return (Criteria) this;
        }

        public Criteria andUnameIsNull() {
            addCriterion("uname is null");
            return (Criteria) this;
        }

        public Criteria andUnameIsNotNull() {
            addCriterion("uname is not null");
            return (Criteria) this;
        }

        public Criteria andUnameEqualTo(String value) {
            addCriterion("uname =", value, "uname");
            return (Criteria) this;
        }

        public Criteria andUnameNotEqualTo(String value) {
            addCriterion("uname <>", value, "uname");
            return (Criteria) this;
        }

        public Criteria andUnameGreaterThan(String value) {
            addCriterion("uname >", value, "uname");
            return (Criteria) this;
        }

        public Criteria andUnameGreaterThanOrEqualTo(String value) {
            addCriterion("uname >=", value, "uname");
            return (Criteria) this;
        }

        public Criteria andUnameLessThan(String value) {
            addCriterion("uname <", value, "uname");
            return (Criteria) this;
        }

        public Criteria andUnameLessThanOrEqualTo(String value) {
            addCriterion("uname <=", value, "uname");
            return (Criteria) this;
        }

        public Criteria andUnameLike(String value) {
            addCriterion("uname like", value, "uname");
            return (Criteria) this;
        }

        public Criteria andUnameNotLike(String value) {
            addCriterion("uname not like", value, "uname");
            return (Criteria) this;
        }

        public Criteria andUnameIn(List<String> values) {
            addCriterion("uname in", values, "uname");
            return (Criteria) this;
        }

        public Criteria andUnameNotIn(List<String> values) {
            addCriterion("uname not in", values, "uname");
            return (Criteria) this;
        }

        public Criteria andUnameBetween(String value1, String value2) {
            addCriterion("uname between", value1, value2, "uname");
            return (Criteria) this;
        }

        public Criteria andUnameNotBetween(String value1, String value2) {
            addCriterion("uname not between", value1, value2, "uname");
            return (Criteria) this;
        }

        public Criteria andSaltIsNull() {
            addCriterion("salt is null");
            return (Criteria) this;
        }

        public Criteria andSaltIsNotNull() {
            addCriterion("salt is not null");
            return (Criteria) this;
        }

        public Criteria andSaltEqualTo(String value) {
            addCriterion("salt =", value, "salt");
            return (Criteria) this;
        }

        public Criteria andSaltNotEqualTo(String value) {
            addCriterion("salt <>", value, "salt");
            return (Criteria) this;
        }

        public Criteria andSaltGreaterThan(String value) {
            addCriterion("salt >", value, "salt");
            return (Criteria) this;
        }

        public Criteria andSaltGreaterThanOrEqualTo(String value) {
            addCriterion("salt >=", value, "salt");
            return (Criteria) this;
        }

        public Criteria andSaltLessThan(String value) {
            addCriterion("salt <", value, "salt");
            return (Criteria) this;
        }

        public Criteria andSaltLessThanOrEqualTo(String value) {
            addCriterion("salt <=", value, "salt");
            return (Criteria) this;
        }

        public Criteria andSaltLike(String value) {
            addCriterion("salt like", value, "salt");
            return (Criteria) this;
        }

        public Criteria andSaltNotLike(String value) {
            addCriterion("salt not like", value, "salt");
            return (Criteria) this;
        }

        public Criteria andSaltIn(List<String> values) {
            addCriterion("salt in", values, "salt");
            return (Criteria) this;
        }

        public Criteria andSaltNotIn(List<String> values) {
            addCriterion("salt not in", values, "salt");
            return (Criteria) this;
        }

        public Criteria andSaltBetween(String value1, String value2) {
            addCriterion("salt between", value1, value2, "salt");
            return (Criteria) this;
        }

        public Criteria andSaltNotBetween(String value1, String value2) {
            addCriterion("salt not between", value1, value2, "salt");
            return (Criteria) this;
        }

        public Criteria andUstatusIsNull() {
            addCriterion("ustatus is null");
            return (Criteria) this;
        }

        public Criteria andUstatusIsNotNull() {
            addCriterion("ustatus is not null");
            return (Criteria) this;
        }

        public Criteria andUstatusEqualTo(Integer value) {
            addCriterion("ustatus =", value, "ustatus");
            return (Criteria) this;
        }

        public Criteria andUstatusNotEqualTo(Integer value) {
            addCriterion("ustatus <>", value, "ustatus");
            return (Criteria) this;
        }

        public Criteria andUstatusGreaterThan(Integer value) {
            addCriterion("ustatus >", value, "ustatus");
            return (Criteria) this;
        }

        public Criteria andUstatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("ustatus >=", value, "ustatus");
            return (Criteria) this;
        }

        public Criteria andUstatusLessThan(Integer value) {
            addCriterion("ustatus <", value, "ustatus");
            return (Criteria) this;
        }

        public Criteria andUstatusLessThanOrEqualTo(Integer value) {
            addCriterion("ustatus <=", value, "ustatus");
            return (Criteria) this;
        }

        public Criteria andUstatusIn(List<Integer> values) {
            addCriterion("ustatus in", values, "ustatus");
            return (Criteria) this;
        }

        public Criteria andUstatusNotIn(List<Integer> values) {
            addCriterion("ustatus not in", values, "ustatus");
            return (Criteria) this;
        }

        public Criteria andUstatusBetween(Integer value1, Integer value2) {
            addCriterion("ustatus between", value1, value2, "ustatus");
            return (Criteria) this;
        }

        public Criteria andUstatusNotBetween(Integer value1, Integer value2) {
            addCriterion("ustatus not between", value1, value2, "ustatus");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("createTime is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("createTime is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("createTime =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("createTime <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("createTime >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("createTime >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("createTime <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("createTime <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("createTime in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("createTime not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("createTime between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("createTime not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("updateTime is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("updateTime is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterion("updateTime =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("updateTime <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("updateTime >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("updateTime >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("updateTime <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("updateTime <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterion("updateTime in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterion("updateTime not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("updateTime between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("updateTime not between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andLastLoginIPIsNull() {
            addCriterion("lastLoginIP is null");
            return (Criteria) this;
        }

        public Criteria andLastLoginIPIsNotNull() {
            addCriterion("lastLoginIP is not null");
            return (Criteria) this;
        }

        public Criteria andLastLoginIPEqualTo(String value) {
            addCriterion("lastLoginIP =", value, "lastLoginIP");
            return (Criteria) this;
        }

        public Criteria andLastLoginIPNotEqualTo(String value) {
            addCriterion("lastLoginIP <>", value, "lastLoginIP");
            return (Criteria) this;
        }

        public Criteria andLastLoginIPGreaterThan(String value) {
            addCriterion("lastLoginIP >", value, "lastLoginIP");
            return (Criteria) this;
        }

        public Criteria andLastLoginIPGreaterThanOrEqualTo(String value) {
            addCriterion("lastLoginIP >=", value, "lastLoginIP");
            return (Criteria) this;
        }

        public Criteria andLastLoginIPLessThan(String value) {
            addCriterion("lastLoginIP <", value, "lastLoginIP");
            return (Criteria) this;
        }

        public Criteria andLastLoginIPLessThanOrEqualTo(String value) {
            addCriterion("lastLoginIP <=", value, "lastLoginIP");
            return (Criteria) this;
        }

        public Criteria andLastLoginIPLike(String value) {
            addCriterion("lastLoginIP like", value, "lastLoginIP");
            return (Criteria) this;
        }

        public Criteria andLastLoginIPNotLike(String value) {
            addCriterion("lastLoginIP not like", value, "lastLoginIP");
            return (Criteria) this;
        }

        public Criteria andLastLoginIPIn(List<String> values) {
            addCriterion("lastLoginIP in", values, "lastLoginIP");
            return (Criteria) this;
        }

        public Criteria andLastLoginIPNotIn(List<String> values) {
            addCriterion("lastLoginIP not in", values, "lastLoginIP");
            return (Criteria) this;
        }

        public Criteria andLastLoginIPBetween(String value1, String value2) {
            addCriterion("lastLoginIP between", value1, value2, "lastLoginIP");
            return (Criteria) this;
        }

        public Criteria andLastLoginIPNotBetween(String value1, String value2) {
            addCriterion("lastLoginIP not between", value1, value2, "lastLoginIP");
            return (Criteria) this;
        }

        public Criteria andLastLoginTimeIsNull() {
            addCriterion("lastLoginTime is null");
            return (Criteria) this;
        }

        public Criteria andLastLoginTimeIsNotNull() {
            addCriterion("lastLoginTime is not null");
            return (Criteria) this;
        }

        public Criteria andLastLoginTimeEqualTo(Date value) {
            addCriterion("lastLoginTime =", value, "lastLoginTime");
            return (Criteria) this;
        }

        public Criteria andLastLoginTimeNotEqualTo(Date value) {
            addCriterion("lastLoginTime <>", value, "lastLoginTime");
            return (Criteria) this;
        }

        public Criteria andLastLoginTimeGreaterThan(Date value) {
            addCriterion("lastLoginTime >", value, "lastLoginTime");
            return (Criteria) this;
        }

        public Criteria andLastLoginTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("lastLoginTime >=", value, "lastLoginTime");
            return (Criteria) this;
        }

        public Criteria andLastLoginTimeLessThan(Date value) {
            addCriterion("lastLoginTime <", value, "lastLoginTime");
            return (Criteria) this;
        }

        public Criteria andLastLoginTimeLessThanOrEqualTo(Date value) {
            addCriterion("lastLoginTime <=", value, "lastLoginTime");
            return (Criteria) this;
        }

        public Criteria andLastLoginTimeIn(List<Date> values) {
            addCriterion("lastLoginTime in", values, "lastLoginTime");
            return (Criteria) this;
        }

        public Criteria andLastLoginTimeNotIn(List<Date> values) {
            addCriterion("lastLoginTime not in", values, "lastLoginTime");
            return (Criteria) this;
        }

        public Criteria andLastLoginTimeBetween(Date value1, Date value2) {
            addCriterion("lastLoginTime between", value1, value2, "lastLoginTime");
            return (Criteria) this;
        }

        public Criteria andLastLoginTimeNotBetween(Date value1, Date value2) {
            addCriterion("lastLoginTime not between", value1, value2, "lastLoginTime");
            return (Criteria) this;
        }

        public Criteria andUacctountLikeInsensitive(String value) {
            addCriterion("upper(uacctount) like", value.toUpperCase(), "uacctount");
            return (Criteria) this;
        }

        public Criteria andUpasswordLikeInsensitive(String value) {
            addCriterion("upper(upassword) like", value.toUpperCase(), "upassword");
            return (Criteria) this;
        }

        public Criteria andUemailLikeInsensitive(String value) {
            addCriterion("upper(uemail) like", value.toUpperCase(), "uemail");
            return (Criteria) this;
        }

        public Criteria andUphoneLikeInsensitive(String value) {
            addCriterion("upper(uphone) like", value.toUpperCase(), "uphone");
            return (Criteria) this;
        }

        public Criteria andUnameLikeInsensitive(String value) {
            addCriterion("upper(uname) like", value.toUpperCase(), "uname");
            return (Criteria) this;
        }

        public Criteria andSaltLikeInsensitive(String value) {
            addCriterion("upper(salt) like", value.toUpperCase(), "salt");
            return (Criteria) this;
        }

        public Criteria andLastLoginIPLikeInsensitive(String value) {
            addCriterion("upper(lastLoginIP) like", value.toUpperCase(), "lastLoginIP");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

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