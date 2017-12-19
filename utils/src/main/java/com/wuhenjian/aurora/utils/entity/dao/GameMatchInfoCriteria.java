package com.wuhenjian.aurora.utils.entity.dao;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class GameMatchInfoCriteria {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected Integer limitStart;

    protected Integer limitEnd;

    public GameMatchInfoCriteria() {
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

        public Criteria andGmiIdIsNull() {
            addCriterion("gmiId is null");
            return (Criteria) this;
        }

        public Criteria andGmiIdIsNotNull() {
            addCriterion("gmiId is not null");
            return (Criteria) this;
        }

        public Criteria andGmiIdEqualTo(Long value) {
            addCriterion("gmiId =", value, "gmiId");
            return (Criteria) this;
        }

        public Criteria andGmiIdNotEqualTo(Long value) {
            addCriterion("gmiId <>", value, "gmiId");
            return (Criteria) this;
        }

        public Criteria andGmiIdGreaterThan(Long value) {
            addCriterion("gmiId >", value, "gmiId");
            return (Criteria) this;
        }

        public Criteria andGmiIdGreaterThanOrEqualTo(Long value) {
            addCriterion("gmiId >=", value, "gmiId");
            return (Criteria) this;
        }

        public Criteria andGmiIdLessThan(Long value) {
            addCriterion("gmiId <", value, "gmiId");
            return (Criteria) this;
        }

        public Criteria andGmiIdLessThanOrEqualTo(Long value) {
            addCriterion("gmiId <=", value, "gmiId");
            return (Criteria) this;
        }

        public Criteria andGmiIdIn(List<Long> values) {
            addCriterion("gmiId in", values, "gmiId");
            return (Criteria) this;
        }

        public Criteria andGmiIdNotIn(List<Long> values) {
            addCriterion("gmiId not in", values, "gmiId");
            return (Criteria) this;
        }

        public Criteria andGmiIdBetween(Long value1, Long value2) {
            addCriterion("gmiId between", value1, value2, "gmiId");
            return (Criteria) this;
        }

        public Criteria andGmiIdNotBetween(Long value1, Long value2) {
            addCriterion("gmiId not between", value1, value2, "gmiId");
            return (Criteria) this;
        }

        public Criteria andOffensiveIsNull() {
            addCriterion("offensive is null");
            return (Criteria) this;
        }

        public Criteria andOffensiveIsNotNull() {
            addCriterion("offensive is not null");
            return (Criteria) this;
        }

        public Criteria andOffensiveEqualTo(Long value) {
            addCriterion("offensive =", value, "offensive");
            return (Criteria) this;
        }

        public Criteria andOffensiveNotEqualTo(Long value) {
            addCriterion("offensive <>", value, "offensive");
            return (Criteria) this;
        }

        public Criteria andOffensiveGreaterThan(Long value) {
            addCriterion("offensive >", value, "offensive");
            return (Criteria) this;
        }

        public Criteria andOffensiveGreaterThanOrEqualTo(Long value) {
            addCriterion("offensive >=", value, "offensive");
            return (Criteria) this;
        }

        public Criteria andOffensiveLessThan(Long value) {
            addCriterion("offensive <", value, "offensive");
            return (Criteria) this;
        }

        public Criteria andOffensiveLessThanOrEqualTo(Long value) {
            addCriterion("offensive <=", value, "offensive");
            return (Criteria) this;
        }

        public Criteria andOffensiveIn(List<Long> values) {
            addCriterion("offensive in", values, "offensive");
            return (Criteria) this;
        }

        public Criteria andOffensiveNotIn(List<Long> values) {
            addCriterion("offensive not in", values, "offensive");
            return (Criteria) this;
        }

        public Criteria andOffensiveBetween(Long value1, Long value2) {
            addCriterion("offensive between", value1, value2, "offensive");
            return (Criteria) this;
        }

        public Criteria andOffensiveNotBetween(Long value1, Long value2) {
            addCriterion("offensive not between", value1, value2, "offensive");
            return (Criteria) this;
        }

        public Criteria andDefensiveIsNull() {
            addCriterion("defensive is null");
            return (Criteria) this;
        }

        public Criteria andDefensiveIsNotNull() {
            addCriterion("defensive is not null");
            return (Criteria) this;
        }

        public Criteria andDefensiveEqualTo(Long value) {
            addCriterion("defensive =", value, "defensive");
            return (Criteria) this;
        }

        public Criteria andDefensiveNotEqualTo(Long value) {
            addCriterion("defensive <>", value, "defensive");
            return (Criteria) this;
        }

        public Criteria andDefensiveGreaterThan(Long value) {
            addCriterion("defensive >", value, "defensive");
            return (Criteria) this;
        }

        public Criteria andDefensiveGreaterThanOrEqualTo(Long value) {
            addCriterion("defensive >=", value, "defensive");
            return (Criteria) this;
        }

        public Criteria andDefensiveLessThan(Long value) {
            addCriterion("defensive <", value, "defensive");
            return (Criteria) this;
        }

        public Criteria andDefensiveLessThanOrEqualTo(Long value) {
            addCriterion("defensive <=", value, "defensive");
            return (Criteria) this;
        }

        public Criteria andDefensiveIn(List<Long> values) {
            addCriterion("defensive in", values, "defensive");
            return (Criteria) this;
        }

        public Criteria andDefensiveNotIn(List<Long> values) {
            addCriterion("defensive not in", values, "defensive");
            return (Criteria) this;
        }

        public Criteria andDefensiveBetween(Long value1, Long value2) {
            addCriterion("defensive between", value1, value2, "defensive");
            return (Criteria) this;
        }

        public Criteria andDefensiveNotBetween(Long value1, Long value2) {
            addCriterion("defensive not between", value1, value2, "defensive");
            return (Criteria) this;
        }

        public Criteria andTotalRoundIsNull() {
            addCriterion("totalRound is null");
            return (Criteria) this;
        }

        public Criteria andTotalRoundIsNotNull() {
            addCriterion("totalRound is not null");
            return (Criteria) this;
        }

        public Criteria andTotalRoundEqualTo(Integer value) {
            addCriterion("totalRound =", value, "totalRound");
            return (Criteria) this;
        }

        public Criteria andTotalRoundNotEqualTo(Integer value) {
            addCriterion("totalRound <>", value, "totalRound");
            return (Criteria) this;
        }

        public Criteria andTotalRoundGreaterThan(Integer value) {
            addCriterion("totalRound >", value, "totalRound");
            return (Criteria) this;
        }

        public Criteria andTotalRoundGreaterThanOrEqualTo(Integer value) {
            addCriterion("totalRound >=", value, "totalRound");
            return (Criteria) this;
        }

        public Criteria andTotalRoundLessThan(Integer value) {
            addCriterion("totalRound <", value, "totalRound");
            return (Criteria) this;
        }

        public Criteria andTotalRoundLessThanOrEqualTo(Integer value) {
            addCriterion("totalRound <=", value, "totalRound");
            return (Criteria) this;
        }

        public Criteria andTotalRoundIn(List<Integer> values) {
            addCriterion("totalRound in", values, "totalRound");
            return (Criteria) this;
        }

        public Criteria andTotalRoundNotIn(List<Integer> values) {
            addCriterion("totalRound not in", values, "totalRound");
            return (Criteria) this;
        }

        public Criteria andTotalRoundBetween(Integer value1, Integer value2) {
            addCriterion("totalRound between", value1, value2, "totalRound");
            return (Criteria) this;
        }

        public Criteria andTotalRoundNotBetween(Integer value1, Integer value2) {
            addCriterion("totalRound not between", value1, value2, "totalRound");
            return (Criteria) this;
        }

        public Criteria andFinalResultIsNull() {
            addCriterion("finalResult is null");
            return (Criteria) this;
        }

        public Criteria andFinalResultIsNotNull() {
            addCriterion("finalResult is not null");
            return (Criteria) this;
        }

        public Criteria andFinalResultEqualTo(Integer value) {
            addCriterion("finalResult =", value, "finalResult");
            return (Criteria) this;
        }

        public Criteria andFinalResultNotEqualTo(Integer value) {
            addCriterion("finalResult <>", value, "finalResult");
            return (Criteria) this;
        }

        public Criteria andFinalResultGreaterThan(Integer value) {
            addCriterion("finalResult >", value, "finalResult");
            return (Criteria) this;
        }

        public Criteria andFinalResultGreaterThanOrEqualTo(Integer value) {
            addCriterion("finalResult >=", value, "finalResult");
            return (Criteria) this;
        }

        public Criteria andFinalResultLessThan(Integer value) {
            addCriterion("finalResult <", value, "finalResult");
            return (Criteria) this;
        }

        public Criteria andFinalResultLessThanOrEqualTo(Integer value) {
            addCriterion("finalResult <=", value, "finalResult");
            return (Criteria) this;
        }

        public Criteria andFinalResultIn(List<Integer> values) {
            addCriterion("finalResult in", values, "finalResult");
            return (Criteria) this;
        }

        public Criteria andFinalResultNotIn(List<Integer> values) {
            addCriterion("finalResult not in", values, "finalResult");
            return (Criteria) this;
        }

        public Criteria andFinalResultBetween(Integer value1, Integer value2) {
            addCriterion("finalResult between", value1, value2, "finalResult");
            return (Criteria) this;
        }

        public Criteria andFinalResultNotBetween(Integer value1, Integer value2) {
            addCriterion("finalResult not between", value1, value2, "finalResult");
            return (Criteria) this;
        }

        public Criteria andStartTimeIsNull() {
            addCriterion("startTime is null");
            return (Criteria) this;
        }

        public Criteria andStartTimeIsNotNull() {
            addCriterion("startTime is not null");
            return (Criteria) this;
        }

        public Criteria andStartTimeEqualTo(Date value) {
            addCriterion("startTime =", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeNotEqualTo(Date value) {
            addCriterion("startTime <>", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeGreaterThan(Date value) {
            addCriterion("startTime >", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("startTime >=", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeLessThan(Date value) {
            addCriterion("startTime <", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeLessThanOrEqualTo(Date value) {
            addCriterion("startTime <=", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeIn(List<Date> values) {
            addCriterion("startTime in", values, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeNotIn(List<Date> values) {
            addCriterion("startTime not in", values, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeBetween(Date value1, Date value2) {
            addCriterion("startTime between", value1, value2, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeNotBetween(Date value1, Date value2) {
            addCriterion("startTime not between", value1, value2, "startTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeIsNull() {
            addCriterion("endTime is null");
            return (Criteria) this;
        }

        public Criteria andEndTimeIsNotNull() {
            addCriterion("endTime is not null");
            return (Criteria) this;
        }

        public Criteria andEndTimeEqualTo(Date value) {
            addCriterion("endTime =", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotEqualTo(Date value) {
            addCriterion("endTime <>", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeGreaterThan(Date value) {
            addCriterion("endTime >", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("endTime >=", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeLessThan(Date value) {
            addCriterion("endTime <", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeLessThanOrEqualTo(Date value) {
            addCriterion("endTime <=", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeIn(List<Date> values) {
            addCriterion("endTime in", values, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotIn(List<Date> values) {
            addCriterion("endTime not in", values, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeBetween(Date value1, Date value2) {
            addCriterion("endTime between", value1, value2, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotBetween(Date value1, Date value2) {
            addCriterion("endTime not between", value1, value2, "endTime");
            return (Criteria) this;
        }

        public Criteria andWinScoreIsNull() {
            addCriterion("winScore is null");
            return (Criteria) this;
        }

        public Criteria andWinScoreIsNotNull() {
            addCriterion("winScore is not null");
            return (Criteria) this;
        }

        public Criteria andWinScoreEqualTo(Integer value) {
            addCriterion("winScore =", value, "winScore");
            return (Criteria) this;
        }

        public Criteria andWinScoreNotEqualTo(Integer value) {
            addCriterion("winScore <>", value, "winScore");
            return (Criteria) this;
        }

        public Criteria andWinScoreGreaterThan(Integer value) {
            addCriterion("winScore >", value, "winScore");
            return (Criteria) this;
        }

        public Criteria andWinScoreGreaterThanOrEqualTo(Integer value) {
            addCriterion("winScore >=", value, "winScore");
            return (Criteria) this;
        }

        public Criteria andWinScoreLessThan(Integer value) {
            addCriterion("winScore <", value, "winScore");
            return (Criteria) this;
        }

        public Criteria andWinScoreLessThanOrEqualTo(Integer value) {
            addCriterion("winScore <=", value, "winScore");
            return (Criteria) this;
        }

        public Criteria andWinScoreIn(List<Integer> values) {
            addCriterion("winScore in", values, "winScore");
            return (Criteria) this;
        }

        public Criteria andWinScoreNotIn(List<Integer> values) {
            addCriterion("winScore not in", values, "winScore");
            return (Criteria) this;
        }

        public Criteria andWinScoreBetween(Integer value1, Integer value2) {
            addCriterion("winScore between", value1, value2, "winScore");
            return (Criteria) this;
        }

        public Criteria andWinScoreNotBetween(Integer value1, Integer value2) {
            addCriterion("winScore not between", value1, value2, "winScore");
            return (Criteria) this;
        }

        public Criteria andLostScoreIsNull() {
            addCriterion("lostScore is null");
            return (Criteria) this;
        }

        public Criteria andLostScoreIsNotNull() {
            addCriterion("lostScore is not null");
            return (Criteria) this;
        }

        public Criteria andLostScoreEqualTo(Integer value) {
            addCriterion("lostScore =", value, "lostScore");
            return (Criteria) this;
        }

        public Criteria andLostScoreNotEqualTo(Integer value) {
            addCriterion("lostScore <>", value, "lostScore");
            return (Criteria) this;
        }

        public Criteria andLostScoreGreaterThan(Integer value) {
            addCriterion("lostScore >", value, "lostScore");
            return (Criteria) this;
        }

        public Criteria andLostScoreGreaterThanOrEqualTo(Integer value) {
            addCriterion("lostScore >=", value, "lostScore");
            return (Criteria) this;
        }

        public Criteria andLostScoreLessThan(Integer value) {
            addCriterion("lostScore <", value, "lostScore");
            return (Criteria) this;
        }

        public Criteria andLostScoreLessThanOrEqualTo(Integer value) {
            addCriterion("lostScore <=", value, "lostScore");
            return (Criteria) this;
        }

        public Criteria andLostScoreIn(List<Integer> values) {
            addCriterion("lostScore in", values, "lostScore");
            return (Criteria) this;
        }

        public Criteria andLostScoreNotIn(List<Integer> values) {
            addCriterion("lostScore not in", values, "lostScore");
            return (Criteria) this;
        }

        public Criteria andLostScoreBetween(Integer value1, Integer value2) {
            addCriterion("lostScore between", value1, value2, "lostScore");
            return (Criteria) this;
        }

        public Criteria andLostScoreNotBetween(Integer value1, Integer value2) {
            addCriterion("lostScore not between", value1, value2, "lostScore");
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