package com.wuhenjian.aurora.utils.entity.dao;

import java.io.Serializable;
import java.util.Date;

public class GameScore implements Serializable {
    private Long gsId;

    private Long maId;

    private Integer score;

    private Long playGameTotalTime;

    private Integer totalTimes;

    private Integer winCount;

    private Integer lostCount;

    private Integer drawCount;

    private Integer fleeCount;

    private Date lastPlayTime;

    private Integer lastDeviceType;

    private String lastLogonIP;

    private static final long serialVersionUID = 1L;

    public Long getGsId() {
        return gsId;
    }

    public void setGsId(Long gsId) {
        this.gsId = gsId;
    }

    public Long getMaId() {
        return maId;
    }

    public void setMaId(Long maId) {
        this.maId = maId;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    public Long getPlayGameTotalTime() {
        return playGameTotalTime;
    }

    public void setPlayGameTotalTime(Long playGameTotalTime) {
        this.playGameTotalTime = playGameTotalTime;
    }

    public Integer getTotalTimes() {
        return totalTimes;
    }

    public void setTotalTimes(Integer totalTimes) {
        this.totalTimes = totalTimes;
    }

    public Integer getWinCount() {
        return winCount;
    }

    public void setWinCount(Integer winCount) {
        this.winCount = winCount;
    }

    public Integer getLostCount() {
        return lostCount;
    }

    public void setLostCount(Integer lostCount) {
        this.lostCount = lostCount;
    }

    public Integer getDrawCount() {
        return drawCount;
    }

    public void setDrawCount(Integer drawCount) {
        this.drawCount = drawCount;
    }

    public Integer getFleeCount() {
        return fleeCount;
    }

    public void setFleeCount(Integer fleeCount) {
        this.fleeCount = fleeCount;
    }

    public Date getLastPlayTime() {
        return lastPlayTime;
    }

    public void setLastPlayTime(Date lastPlayTime) {
        this.lastPlayTime = lastPlayTime;
    }

    public Integer getLastDeviceType() {
        return lastDeviceType;
    }

    public void setLastDeviceType(Integer lastDeviceType) {
        this.lastDeviceType = lastDeviceType;
    }

    public String getLastLogonIP() {
        return lastLogonIP;
    }

    public void setLastLogonIP(String lastLogonIP) {
        this.lastLogonIP = lastLogonIP == null ? null : lastLogonIP.trim();
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
        GameScore other = (GameScore) that;
        return (this.getGsId() == null ? other.getGsId() == null : this.getGsId().equals(other.getGsId()))
            && (this.getMaId() == null ? other.getMaId() == null : this.getMaId().equals(other.getMaId()))
            && (this.getScore() == null ? other.getScore() == null : this.getScore().equals(other.getScore()))
            && (this.getPlayGameTotalTime() == null ? other.getPlayGameTotalTime() == null : this.getPlayGameTotalTime().equals(other.getPlayGameTotalTime()))
            && (this.getTotalTimes() == null ? other.getTotalTimes() == null : this.getTotalTimes().equals(other.getTotalTimes()))
            && (this.getWinCount() == null ? other.getWinCount() == null : this.getWinCount().equals(other.getWinCount()))
            && (this.getLostCount() == null ? other.getLostCount() == null : this.getLostCount().equals(other.getLostCount()))
            && (this.getDrawCount() == null ? other.getDrawCount() == null : this.getDrawCount().equals(other.getDrawCount()))
            && (this.getFleeCount() == null ? other.getFleeCount() == null : this.getFleeCount().equals(other.getFleeCount()))
            && (this.getLastPlayTime() == null ? other.getLastPlayTime() == null : this.getLastPlayTime().equals(other.getLastPlayTime()))
            && (this.getLastDeviceType() == null ? other.getLastDeviceType() == null : this.getLastDeviceType().equals(other.getLastDeviceType()))
            && (this.getLastLogonIP() == null ? other.getLastLogonIP() == null : this.getLastLogonIP().equals(other.getLastLogonIP()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getGsId() == null) ? 0 : getGsId().hashCode());
        result = prime * result + ((getMaId() == null) ? 0 : getMaId().hashCode());
        result = prime * result + ((getScore() == null) ? 0 : getScore().hashCode());
        result = prime * result + ((getPlayGameTotalTime() == null) ? 0 : getPlayGameTotalTime().hashCode());
        result = prime * result + ((getTotalTimes() == null) ? 0 : getTotalTimes().hashCode());
        result = prime * result + ((getWinCount() == null) ? 0 : getWinCount().hashCode());
        result = prime * result + ((getLostCount() == null) ? 0 : getLostCount().hashCode());
        result = prime * result + ((getDrawCount() == null) ? 0 : getDrawCount().hashCode());
        result = prime * result + ((getFleeCount() == null) ? 0 : getFleeCount().hashCode());
        result = prime * result + ((getLastPlayTime() == null) ? 0 : getLastPlayTime().hashCode());
        result = prime * result + ((getLastDeviceType() == null) ? 0 : getLastDeviceType().hashCode());
        result = prime * result + ((getLastLogonIP() == null) ? 0 : getLastLogonIP().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", gsId=").append(gsId);
        sb.append(", maId=").append(maId);
        sb.append(", score=").append(score);
        sb.append(", playGameTotalTime=").append(playGameTotalTime);
        sb.append(", totalTimes=").append(totalTimes);
        sb.append(", winCount=").append(winCount);
        sb.append(", lostCount=").append(lostCount);
        sb.append(", drawCount=").append(drawCount);
        sb.append(", fleeCount=").append(fleeCount);
        sb.append(", lastPlayTime=").append(lastPlayTime);
        sb.append(", lastDeviceType=").append(lastDeviceType);
        sb.append(", lastLogonIP=").append(lastLogonIP);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}