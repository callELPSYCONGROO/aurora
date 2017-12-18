package com.wuhenjian.aurora.utils.entity.dao;

import java.util.Date;

/**
 * @author 無痕剑
 * @date 2017/12/18 16:58
 */
public class MemberAuth {

	private Long maId;

	private Long accountCode;

	private String memberPhone;

	private String memberEmail;

	private String authSalt;

	private String memberPassword;

	private Integer authFail;

	private Integer currentStatus;

	private Date registerTime;

	private Date updateTime;

	public Long getMaId() {
		return maId;
	}

	public void setMaId(Long maId) {
		this.maId = maId;
	}

	public Long getAccountCode() {
		return accountCode;
	}

	public void setAccountCode(Long accountCode) {
		this.accountCode = accountCode;
	}

	public String getMemberPhone() {
		return memberPhone;
	}

	public void setMemberPhone(String memberPhone) {
		this.memberPhone = memberPhone;
	}

	public String getMemberEmail() {
		return memberEmail;
	}

	public void setMemberEmail(String memberEmail) {
		this.memberEmail = memberEmail;
	}

	public String getAuthSalt() {
		return authSalt;
	}

	public void setAuthSalt(String authSalt) {
		this.authSalt = authSalt;
	}

	public String getMemberPassword() {
		return memberPassword;
	}

	public void setMemberPassword(String memberPassword) {
		this.memberPassword = memberPassword;
	}

	public Integer getAuthFail() {
		return authFail;
	}

	public void setAuthFail(Integer authFail) {
		this.authFail = authFail;
	}

	public Integer getCurrentStatus() {
		return currentStatus;
	}

	public void setCurrentStatus(Integer currentStatus) {
		this.currentStatus = currentStatus;
	}

	public Date getRegisterTime() {
		return registerTime;
	}

	public void setRegisterTime(Date registerTime) {
		this.registerTime = registerTime;
	}

	public Date getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}
}
