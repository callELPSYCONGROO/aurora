package com.wuhenjian.aurora.utils.entity.dao;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CommonAdCriteria {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected Integer limitStart;

    protected Integer limitEnd;

    public CommonAdCriteria() {
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

        public Criteria andCaIdIsNull() {
            addCriterion("caId is null");
            return (Criteria) this;
        }

        public Criteria andCaIdIsNotNull() {
            addCriterion("caId is not null");
            return (Criteria) this;
        }

        public Criteria andCaIdEqualTo(Long value) {
            addCriterion("caId =", value, "caId");
            return (Criteria) this;
        }

        public Criteria andCaIdNotEqualTo(Long value) {
            addCriterion("caId <>", value, "caId");
            return (Criteria) this;
        }

        public Criteria andCaIdGreaterThan(Long value) {
            addCriterion("caId >", value, "caId");
            return (Criteria) this;
        }

        public Criteria andCaIdGreaterThanOrEqualTo(Long value) {
            addCriterion("caId >=", value, "caId");
            return (Criteria) this;
        }

        public Criteria andCaIdLessThan(Long value) {
            addCriterion("caId <", value, "caId");
            return (Criteria) this;
        }

        public Criteria andCaIdLessThanOrEqualTo(Long value) {
            addCriterion("caId <=", value, "caId");
            return (Criteria) this;
        }

        public Criteria andCaIdIn(List<Long> values) {
            addCriterion("caId in", values, "caId");
            return (Criteria) this;
        }

        public Criteria andCaIdNotIn(List<Long> values) {
            addCriterion("caId not in", values, "caId");
            return (Criteria) this;
        }

        public Criteria andCaIdBetween(Long value1, Long value2) {
            addCriterion("caId between", value1, value2, "caId");
            return (Criteria) this;
        }

        public Criteria andCaIdNotBetween(Long value1, Long value2) {
            addCriterion("caId not between", value1, value2, "caId");
            return (Criteria) this;
        }

        public Criteria andAdTypeIsNull() {
            addCriterion("adType is null");
            return (Criteria) this;
        }

        public Criteria andAdTypeIsNotNull() {
            addCriterion("adType is not null");
            return (Criteria) this;
        }

        public Criteria andAdTypeEqualTo(Integer value) {
            addCriterion("adType =", value, "adType");
            return (Criteria) this;
        }

        public Criteria andAdTypeNotEqualTo(Integer value) {
            addCriterion("adType <>", value, "adType");
            return (Criteria) this;
        }

        public Criteria andAdTypeGreaterThan(Integer value) {
            addCriterion("adType >", value, "adType");
            return (Criteria) this;
        }

        public Criteria andAdTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("adType >=", value, "adType");
            return (Criteria) this;
        }

        public Criteria andAdTypeLessThan(Integer value) {
            addCriterion("adType <", value, "adType");
            return (Criteria) this;
        }

        public Criteria andAdTypeLessThanOrEqualTo(Integer value) {
            addCriterion("adType <=", value, "adType");
            return (Criteria) this;
        }

        public Criteria andAdTypeIn(List<Integer> values) {
            addCriterion("adType in", values, "adType");
            return (Criteria) this;
        }

        public Criteria andAdTypeNotIn(List<Integer> values) {
            addCriterion("adType not in", values, "adType");
            return (Criteria) this;
        }

        public Criteria andAdTypeBetween(Integer value1, Integer value2) {
            addCriterion("adType between", value1, value2, "adType");
            return (Criteria) this;
        }

        public Criteria andAdTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("adType not between", value1, value2, "adType");
            return (Criteria) this;
        }

        public Criteria andAdTitleIsNull() {
            addCriterion("adTitle is null");
            return (Criteria) this;
        }

        public Criteria andAdTitleIsNotNull() {
            addCriterion("adTitle is not null");
            return (Criteria) this;
        }

        public Criteria andAdTitleEqualTo(String value) {
            addCriterion("adTitle =", value, "adTitle");
            return (Criteria) this;
        }

        public Criteria andAdTitleNotEqualTo(String value) {
            addCriterion("adTitle <>", value, "adTitle");
            return (Criteria) this;
        }

        public Criteria andAdTitleGreaterThan(String value) {
            addCriterion("adTitle >", value, "adTitle");
            return (Criteria) this;
        }

        public Criteria andAdTitleGreaterThanOrEqualTo(String value) {
            addCriterion("adTitle >=", value, "adTitle");
            return (Criteria) this;
        }

        public Criteria andAdTitleLessThan(String value) {
            addCriterion("adTitle <", value, "adTitle");
            return (Criteria) this;
        }

        public Criteria andAdTitleLessThanOrEqualTo(String value) {
            addCriterion("adTitle <=", value, "adTitle");
            return (Criteria) this;
        }

        public Criteria andAdTitleLike(String value) {
            addCriterion("adTitle like", value, "adTitle");
            return (Criteria) this;
        }

        public Criteria andAdTitleNotLike(String value) {
            addCriterion("adTitle not like", value, "adTitle");
            return (Criteria) this;
        }

        public Criteria andAdTitleIn(List<String> values) {
            addCriterion("adTitle in", values, "adTitle");
            return (Criteria) this;
        }

        public Criteria andAdTitleNotIn(List<String> values) {
            addCriterion("adTitle not in", values, "adTitle");
            return (Criteria) this;
        }

        public Criteria andAdTitleBetween(String value1, String value2) {
            addCriterion("adTitle between", value1, value2, "adTitle");
            return (Criteria) this;
        }

        public Criteria andAdTitleNotBetween(String value1, String value2) {
            addCriterion("adTitle not between", value1, value2, "adTitle");
            return (Criteria) this;
        }

        public Criteria andImageIdIsNull() {
            addCriterion("imageId is null");
            return (Criteria) this;
        }

        public Criteria andImageIdIsNotNull() {
            addCriterion("imageId is not null");
            return (Criteria) this;
        }

        public Criteria andImageIdEqualTo(Long value) {
            addCriterion("imageId =", value, "imageId");
            return (Criteria) this;
        }

        public Criteria andImageIdNotEqualTo(Long value) {
            addCriterion("imageId <>", value, "imageId");
            return (Criteria) this;
        }

        public Criteria andImageIdGreaterThan(Long value) {
            addCriterion("imageId >", value, "imageId");
            return (Criteria) this;
        }

        public Criteria andImageIdGreaterThanOrEqualTo(Long value) {
            addCriterion("imageId >=", value, "imageId");
            return (Criteria) this;
        }

        public Criteria andImageIdLessThan(Long value) {
            addCriterion("imageId <", value, "imageId");
            return (Criteria) this;
        }

        public Criteria andImageIdLessThanOrEqualTo(Long value) {
            addCriterion("imageId <=", value, "imageId");
            return (Criteria) this;
        }

        public Criteria andImageIdIn(List<Long> values) {
            addCriterion("imageId in", values, "imageId");
            return (Criteria) this;
        }

        public Criteria andImageIdNotIn(List<Long> values) {
            addCriterion("imageId not in", values, "imageId");
            return (Criteria) this;
        }

        public Criteria andImageIdBetween(Long value1, Long value2) {
            addCriterion("imageId between", value1, value2, "imageId");
            return (Criteria) this;
        }

        public Criteria andImageIdNotBetween(Long value1, Long value2) {
            addCriterion("imageId not between", value1, value2, "imageId");
            return (Criteria) this;
        }

        public Criteria andImageLinkIsNull() {
            addCriterion("imageLink is null");
            return (Criteria) this;
        }

        public Criteria andImageLinkIsNotNull() {
            addCriterion("imageLink is not null");
            return (Criteria) this;
        }

        public Criteria andImageLinkEqualTo(String value) {
            addCriterion("imageLink =", value, "imageLink");
            return (Criteria) this;
        }

        public Criteria andImageLinkNotEqualTo(String value) {
            addCriterion("imageLink <>", value, "imageLink");
            return (Criteria) this;
        }

        public Criteria andImageLinkGreaterThan(String value) {
            addCriterion("imageLink >", value, "imageLink");
            return (Criteria) this;
        }

        public Criteria andImageLinkGreaterThanOrEqualTo(String value) {
            addCriterion("imageLink >=", value, "imageLink");
            return (Criteria) this;
        }

        public Criteria andImageLinkLessThan(String value) {
            addCriterion("imageLink <", value, "imageLink");
            return (Criteria) this;
        }

        public Criteria andImageLinkLessThanOrEqualTo(String value) {
            addCriterion("imageLink <=", value, "imageLink");
            return (Criteria) this;
        }

        public Criteria andImageLinkLike(String value) {
            addCriterion("imageLink like", value, "imageLink");
            return (Criteria) this;
        }

        public Criteria andImageLinkNotLike(String value) {
            addCriterion("imageLink not like", value, "imageLink");
            return (Criteria) this;
        }

        public Criteria andImageLinkIn(List<String> values) {
            addCriterion("imageLink in", values, "imageLink");
            return (Criteria) this;
        }

        public Criteria andImageLinkNotIn(List<String> values) {
            addCriterion("imageLink not in", values, "imageLink");
            return (Criteria) this;
        }

        public Criteria andImageLinkBetween(String value1, String value2) {
            addCriterion("imageLink between", value1, value2, "imageLink");
            return (Criteria) this;
        }

        public Criteria andImageLinkNotBetween(String value1, String value2) {
            addCriterion("imageLink not between", value1, value2, "imageLink");
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

        public Criteria andCreateUserIsNull() {
            addCriterion("createUser is null");
            return (Criteria) this;
        }

        public Criteria andCreateUserIsNotNull() {
            addCriterion("createUser is not null");
            return (Criteria) this;
        }

        public Criteria andCreateUserEqualTo(Long value) {
            addCriterion("createUser =", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserNotEqualTo(Long value) {
            addCriterion("createUser <>", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserGreaterThan(Long value) {
            addCriterion("createUser >", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserGreaterThanOrEqualTo(Long value) {
            addCriterion("createUser >=", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserLessThan(Long value) {
            addCriterion("createUser <", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserLessThanOrEqualTo(Long value) {
            addCriterion("createUser <=", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserIn(List<Long> values) {
            addCriterion("createUser in", values, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserNotIn(List<Long> values) {
            addCriterion("createUser not in", values, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserBetween(Long value1, Long value2) {
            addCriterion("createUser between", value1, value2, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserNotBetween(Long value1, Long value2) {
            addCriterion("createUser not between", value1, value2, "createUser");
            return (Criteria) this;
        }

        public Criteria andAdTitleLikeInsensitive(String value) {
            addCriterion("upper(adTitle) like", value.toUpperCase(), "adTitle");
            return (Criteria) this;
        }

        public Criteria andImageLinkLikeInsensitive(String value) {
            addCriterion("upper(imageLink) like", value.toUpperCase(), "imageLink");
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