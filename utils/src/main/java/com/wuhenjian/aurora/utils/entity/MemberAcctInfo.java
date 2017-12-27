package com.wuhenjian.aurora.utils.entity;

import java.util.Date;

/**
 * @author 無痕剑
 * @date 2017/12/11 14:47
 */
public class MemberAcctInfo {
	private Long faceId;

	private Long area;

	private String nickName;

	private String memberSign;

	private Integer sex;

	private Date lastLoginTime;

	private String lastLoginIP;

	private Integer lastLoginDevice;

	public Long getFaceId() {
		return faceId;
	}

	public void setFaceId(Long faceId) {
		this.faceId = faceId;
	}

	public Long getArea() {
		return area;
	}

	public void setArea(Long area) {
		this.area = area;
	}

	public String getNickName() {
		return nickName;
	}

	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

	public String getMemberSign() {
		return memberSign;
	}

	public void setMemberSign(String memberSign) {
		this.memberSign = memberSign;
	}

	public Integer getSex() {
		return sex;
	}

	public void setSex(Integer sex) {
		this.sex = sex;
	}

	public Date getLastLoginTime() {
		return lastLoginTime;
	}

	public void setLastLoginTime(Date lastLoginTime) {
		this.lastLoginTime = lastLoginTime;
	}

	public String getLastLoginIP() {
		return lastLoginIP;
	}

	public void setLastLoginIP(String lastLoginIP) {
		this.lastLoginIP = lastLoginIP;
	}

	public Integer getLastLoginDevice() {
		return lastLoginDevice;
	}

	public void setLastLoginDevice(Integer lastLoginDevice) {
		this.lastLoginDevice = lastLoginDevice;
	}
}
