package com.wuhenjian.aurora.utils.entity.dao;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PhpBlogCriteria {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected Integer limitStart;

    protected Integer limitEnd;

    public PhpBlogCriteria() {
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

        public Criteria andPbIdIsNull() {
            addCriterion("pbId is null");
            return (Criteria) this;
        }

        public Criteria andPbIdIsNotNull() {
            addCriterion("pbId is not null");
            return (Criteria) this;
        }

        public Criteria andPbIdEqualTo(Long value) {
            addCriterion("pbId =", value, "pbId");
            return (Criteria) this;
        }

        public Criteria andPbIdNotEqualTo(Long value) {
            addCriterion("pbId <>", value, "pbId");
            return (Criteria) this;
        }

        public Criteria andPbIdGreaterThan(Long value) {
            addCriterion("pbId >", value, "pbId");
            return (Criteria) this;
        }

        public Criteria andPbIdGreaterThanOrEqualTo(Long value) {
            addCriterion("pbId >=", value, "pbId");
            return (Criteria) this;
        }

        public Criteria andPbIdLessThan(Long value) {
            addCriterion("pbId <", value, "pbId");
            return (Criteria) this;
        }

        public Criteria andPbIdLessThanOrEqualTo(Long value) {
            addCriterion("pbId <=", value, "pbId");
            return (Criteria) this;
        }

        public Criteria andPbIdIn(List<Long> values) {
            addCriterion("pbId in", values, "pbId");
            return (Criteria) this;
        }

        public Criteria andPbIdNotIn(List<Long> values) {
            addCriterion("pbId not in", values, "pbId");
            return (Criteria) this;
        }

        public Criteria andPbIdBetween(Long value1, Long value2) {
            addCriterion("pbId between", value1, value2, "pbId");
            return (Criteria) this;
        }

        public Criteria andPbIdNotBetween(Long value1, Long value2) {
            addCriterion("pbId not between", value1, value2, "pbId");
            return (Criteria) this;
        }

        public Criteria andTitleIsNull() {
            addCriterion("title is null");
            return (Criteria) this;
        }

        public Criteria andTitleIsNotNull() {
            addCriterion("title is not null");
            return (Criteria) this;
        }

        public Criteria andTitleEqualTo(String value) {
            addCriterion("title =", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotEqualTo(String value) {
            addCriterion("title <>", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThan(String value) {
            addCriterion("title >", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThanOrEqualTo(String value) {
            addCriterion("title >=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThan(String value) {
            addCriterion("title <", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThanOrEqualTo(String value) {
            addCriterion("title <=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLike(String value) {
            addCriterion("title like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotLike(String value) {
            addCriterion("title not like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleIn(List<String> values) {
            addCriterion("title in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotIn(List<String> values) {
            addCriterion("title not in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleBetween(String value1, String value2) {
            addCriterion("title between", value1, value2, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotBetween(String value1, String value2) {
            addCriterion("title not between", value1, value2, "title");
            return (Criteria) this;
        }

        public Criteria andTypeIsNull() {
            addCriterion("type is null");
            return (Criteria) this;
        }

        public Criteria andTypeIsNotNull() {
            addCriterion("type is not null");
            return (Criteria) this;
        }

        public Criteria andTypeEqualTo(String value) {
            addCriterion("type =", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotEqualTo(String value) {
            addCriterion("type <>", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThan(String value) {
            addCriterion("type >", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThanOrEqualTo(String value) {
            addCriterion("type >=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThan(String value) {
            addCriterion("type <", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThanOrEqualTo(String value) {
            addCriterion("type <=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLike(String value) {
            addCriterion("type like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotLike(String value) {
            addCriterion("type not like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeIn(List<String> values) {
            addCriterion("type in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotIn(List<String> values) {
            addCriterion("type not in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeBetween(String value1, String value2) {
            addCriterion("type between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotBetween(String value1, String value2) {
            addCriterion("type not between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andCsdnIdIsNull() {
            addCriterion("csdnId is null");
            return (Criteria) this;
        }

        public Criteria andCsdnIdIsNotNull() {
            addCriterion("csdnId is not null");
            return (Criteria) this;
        }

        public Criteria andCsdnIdEqualTo(Long value) {
            addCriterion("csdnId =", value, "csdnId");
            return (Criteria) this;
        }

        public Criteria andCsdnIdNotEqualTo(Long value) {
            addCriterion("csdnId <>", value, "csdnId");
            return (Criteria) this;
        }

        public Criteria andCsdnIdGreaterThan(Long value) {
            addCriterion("csdnId >", value, "csdnId");
            return (Criteria) this;
        }

        public Criteria andCsdnIdGreaterThanOrEqualTo(Long value) {
            addCriterion("csdnId >=", value, "csdnId");
            return (Criteria) this;
        }

        public Criteria andCsdnIdLessThan(Long value) {
            addCriterion("csdnId <", value, "csdnId");
            return (Criteria) this;
        }

        public Criteria andCsdnIdLessThanOrEqualTo(Long value) {
            addCriterion("csdnId <=", value, "csdnId");
            return (Criteria) this;
        }

        public Criteria andCsdnIdIn(List<Long> values) {
            addCriterion("csdnId in", values, "csdnId");
            return (Criteria) this;
        }

        public Criteria andCsdnIdNotIn(List<Long> values) {
            addCriterion("csdnId not in", values, "csdnId");
            return (Criteria) this;
        }

        public Criteria andCsdnIdBetween(Long value1, Long value2) {
            addCriterion("csdnId between", value1, value2, "csdnId");
            return (Criteria) this;
        }

        public Criteria andCsdnIdNotBetween(Long value1, Long value2) {
            addCriterion("csdnId not between", value1, value2, "csdnId");
            return (Criteria) this;
        }

        public Criteria andCategoriesIsNull() {
            addCriterion("categories is null");
            return (Criteria) this;
        }

        public Criteria andCategoriesIsNotNull() {
            addCriterion("categories is not null");
            return (Criteria) this;
        }

        public Criteria andCategoriesEqualTo(String value) {
            addCriterion("categories =", value, "categories");
            return (Criteria) this;
        }

        public Criteria andCategoriesNotEqualTo(String value) {
            addCriterion("categories <>", value, "categories");
            return (Criteria) this;
        }

        public Criteria andCategoriesGreaterThan(String value) {
            addCriterion("categories >", value, "categories");
            return (Criteria) this;
        }

        public Criteria andCategoriesGreaterThanOrEqualTo(String value) {
            addCriterion("categories >=", value, "categories");
            return (Criteria) this;
        }

        public Criteria andCategoriesLessThan(String value) {
            addCriterion("categories <", value, "categories");
            return (Criteria) this;
        }

        public Criteria andCategoriesLessThanOrEqualTo(String value) {
            addCriterion("categories <=", value, "categories");
            return (Criteria) this;
        }

        public Criteria andCategoriesLike(String value) {
            addCriterion("categories like", value, "categories");
            return (Criteria) this;
        }

        public Criteria andCategoriesNotLike(String value) {
            addCriterion("categories not like", value, "categories");
            return (Criteria) this;
        }

        public Criteria andCategoriesIn(List<String> values) {
            addCriterion("categories in", values, "categories");
            return (Criteria) this;
        }

        public Criteria andCategoriesNotIn(List<String> values) {
            addCriterion("categories not in", values, "categories");
            return (Criteria) this;
        }

        public Criteria andCategoriesBetween(String value1, String value2) {
            addCriterion("categories between", value1, value2, "categories");
            return (Criteria) this;
        }

        public Criteria andCategoriesNotBetween(String value1, String value2) {
            addCriterion("categories not between", value1, value2, "categories");
            return (Criteria) this;
        }

        public Criteria andTagsIsNull() {
            addCriterion("tags is null");
            return (Criteria) this;
        }

        public Criteria andTagsIsNotNull() {
            addCriterion("tags is not null");
            return (Criteria) this;
        }

        public Criteria andTagsEqualTo(String value) {
            addCriterion("tags =", value, "tags");
            return (Criteria) this;
        }

        public Criteria andTagsNotEqualTo(String value) {
            addCriterion("tags <>", value, "tags");
            return (Criteria) this;
        }

        public Criteria andTagsGreaterThan(String value) {
            addCriterion("tags >", value, "tags");
            return (Criteria) this;
        }

        public Criteria andTagsGreaterThanOrEqualTo(String value) {
            addCriterion("tags >=", value, "tags");
            return (Criteria) this;
        }

        public Criteria andTagsLessThan(String value) {
            addCriterion("tags <", value, "tags");
            return (Criteria) this;
        }

        public Criteria andTagsLessThanOrEqualTo(String value) {
            addCriterion("tags <=", value, "tags");
            return (Criteria) this;
        }

        public Criteria andTagsLike(String value) {
            addCriterion("tags like", value, "tags");
            return (Criteria) this;
        }

        public Criteria andTagsNotLike(String value) {
            addCriterion("tags not like", value, "tags");
            return (Criteria) this;
        }

        public Criteria andTagsIn(List<String> values) {
            addCriterion("tags in", values, "tags");
            return (Criteria) this;
        }

        public Criteria andTagsNotIn(List<String> values) {
            addCriterion("tags not in", values, "tags");
            return (Criteria) this;
        }

        public Criteria andTagsBetween(String value1, String value2) {
            addCriterion("tags between", value1, value2, "tags");
            return (Criteria) this;
        }

        public Criteria andTagsNotBetween(String value1, String value2) {
            addCriterion("tags not between", value1, value2, "tags");
            return (Criteria) this;
        }

        public Criteria andOriginalUrlIsNull() {
            addCriterion("originalUrl is null");
            return (Criteria) this;
        }

        public Criteria andOriginalUrlIsNotNull() {
            addCriterion("originalUrl is not null");
            return (Criteria) this;
        }

        public Criteria andOriginalUrlEqualTo(String value) {
            addCriterion("originalUrl =", value, "originalUrl");
            return (Criteria) this;
        }

        public Criteria andOriginalUrlNotEqualTo(String value) {
            addCriterion("originalUrl <>", value, "originalUrl");
            return (Criteria) this;
        }

        public Criteria andOriginalUrlGreaterThan(String value) {
            addCriterion("originalUrl >", value, "originalUrl");
            return (Criteria) this;
        }

        public Criteria andOriginalUrlGreaterThanOrEqualTo(String value) {
            addCriterion("originalUrl >=", value, "originalUrl");
            return (Criteria) this;
        }

        public Criteria andOriginalUrlLessThan(String value) {
            addCriterion("originalUrl <", value, "originalUrl");
            return (Criteria) this;
        }

        public Criteria andOriginalUrlLessThanOrEqualTo(String value) {
            addCriterion("originalUrl <=", value, "originalUrl");
            return (Criteria) this;
        }

        public Criteria andOriginalUrlLike(String value) {
            addCriterion("originalUrl like", value, "originalUrl");
            return (Criteria) this;
        }

        public Criteria andOriginalUrlNotLike(String value) {
            addCriterion("originalUrl not like", value, "originalUrl");
            return (Criteria) this;
        }

        public Criteria andOriginalUrlIn(List<String> values) {
            addCriterion("originalUrl in", values, "originalUrl");
            return (Criteria) this;
        }

        public Criteria andOriginalUrlNotIn(List<String> values) {
            addCriterion("originalUrl not in", values, "originalUrl");
            return (Criteria) this;
        }

        public Criteria andOriginalUrlBetween(String value1, String value2) {
            addCriterion("originalUrl between", value1, value2, "originalUrl");
            return (Criteria) this;
        }

        public Criteria andOriginalUrlNotBetween(String value1, String value2) {
            addCriterion("originalUrl not between", value1, value2, "originalUrl");
            return (Criteria) this;
        }

        public Criteria andDescriptionIsNull() {
            addCriterion("description is null");
            return (Criteria) this;
        }

        public Criteria andDescriptionIsNotNull() {
            addCriterion("description is not null");
            return (Criteria) this;
        }

        public Criteria andDescriptionEqualTo(String value) {
            addCriterion("description =", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotEqualTo(String value) {
            addCriterion("description <>", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionGreaterThan(String value) {
            addCriterion("description >", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("description >=", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLessThan(String value) {
            addCriterion("description <", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLessThanOrEqualTo(String value) {
            addCriterion("description <=", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLike(String value) {
            addCriterion("description like", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotLike(String value) {
            addCriterion("description not like", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionIn(List<String> values) {
            addCriterion("description in", values, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotIn(List<String> values) {
            addCriterion("description not in", values, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionBetween(String value1, String value2) {
            addCriterion("description between", value1, value2, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotBetween(String value1, String value2) {
            addCriterion("description not between", value1, value2, "description");
            return (Criteria) this;
        }

        public Criteria andBuryIsNull() {
            addCriterion("bury is null");
            return (Criteria) this;
        }

        public Criteria andBuryIsNotNull() {
            addCriterion("bury is not null");
            return (Criteria) this;
        }

        public Criteria andBuryEqualTo(Integer value) {
            addCriterion("bury =", value, "bury");
            return (Criteria) this;
        }

        public Criteria andBuryNotEqualTo(Integer value) {
            addCriterion("bury <>", value, "bury");
            return (Criteria) this;
        }

        public Criteria andBuryGreaterThan(Integer value) {
            addCriterion("bury >", value, "bury");
            return (Criteria) this;
        }

        public Criteria andBuryGreaterThanOrEqualTo(Integer value) {
            addCriterion("bury >=", value, "bury");
            return (Criteria) this;
        }

        public Criteria andBuryLessThan(Integer value) {
            addCriterion("bury <", value, "bury");
            return (Criteria) this;
        }

        public Criteria andBuryLessThanOrEqualTo(Integer value) {
            addCriterion("bury <=", value, "bury");
            return (Criteria) this;
        }

        public Criteria andBuryIn(List<Integer> values) {
            addCriterion("bury in", values, "bury");
            return (Criteria) this;
        }

        public Criteria andBuryNotIn(List<Integer> values) {
            addCriterion("bury not in", values, "bury");
            return (Criteria) this;
        }

        public Criteria andBuryBetween(Integer value1, Integer value2) {
            addCriterion("bury between", value1, value2, "bury");
            return (Criteria) this;
        }

        public Criteria andBuryNotBetween(Integer value1, Integer value2) {
            addCriterion("bury not between", value1, value2, "bury");
            return (Criteria) this;
        }

        public Criteria andDiggIsNull() {
            addCriterion("digg is null");
            return (Criteria) this;
        }

        public Criteria andDiggIsNotNull() {
            addCriterion("digg is not null");
            return (Criteria) this;
        }

        public Criteria andDiggEqualTo(Integer value) {
            addCriterion("digg =", value, "digg");
            return (Criteria) this;
        }

        public Criteria andDiggNotEqualTo(Integer value) {
            addCriterion("digg <>", value, "digg");
            return (Criteria) this;
        }

        public Criteria andDiggGreaterThan(Integer value) {
            addCriterion("digg >", value, "digg");
            return (Criteria) this;
        }

        public Criteria andDiggGreaterThanOrEqualTo(Integer value) {
            addCriterion("digg >=", value, "digg");
            return (Criteria) this;
        }

        public Criteria andDiggLessThan(Integer value) {
            addCriterion("digg <", value, "digg");
            return (Criteria) this;
        }

        public Criteria andDiggLessThanOrEqualTo(Integer value) {
            addCriterion("digg <=", value, "digg");
            return (Criteria) this;
        }

        public Criteria andDiggIn(List<Integer> values) {
            addCriterion("digg in", values, "digg");
            return (Criteria) this;
        }

        public Criteria andDiggNotIn(List<Integer> values) {
            addCriterion("digg not in", values, "digg");
            return (Criteria) this;
        }

        public Criteria andDiggBetween(Integer value1, Integer value2) {
            addCriterion("digg between", value1, value2, "digg");
            return (Criteria) this;
        }

        public Criteria andDiggNotBetween(Integer value1, Integer value2) {
            addCriterion("digg not between", value1, value2, "digg");
            return (Criteria) this;
        }

        public Criteria andChannelIsNull() {
            addCriterion("channel is null");
            return (Criteria) this;
        }

        public Criteria andChannelIsNotNull() {
            addCriterion("channel is not null");
            return (Criteria) this;
        }

        public Criteria andChannelEqualTo(Integer value) {
            addCriterion("channel =", value, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelNotEqualTo(Integer value) {
            addCriterion("channel <>", value, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelGreaterThan(Integer value) {
            addCriterion("channel >", value, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelGreaterThanOrEqualTo(Integer value) {
            addCriterion("channel >=", value, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelLessThan(Integer value) {
            addCriterion("channel <", value, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelLessThanOrEqualTo(Integer value) {
            addCriterion("channel <=", value, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelIn(List<Integer> values) {
            addCriterion("channel in", values, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelNotIn(List<Integer> values) {
            addCriterion("channel not in", values, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelBetween(Integer value1, Integer value2) {
            addCriterion("channel between", value1, value2, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelNotBetween(Integer value1, Integer value2) {
            addCriterion("channel not between", value1, value2, "channel");
            return (Criteria) this;
        }

        public Criteria andCommentCountIsNull() {
            addCriterion("commentCount is null");
            return (Criteria) this;
        }

        public Criteria andCommentCountIsNotNull() {
            addCriterion("commentCount is not null");
            return (Criteria) this;
        }

        public Criteria andCommentCountEqualTo(Integer value) {
            addCriterion("commentCount =", value, "commentCount");
            return (Criteria) this;
        }

        public Criteria andCommentCountNotEqualTo(Integer value) {
            addCriterion("commentCount <>", value, "commentCount");
            return (Criteria) this;
        }

        public Criteria andCommentCountGreaterThan(Integer value) {
            addCriterion("commentCount >", value, "commentCount");
            return (Criteria) this;
        }

        public Criteria andCommentCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("commentCount >=", value, "commentCount");
            return (Criteria) this;
        }

        public Criteria andCommentCountLessThan(Integer value) {
            addCriterion("commentCount <", value, "commentCount");
            return (Criteria) this;
        }

        public Criteria andCommentCountLessThanOrEqualTo(Integer value) {
            addCriterion("commentCount <=", value, "commentCount");
            return (Criteria) this;
        }

        public Criteria andCommentCountIn(List<Integer> values) {
            addCriterion("commentCount in", values, "commentCount");
            return (Criteria) this;
        }

        public Criteria andCommentCountNotIn(List<Integer> values) {
            addCriterion("commentCount not in", values, "commentCount");
            return (Criteria) this;
        }

        public Criteria andCommentCountBetween(Integer value1, Integer value2) {
            addCriterion("commentCount between", value1, value2, "commentCount");
            return (Criteria) this;
        }

        public Criteria andCommentCountNotBetween(Integer value1, Integer value2) {
            addCriterion("commentCount not between", value1, value2, "commentCount");
            return (Criteria) this;
        }

        public Criteria andViewCountIsNull() {
            addCriterion("viewCount is null");
            return (Criteria) this;
        }

        public Criteria andViewCountIsNotNull() {
            addCriterion("viewCount is not null");
            return (Criteria) this;
        }

        public Criteria andViewCountEqualTo(Integer value) {
            addCriterion("viewCount =", value, "viewCount");
            return (Criteria) this;
        }

        public Criteria andViewCountNotEqualTo(Integer value) {
            addCriterion("viewCount <>", value, "viewCount");
            return (Criteria) this;
        }

        public Criteria andViewCountGreaterThan(Integer value) {
            addCriterion("viewCount >", value, "viewCount");
            return (Criteria) this;
        }

        public Criteria andViewCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("viewCount >=", value, "viewCount");
            return (Criteria) this;
        }

        public Criteria andViewCountLessThan(Integer value) {
            addCriterion("viewCount <", value, "viewCount");
            return (Criteria) this;
        }

        public Criteria andViewCountLessThanOrEqualTo(Integer value) {
            addCriterion("viewCount <=", value, "viewCount");
            return (Criteria) this;
        }

        public Criteria andViewCountIn(List<Integer> values) {
            addCriterion("viewCount in", values, "viewCount");
            return (Criteria) this;
        }

        public Criteria andViewCountNotIn(List<Integer> values) {
            addCriterion("viewCount not in", values, "viewCount");
            return (Criteria) this;
        }

        public Criteria andViewCountBetween(Integer value1, Integer value2) {
            addCriterion("viewCount between", value1, value2, "viewCount");
            return (Criteria) this;
        }

        public Criteria andViewCountNotBetween(Integer value1, Integer value2) {
            addCriterion("viewCount not between", value1, value2, "viewCount");
            return (Criteria) this;
        }

        public Criteria andPhpViewCountIsNull() {
            addCriterion("phpViewCount is null");
            return (Criteria) this;
        }

        public Criteria andPhpViewCountIsNotNull() {
            addCriterion("phpViewCount is not null");
            return (Criteria) this;
        }

        public Criteria andPhpViewCountEqualTo(Integer value) {
            addCriterion("phpViewCount =", value, "phpViewCount");
            return (Criteria) this;
        }

        public Criteria andPhpViewCountNotEqualTo(Integer value) {
            addCriterion("phpViewCount <>", value, "phpViewCount");
            return (Criteria) this;
        }

        public Criteria andPhpViewCountGreaterThan(Integer value) {
            addCriterion("phpViewCount >", value, "phpViewCount");
            return (Criteria) this;
        }

        public Criteria andPhpViewCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("phpViewCount >=", value, "phpViewCount");
            return (Criteria) this;
        }

        public Criteria andPhpViewCountLessThan(Integer value) {
            addCriterion("phpViewCount <", value, "phpViewCount");
            return (Criteria) this;
        }

        public Criteria andPhpViewCountLessThanOrEqualTo(Integer value) {
            addCriterion("phpViewCount <=", value, "phpViewCount");
            return (Criteria) this;
        }

        public Criteria andPhpViewCountIn(List<Integer> values) {
            addCriterion("phpViewCount in", values, "phpViewCount");
            return (Criteria) this;
        }

        public Criteria andPhpViewCountNotIn(List<Integer> values) {
            addCriterion("phpViewCount not in", values, "phpViewCount");
            return (Criteria) this;
        }

        public Criteria andPhpViewCountBetween(Integer value1, Integer value2) {
            addCriterion("phpViewCount between", value1, value2, "phpViewCount");
            return (Criteria) this;
        }

        public Criteria andPhpViewCountNotBetween(Integer value1, Integer value2) {
            addCriterion("phpViewCount not between", value1, value2, "phpViewCount");
            return (Criteria) this;
        }

        public Criteria andCreatedAtIsNull() {
            addCriterion("createdAt is null");
            return (Criteria) this;
        }

        public Criteria andCreatedAtIsNotNull() {
            addCriterion("createdAt is not null");
            return (Criteria) this;
        }

        public Criteria andCreatedAtEqualTo(Date value) {
            addCriterion("createdAt =", value, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtNotEqualTo(Date value) {
            addCriterion("createdAt <>", value, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtGreaterThan(Date value) {
            addCriterion("createdAt >", value, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtGreaterThanOrEqualTo(Date value) {
            addCriterion("createdAt >=", value, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtLessThan(Date value) {
            addCriterion("createdAt <", value, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtLessThanOrEqualTo(Date value) {
            addCriterion("createdAt <=", value, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtIn(List<Date> values) {
            addCriterion("createdAt in", values, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtNotIn(List<Date> values) {
            addCriterion("createdAt not in", values, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtBetween(Date value1, Date value2) {
            addCriterion("createdAt between", value1, value2, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtNotBetween(Date value1, Date value2) {
            addCriterion("createdAt not between", value1, value2, "createdAt");
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

        public Criteria andTitleLikeInsensitive(String value) {
            addCriterion("upper(title) like", value.toUpperCase(), "title");
            return (Criteria) this;
        }

        public Criteria andTypeLikeInsensitive(String value) {
            addCriterion("upper(type) like", value.toUpperCase(), "type");
            return (Criteria) this;
        }

        public Criteria andCategoriesLikeInsensitive(String value) {
            addCriterion("upper(categories) like", value.toUpperCase(), "categories");
            return (Criteria) this;
        }

        public Criteria andTagsLikeInsensitive(String value) {
            addCriterion("upper(tags) like", value.toUpperCase(), "tags");
            return (Criteria) this;
        }

        public Criteria andOriginalUrlLikeInsensitive(String value) {
            addCriterion("upper(originalUrl) like", value.toUpperCase(), "originalUrl");
            return (Criteria) this;
        }

        public Criteria andDescriptionLikeInsensitive(String value) {
            addCriterion("upper(description) like", value.toUpperCase(), "description");
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