package com.wuhenjian.aurora.utils.entity.dao;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MemberPushCriteria {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected Integer limitStart;

    protected Integer limitEnd;

    public MemberPushCriteria() {
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

        public Criteria andMpIdIsNull() {
            addCriterion("mpId is null");
            return (Criteria) this;
        }

        public Criteria andMpIdIsNotNull() {
            addCriterion("mpId is not null");
            return (Criteria) this;
        }

        public Criteria andMpIdEqualTo(Long value) {
            addCriterion("mpId =", value, "mpId");
            return (Criteria) this;
        }

        public Criteria andMpIdNotEqualTo(Long value) {
            addCriterion("mpId <>", value, "mpId");
            return (Criteria) this;
        }

        public Criteria andMpIdGreaterThan(Long value) {
            addCriterion("mpId >", value, "mpId");
            return (Criteria) this;
        }

        public Criteria andMpIdGreaterThanOrEqualTo(Long value) {
            addCriterion("mpId >=", value, "mpId");
            return (Criteria) this;
        }

        public Criteria andMpIdLessThan(Long value) {
            addCriterion("mpId <", value, "mpId");
            return (Criteria) this;
        }

        public Criteria andMpIdLessThanOrEqualTo(Long value) {
            addCriterion("mpId <=", value, "mpId");
            return (Criteria) this;
        }

        public Criteria andMpIdIn(List<Long> values) {
            addCriterion("mpId in", values, "mpId");
            return (Criteria) this;
        }

        public Criteria andMpIdNotIn(List<Long> values) {
            addCriterion("mpId not in", values, "mpId");
            return (Criteria) this;
        }

        public Criteria andMpIdBetween(Long value1, Long value2) {
            addCriterion("mpId between", value1, value2, "mpId");
            return (Criteria) this;
        }

        public Criteria andMpIdNotBetween(Long value1, Long value2) {
            addCriterion("mpId not between", value1, value2, "mpId");
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

        public Criteria andPhoneIsNull() {
            addCriterion("phone is null");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNotNull() {
            addCriterion("phone is not null");
            return (Criteria) this;
        }

        public Criteria andPhoneEqualTo(Integer value) {
            addCriterion("phone =", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotEqualTo(Integer value) {
            addCriterion("phone <>", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThan(Integer value) {
            addCriterion("phone >", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThanOrEqualTo(Integer value) {
            addCriterion("phone >=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThan(Integer value) {
            addCriterion("phone <", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThanOrEqualTo(Integer value) {
            addCriterion("phone <=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneIn(List<Integer> values) {
            addCriterion("phone in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotIn(List<Integer> values) {
            addCriterion("phone not in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneBetween(Integer value1, Integer value2) {
            addCriterion("phone between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotBetween(Integer value1, Integer value2) {
            addCriterion("phone not between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andEmailIsNull() {
            addCriterion("service is null");
            return (Criteria) this;
        }

        public Criteria andEmailIsNotNull() {
            addCriterion("service is not null");
            return (Criteria) this;
        }

        public Criteria andEmailEqualTo(Integer value) {
            addCriterion("service =", value, "service");
            return (Criteria) this;
        }

        public Criteria andEmailNotEqualTo(Integer value) {
            addCriterion("service <>", value, "service");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThan(Integer value) {
            addCriterion("service >", value, "service");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThanOrEqualTo(Integer value) {
            addCriterion("service >=", value, "service");
            return (Criteria) this;
        }

        public Criteria andEmailLessThan(Integer value) {
            addCriterion("service <", value, "service");
            return (Criteria) this;
        }

        public Criteria andEmailLessThanOrEqualTo(Integer value) {
            addCriterion("service <=", value, "service");
            return (Criteria) this;
        }

        public Criteria andEmailIn(List<Integer> values) {
            addCriterion("service in", values, "service");
            return (Criteria) this;
        }

        public Criteria andEmailNotIn(List<Integer> values) {
            addCriterion("service not in", values, "service");
            return (Criteria) this;
        }

        public Criteria andEmailBetween(Integer value1, Integer value2) {
            addCriterion("service between", value1, value2, "service");
            return (Criteria) this;
        }

        public Criteria andEmailNotBetween(Integer value1, Integer value2) {
            addCriterion("service not between", value1, value2, "service");
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