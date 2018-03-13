package com.wuhenjian.aurora.utils.entity.dao;

import java.util.ArrayList;
import java.util.List;

public class SysUserGroupCriteria {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected Integer limitStart;

    protected Integer limitEnd;

    public SysUserGroupCriteria() {
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

        public Criteria andSugIdIsNull() {
            addCriterion("sugId is null");
            return (Criteria) this;
        }

        public Criteria andSugIdIsNotNull() {
            addCriterion("sugId is not null");
            return (Criteria) this;
        }

        public Criteria andSugIdEqualTo(Long value) {
            addCriterion("sugId =", value, "sugId");
            return (Criteria) this;
        }

        public Criteria andSugIdNotEqualTo(Long value) {
            addCriterion("sugId <>", value, "sugId");
            return (Criteria) this;
        }

        public Criteria andSugIdGreaterThan(Long value) {
            addCriterion("sugId >", value, "sugId");
            return (Criteria) this;
        }

        public Criteria andSugIdGreaterThanOrEqualTo(Long value) {
            addCriterion("sugId >=", value, "sugId");
            return (Criteria) this;
        }

        public Criteria andSugIdLessThan(Long value) {
            addCriterion("sugId <", value, "sugId");
            return (Criteria) this;
        }

        public Criteria andSugIdLessThanOrEqualTo(Long value) {
            addCriterion("sugId <=", value, "sugId");
            return (Criteria) this;
        }

        public Criteria andSugIdIn(List<Long> values) {
            addCriterion("sugId in", values, "sugId");
            return (Criteria) this;
        }

        public Criteria andSugIdNotIn(List<Long> values) {
            addCriterion("sugId not in", values, "sugId");
            return (Criteria) this;
        }

        public Criteria andSugIdBetween(Long value1, Long value2) {
            addCriterion("sugId between", value1, value2, "sugId");
            return (Criteria) this;
        }

        public Criteria andSugIdNotBetween(Long value1, Long value2) {
            addCriterion("sugId not between", value1, value2, "sugId");
            return (Criteria) this;
        }

        public Criteria andSgIdIsNull() {
            addCriterion("sgId is null");
            return (Criteria) this;
        }

        public Criteria andSgIdIsNotNull() {
            addCriterion("sgId is not null");
            return (Criteria) this;
        }

        public Criteria andSgIdEqualTo(Long value) {
            addCriterion("sgId =", value, "sgId");
            return (Criteria) this;
        }

        public Criteria andSgIdNotEqualTo(Long value) {
            addCriterion("sgId <>", value, "sgId");
            return (Criteria) this;
        }

        public Criteria andSgIdGreaterThan(Long value) {
            addCriterion("sgId >", value, "sgId");
            return (Criteria) this;
        }

        public Criteria andSgIdGreaterThanOrEqualTo(Long value) {
            addCriterion("sgId >=", value, "sgId");
            return (Criteria) this;
        }

        public Criteria andSgIdLessThan(Long value) {
            addCriterion("sgId <", value, "sgId");
            return (Criteria) this;
        }

        public Criteria andSgIdLessThanOrEqualTo(Long value) {
            addCriterion("sgId <=", value, "sgId");
            return (Criteria) this;
        }

        public Criteria andSgIdIn(List<Long> values) {
            addCriterion("sgId in", values, "sgId");
            return (Criteria) this;
        }

        public Criteria andSgIdNotIn(List<Long> values) {
            addCriterion("sgId not in", values, "sgId");
            return (Criteria) this;
        }

        public Criteria andSgIdBetween(Long value1, Long value2) {
            addCriterion("sgId between", value1, value2, "sgId");
            return (Criteria) this;
        }

        public Criteria andSgIdNotBetween(Long value1, Long value2) {
            addCriterion("sgId not between", value1, value2, "sgId");
            return (Criteria) this;
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