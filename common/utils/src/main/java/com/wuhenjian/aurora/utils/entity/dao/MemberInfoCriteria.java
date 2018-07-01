package com.wuhenjian.aurora.utils.entity.dao;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MemberInfoCriteria {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected Integer limitStart;

    protected Integer limitEnd;

    public MemberInfoCriteria() {
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

        public Criteria andMiIdIsNull() {
            addCriterion("miId is null");
            return (Criteria) this;
        }

        public Criteria andMiIdIsNotNull() {
            addCriterion("miId is not null");
            return (Criteria) this;
        }

        public Criteria andMiIdEqualTo(Long value) {
            addCriterion("miId =", value, "miId");
            return (Criteria) this;
        }

        public Criteria andMiIdNotEqualTo(Long value) {
            addCriterion("miId <>", value, "miId");
            return (Criteria) this;
        }

        public Criteria andMiIdGreaterThan(Long value) {
            addCriterion("miId >", value, "miId");
            return (Criteria) this;
        }

        public Criteria andMiIdGreaterThanOrEqualTo(Long value) {
            addCriterion("miId >=", value, "miId");
            return (Criteria) this;
        }

        public Criteria andMiIdLessThan(Long value) {
            addCriterion("miId <", value, "miId");
            return (Criteria) this;
        }

        public Criteria andMiIdLessThanOrEqualTo(Long value) {
            addCriterion("miId <=", value, "miId");
            return (Criteria) this;
        }

        public Criteria andMiIdIn(List<Long> values) {
            addCriterion("miId in", values, "miId");
            return (Criteria) this;
        }

        public Criteria andMiIdNotIn(List<Long> values) {
            addCriterion("miId not in", values, "miId");
            return (Criteria) this;
        }

        public Criteria andMiIdBetween(Long value1, Long value2) {
            addCriterion("miId between", value1, value2, "miId");
            return (Criteria) this;
        }

        public Criteria andMiIdNotBetween(Long value1, Long value2) {
            addCriterion("miId not between", value1, value2, "miId");
            return (Criteria) this;
        }

        public Criteria andMaIdIsNull() {
            addCriterion("maId is null");
            return (Criteria) this;
        }

        public Criteria andMaIdIsNotNull() {
            addCriterion("maId is not null");
            return (Criteria) this;
        }

        public Criteria andMaIdEqualTo(Long value) {
            addCriterion("maId =", value, "maId");
            return (Criteria) this;
        }

        public Criteria andMaIdNotEqualTo(Long value) {
            addCriterion("maId <>", value, "maId");
            return (Criteria) this;
        }

        public Criteria andMaIdGreaterThan(Long value) {
            addCriterion("maId >", value, "maId");
            return (Criteria) this;
        }

        public Criteria andMaIdGreaterThanOrEqualTo(Long value) {
            addCriterion("maId >=", value, "maId");
            return (Criteria) this;
        }

        public Criteria andMaIdLessThan(Long value) {
            addCriterion("maId <", value, "maId");
            return (Criteria) this;
        }

        public Criteria andMaIdLessThanOrEqualTo(Long value) {
            addCriterion("maId <=", value, "maId");
            return (Criteria) this;
        }

        public Criteria andMaIdIn(List<Long> values) {
            addCriterion("maId in", values, "maId");
            return (Criteria) this;
        }

        public Criteria andMaIdNotIn(List<Long> values) {
            addCriterion("maId not in", values, "maId");
            return (Criteria) this;
        }

        public Criteria andMaIdBetween(Long value1, Long value2) {
            addCriterion("maId between", value1, value2, "maId");
            return (Criteria) this;
        }

        public Criteria andMaIdNotBetween(Long value1, Long value2) {
            addCriterion("maId not between", value1, value2, "maId");
            return (Criteria) this;
        }

        public Criteria andFaceIdIsNull() {
            addCriterion("faceId is null");
            return (Criteria) this;
        }

        public Criteria andFaceIdIsNotNull() {
            addCriterion("faceId is not null");
            return (Criteria) this;
        }

        public Criteria andFaceIdEqualTo(Long value) {
            addCriterion("faceId =", value, "faceId");
            return (Criteria) this;
        }

        public Criteria andFaceIdNotEqualTo(Long value) {
            addCriterion("faceId <>", value, "faceId");
            return (Criteria) this;
        }

        public Criteria andFaceIdGreaterThan(Long value) {
            addCriterion("faceId >", value, "faceId");
            return (Criteria) this;
        }

        public Criteria andFaceIdGreaterThanOrEqualTo(Long value) {
            addCriterion("faceId >=", value, "faceId");
            return (Criteria) this;
        }

        public Criteria andFaceIdLessThan(Long value) {
            addCriterion("faceId <", value, "faceId");
            return (Criteria) this;
        }

        public Criteria andFaceIdLessThanOrEqualTo(Long value) {
            addCriterion("faceId <=", value, "faceId");
            return (Criteria) this;
        }

        public Criteria andFaceIdIn(List<Long> values) {
            addCriterion("faceId in", values, "faceId");
            return (Criteria) this;
        }

        public Criteria andFaceIdNotIn(List<Long> values) {
            addCriterion("faceId not in", values, "faceId");
            return (Criteria) this;
        }

        public Criteria andFaceIdBetween(Long value1, Long value2) {
            addCriterion("faceId between", value1, value2, "faceId");
            return (Criteria) this;
        }

        public Criteria andFaceIdNotBetween(Long value1, Long value2) {
            addCriterion("faceId not between", value1, value2, "faceId");
            return (Criteria) this;
        }

        public Criteria andAreaIsNull() {
            addCriterion("area is null");
            return (Criteria) this;
        }

        public Criteria andAreaIsNotNull() {
            addCriterion("area is not null");
            return (Criteria) this;
        }

        public Criteria andAreaEqualTo(Long value) {
            addCriterion("area =", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaNotEqualTo(Long value) {
            addCriterion("area <>", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaGreaterThan(Long value) {
            addCriterion("area >", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaGreaterThanOrEqualTo(Long value) {
            addCriterion("area >=", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaLessThan(Long value) {
            addCriterion("area <", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaLessThanOrEqualTo(Long value) {
            addCriterion("area <=", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaIn(List<Long> values) {
            addCriterion("area in", values, "area");
            return (Criteria) this;
        }

        public Criteria andAreaNotIn(List<Long> values) {
            addCriterion("area not in", values, "area");
            return (Criteria) this;
        }

        public Criteria andAreaBetween(Long value1, Long value2) {
            addCriterion("area between", value1, value2, "area");
            return (Criteria) this;
        }

        public Criteria andAreaNotBetween(Long value1, Long value2) {
            addCriterion("area not between", value1, value2, "area");
            return (Criteria) this;
        }

        public Criteria andNickNameIsNull() {
            addCriterion("nickName is null");
            return (Criteria) this;
        }

        public Criteria andNickNameIsNotNull() {
            addCriterion("nickName is not null");
            return (Criteria) this;
        }

        public Criteria andNickNameEqualTo(String value) {
            addCriterion("nickName =", value, "nickName");
            return (Criteria) this;
        }

        public Criteria andNickNameNotEqualTo(String value) {
            addCriterion("nickName <>", value, "nickName");
            return (Criteria) this;
        }

        public Criteria andNickNameGreaterThan(String value) {
            addCriterion("nickName >", value, "nickName");
            return (Criteria) this;
        }

        public Criteria andNickNameGreaterThanOrEqualTo(String value) {
            addCriterion("nickName >=", value, "nickName");
            return (Criteria) this;
        }

        public Criteria andNickNameLessThan(String value) {
            addCriterion("nickName <", value, "nickName");
            return (Criteria) this;
        }

        public Criteria andNickNameLessThanOrEqualTo(String value) {
            addCriterion("nickName <=", value, "nickName");
            return (Criteria) this;
        }

        public Criteria andNickNameLike(String value) {
            addCriterion("nickName like", value, "nickName");
            return (Criteria) this;
        }

        public Criteria andNickNameNotLike(String value) {
            addCriterion("nickName not like", value, "nickName");
            return (Criteria) this;
        }

        public Criteria andNickNameIn(List<String> values) {
            addCriterion("nickName in", values, "nickName");
            return (Criteria) this;
        }

        public Criteria andNickNameNotIn(List<String> values) {
            addCriterion("nickName not in", values, "nickName");
            return (Criteria) this;
        }

        public Criteria andNickNameBetween(String value1, String value2) {
            addCriterion("nickName between", value1, value2, "nickName");
            return (Criteria) this;
        }

        public Criteria andNickNameNotBetween(String value1, String value2) {
            addCriterion("nickName not between", value1, value2, "nickName");
            return (Criteria) this;
        }

        public Criteria andMemberSignIsNull() {
            addCriterion("memberSign is null");
            return (Criteria) this;
        }

        public Criteria andMemberSignIsNotNull() {
            addCriterion("memberSign is not null");
            return (Criteria) this;
        }

        public Criteria andMemberSignEqualTo(String value) {
            addCriterion("memberSign =", value, "memberSign");
            return (Criteria) this;
        }

        public Criteria andMemberSignNotEqualTo(String value) {
            addCriterion("memberSign <>", value, "memberSign");
            return (Criteria) this;
        }

        public Criteria andMemberSignGreaterThan(String value) {
            addCriterion("memberSign >", value, "memberSign");
            return (Criteria) this;
        }

        public Criteria andMemberSignGreaterThanOrEqualTo(String value) {
            addCriterion("memberSign >=", value, "memberSign");
            return (Criteria) this;
        }

        public Criteria andMemberSignLessThan(String value) {
            addCriterion("memberSign <", value, "memberSign");
            return (Criteria) this;
        }

        public Criteria andMemberSignLessThanOrEqualTo(String value) {
            addCriterion("memberSign <=", value, "memberSign");
            return (Criteria) this;
        }

        public Criteria andMemberSignLike(String value) {
            addCriterion("memberSign like", value, "memberSign");
            return (Criteria) this;
        }

        public Criteria andMemberSignNotLike(String value) {
            addCriterion("memberSign not like", value, "memberSign");
            return (Criteria) this;
        }

        public Criteria andMemberSignIn(List<String> values) {
            addCriterion("memberSign in", values, "memberSign");
            return (Criteria) this;
        }

        public Criteria andMemberSignNotIn(List<String> values) {
            addCriterion("memberSign not in", values, "memberSign");
            return (Criteria) this;
        }

        public Criteria andMemberSignBetween(String value1, String value2) {
            addCriterion("memberSign between", value1, value2, "memberSign");
            return (Criteria) this;
        }

        public Criteria andMemberSignNotBetween(String value1, String value2) {
            addCriterion("memberSign not between", value1, value2, "memberSign");
            return (Criteria) this;
        }

        public Criteria andSexIsNull() {
            addCriterion("sex is null");
            return (Criteria) this;
        }

        public Criteria andSexIsNotNull() {
            addCriterion("sex is not null");
            return (Criteria) this;
        }

        public Criteria andSexEqualTo(Integer value) {
            addCriterion("sex =", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotEqualTo(Integer value) {
            addCriterion("sex <>", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexGreaterThan(Integer value) {
            addCriterion("sex >", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexGreaterThanOrEqualTo(Integer value) {
            addCriterion("sex >=", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLessThan(Integer value) {
            addCriterion("sex <", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLessThanOrEqualTo(Integer value) {
            addCriterion("sex <=", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexIn(List<Integer> values) {
            addCriterion("sex in", values, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotIn(List<Integer> values) {
            addCriterion("sex not in", values, "sex");
            return (Criteria) this;
        }

        public Criteria andSexBetween(Integer value1, Integer value2) {
            addCriterion("sex between", value1, value2, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotBetween(Integer value1, Integer value2) {
            addCriterion("sex not between", value1, value2, "sex");
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

        public Criteria andLastLoginDeviceIsNull() {
            addCriterion("lastLoginDevice is null");
            return (Criteria) this;
        }

        public Criteria andLastLoginDeviceIsNotNull() {
            addCriterion("lastLoginDevice is not null");
            return (Criteria) this;
        }

        public Criteria andLastLoginDeviceEqualTo(Integer value) {
            addCriterion("lastLoginDevice =", value, "lastLoginDevice");
            return (Criteria) this;
        }

        public Criteria andLastLoginDeviceNotEqualTo(Integer value) {
            addCriterion("lastLoginDevice <>", value, "lastLoginDevice");
            return (Criteria) this;
        }

        public Criteria andLastLoginDeviceGreaterThan(Integer value) {
            addCriterion("lastLoginDevice >", value, "lastLoginDevice");
            return (Criteria) this;
        }

        public Criteria andLastLoginDeviceGreaterThanOrEqualTo(Integer value) {
            addCriterion("lastLoginDevice >=", value, "lastLoginDevice");
            return (Criteria) this;
        }

        public Criteria andLastLoginDeviceLessThan(Integer value) {
            addCriterion("lastLoginDevice <", value, "lastLoginDevice");
            return (Criteria) this;
        }

        public Criteria andLastLoginDeviceLessThanOrEqualTo(Integer value) {
            addCriterion("lastLoginDevice <=", value, "lastLoginDevice");
            return (Criteria) this;
        }

        public Criteria andLastLoginDeviceIn(List<Integer> values) {
            addCriterion("lastLoginDevice in", values, "lastLoginDevice");
            return (Criteria) this;
        }

        public Criteria andLastLoginDeviceNotIn(List<Integer> values) {
            addCriterion("lastLoginDevice not in", values, "lastLoginDevice");
            return (Criteria) this;
        }

        public Criteria andLastLoginDeviceBetween(Integer value1, Integer value2) {
            addCriterion("lastLoginDevice between", value1, value2, "lastLoginDevice");
            return (Criteria) this;
        }

        public Criteria andLastLoginDeviceNotBetween(Integer value1, Integer value2) {
            addCriterion("lastLoginDevice not between", value1, value2, "lastLoginDevice");
            return (Criteria) this;
        }

        public Criteria andNickNameLikeInsensitive(String value) {
            addCriterion("upper(nickName) like", value.toUpperCase(), "nickName");
            return (Criteria) this;
        }

        public Criteria andMemberSignLikeInsensitive(String value) {
            addCriterion("upper(memberSign) like", value.toUpperCase(), "memberSign");
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