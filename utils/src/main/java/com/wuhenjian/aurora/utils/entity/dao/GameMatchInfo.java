package com.wuhenjian.aurora.utils.entity.dao;

import com.wuhenjian.aurora.utils.entity.bo.Page;

import java.io.Serializable;
import java.util.Date;

public class GameMatchInfo extends Page implements Serializable {
    private Long gmiId;

    private Long offensive;

    private Long defensive;

    private Integer totalRound;

    private Integer finalResult;

    private Date startTime;

    private Date endTime;

    private Integer winScore;

    private Integer lostScore;

    private Date createTime;

    private static final long serialVersionUID = 1L;

    public Long getGmiId() {
        return gmiId;
    }

    public void setGmiId(Long gmiId) {
        this.gmiId = gmiId;
    }

    public Long getOffensive() {
        return offensive;
    }

    public void setOffensive(Long offensive) {
        this.offensive = offensive;
    }

    public Long getDefensive() {
        return defensive;
    }

    public void setDefensive(Long defensive) {
        this.defensive = defensive;
    }

    public Integer getTotalRound() {
        return totalRound;
    }

    public void setTotalRound(Integer totalRound) {
        this.totalRound = totalRound;
    }

    public Integer getFinalResult() {
        return finalResult;
    }

    public void setFinalResult(Integer finalResult) {
        this.finalResult = finalResult;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public Integer getWinScore() {
        return winScore;
    }

    public void setWinScore(Integer winScore) {
        this.winScore = winScore;
    }

    public Integer getLostScore() {
        return lostScore;
    }

    public void setLostScore(Integer lostScore) {
        this.lostScore = lostScore;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        GameMatchInfo other = (GameMatchInfo) that;
        return (this.getGmiId() == null ? other.getGmiId() == null : this.getGmiId().equals(other.getGmiId()))
            && (this.getOffensive() == null ? other.getOffensive() == null : this.getOffensive().equals(other.getOffensive()))
            && (this.getDefensive() == null ? other.getDefensive() == null : this.getDefensive().equals(other.getDefensive()))
            && (this.getTotalRound() == null ? other.getTotalRound() == null : this.getTotalRound().equals(other.getTotalRound()))
            && (this.getFinalResult() == null ? other.getFinalResult() == null : this.getFinalResult().equals(other.getFinalResult()))
            && (this.getStartTime() == null ? other.getStartTime() == null : this.getStartTime().equals(other.getStartTime()))
            && (this.getEndTime() == null ? other.getEndTime() == null : this.getEndTime().equals(other.getEndTime()))
            && (this.getWinScore() == null ? other.getWinScore() == null : this.getWinScore().equals(other.getWinScore()))
            && (this.getLostScore() == null ? other.getLostScore() == null : this.getLostScore().equals(other.getLostScore()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getGmiId() == null) ? 0 : getGmiId().hashCode());
        result = prime * result + ((getOffensive() == null) ? 0 : getOffensive().hashCode());
        result = prime * result + ((getDefensive() == null) ? 0 : getDefensive().hashCode());
        result = prime * result + ((getTotalRound() == null) ? 0 : getTotalRound().hashCode());
        result = prime * result + ((getFinalResult() == null) ? 0 : getFinalResult().hashCode());
        result = prime * result + ((getStartTime() == null) ? 0 : getStartTime().hashCode());
        result = prime * result + ((getEndTime() == null) ? 0 : getEndTime().hashCode());
        result = prime * result + ((getWinScore() == null) ? 0 : getWinScore().hashCode());
        result = prime * result + ((getLostScore() == null) ? 0 : getLostScore().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", gmiId=").append(gmiId);
        sb.append(", offensive=").append(offensive);
        sb.append(", defensive=").append(defensive);
        sb.append(", totalRound=").append(totalRound);
        sb.append(", finalResult=").append(finalResult);
        sb.append(", startTime=").append(startTime);
        sb.append(", endTime=").append(endTime);
        sb.append(", winScore=").append(winScore);
        sb.append(", lostScore=").append(lostScore);
        sb.append(", createTime=").append(createTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}