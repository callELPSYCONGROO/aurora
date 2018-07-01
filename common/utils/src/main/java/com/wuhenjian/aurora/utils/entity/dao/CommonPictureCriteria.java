package com.wuhenjian.aurora.utils.entity.dao;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CommonPictureCriteria {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected Integer limitStart;

    protected Integer limitEnd;

    public CommonPictureCriteria() {
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

        public Criteria andCpIdIsNull() {
            addCriterion("cpId is null");
            return (Criteria) this;
        }

        public Criteria andCpIdIsNotNull() {
            addCriterion("cpId is not null");
            return (Criteria) this;
        }

        public Criteria andCpIdEqualTo(Long value) {
            addCriterion("cpId =", value, "cpId");
            return (Criteria) this;
        }

        public Criteria andCpIdNotEqualTo(Long value) {
            addCriterion("cpId <>", value, "cpId");
            return (Criteria) this;
        }

        public Criteria andCpIdGreaterThan(Long value) {
            addCriterion("cpId >", value, "cpId");
            return (Criteria) this;
        }

        public Criteria andCpIdGreaterThanOrEqualTo(Long value) {
            addCriterion("cpId >=", value, "cpId");
            return (Criteria) this;
        }

        public Criteria andCpIdLessThan(Long value) {
            addCriterion("cpId <", value, "cpId");
            return (Criteria) this;
        }

        public Criteria andCpIdLessThanOrEqualTo(Long value) {
            addCriterion("cpId <=", value, "cpId");
            return (Criteria) this;
        }

        public Criteria andCpIdIn(List<Long> values) {
            addCriterion("cpId in", values, "cpId");
            return (Criteria) this;
        }

        public Criteria andCpIdNotIn(List<Long> values) {
            addCriterion("cpId not in", values, "cpId");
            return (Criteria) this;
        }

        public Criteria andCpIdBetween(Long value1, Long value2) {
            addCriterion("cpId between", value1, value2, "cpId");
            return (Criteria) this;
        }

        public Criteria andCpIdNotBetween(Long value1, Long value2) {
            addCriterion("cpId not between", value1, value2, "cpId");
            return (Criteria) this;
        }

        public Criteria andPTypeIsNull() {
            addCriterion("pType is null");
            return (Criteria) this;
        }

        public Criteria andPTypeIsNotNull() {
            addCriterion("pType is not null");
            return (Criteria) this;
        }

        public Criteria andPTypeEqualTo(Integer value) {
            addCriterion("pType =", value, "pType");
            return (Criteria) this;
        }

        public Criteria andPTypeNotEqualTo(Integer value) {
            addCriterion("pType <>", value, "pType");
            return (Criteria) this;
        }

        public Criteria andPTypeGreaterThan(Integer value) {
            addCriterion("pType >", value, "pType");
            return (Criteria) this;
        }

        public Criteria andPTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("pType >=", value, "pType");
            return (Criteria) this;
        }

        public Criteria andPTypeLessThan(Integer value) {
            addCriterion("pType <", value, "pType");
            return (Criteria) this;
        }

        public Criteria andPTypeLessThanOrEqualTo(Integer value) {
            addCriterion("pType <=", value, "pType");
            return (Criteria) this;
        }

        public Criteria andPTypeIn(List<Integer> values) {
            addCriterion("pType in", values, "pType");
            return (Criteria) this;
        }

        public Criteria andPTypeNotIn(List<Integer> values) {
            addCriterion("pType not in", values, "pType");
            return (Criteria) this;
        }

        public Criteria andPTypeBetween(Integer value1, Integer value2) {
            addCriterion("pType between", value1, value2, "pType");
            return (Criteria) this;
        }

        public Criteria andPTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("pType not between", value1, value2, "pType");
            return (Criteria) this;
        }

        public Criteria andPicAddressIsNull() {
            addCriterion("picAddress is null");
            return (Criteria) this;
        }

        public Criteria andPicAddressIsNotNull() {
            addCriterion("picAddress is not null");
            return (Criteria) this;
        }

        public Criteria andPicAddressEqualTo(String value) {
            addCriterion("picAddress =", value, "picAddress");
            return (Criteria) this;
        }

        public Criteria andPicAddressNotEqualTo(String value) {
            addCriterion("picAddress <>", value, "picAddress");
            return (Criteria) this;
        }

        public Criteria andPicAddressGreaterThan(String value) {
            addCriterion("picAddress >", value, "picAddress");
            return (Criteria) this;
        }

        public Criteria andPicAddressGreaterThanOrEqualTo(String value) {
            addCriterion("picAddress >=", value, "picAddress");
            return (Criteria) this;
        }

        public Criteria andPicAddressLessThan(String value) {
            addCriterion("picAddress <", value, "picAddress");
            return (Criteria) this;
        }

        public Criteria andPicAddressLessThanOrEqualTo(String value) {
            addCriterion("picAddress <=", value, "picAddress");
            return (Criteria) this;
        }

        public Criteria andPicAddressLike(String value) {
            addCriterion("picAddress like", value, "picAddress");
            return (Criteria) this;
        }

        public Criteria andPicAddressNotLike(String value) {
            addCriterion("picAddress not like", value, "picAddress");
            return (Criteria) this;
        }

        public Criteria andPicAddressIn(List<String> values) {
            addCriterion("picAddress in", values, "picAddress");
            return (Criteria) this;
        }

        public Criteria andPicAddressNotIn(List<String> values) {
            addCriterion("picAddress not in", values, "picAddress");
            return (Criteria) this;
        }

        public Criteria andPicAddressBetween(String value1, String value2) {
            addCriterion("picAddress between", value1, value2, "picAddress");
            return (Criteria) this;
        }

        public Criteria andPicAddressNotBetween(String value1, String value2) {
            addCriterion("picAddress not between", value1, value2, "picAddress");
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

        public Criteria andIsShowIsNull() {
            addCriterion("isShow is null");
            return (Criteria) this;
        }

        public Criteria andIsShowIsNotNull() {
            addCriterion("isShow is not null");
            return (Criteria) this;
        }

        public Criteria andIsShowEqualTo(Integer value) {
            addCriterion("isShow =", value, "isShow");
            return (Criteria) this;
        }

        public Criteria andIsShowNotEqualTo(Integer value) {
            addCriterion("isShow <>", value, "isShow");
            return (Criteria) this;
        }

        public Criteria andIsShowGreaterThan(Integer value) {
            addCriterion("isShow >", value, "isShow");
            return (Criteria) this;
        }

        public Criteria andIsShowGreaterThanOrEqualTo(Integer value) {
            addCriterion("isShow >=", value, "isShow");
            return (Criteria) this;
        }

        public Criteria andIsShowLessThan(Integer value) {
            addCriterion("isShow <", value, "isShow");
            return (Criteria) this;
        }

        public Criteria andIsShowLessThanOrEqualTo(Integer value) {
            addCriterion("isShow <=", value, "isShow");
            return (Criteria) this;
        }

        public Criteria andIsShowIn(List<Integer> values) {
            addCriterion("isShow in", values, "isShow");
            return (Criteria) this;
        }

        public Criteria andIsShowNotIn(List<Integer> values) {
            addCriterion("isShow not in", values, "isShow");
            return (Criteria) this;
        }

        public Criteria andIsShowBetween(Integer value1, Integer value2) {
            addCriterion("isShow between", value1, value2, "isShow");
            return (Criteria) this;
        }

        public Criteria andIsShowNotBetween(Integer value1, Integer value2) {
            addCriterion("isShow not between", value1, value2, "isShow");
            return (Criteria) this;
        }

        public Criteria andPicAddressLikeInsensitive(String value) {
            addCriterion("upper(picAddress) like", value.toUpperCase(), "picAddress");
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