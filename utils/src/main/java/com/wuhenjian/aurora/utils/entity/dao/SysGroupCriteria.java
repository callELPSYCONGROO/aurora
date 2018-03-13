package com.wuhenjian.aurora.utils.entity.dao;

import java.util.ArrayList;
import java.util.List;

public class SysGroupCriteria {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected Integer limitStart;

    protected Integer limitEnd;

    public SysGroupCriteria() {
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

        public Criteria andGnameIsNull() {
            addCriterion("gname is null");
            return (Criteria) this;
        }

        public Criteria andGnameIsNotNull() {
            addCriterion("gname is not null");
            return (Criteria) this;
        }

        public Criteria andGnameEqualTo(String value) {
            addCriterion("gname =", value, "gname");
            return (Criteria) this;
        }

        public Criteria andGnameNotEqualTo(String value) {
            addCriterion("gname <>", value, "gname");
            return (Criteria) this;
        }

        public Criteria andGnameGreaterThan(String value) {
            addCriterion("gname >", value, "gname");
            return (Criteria) this;
        }

        public Criteria andGnameGreaterThanOrEqualTo(String value) {
            addCriterion("gname >=", value, "gname");
            return (Criteria) this;
        }

        public Criteria andGnameLessThan(String value) {
            addCriterion("gname <", value, "gname");
            return (Criteria) this;
        }

        public Criteria andGnameLessThanOrEqualTo(String value) {
            addCriterion("gname <=", value, "gname");
            return (Criteria) this;
        }

        public Criteria andGnameLike(String value) {
            addCriterion("gname like", value, "gname");
            return (Criteria) this;
        }

        public Criteria andGnameNotLike(String value) {
            addCriterion("gname not like", value, "gname");
            return (Criteria) this;
        }

        public Criteria andGnameIn(List<String> values) {
            addCriterion("gname in", values, "gname");
            return (Criteria) this;
        }

        public Criteria andGnameNotIn(List<String> values) {
            addCriterion("gname not in", values, "gname");
            return (Criteria) this;
        }

        public Criteria andGnameBetween(String value1, String value2) {
            addCriterion("gname between", value1, value2, "gname");
            return (Criteria) this;
        }

        public Criteria andGnameNotBetween(String value1, String value2) {
            addCriterion("gname not between", value1, value2, "gname");
            return (Criteria) this;
        }

        public Criteria andGlevelIsNull() {
            addCriterion("glevel is null");
            return (Criteria) this;
        }

        public Criteria andGlevelIsNotNull() {
            addCriterion("glevel is not null");
            return (Criteria) this;
        }

        public Criteria andGlevelEqualTo(Integer value) {
            addCriterion("glevel =", value, "glevel");
            return (Criteria) this;
        }

        public Criteria andGlevelNotEqualTo(Integer value) {
            addCriterion("glevel <>", value, "glevel");
            return (Criteria) this;
        }

        public Criteria andGlevelGreaterThan(Integer value) {
            addCriterion("glevel >", value, "glevel");
            return (Criteria) this;
        }

        public Criteria andGlevelGreaterThanOrEqualTo(Integer value) {
            addCriterion("glevel >=", value, "glevel");
            return (Criteria) this;
        }

        public Criteria andGlevelLessThan(Integer value) {
            addCriterion("glevel <", value, "glevel");
            return (Criteria) this;
        }

        public Criteria andGlevelLessThanOrEqualTo(Integer value) {
            addCriterion("glevel <=", value, "glevel");
            return (Criteria) this;
        }

        public Criteria andGlevelIn(List<Integer> values) {
            addCriterion("glevel in", values, "glevel");
            return (Criteria) this;
        }

        public Criteria andGlevelNotIn(List<Integer> values) {
            addCriterion("glevel not in", values, "glevel");
            return (Criteria) this;
        }

        public Criteria andGlevelBetween(Integer value1, Integer value2) {
            addCriterion("glevel between", value1, value2, "glevel");
            return (Criteria) this;
        }

        public Criteria andGlevelNotBetween(Integer value1, Integer value2) {
            addCriterion("glevel not between", value1, value2, "glevel");
            return (Criteria) this;
        }

        public Criteria andGstatusIsNull() {
            addCriterion("gstatus is null");
            return (Criteria) this;
        }

        public Criteria andGstatusIsNotNull() {
            addCriterion("gstatus is not null");
            return (Criteria) this;
        }

        public Criteria andGstatusEqualTo(Integer value) {
            addCriterion("gstatus =", value, "gstatus");
            return (Criteria) this;
        }

        public Criteria andGstatusNotEqualTo(Integer value) {
            addCriterion("gstatus <>", value, "gstatus");
            return (Criteria) this;
        }

        public Criteria andGstatusGreaterThan(Integer value) {
            addCriterion("gstatus >", value, "gstatus");
            return (Criteria) this;
        }

        public Criteria andGstatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("gstatus >=", value, "gstatus");
            return (Criteria) this;
        }

        public Criteria andGstatusLessThan(Integer value) {
            addCriterion("gstatus <", value, "gstatus");
            return (Criteria) this;
        }

        public Criteria andGstatusLessThanOrEqualTo(Integer value) {
            addCriterion("gstatus <=", value, "gstatus");
            return (Criteria) this;
        }

        public Criteria andGstatusIn(List<Integer> values) {
            addCriterion("gstatus in", values, "gstatus");
            return (Criteria) this;
        }

        public Criteria andGstatusNotIn(List<Integer> values) {
            addCriterion("gstatus not in", values, "gstatus");
            return (Criteria) this;
        }

        public Criteria andGstatusBetween(Integer value1, Integer value2) {
            addCriterion("gstatus between", value1, value2, "gstatus");
            return (Criteria) this;
        }

        public Criteria andGstatusNotBetween(Integer value1, Integer value2) {
            addCriterion("gstatus not between", value1, value2, "gstatus");
            return (Criteria) this;
        }

        public Criteria andGnameLikeInsensitive(String value) {
            addCriterion("upper(gname) like", value.toUpperCase(), "gname");
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