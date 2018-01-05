package com.wuhenjian.aurora.utils.entity.dao;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MemberPhotoAlbumPictureCriteria {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected Integer limitStart;

    protected Integer limitEnd;

    public MemberPhotoAlbumPictureCriteria() {
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

        public Criteria andMpapIdIsNull() {
            addCriterion("mpapId is null");
            return (Criteria) this;
        }

        public Criteria andMpapIdIsNotNull() {
            addCriterion("mpapId is not null");
            return (Criteria) this;
        }

        public Criteria andMpapIdEqualTo(Long value) {
            addCriterion("mpapId =", value, "mpapId");
            return (Criteria) this;
        }

        public Criteria andMpapIdNotEqualTo(Long value) {
            addCriterion("mpapId <>", value, "mpapId");
            return (Criteria) this;
        }

        public Criteria andMpapIdGreaterThan(Long value) {
            addCriterion("mpapId >", value, "mpapId");
            return (Criteria) this;
        }

        public Criteria andMpapIdGreaterThanOrEqualTo(Long value) {
            addCriterion("mpapId >=", value, "mpapId");
            return (Criteria) this;
        }

        public Criteria andMpapIdLessThan(Long value) {
            addCriterion("mpapId <", value, "mpapId");
            return (Criteria) this;
        }

        public Criteria andMpapIdLessThanOrEqualTo(Long value) {
            addCriterion("mpapId <=", value, "mpapId");
            return (Criteria) this;
        }

        public Criteria andMpapIdIn(List<Long> values) {
            addCriterion("mpapId in", values, "mpapId");
            return (Criteria) this;
        }

        public Criteria andMpapIdNotIn(List<Long> values) {
            addCriterion("mpapId not in", values, "mpapId");
            return (Criteria) this;
        }

        public Criteria andMpapIdBetween(Long value1, Long value2) {
            addCriterion("mpapId between", value1, value2, "mpapId");
            return (Criteria) this;
        }

        public Criteria andMpapIdNotBetween(Long value1, Long value2) {
            addCriterion("mpapId not between", value1, value2, "mpapId");
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

        public Criteria andMpaIdIsNull() {
            addCriterion("mpaId is null");
            return (Criteria) this;
        }

        public Criteria andMpaIdIsNotNull() {
            addCriterion("mpaId is not null");
            return (Criteria) this;
        }

        public Criteria andMpaIdEqualTo(Long value) {
            addCriterion("mpaId =", value, "mpaId");
            return (Criteria) this;
        }

        public Criteria andMpaIdNotEqualTo(Long value) {
            addCriterion("mpaId <>", value, "mpaId");
            return (Criteria) this;
        }

        public Criteria andMpaIdGreaterThan(Long value) {
            addCriterion("mpaId >", value, "mpaId");
            return (Criteria) this;
        }

        public Criteria andMpaIdGreaterThanOrEqualTo(Long value) {
            addCriterion("mpaId >=", value, "mpaId");
            return (Criteria) this;
        }

        public Criteria andMpaIdLessThan(Long value) {
            addCriterion("mpaId <", value, "mpaId");
            return (Criteria) this;
        }

        public Criteria andMpaIdLessThanOrEqualTo(Long value) {
            addCriterion("mpaId <=", value, "mpaId");
            return (Criteria) this;
        }

        public Criteria andMpaIdIn(List<Long> values) {
            addCriterion("mpaId in", values, "mpaId");
            return (Criteria) this;
        }

        public Criteria andMpaIdNotIn(List<Long> values) {
            addCriterion("mpaId not in", values, "mpaId");
            return (Criteria) this;
        }

        public Criteria andMpaIdBetween(Long value1, Long value2) {
            addCriterion("mpaId between", value1, value2, "mpaId");
            return (Criteria) this;
        }

        public Criteria andMpaIdNotBetween(Long value1, Long value2) {
            addCriterion("mpaId not between", value1, value2, "mpaId");
            return (Criteria) this;
        }

        public Criteria andRelativePathIsNull() {
            addCriterion("relativePath is null");
            return (Criteria) this;
        }

        public Criteria andRelativePathIsNotNull() {
            addCriterion("relativePath is not null");
            return (Criteria) this;
        }

        public Criteria andRelativePathEqualTo(String value) {
            addCriterion("relativePath =", value, "relativePath");
            return (Criteria) this;
        }

        public Criteria andRelativePathNotEqualTo(String value) {
            addCriterion("relativePath <>", value, "relativePath");
            return (Criteria) this;
        }

        public Criteria andRelativePathGreaterThan(String value) {
            addCriterion("relativePath >", value, "relativePath");
            return (Criteria) this;
        }

        public Criteria andRelativePathGreaterThanOrEqualTo(String value) {
            addCriterion("relativePath >=", value, "relativePath");
            return (Criteria) this;
        }

        public Criteria andRelativePathLessThan(String value) {
            addCriterion("relativePath <", value, "relativePath");
            return (Criteria) this;
        }

        public Criteria andRelativePathLessThanOrEqualTo(String value) {
            addCriterion("relativePath <=", value, "relativePath");
            return (Criteria) this;
        }

        public Criteria andRelativePathLike(String value) {
            addCriterion("relativePath like", value, "relativePath");
            return (Criteria) this;
        }

        public Criteria andRelativePathNotLike(String value) {
            addCriterion("relativePath not like", value, "relativePath");
            return (Criteria) this;
        }

        public Criteria andRelativePathIn(List<String> values) {
            addCriterion("relativePath in", values, "relativePath");
            return (Criteria) this;
        }

        public Criteria andRelativePathNotIn(List<String> values) {
            addCriterion("relativePath not in", values, "relativePath");
            return (Criteria) this;
        }

        public Criteria andRelativePathBetween(String value1, String value2) {
            addCriterion("relativePath between", value1, value2, "relativePath");
            return (Criteria) this;
        }

        public Criteria andRelativePathNotBetween(String value1, String value2) {
            addCriterion("relativePath not between", value1, value2, "relativePath");
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

        public Criteria andRelativePathLikeInsensitive(String value) {
            addCriterion("upper(relativePath) like", value.toUpperCase(), "relativePath");
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