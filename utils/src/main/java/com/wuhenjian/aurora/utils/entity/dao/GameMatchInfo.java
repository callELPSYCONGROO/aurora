package com.wuhenjian.aurora.utils.entity.dao;

import java.util.Date;

/**
 * @author 無痕剑
 * @date 2017/12/18 16:54
 */
public class GameMatchInfo {

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
}
