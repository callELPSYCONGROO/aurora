package com.wuhenjian.aurora.utils.entity.dao;

import java.util.Date;

/**
 * @author 無痕剑
 * @date 2017/12/18 16:56
 */
public class GameScore {

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
		this.lastLogonIP = lastLogonIP;
	}
}
