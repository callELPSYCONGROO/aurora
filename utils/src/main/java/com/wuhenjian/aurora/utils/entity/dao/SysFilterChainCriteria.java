package com.wuhenjian.aurora.utils.entity.dao;

import java.util.ArrayList;
import java.util.List;

public class SysFilterChainCriteria {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected Integer limitStart;

    protected Integer limitEnd;

    public SysFilterChainCriteria() {
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

        public Criteria andSfcIdIsNull() {
            addCriterion("sfcId is null");
            return (Criteria) this;
        }

        public Criteria andSfcIdIsNotNull() {
            addCriterion("sfcId is not null");
            return (Criteria) this;
        }

        public Criteria andSfcIdEqualTo(Long value) {
            addCriterion("sfcId =", value, "sfcId");
            return (Criteria) this;
        }

        public Criteria andSfcIdNotEqualTo(Long value) {
            addCriterion("sfcId <>", value, "sfcId");
            return (Criteria) this;
        }

        public Criteria andSfcIdGreaterThan(Long value) {
            addCriterion("sfcId >", value, "sfcId");
            return (Criteria) this;
        }

        public Criteria andSfcIdGreaterThanOrEqualTo(Long value) {
            addCriterion("sfcId >=", value, "sfcId");
            return (Criteria) this;
        }

        public Criteria andSfcIdLessThan(Long value) {
            addCriterion("sfcId <", value, "sfcId");
            return (Criteria) this;
        }

        public Criteria andSfcIdLessThanOrEqualTo(Long value) {
            addCriterion("sfcId <=", value, "sfcId");
            return (Criteria) this;
        }

        public Criteria andSfcIdIn(List<Long> values) {
            addCriterion("sfcId in", values, "sfcId");
            return (Criteria) this;
        }

        public Criteria andSfcIdNotIn(List<Long> values) {
            addCriterion("sfcId not in", values, "sfcId");
            return (Criteria) this;
        }

        public Criteria andSfcIdBetween(Long value1, Long value2) {
            addCriterion("sfcId between", value1, value2, "sfcId");
            return (Criteria) this;
        }

        public Criteria andSfcIdNotBetween(Long value1, Long value2) {
            addCriterion("sfcId not between", value1, value2, "sfcId");
            return (Criteria) this;
        }

        public Criteria andUrlIsNull() {
            addCriterion("url is null");
            return (Criteria) this;
        }

        public Criteria andUrlIsNotNull() {
            addCriterion("url is not null");
            return (Criteria) this;
        }

        public Criteria andUrlEqualTo(String value) {
            addCriterion("url =", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlNotEqualTo(String value) {
            addCriterion("url <>", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlGreaterThan(String value) {
            addCriterion("url >", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlGreaterThanOrEqualTo(String value) {
            addCriterion("url >=", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlLessThan(String value) {
            addCriterion("url <", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlLessThanOrEqualTo(String value) {
            addCriterion("url <=", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlLike(String value) {
            addCriterion("url like", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlNotLike(String value) {
            addCriterion("url not like", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlIn(List<String> values) {
            addCriterion("url in", values, "url");
            return (Criteria) this;
        }

        public Criteria andUrlNotIn(List<String> values) {
            addCriterion("url not in", values, "url");
            return (Criteria) this;
        }

        public Criteria andUrlBetween(String value1, String value2) {
            addCriterion("url between", value1, value2, "url");
            return (Criteria) this;
        }

        public Criteria andUrlNotBetween(String value1, String value2) {
            addCriterion("url not between", value1, value2, "url");
            return (Criteria) this;
        }

        public Criteria andFilterRoleIsNull() {
            addCriterion("filterRole is null");
            return (Criteria) this;
        }

        public Criteria andFilterRoleIsNotNull() {
            addCriterion("filterRole is not null");
            return (Criteria) this;
        }

        public Criteria andFilterRoleEqualTo(String value) {
            addCriterion("filterRole =", value, "filterRole");
            return (Criteria) this;
        }

        public Criteria andFilterRoleNotEqualTo(String value) {
            addCriterion("filterRole <>", value, "filterRole");
            return (Criteria) this;
        }

        public Criteria andFilterRoleGreaterThan(String value) {
            addCriterion("filterRole >", value, "filterRole");
            return (Criteria) this;
        }

        public Criteria andFilterRoleGreaterThanOrEqualTo(String value) {
            addCriterion("filterRole >=", value, "filterRole");
            return (Criteria) this;
        }

        public Criteria andFilterRoleLessThan(String value) {
            addCriterion("filterRole <", value, "filterRole");
            return (Criteria) this;
        }

        public Criteria andFilterRoleLessThanOrEqualTo(String value) {
            addCriterion("filterRole <=", value, "filterRole");
            return (Criteria) this;
        }

        public Criteria andFilterRoleLike(String value) {
            addCriterion("filterRole like", value, "filterRole");
            return (Criteria) this;
        }

        public Criteria andFilterRoleNotLike(String value) {
            addCriterion("filterRole not like", value, "filterRole");
            return (Criteria) this;
        }

        public Criteria andFilterRoleIn(List<String> values) {
            addCriterion("filterRole in", values, "filterRole");
            return (Criteria) this;
        }

        public Criteria andFilterRoleNotIn(List<String> values) {
            addCriterion("filterRole not in", values, "filterRole");
            return (Criteria) this;
        }

        public Criteria andFilterRoleBetween(String value1, String value2) {
            addCriterion("filterRole between", value1, value2, "filterRole");
            return (Criteria) this;
        }

        public Criteria andFilterRoleNotBetween(String value1, String value2) {
            addCriterion("filterRole not between", value1, value2, "filterRole");
            return (Criteria) this;
        }

        public Criteria andSortIsNull() {
            addCriterion("sort is null");
            return (Criteria) this;
        }

        public Criteria andSortIsNotNull() {
            addCriterion("sort is not null");
            return (Criteria) this;
        }

        public Criteria andSortEqualTo(Integer value) {
            addCriterion("sort =", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortNotEqualTo(Integer value) {
            addCriterion("sort <>", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortGreaterThan(Integer value) {
            addCriterion("sort >", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortGreaterThanOrEqualTo(Integer value) {
            addCriterion("sort >=", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortLessThan(Integer value) {
            addCriterion("sort <", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortLessThanOrEqualTo(Integer value) {
            addCriterion("sort <=", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortIn(List<Integer> values) {
            addCriterion("sort in", values, "sort");
            return (Criteria) this;
        }

        public Criteria andSortNotIn(List<Integer> values) {
            addCriterion("sort not in", values, "sort");
            return (Criteria) this;
        }

        public Criteria andSortBetween(Integer value1, Integer value2) {
            addCriterion("sort between", value1, value2, "sort");
            return (Criteria) this;
        }

        public Criteria andSortNotBetween(Integer value1, Integer value2) {
            addCriterion("sort not between", value1, value2, "sort");
            return (Criteria) this;
        }

        public Criteria andUrlLikeInsensitive(String value) {
            addCriterion("upper(url) like", value.toUpperCase(), "url");
            return (Criteria) this;
        }

        public Criteria andFilterRoleLikeInsensitive(String value) {
            addCriterion("upper(filterRole) like", value.toUpperCase(), "filterRole");
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