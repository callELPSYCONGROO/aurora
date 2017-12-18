package com.wuhenjian.aurora.utils.entity.dao;

import java.util.Date;

/**
 * @author 無痕剑
 * @date 2017/12/18 17:00
 */
public class MemberComment {

	private Long mcId;

	private Long maId;

	private Integer commentType;

	private String title;

	private String content;

	private Integer commentDevice;

	private Date createTime;

	public Long getMcId() {
		return mcId;
	}

	public void setMcId(Long mcId) {
		this.mcId = mcId;
	}

	public Long getMaId() {
		return maId;
	}

	public void setMaId(Long maId) {
		this.maId = maId;
	}

	public Integer getCommentType() {
		return commentType;
	}

	public void setCommentType(Integer commentType) {
		this.commentType = commentType;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Integer getCommentDevice() {
		return commentDevice;
	}

	public void setCommentDevice(Integer commentDevice) {
		this.commentDevice = commentDevice;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
}
