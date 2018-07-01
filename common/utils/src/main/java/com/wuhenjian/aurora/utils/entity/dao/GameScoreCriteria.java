package com.wuhenjian.aurora.utils.entity.dao;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class GameScoreCriteria {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected Integer limitStart;

    protected Integer limitEnd;

    public GameScoreCriteria() {
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

        public Criteria andGsIdIsNull() {
            addCriterion("gsId is null");
            return (Criteria) this;
        }

        public Criteria andGsIdIsNotNull() {
            addCriterion("gsId is not null");
            return (Criteria) this;
        }

        public Criteria andGsIdEqualTo(Long value) {
            addCriterion("gsId =", value, "gsId");
            return (Criteria) this;
        }

        public Criteria andGsIdNotEqualTo(Long value) {
            addCriterion("gsId <>", value, "gsId");
            return (Criteria) this;
        }

        public Criteria andGsIdGreaterThan(Long value) {
            addCriterion("gsId >", value, "gsId");
            return (Criteria) this;
        }

        public Criteria andGsIdGreaterThanOrEqualTo(Long value) {
            addCriterion("gsId >=", value, "gsId");
            return (Criteria) this;
        }

        public Criteria andGsIdLessThan(Long value) {
            addCriterion("gsId <", value, "gsId");
            return (Criteria) this;
        }

        public Criteria andGsIdLessThanOrEqualTo(Long value) {
            addCriterion("gsId <=", value, "gsId");
            return (Criteria) this;
        }

        public Criteria andGsIdIn(List<Long> values) {
            addCriterion("gsId in", values, "gsId");
            return (Criteria) this;
        }

        public Criteria andGsIdNotIn(List<Long> values) {
            addCriterion("gsId not in", values, "gsId");
            return (Criteria) this;
        }

        public Criteria andGsIdBetween(Long value1, Long value2) {
            addCriterion("gsId between", value1, value2, "gsId");
            return (Criteria) this;
        }

        public Criteria andGsIdNotBetween(Long value1, Long value2) {
            addCriterion("gsId not between", value1, value2, "gsId");
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

        public Criteria andScoreIsNull() {
            addCriterion("score is null");
            return (Criteria) this;
        }

        public Criteria andScoreIsNotNull() {
            addCriterion("score is not null");
            return (Criteria) this;
        }

        public Criteria andScoreEqualTo(Integer value) {
            addCriterion("score =", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreNotEqualTo(Integer value) {
            addCriterion("score <>", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreGreaterThan(Integer value) {
            addCriterion("score >", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreGreaterThanOrEqualTo(Integer value) {
            addCriterion("score >=", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreLessThan(Integer value) {
            addCriterion("score <", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreLessThanOrEqualTo(Integer value) {
            addCriterion("score <=", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreIn(List<Integer> values) {
            addCriterion("score in", values, "score");
            return (Criteria) this;
        }

        public Criteria andScoreNotIn(List<Integer> values) {
            addCriterion("score not in", values, "score");
            return (Criteria) this;
        }

        public Criteria andScoreBetween(Integer value1, Integer value2) {
            addCriterion("score between", value1, value2, "score");
            return (Criteria) this;
        }

        public Criteria andScoreNotBetween(Integer value1, Integer value2) {
            addCriterion("score not between", value1, value2, "score");
            return (Criteria) this;
        }

        public Criteria andPlayGameTotalTimeIsNull() {
            addCriterion("playGameTotalTime is null");
            return (Criteria) this;
        }

        public Criteria andPlayGameTotalTimeIsNotNull() {
            addCriterion("playGameTotalTime is not null");
            return (Criteria) this;
        }

        public Criteria andPlayGameTotalTimeEqualTo(Long value) {
            addCriterion("playGameTotalTime =", value, "playGameTotalTime");
            return (Criteria) this;
        }

        public Criteria andPlayGameTotalTimeNotEqualTo(Long value) {
            addCriterion("playGameTotalTime <>", value, "playGameTotalTime");
            return (Criteria) this;
        }

        public Criteria andPlayGameTotalTimeGreaterThan(Long value) {
            addCriterion("playGameTotalTime >", value, "playGameTotalTime");
            return (Criteria) this;
        }

        public Criteria andPlayGameTotalTimeGreaterThanOrEqualTo(Long value) {
            addCriterion("playGameTotalTime >=", value, "playGameTotalTime");
            return (Criteria) this;
        }

        public Criteria andPlayGameTotalTimeLessThan(Long value) {
            addCriterion("playGameTotalTime <", value, "playGameTotalTime");
            return (Criteria) this;
        }

        public Criteria andPlayGameTotalTimeLessThanOrEqualTo(Long value) {
            addCriterion("playGameTotalTime <=", value, "playGameTotalTime");
            return (Criteria) this;
        }

        public Criteria andPlayGameTotalTimeIn(List<Long> values) {
            addCriterion("playGameTotalTime in", values, "playGameTotalTime");
            return (Criteria) this;
        }

        public Criteria andPlayGameTotalTimeNotIn(List<Long> values) {
            addCriterion("playGameTotalTime not in", values, "playGameTotalTime");
            return (Criteria) this;
        }

        public Criteria andPlayGameTotalTimeBetween(Long value1, Long value2) {
            addCriterion("playGameTotalTime between", value1, value2, "playGameTotalTime");
            return (Criteria) this;
        }

        public Criteria andPlayGameTotalTimeNotBetween(Long value1, Long value2) {
            addCriterion("playGameTotalTime not between", value1, value2, "playGameTotalTime");
            return (Criteria) this;
        }

        public Criteria andTotalTimesIsNull() {
            addCriterion("totalTimes is null");
            return (Criteria) this;
        }

        public Criteria andTotalTimesIsNotNull() {
            addCriterion("totalTimes is not null");
            return (Criteria) this;
        }

        public Criteria andTotalTimesEqualTo(Integer value) {
            addCriterion("totalTimes =", value, "totalTimes");
            return (Criteria) this;
        }

        public Criteria andTotalTimesNotEqualTo(Integer value) {
            addCriterion("totalTimes <>", value, "totalTimes");
            return (Criteria) this;
        }

        public Criteria andTotalTimesGreaterThan(Integer value) {
            addCriterion("totalTimes >", value, "totalTimes");
            return (Criteria) this;
        }

        public Criteria andTotalTimesGreaterThanOrEqualTo(Integer value) {
            addCriterion("totalTimes >=", value, "totalTimes");
            return (Criteria) this;
        }

        public Criteria andTotalTimesLessThan(Integer value) {
            addCriterion("totalTimes <", value, "totalTimes");
            return (Criteria) this;
        }

        public Criteria andTotalTimesLessThanOrEqualTo(Integer value) {
            addCriterion("totalTimes <=", value, "totalTimes");
            return (Criteria) this;
        }

        public Criteria andTotalTimesIn(List<Integer> values) {
            addCriterion("totalTimes in", values, "totalTimes");
            return (Criteria) this;
        }

        public Criteria andTotalTimesNotIn(List<Integer> values) {
            addCriterion("totalTimes not in", values, "totalTimes");
            return (Criteria) this;
        }

        public Criteria andTotalTimesBetween(Integer value1, Integer value2) {
            addCriterion("totalTimes between", value1, value2, "totalTimes");
            return (Criteria) this;
        }

        public Criteria andTotalTimesNotBetween(Integer value1, Integer value2) {
            addCriterion("totalTimes not between", value1, value2, "totalTimes");
            return (Criteria) this;
        }

        public Criteria andWinCountIsNull() {
            addCriterion("winCount is null");
            return (Criteria) this;
        }

        public Criteria andWinCountIsNotNull() {
            addCriterion("winCount is not null");
            return (Criteria) this;
        }

        public Criteria andWinCountEqualTo(Integer value) {
            addCriterion("winCount =", value, "winCount");
            return (Criteria) this;
        }

        public Criteria andWinCountNotEqualTo(Integer value) {
            addCriterion("winCount <>", value, "winCount");
            return (Criteria) this;
        }

        public Criteria andWinCountGreaterThan(Integer value) {
            addCriterion("winCount >", value, "winCount");
            return (Criteria) this;
        }

        public Criteria andWinCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("winCount >=", value, "winCount");
            return (Criteria) this;
        }

        public Criteria andWinCountLessThan(Integer value) {
            addCriterion("winCount <", value, "winCount");
            return (Criteria) this;
        }

        public Criteria andWinCountLessThanOrEqualTo(Integer value) {
            addCriterion("winCount <=", value, "winCount");
            return (Criteria) this;
        }

        public Criteria andWinCountIn(List<Integer> values) {
            addCriterion("winCount in", values, "winCount");
            return (Criteria) this;
        }

        public Criteria andWinCountNotIn(List<Integer> values) {
            addCriterion("winCount not in", values, "winCount");
            return (Criteria) this;
        }

        public Criteria andWinCountBetween(Integer value1, Integer value2) {
            addCriterion("winCount between", value1, value2, "winCount");
            return (Criteria) this;
        }

        public Criteria andWinCountNotBetween(Integer value1, Integer value2) {
            addCriterion("winCount not between", value1, value2, "winCount");
            return (Criteria) this;
        }

        public Criteria andLostCountIsNull() {
            addCriterion("lostCount is null");
            return (Criteria) this;
        }

        public Criteria andLostCountIsNotNull() {
            addCriterion("lostCount is not null");
            return (Criteria) this;
        }

        public Criteria andLostCountEqualTo(Integer value) {
            addCriterion("lostCount =", value, "lostCount");
            return (Criteria) this;
        }

        public Criteria andLostCountNotEqualTo(Integer value) {
            addCriterion("lostCount <>", value, "lostCount");
            return (Criteria) this;
        }

        public Criteria andLostCountGreaterThan(Integer value) {
            addCriterion("lostCount >", value, "lostCount");
            return (Criteria) this;
        }

        public Criteria andLostCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("lostCount >=", value, "lostCount");
            return (Criteria) this;
        }

        public Criteria andLostCountLessThan(Integer value) {
            addCriterion("lostCount <", value, "lostCount");
            return (Criteria) this;
        }

        public Criteria andLostCountLessThanOrEqualTo(Integer value) {
            addCriterion("lostCount <=", value, "lostCount");
            return (Criteria) this;
        }

        public Criteria andLostCountIn(List<Integer> values) {
            addCriterion("lostCount in", values, "lostCount");
            return (Criteria) this;
        }

        public Criteria andLostCountNotIn(List<Integer> values) {
            addCriterion("lostCount not in", values, "lostCount");
            return (Criteria) this;
        }

        public Criteria andLostCountBetween(Integer value1, Integer value2) {
            addCriterion("lostCount between", value1, value2, "lostCount");
            return (Criteria) this;
        }

        public Criteria andLostCountNotBetween(Integer value1, Integer value2) {
            addCriterion("lostCount not between", value1, value2, "lostCount");
            return (Criteria) this;
        }

        public Criteria andDrawCountIsNull() {
            addCriterion("drawCount is null");
            return (Criteria) this;
        }

        public Criteria andDrawCountIsNotNull() {
            addCriterion("drawCount is not null");
            return (Criteria) this;
        }

        public Criteria andDrawCountEqualTo(Integer value) {
            addCriterion("drawCount =", value, "drawCount");
            return (Criteria) this;
        }

        public Criteria andDrawCountNotEqualTo(Integer value) {
            addCriterion("drawCount <>", value, "drawCount");
            return (Criteria) this;
        }

        public Criteria andDrawCountGreaterThan(Integer value) {
            addCriterion("drawCount >", value, "drawCount");
            return (Criteria) this;
        }

        public Criteria andDrawCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("drawCount >=", value, "drawCount");
            return (Criteria) this;
        }

        public Criteria andDrawCountLessThan(Integer value) {
            addCriterion("drawCount <", value, "drawCount");
            return (Criteria) this;
        }

        public Criteria andDrawCountLessThanOrEqualTo(Integer value) {
            addCriterion("drawCount <=", value, "drawCount");
            return (Criteria) this;
        }

        public Criteria andDrawCountIn(List<Integer> values) {
            addCriterion("drawCount in", values, "drawCount");
            return (Criteria) this;
        }

        public Criteria andDrawCountNotIn(List<Integer> values) {
            addCriterion("drawCount not in", values, "drawCount");
            return (Criteria) this;
        }

        public Criteria andDrawCountBetween(Integer value1, Integer value2) {
            addCriterion("drawCount between", value1, value2, "drawCount");
            return (Criteria) this;
        }

        public Criteria andDrawCountNotBetween(Integer value1, Integer value2) {
            addCriterion("drawCount not between", value1, value2, "drawCount");
            return (Criteria) this;
        }

        public Criteria andFleeCountIsNull() {
            addCriterion("fleeCount is null");
            return (Criteria) this;
        }

        public Criteria andFleeCountIsNotNull() {
            addCriterion("fleeCount is not null");
            return (Criteria) this;
        }

        public Criteria andFleeCountEqualTo(Integer value) {
            addCriterion("fleeCount =", value, "fleeCount");
            return (Criteria) this;
        }

        public Criteria andFleeCountNotEqualTo(Integer value) {
            addCriterion("fleeCount <>", value, "fleeCount");
            return (Criteria) this;
        }

        public Criteria andFleeCountGreaterThan(Integer value) {
            addCriterion("fleeCount >", value, "fleeCount");
            return (Criteria) this;
        }

        public Criteria andFleeCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("fleeCount >=", value, "fleeCount");
            return (Criteria) this;
        }

        public Criteria andFleeCountLessThan(Integer value) {
            addCriterion("fleeCount <", value, "fleeCount");
            return (Criteria) this;
        }

        public Criteria andFleeCountLessThanOrEqualTo(Integer value) {
            addCriterion("fleeCount <=", value, "fleeCount");
            return (Criteria) this;
        }

        public Criteria andFleeCountIn(List<Integer> values) {
            addCriterion("fleeCount in", values, "fleeCount");
            return (Criteria) this;
        }

        public Criteria andFleeCountNotIn(List<Integer> values) {
            addCriterion("fleeCount not in", values, "fleeCount");
            return (Criteria) this;
        }

        public Criteria andFleeCountBetween(Integer value1, Integer value2) {
            addCriterion("fleeCount between", value1, value2, "fleeCount");
            return (Criteria) this;
        }

        public Criteria andFleeCountNotBetween(Integer value1, Integer value2) {
            addCriterion("fleeCount not between", value1, value2, "fleeCount");
            return (Criteria) this;
        }

        public Criteria andLastPlayTimeIsNull() {
            addCriterion("lastPlayTime is null");
            return (Criteria) this;
        }

        public Criteria andLastPlayTimeIsNotNull() {
            addCriterion("lastPlayTime is not null");
            return (Criteria) this;
        }

        public Criteria andLastPlayTimeEqualTo(Date value) {
            addCriterion("lastPlayTime =", value, "lastPlayTime");
            return (Criteria) this;
        }

        public Criteria andLastPlayTimeNotEqualTo(Date value) {
            addCriterion("lastPlayTime <>", value, "lastPlayTime");
            return (Criteria) this;
        }

        public Criteria andLastPlayTimeGreaterThan(Date value) {
            addCriterion("lastPlayTime >", value, "lastPlayTime");
            return (Criteria) this;
        }

        public Criteria andLastPlayTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("lastPlayTime >=", value, "lastPlayTime");
            return (Criteria) this;
        }

        public Criteria andLastPlayTimeLessThan(Date value) {
            addCriterion("lastPlayTime <", value, "lastPlayTime");
            return (Criteria) this;
        }

        public Criteria andLastPlayTimeLessThanOrEqualTo(Date value) {
            addCriterion("lastPlayTime <=", value, "lastPlayTime");
            return (Criteria) this;
        }

        public Criteria andLastPlayTimeIn(List<Date> values) {
            addCriterion("lastPlayTime in", values, "lastPlayTime");
            return (Criteria) this;
        }

        public Criteria andLastPlayTimeNotIn(List<Date> values) {
            addCriterion("lastPlayTime not in", values, "lastPlayTime");
            return (Criteria) this;
        }

        public Criteria andLastPlayTimeBetween(Date value1, Date value2) {
            addCriterion("lastPlayTime between", value1, value2, "lastPlayTime");
            return (Criteria) this;
        }

        public Criteria andLastPlayTimeNotBetween(Date value1, Date value2) {
            addCriterion("lastPlayTime not between", value1, value2, "lastPlayTime");
            return (Criteria) this;
        }

        public Criteria andLastDeviceTypeIsNull() {
            addCriterion("lastDeviceType is null");
            return (Criteria) this;
        }

        public Criteria andLastDeviceTypeIsNotNull() {
            addCriterion("lastDeviceType is not null");
            return (Criteria) this;
        }

        public Criteria andLastDeviceTypeEqualTo(Integer value) {
            addCriterion("lastDeviceType =", value, "lastDeviceType");
            return (Criteria) this;
        }

        public Criteria andLastDeviceTypeNotEqualTo(Integer value) {
            addCriterion("lastDeviceType <>", value, "lastDeviceType");
            return (Criteria) this;
        }

        public Criteria andLastDeviceTypeGreaterThan(Integer value) {
            addCriterion("lastDeviceType >", value, "lastDeviceType");
            return (Criteria) this;
        }

        public Criteria andLastDeviceTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("lastDeviceType >=", value, "lastDeviceType");
            return (Criteria) this;
        }

        public Criteria andLastDeviceTypeLessThan(Integer value) {
            addCriterion("lastDeviceType <", value, "lastDeviceType");
            return (Criteria) this;
        }

        public Criteria andLastDeviceTypeLessThanOrEqualTo(Integer value) {
            addCriterion("lastDeviceType <=", value, "lastDeviceType");
            return (Criteria) this;
        }

        public Criteria andLastDeviceTypeIn(List<Integer> values) {
            addCriterion("lastDeviceType in", values, "lastDeviceType");
            return (Criteria) this;
        }

        public Criteria andLastDeviceTypeNotIn(List<Integer> values) {
            addCriterion("lastDeviceType not in", values, "lastDeviceType");
            return (Criteria) this;
        }

        public Criteria andLastDeviceTypeBetween(Integer value1, Integer value2) {
            addCriterion("lastDeviceType between", value1, value2, "lastDeviceType");
            return (Criteria) this;
        }

        public Criteria andLastDeviceTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("lastDeviceType not between", value1, value2, "lastDeviceType");
            return (Criteria) this;
        }

        public Criteria andLastLogonIPIsNull() {
            addCriterion("lastLogonIP is null");
            return (Criteria) this;
        }

        public Criteria andLastLogonIPIsNotNull() {
            addCriterion("lastLogonIP is not null");
            return (Criteria) this;
        }

        public Criteria andLastLogonIPEqualTo(String value) {
            addCriterion("lastLogonIP =", value, "lastLogonIP");
            return (Criteria) this;
        }

        public Criteria andLastLogonIPNotEqualTo(String value) {
            addCriterion("lastLogonIP <>", value, "lastLogonIP");
            return (Criteria) this;
        }

        public Criteria andLastLogonIPGreaterThan(String value) {
            addCriterion("lastLogonIP >", value, "lastLogonIP");
            return (Criteria) this;
        }

        public Criteria andLastLogonIPGreaterThanOrEqualTo(String value) {
            addCriterion("lastLogonIP >=", value, "lastLogonIP");
            return (Criteria) this;
        }

        public Criteria andLastLogonIPLessThan(String value) {
            addCriterion("lastLogonIP <", value, "lastLogonIP");
            return (Criteria) this;
        }

        public Criteria andLastLogonIPLessThanOrEqualTo(String value) {
            addCriterion("lastLogonIP <=", value, "lastLogonIP");
            return (Criteria) this;
        }

        public Criteria andLastLogonIPLike(String value) {
            addCriterion("lastLogonIP like", value, "lastLogonIP");
            return (Criteria) this;
        }

        public Criteria andLastLogonIPNotLike(String value) {
            addCriterion("lastLogonIP not like", value, "lastLogonIP");
            return (Criteria) this;
        }

        public Criteria andLastLogonIPIn(List<String> values) {
            addCriterion("lastLogonIP in", values, "lastLogonIP");
            return (Criteria) this;
        }

        public Criteria andLastLogonIPNotIn(List<String> values) {
            addCriterion("lastLogonIP not in", values, "lastLogonIP");
            return (Criteria) this;
        }

        public Criteria andLastLogonIPBetween(String value1, String value2) {
            addCriterion("lastLogonIP between", value1, value2, "lastLogonIP");
            return (Criteria) this;
        }

        public Criteria andLastLogonIPNotBetween(String value1, String value2) {
            addCriterion("lastLogonIP not between", value1, value2, "lastLogonIP");
            return (Criteria) this;
        }

        public Criteria andLastLogonIPLikeInsensitive(String value) {
            addCriterion("upper(lastLogonIP) like", value.toUpperCase(), "lastLogonIP");
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