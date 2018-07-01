package com.wuhenjian.aurora.utils.entity.dao;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PhpProjectCriteria {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected Integer limitStart;

    protected Integer limitEnd;

    public PhpProjectCriteria() {
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

        public Criteria andPpIdIsNull() {
            addCriterion("ppId is null");
            return (Criteria) this;
        }

        public Criteria andPpIdIsNotNull() {
            addCriterion("ppId is not null");
            return (Criteria) this;
        }

        public Criteria andPpIdEqualTo(Long value) {
            addCriterion("ppId =", value, "ppId");
            return (Criteria) this;
        }

        public Criteria andPpIdNotEqualTo(Long value) {
            addCriterion("ppId <>", value, "ppId");
            return (Criteria) this;
        }

        public Criteria andPpIdGreaterThan(Long value) {
            addCriterion("ppId >", value, "ppId");
            return (Criteria) this;
        }

        public Criteria andPpIdGreaterThanOrEqualTo(Long value) {
            addCriterion("ppId >=", value, "ppId");
            return (Criteria) this;
        }

        public Criteria andPpIdLessThan(Long value) {
            addCriterion("ppId <", value, "ppId");
            return (Criteria) this;
        }

        public Criteria andPpIdLessThanOrEqualTo(Long value) {
            addCriterion("ppId <=", value, "ppId");
            return (Criteria) this;
        }

        public Criteria andPpIdIn(List<Long> values) {
            addCriterion("ppId in", values, "ppId");
            return (Criteria) this;
        }

        public Criteria andPpIdNotIn(List<Long> values) {
            addCriterion("ppId not in", values, "ppId");
            return (Criteria) this;
        }

        public Criteria andPpIdBetween(Long value1, Long value2) {
            addCriterion("ppId between", value1, value2, "ppId");
            return (Criteria) this;
        }

        public Criteria andPpIdNotBetween(Long value1, Long value2) {
            addCriterion("ppId not between", value1, value2, "ppId");
            return (Criteria) this;
        }

        public Criteria andAccountNameIsNull() {
            addCriterion("accountName is null");
            return (Criteria) this;
        }

        public Criteria andAccountNameIsNotNull() {
            addCriterion("accountName is not null");
            return (Criteria) this;
        }

        public Criteria andAccountNameEqualTo(String value) {
            addCriterion("accountName =", value, "accountName");
            return (Criteria) this;
        }

        public Criteria andAccountNameNotEqualTo(String value) {
            addCriterion("accountName <>", value, "accountName");
            return (Criteria) this;
        }

        public Criteria andAccountNameGreaterThan(String value) {
            addCriterion("accountName >", value, "accountName");
            return (Criteria) this;
        }

        public Criteria andAccountNameGreaterThanOrEqualTo(String value) {
            addCriterion("accountName >=", value, "accountName");
            return (Criteria) this;
        }

        public Criteria andAccountNameLessThan(String value) {
            addCriterion("accountName <", value, "accountName");
            return (Criteria) this;
        }

        public Criteria andAccountNameLessThanOrEqualTo(String value) {
            addCriterion("accountName <=", value, "accountName");
            return (Criteria) this;
        }

        public Criteria andAccountNameLike(String value) {
            addCriterion("accountName like", value, "accountName");
            return (Criteria) this;
        }

        public Criteria andAccountNameNotLike(String value) {
            addCriterion("accountName not like", value, "accountName");
            return (Criteria) this;
        }

        public Criteria andAccountNameIn(List<String> values) {
            addCriterion("accountName in", values, "accountName");
            return (Criteria) this;
        }

        public Criteria andAccountNameNotIn(List<String> values) {
            addCriterion("accountName not in", values, "accountName");
            return (Criteria) this;
        }

        public Criteria andAccountNameBetween(String value1, String value2) {
            addCriterion("accountName between", value1, value2, "accountName");
            return (Criteria) this;
        }

        public Criteria andAccountNameNotBetween(String value1, String value2) {
            addCriterion("accountName not between", value1, value2, "accountName");
            return (Criteria) this;
        }

        public Criteria andRepoNameIsNull() {
            addCriterion("repoName is null");
            return (Criteria) this;
        }

        public Criteria andRepoNameIsNotNull() {
            addCriterion("repoName is not null");
            return (Criteria) this;
        }

        public Criteria andRepoNameEqualTo(String value) {
            addCriterion("repoName =", value, "repoName");
            return (Criteria) this;
        }

        public Criteria andRepoNameNotEqualTo(String value) {
            addCriterion("repoName <>", value, "repoName");
            return (Criteria) this;
        }

        public Criteria andRepoNameGreaterThan(String value) {
            addCriterion("repoName >", value, "repoName");
            return (Criteria) this;
        }

        public Criteria andRepoNameGreaterThanOrEqualTo(String value) {
            addCriterion("repoName >=", value, "repoName");
            return (Criteria) this;
        }

        public Criteria andRepoNameLessThan(String value) {
            addCriterion("repoName <", value, "repoName");
            return (Criteria) this;
        }

        public Criteria andRepoNameLessThanOrEqualTo(String value) {
            addCriterion("repoName <=", value, "repoName");
            return (Criteria) this;
        }

        public Criteria andRepoNameLike(String value) {
            addCriterion("repoName like", value, "repoName");
            return (Criteria) this;
        }

        public Criteria andRepoNameNotLike(String value) {
            addCriterion("repoName not like", value, "repoName");
            return (Criteria) this;
        }

        public Criteria andRepoNameIn(List<String> values) {
            addCriterion("repoName in", values, "repoName");
            return (Criteria) this;
        }

        public Criteria andRepoNameNotIn(List<String> values) {
            addCriterion("repoName not in", values, "repoName");
            return (Criteria) this;
        }

        public Criteria andRepoNameBetween(String value1, String value2) {
            addCriterion("repoName between", value1, value2, "repoName");
            return (Criteria) this;
        }

        public Criteria andRepoNameNotBetween(String value1, String value2) {
            addCriterion("repoName not between", value1, value2, "repoName");
            return (Criteria) this;
        }

        public Criteria andLangIsNull() {
            addCriterion("lang is null");
            return (Criteria) this;
        }

        public Criteria andLangIsNotNull() {
            addCriterion("lang is not null");
            return (Criteria) this;
        }

        public Criteria andLangEqualTo(String value) {
            addCriterion("lang =", value, "lang");
            return (Criteria) this;
        }

        public Criteria andLangNotEqualTo(String value) {
            addCriterion("lang <>", value, "lang");
            return (Criteria) this;
        }

        public Criteria andLangGreaterThan(String value) {
            addCriterion("lang >", value, "lang");
            return (Criteria) this;
        }

        public Criteria andLangGreaterThanOrEqualTo(String value) {
            addCriterion("lang >=", value, "lang");
            return (Criteria) this;
        }

        public Criteria andLangLessThan(String value) {
            addCriterion("lang <", value, "lang");
            return (Criteria) this;
        }

        public Criteria andLangLessThanOrEqualTo(String value) {
            addCriterion("lang <=", value, "lang");
            return (Criteria) this;
        }

        public Criteria andLangLike(String value) {
            addCriterion("lang like", value, "lang");
            return (Criteria) this;
        }

        public Criteria andLangNotLike(String value) {
            addCriterion("lang not like", value, "lang");
            return (Criteria) this;
        }

        public Criteria andLangIn(List<String> values) {
            addCriterion("lang in", values, "lang");
            return (Criteria) this;
        }

        public Criteria andLangNotIn(List<String> values) {
            addCriterion("lang not in", values, "lang");
            return (Criteria) this;
        }

        public Criteria andLangBetween(String value1, String value2) {
            addCriterion("lang between", value1, value2, "lang");
            return (Criteria) this;
        }

        public Criteria andLangNotBetween(String value1, String value2) {
            addCriterion("lang not between", value1, value2, "lang");
            return (Criteria) this;
        }

        public Criteria andDefaultBranchIsNull() {
            addCriterion("defaultBranch is null");
            return (Criteria) this;
        }

        public Criteria andDefaultBranchIsNotNull() {
            addCriterion("defaultBranch is not null");
            return (Criteria) this;
        }

        public Criteria andDefaultBranchEqualTo(String value) {
            addCriterion("defaultBranch =", value, "defaultBranch");
            return (Criteria) this;
        }

        public Criteria andDefaultBranchNotEqualTo(String value) {
            addCriterion("defaultBranch <>", value, "defaultBranch");
            return (Criteria) this;
        }

        public Criteria andDefaultBranchGreaterThan(String value) {
            addCriterion("defaultBranch >", value, "defaultBranch");
            return (Criteria) this;
        }

        public Criteria andDefaultBranchGreaterThanOrEqualTo(String value) {
            addCriterion("defaultBranch >=", value, "defaultBranch");
            return (Criteria) this;
        }

        public Criteria andDefaultBranchLessThan(String value) {
            addCriterion("defaultBranch <", value, "defaultBranch");
            return (Criteria) this;
        }

        public Criteria andDefaultBranchLessThanOrEqualTo(String value) {
            addCriterion("defaultBranch <=", value, "defaultBranch");
            return (Criteria) this;
        }

        public Criteria andDefaultBranchLike(String value) {
            addCriterion("defaultBranch like", value, "defaultBranch");
            return (Criteria) this;
        }

        public Criteria andDefaultBranchNotLike(String value) {
            addCriterion("defaultBranch not like", value, "defaultBranch");
            return (Criteria) this;
        }

        public Criteria andDefaultBranchIn(List<String> values) {
            addCriterion("defaultBranch in", values, "defaultBranch");
            return (Criteria) this;
        }

        public Criteria andDefaultBranchNotIn(List<String> values) {
            addCriterion("defaultBranch not in", values, "defaultBranch");
            return (Criteria) this;
        }

        public Criteria andDefaultBranchBetween(String value1, String value2) {
            addCriterion("defaultBranch between", value1, value2, "defaultBranch");
            return (Criteria) this;
        }

        public Criteria andDefaultBranchNotBetween(String value1, String value2) {
            addCriterion("defaultBranch not between", value1, value2, "defaultBranch");
            return (Criteria) this;
        }

        public Criteria andHomepageIsNull() {
            addCriterion("homepage is null");
            return (Criteria) this;
        }

        public Criteria andHomepageIsNotNull() {
            addCriterion("homepage is not null");
            return (Criteria) this;
        }

        public Criteria andHomepageEqualTo(String value) {
            addCriterion("homepage =", value, "homepage");
            return (Criteria) this;
        }

        public Criteria andHomepageNotEqualTo(String value) {
            addCriterion("homepage <>", value, "homepage");
            return (Criteria) this;
        }

        public Criteria andHomepageGreaterThan(String value) {
            addCriterion("homepage >", value, "homepage");
            return (Criteria) this;
        }

        public Criteria andHomepageGreaterThanOrEqualTo(String value) {
            addCriterion("homepage >=", value, "homepage");
            return (Criteria) this;
        }

        public Criteria andHomepageLessThan(String value) {
            addCriterion("homepage <", value, "homepage");
            return (Criteria) this;
        }

        public Criteria andHomepageLessThanOrEqualTo(String value) {
            addCriterion("homepage <=", value, "homepage");
            return (Criteria) this;
        }

        public Criteria andHomepageLike(String value) {
            addCriterion("homepage like", value, "homepage");
            return (Criteria) this;
        }

        public Criteria andHomepageNotLike(String value) {
            addCriterion("homepage not like", value, "homepage");
            return (Criteria) this;
        }

        public Criteria andHomepageIn(List<String> values) {
            addCriterion("homepage in", values, "homepage");
            return (Criteria) this;
        }

        public Criteria andHomepageNotIn(List<String> values) {
            addCriterion("homepage not in", values, "homepage");
            return (Criteria) this;
        }

        public Criteria andHomepageBetween(String value1, String value2) {
            addCriterion("homepage between", value1, value2, "homepage");
            return (Criteria) this;
        }

        public Criteria andHomepageNotBetween(String value1, String value2) {
            addCriterion("homepage not between", value1, value2, "homepage");
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

        public Criteria andFileSizeIsNull() {
            addCriterion("fileSize is null");
            return (Criteria) this;
        }

        public Criteria andFileSizeIsNotNull() {
            addCriterion("fileSize is not null");
            return (Criteria) this;
        }

        public Criteria andFileSizeEqualTo(Integer value) {
            addCriterion("fileSize =", value, "fileSize");
            return (Criteria) this;
        }

        public Criteria andFileSizeNotEqualTo(Integer value) {
            addCriterion("fileSize <>", value, "fileSize");
            return (Criteria) this;
        }

        public Criteria andFileSizeGreaterThan(Integer value) {
            addCriterion("fileSize >", value, "fileSize");
            return (Criteria) this;
        }

        public Criteria andFileSizeGreaterThanOrEqualTo(Integer value) {
            addCriterion("fileSize >=", value, "fileSize");
            return (Criteria) this;
        }

        public Criteria andFileSizeLessThan(Integer value) {
            addCriterion("fileSize <", value, "fileSize");
            return (Criteria) this;
        }

        public Criteria andFileSizeLessThanOrEqualTo(Integer value) {
            addCriterion("fileSize <=", value, "fileSize");
            return (Criteria) this;
        }

        public Criteria andFileSizeIn(List<Integer> values) {
            addCriterion("fileSize in", values, "fileSize");
            return (Criteria) this;
        }

        public Criteria andFileSizeNotIn(List<Integer> values) {
            addCriterion("fileSize not in", values, "fileSize");
            return (Criteria) this;
        }

        public Criteria andFileSizeBetween(Integer value1, Integer value2) {
            addCriterion("fileSize between", value1, value2, "fileSize");
            return (Criteria) this;
        }

        public Criteria andFileSizeNotBetween(Integer value1, Integer value2) {
            addCriterion("fileSize not between", value1, value2, "fileSize");
            return (Criteria) this;
        }

        public Criteria andForksCountIsNull() {
            addCriterion("forksCount is null");
            return (Criteria) this;
        }

        public Criteria andForksCountIsNotNull() {
            addCriterion("forksCount is not null");
            return (Criteria) this;
        }

        public Criteria andForksCountEqualTo(Integer value) {
            addCriterion("forksCount =", value, "forksCount");
            return (Criteria) this;
        }

        public Criteria andForksCountNotEqualTo(Integer value) {
            addCriterion("forksCount <>", value, "forksCount");
            return (Criteria) this;
        }

        public Criteria andForksCountGreaterThan(Integer value) {
            addCriterion("forksCount >", value, "forksCount");
            return (Criteria) this;
        }

        public Criteria andForksCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("forksCount >=", value, "forksCount");
            return (Criteria) this;
        }

        public Criteria andForksCountLessThan(Integer value) {
            addCriterion("forksCount <", value, "forksCount");
            return (Criteria) this;
        }

        public Criteria andForksCountLessThanOrEqualTo(Integer value) {
            addCriterion("forksCount <=", value, "forksCount");
            return (Criteria) this;
        }

        public Criteria andForksCountIn(List<Integer> values) {
            addCriterion("forksCount in", values, "forksCount");
            return (Criteria) this;
        }

        public Criteria andForksCountNotIn(List<Integer> values) {
            addCriterion("forksCount not in", values, "forksCount");
            return (Criteria) this;
        }

        public Criteria andForksCountBetween(Integer value1, Integer value2) {
            addCriterion("forksCount between", value1, value2, "forksCount");
            return (Criteria) this;
        }

        public Criteria andForksCountNotBetween(Integer value1, Integer value2) {
            addCriterion("forksCount not between", value1, value2, "forksCount");
            return (Criteria) this;
        }

        public Criteria andStargazersCountIsNull() {
            addCriterion("stargazersCount is null");
            return (Criteria) this;
        }

        public Criteria andStargazersCountIsNotNull() {
            addCriterion("stargazersCount is not null");
            return (Criteria) this;
        }

        public Criteria andStargazersCountEqualTo(Integer value) {
            addCriterion("stargazersCount =", value, "stargazersCount");
            return (Criteria) this;
        }

        public Criteria andStargazersCountNotEqualTo(Integer value) {
            addCriterion("stargazersCount <>", value, "stargazersCount");
            return (Criteria) this;
        }

        public Criteria andStargazersCountGreaterThan(Integer value) {
            addCriterion("stargazersCount >", value, "stargazersCount");
            return (Criteria) this;
        }

        public Criteria andStargazersCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("stargazersCount >=", value, "stargazersCount");
            return (Criteria) this;
        }

        public Criteria andStargazersCountLessThan(Integer value) {
            addCriterion("stargazersCount <", value, "stargazersCount");
            return (Criteria) this;
        }

        public Criteria andStargazersCountLessThanOrEqualTo(Integer value) {
            addCriterion("stargazersCount <=", value, "stargazersCount");
            return (Criteria) this;
        }

        public Criteria andStargazersCountIn(List<Integer> values) {
            addCriterion("stargazersCount in", values, "stargazersCount");
            return (Criteria) this;
        }

        public Criteria andStargazersCountNotIn(List<Integer> values) {
            addCriterion("stargazersCount not in", values, "stargazersCount");
            return (Criteria) this;
        }

        public Criteria andStargazersCountBetween(Integer value1, Integer value2) {
            addCriterion("stargazersCount between", value1, value2, "stargazersCount");
            return (Criteria) this;
        }

        public Criteria andStargazersCountNotBetween(Integer value1, Integer value2) {
            addCriterion("stargazersCount not between", value1, value2, "stargazersCount");
            return (Criteria) this;
        }

        public Criteria andWatchersCountIsNull() {
            addCriterion("watchersCount is null");
            return (Criteria) this;
        }

        public Criteria andWatchersCountIsNotNull() {
            addCriterion("watchersCount is not null");
            return (Criteria) this;
        }

        public Criteria andWatchersCountEqualTo(Integer value) {
            addCriterion("watchersCount =", value, "watchersCount");
            return (Criteria) this;
        }

        public Criteria andWatchersCountNotEqualTo(Integer value) {
            addCriterion("watchersCount <>", value, "watchersCount");
            return (Criteria) this;
        }

        public Criteria andWatchersCountGreaterThan(Integer value) {
            addCriterion("watchersCount >", value, "watchersCount");
            return (Criteria) this;
        }

        public Criteria andWatchersCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("watchersCount >=", value, "watchersCount");
            return (Criteria) this;
        }

        public Criteria andWatchersCountLessThan(Integer value) {
            addCriterion("watchersCount <", value, "watchersCount");
            return (Criteria) this;
        }

        public Criteria andWatchersCountLessThanOrEqualTo(Integer value) {
            addCriterion("watchersCount <=", value, "watchersCount");
            return (Criteria) this;
        }

        public Criteria andWatchersCountIn(List<Integer> values) {
            addCriterion("watchersCount in", values, "watchersCount");
            return (Criteria) this;
        }

        public Criteria andWatchersCountNotIn(List<Integer> values) {
            addCriterion("watchersCount not in", values, "watchersCount");
            return (Criteria) this;
        }

        public Criteria andWatchersCountBetween(Integer value1, Integer value2) {
            addCriterion("watchersCount between", value1, value2, "watchersCount");
            return (Criteria) this;
        }

        public Criteria andWatchersCountNotBetween(Integer value1, Integer value2) {
            addCriterion("watchersCount not between", value1, value2, "watchersCount");
            return (Criteria) this;
        }

        public Criteria andOpenIssuesCountIsNull() {
            addCriterion("openIssuesCount is null");
            return (Criteria) this;
        }

        public Criteria andOpenIssuesCountIsNotNull() {
            addCriterion("openIssuesCount is not null");
            return (Criteria) this;
        }

        public Criteria andOpenIssuesCountEqualTo(Integer value) {
            addCriterion("openIssuesCount =", value, "openIssuesCount");
            return (Criteria) this;
        }

        public Criteria andOpenIssuesCountNotEqualTo(Integer value) {
            addCriterion("openIssuesCount <>", value, "openIssuesCount");
            return (Criteria) this;
        }

        public Criteria andOpenIssuesCountGreaterThan(Integer value) {
            addCriterion("openIssuesCount >", value, "openIssuesCount");
            return (Criteria) this;
        }

        public Criteria andOpenIssuesCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("openIssuesCount >=", value, "openIssuesCount");
            return (Criteria) this;
        }

        public Criteria andOpenIssuesCountLessThan(Integer value) {
            addCriterion("openIssuesCount <", value, "openIssuesCount");
            return (Criteria) this;
        }

        public Criteria andOpenIssuesCountLessThanOrEqualTo(Integer value) {
            addCriterion("openIssuesCount <=", value, "openIssuesCount");
            return (Criteria) this;
        }

        public Criteria andOpenIssuesCountIn(List<Integer> values) {
            addCriterion("openIssuesCount in", values, "openIssuesCount");
            return (Criteria) this;
        }

        public Criteria andOpenIssuesCountNotIn(List<Integer> values) {
            addCriterion("openIssuesCount not in", values, "openIssuesCount");
            return (Criteria) this;
        }

        public Criteria andOpenIssuesCountBetween(Integer value1, Integer value2) {
            addCriterion("openIssuesCount between", value1, value2, "openIssuesCount");
            return (Criteria) this;
        }

        public Criteria andOpenIssuesCountNotBetween(Integer value1, Integer value2) {
            addCriterion("openIssuesCount not between", value1, value2, "openIssuesCount");
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

        public Criteria andUpdatedAtIsNull() {
            addCriterion("updatedAt is null");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtIsNotNull() {
            addCriterion("updatedAt is not null");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtEqualTo(Date value) {
            addCriterion("updatedAt =", value, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtNotEqualTo(Date value) {
            addCriterion("updatedAt <>", value, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtGreaterThan(Date value) {
            addCriterion("updatedAt >", value, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtGreaterThanOrEqualTo(Date value) {
            addCriterion("updatedAt >=", value, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtLessThan(Date value) {
            addCriterion("updatedAt <", value, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtLessThanOrEqualTo(Date value) {
            addCriterion("updatedAt <=", value, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtIn(List<Date> values) {
            addCriterion("updatedAt in", values, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtNotIn(List<Date> values) {
            addCriterion("updatedAt not in", values, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtBetween(Date value1, Date value2) {
            addCriterion("updatedAt between", value1, value2, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtNotBetween(Date value1, Date value2) {
            addCriterion("updatedAt not between", value1, value2, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andPushedAtIsNull() {
            addCriterion("pushedAt is null");
            return (Criteria) this;
        }

        public Criteria andPushedAtIsNotNull() {
            addCriterion("pushedAt is not null");
            return (Criteria) this;
        }

        public Criteria andPushedAtEqualTo(Date value) {
            addCriterion("pushedAt =", value, "pushedAt");
            return (Criteria) this;
        }

        public Criteria andPushedAtNotEqualTo(Date value) {
            addCriterion("pushedAt <>", value, "pushedAt");
            return (Criteria) this;
        }

        public Criteria andPushedAtGreaterThan(Date value) {
            addCriterion("pushedAt >", value, "pushedAt");
            return (Criteria) this;
        }

        public Criteria andPushedAtGreaterThanOrEqualTo(Date value) {
            addCriterion("pushedAt >=", value, "pushedAt");
            return (Criteria) this;
        }

        public Criteria andPushedAtLessThan(Date value) {
            addCriterion("pushedAt <", value, "pushedAt");
            return (Criteria) this;
        }

        public Criteria andPushedAtLessThanOrEqualTo(Date value) {
            addCriterion("pushedAt <=", value, "pushedAt");
            return (Criteria) this;
        }

        public Criteria andPushedAtIn(List<Date> values) {
            addCriterion("pushedAt in", values, "pushedAt");
            return (Criteria) this;
        }

        public Criteria andPushedAtNotIn(List<Date> values) {
            addCriterion("pushedAt not in", values, "pushedAt");
            return (Criteria) this;
        }

        public Criteria andPushedAtBetween(Date value1, Date value2) {
            addCriterion("pushedAt between", value1, value2, "pushedAt");
            return (Criteria) this;
        }

        public Criteria andPushedAtNotBetween(Date value1, Date value2) {
            addCriterion("pushedAt not between", value1, value2, "pushedAt");
            return (Criteria) this;
        }

        public Criteria andGitUrlIsNull() {
            addCriterion("gitUrl is null");
            return (Criteria) this;
        }

        public Criteria andGitUrlIsNotNull() {
            addCriterion("gitUrl is not null");
            return (Criteria) this;
        }

        public Criteria andGitUrlEqualTo(String value) {
            addCriterion("gitUrl =", value, "gitUrl");
            return (Criteria) this;
        }

        public Criteria andGitUrlNotEqualTo(String value) {
            addCriterion("gitUrl <>", value, "gitUrl");
            return (Criteria) this;
        }

        public Criteria andGitUrlGreaterThan(String value) {
            addCriterion("gitUrl >", value, "gitUrl");
            return (Criteria) this;
        }

        public Criteria andGitUrlGreaterThanOrEqualTo(String value) {
            addCriterion("gitUrl >=", value, "gitUrl");
            return (Criteria) this;
        }

        public Criteria andGitUrlLessThan(String value) {
            addCriterion("gitUrl <", value, "gitUrl");
            return (Criteria) this;
        }

        public Criteria andGitUrlLessThanOrEqualTo(String value) {
            addCriterion("gitUrl <=", value, "gitUrl");
            return (Criteria) this;
        }

        public Criteria andGitUrlLike(String value) {
            addCriterion("gitUrl like", value, "gitUrl");
            return (Criteria) this;
        }

        public Criteria andGitUrlNotLike(String value) {
            addCriterion("gitUrl not like", value, "gitUrl");
            return (Criteria) this;
        }

        public Criteria andGitUrlIn(List<String> values) {
            addCriterion("gitUrl in", values, "gitUrl");
            return (Criteria) this;
        }

        public Criteria andGitUrlNotIn(List<String> values) {
            addCriterion("gitUrl not in", values, "gitUrl");
            return (Criteria) this;
        }

        public Criteria andGitUrlBetween(String value1, String value2) {
            addCriterion("gitUrl between", value1, value2, "gitUrl");
            return (Criteria) this;
        }

        public Criteria andGitUrlNotBetween(String value1, String value2) {
            addCriterion("gitUrl not between", value1, value2, "gitUrl");
            return (Criteria) this;
        }

        public Criteria andSshUrlIsNull() {
            addCriterion("sshUrl is null");
            return (Criteria) this;
        }

        public Criteria andSshUrlIsNotNull() {
            addCriterion("sshUrl is not null");
            return (Criteria) this;
        }

        public Criteria andSshUrlEqualTo(String value) {
            addCriterion("sshUrl =", value, "sshUrl");
            return (Criteria) this;
        }

        public Criteria andSshUrlNotEqualTo(String value) {
            addCriterion("sshUrl <>", value, "sshUrl");
            return (Criteria) this;
        }

        public Criteria andSshUrlGreaterThan(String value) {
            addCriterion("sshUrl >", value, "sshUrl");
            return (Criteria) this;
        }

        public Criteria andSshUrlGreaterThanOrEqualTo(String value) {
            addCriterion("sshUrl >=", value, "sshUrl");
            return (Criteria) this;
        }

        public Criteria andSshUrlLessThan(String value) {
            addCriterion("sshUrl <", value, "sshUrl");
            return (Criteria) this;
        }

        public Criteria andSshUrlLessThanOrEqualTo(String value) {
            addCriterion("sshUrl <=", value, "sshUrl");
            return (Criteria) this;
        }

        public Criteria andSshUrlLike(String value) {
            addCriterion("sshUrl like", value, "sshUrl");
            return (Criteria) this;
        }

        public Criteria andSshUrlNotLike(String value) {
            addCriterion("sshUrl not like", value, "sshUrl");
            return (Criteria) this;
        }

        public Criteria andSshUrlIn(List<String> values) {
            addCriterion("sshUrl in", values, "sshUrl");
            return (Criteria) this;
        }

        public Criteria andSshUrlNotIn(List<String> values) {
            addCriterion("sshUrl not in", values, "sshUrl");
            return (Criteria) this;
        }

        public Criteria andSshUrlBetween(String value1, String value2) {
            addCriterion("sshUrl between", value1, value2, "sshUrl");
            return (Criteria) this;
        }

        public Criteria andSshUrlNotBetween(String value1, String value2) {
            addCriterion("sshUrl not between", value1, value2, "sshUrl");
            return (Criteria) this;
        }

        public Criteria andCloneUrlIsNull() {
            addCriterion("cloneUrl is null");
            return (Criteria) this;
        }

        public Criteria andCloneUrlIsNotNull() {
            addCriterion("cloneUrl is not null");
            return (Criteria) this;
        }

        public Criteria andCloneUrlEqualTo(String value) {
            addCriterion("cloneUrl =", value, "cloneUrl");
            return (Criteria) this;
        }

        public Criteria andCloneUrlNotEqualTo(String value) {
            addCriterion("cloneUrl <>", value, "cloneUrl");
            return (Criteria) this;
        }

        public Criteria andCloneUrlGreaterThan(String value) {
            addCriterion("cloneUrl >", value, "cloneUrl");
            return (Criteria) this;
        }

        public Criteria andCloneUrlGreaterThanOrEqualTo(String value) {
            addCriterion("cloneUrl >=", value, "cloneUrl");
            return (Criteria) this;
        }

        public Criteria andCloneUrlLessThan(String value) {
            addCriterion("cloneUrl <", value, "cloneUrl");
            return (Criteria) this;
        }

        public Criteria andCloneUrlLessThanOrEqualTo(String value) {
            addCriterion("cloneUrl <=", value, "cloneUrl");
            return (Criteria) this;
        }

        public Criteria andCloneUrlLike(String value) {
            addCriterion("cloneUrl like", value, "cloneUrl");
            return (Criteria) this;
        }

        public Criteria andCloneUrlNotLike(String value) {
            addCriterion("cloneUrl not like", value, "cloneUrl");
            return (Criteria) this;
        }

        public Criteria andCloneUrlIn(List<String> values) {
            addCriterion("cloneUrl in", values, "cloneUrl");
            return (Criteria) this;
        }

        public Criteria andCloneUrlNotIn(List<String> values) {
            addCriterion("cloneUrl not in", values, "cloneUrl");
            return (Criteria) this;
        }

        public Criteria andCloneUrlBetween(String value1, String value2) {
            addCriterion("cloneUrl between", value1, value2, "cloneUrl");
            return (Criteria) this;
        }

        public Criteria andCloneUrlNotBetween(String value1, String value2) {
            addCriterion("cloneUrl not between", value1, value2, "cloneUrl");
            return (Criteria) this;
        }

        public Criteria andSvnUrlIsNull() {
            addCriterion("svnUrl is null");
            return (Criteria) this;
        }

        public Criteria andSvnUrlIsNotNull() {
            addCriterion("svnUrl is not null");
            return (Criteria) this;
        }

        public Criteria andSvnUrlEqualTo(String value) {
            addCriterion("svnUrl =", value, "svnUrl");
            return (Criteria) this;
        }

        public Criteria andSvnUrlNotEqualTo(String value) {
            addCriterion("svnUrl <>", value, "svnUrl");
            return (Criteria) this;
        }

        public Criteria andSvnUrlGreaterThan(String value) {
            addCriterion("svnUrl >", value, "svnUrl");
            return (Criteria) this;
        }

        public Criteria andSvnUrlGreaterThanOrEqualTo(String value) {
            addCriterion("svnUrl >=", value, "svnUrl");
            return (Criteria) this;
        }

        public Criteria andSvnUrlLessThan(String value) {
            addCriterion("svnUrl <", value, "svnUrl");
            return (Criteria) this;
        }

        public Criteria andSvnUrlLessThanOrEqualTo(String value) {
            addCriterion("svnUrl <=", value, "svnUrl");
            return (Criteria) this;
        }

        public Criteria andSvnUrlLike(String value) {
            addCriterion("svnUrl like", value, "svnUrl");
            return (Criteria) this;
        }

        public Criteria andSvnUrlNotLike(String value) {
            addCriterion("svnUrl not like", value, "svnUrl");
            return (Criteria) this;
        }

        public Criteria andSvnUrlIn(List<String> values) {
            addCriterion("svnUrl in", values, "svnUrl");
            return (Criteria) this;
        }

        public Criteria andSvnUrlNotIn(List<String> values) {
            addCriterion("svnUrl not in", values, "svnUrl");
            return (Criteria) this;
        }

        public Criteria andSvnUrlBetween(String value1, String value2) {
            addCriterion("svnUrl between", value1, value2, "svnUrl");
            return (Criteria) this;
        }

        public Criteria andSvnUrlNotBetween(String value1, String value2) {
            addCriterion("svnUrl not between", value1, value2, "svnUrl");
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

        public Criteria andAccountNameLikeInsensitive(String value) {
            addCriterion("upper(accountName) like", value.toUpperCase(), "accountName");
            return (Criteria) this;
        }

        public Criteria andRepoNameLikeInsensitive(String value) {
            addCriterion("upper(repoName) like", value.toUpperCase(), "repoName");
            return (Criteria) this;
        }

        public Criteria andLangLikeInsensitive(String value) {
            addCriterion("upper(lang) like", value.toUpperCase(), "lang");
            return (Criteria) this;
        }

        public Criteria andDefaultBranchLikeInsensitive(String value) {
            addCriterion("upper(defaultBranch) like", value.toUpperCase(), "defaultBranch");
            return (Criteria) this;
        }

        public Criteria andHomepageLikeInsensitive(String value) {
            addCriterion("upper(homepage) like", value.toUpperCase(), "homepage");
            return (Criteria) this;
        }

        public Criteria andDescriptionLikeInsensitive(String value) {
            addCriterion("upper(description) like", value.toUpperCase(), "description");
            return (Criteria) this;
        }

        public Criteria andGitUrlLikeInsensitive(String value) {
            addCriterion("upper(gitUrl) like", value.toUpperCase(), "gitUrl");
            return (Criteria) this;
        }

        public Criteria andSshUrlLikeInsensitive(String value) {
            addCriterion("upper(sshUrl) like", value.toUpperCase(), "sshUrl");
            return (Criteria) this;
        }

        public Criteria andCloneUrlLikeInsensitive(String value) {
            addCriterion("upper(cloneUrl) like", value.toUpperCase(), "cloneUrl");
            return (Criteria) this;
        }

        public Criteria andSvnUrlLikeInsensitive(String value) {
            addCriterion("upper(svnUrl) like", value.toUpperCase(), "svnUrl");
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