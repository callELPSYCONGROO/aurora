package com.wuhenjian.aurora.utils.entity.dao;

import com.wuhenjian.aurora.utils.entity.bo.Page;

import java.io.Serializable;
import java.util.Date;

public class MemberAuth extends Page implements Serializable {
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

    private static final long serialVersionUID = 1L;

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
        this.memberPhone = memberPhone == null ? null : memberPhone.trim();
    }

    public String getMemberEmail() {
        return memberEmail;
    }

    public void setMemberEmail(String memberEmail) {
        this.memberEmail = memberEmail == null ? null : memberEmail.trim();
    }

    public String getAuthSalt() {
        return authSalt;
    }

    public void setAuthSalt(String authSalt) {
        this.authSalt = authSalt == null ? null : authSalt.trim();
    }

    public String getMemberPassword() {
        return memberPassword;
    }

    public void setMemberPassword(String memberPassword) {
        this.memberPassword = memberPassword == null ? null : memberPassword.trim();
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
        MemberAuth other = (MemberAuth) that;
        return (this.getMaId() == null ? other.getMaId() == null : this.getMaId().equals(other.getMaId()))
            && (this.getAccountCode() == null ? other.getAccountCode() == null : this.getAccountCode().equals(other.getAccountCode()))
            && (this.getMemberPhone() == null ? other.getMemberPhone() == null : this.getMemberPhone().equals(other.getMemberPhone()))
            && (this.getMemberEmail() == null ? other.getMemberEmail() == null : this.getMemberEmail().equals(other.getMemberEmail()))
            && (this.getAuthSalt() == null ? other.getAuthSalt() == null : this.getAuthSalt().equals(other.getAuthSalt()))
            && (this.getMemberPassword() == null ? other.getMemberPassword() == null : this.getMemberPassword().equals(other.getMemberPassword()))
            && (this.getAuthFail() == null ? other.getAuthFail() == null : this.getAuthFail().equals(other.getAuthFail()))
            && (this.getCurrentStatus() == null ? other.getCurrentStatus() == null : this.getCurrentStatus().equals(other.getCurrentStatus()))
            && (this.getRegisterTime() == null ? other.getRegisterTime() == null : this.getRegisterTime().equals(other.getRegisterTime()))
            && (this.getUpdateTime() == null ? other.getUpdateTime() == null : this.getUpdateTime().equals(other.getUpdateTime()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getMaId() == null) ? 0 : getMaId().hashCode());
        result = prime * result + ((getAccountCode() == null) ? 0 : getAccountCode().hashCode());
        result = prime * result + ((getMemberPhone() == null) ? 0 : getMemberPhone().hashCode());
        result = prime * result + ((getMemberEmail() == null) ? 0 : getMemberEmail().hashCode());
        result = prime * result + ((getAuthSalt() == null) ? 0 : getAuthSalt().hashCode());
        result = prime * result + ((getMemberPassword() == null) ? 0 : getMemberPassword().hashCode());
        result = prime * result + ((getAuthFail() == null) ? 0 : getAuthFail().hashCode());
        result = prime * result + ((getCurrentStatus() == null) ? 0 : getCurrentStatus().hashCode());
        result = prime * result + ((getRegisterTime() == null) ? 0 : getRegisterTime().hashCode());
        result = prime * result + ((getUpdateTime() == null) ? 0 : getUpdateTime().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", maId=").append(maId);
        sb.append(", accountCode=").append(accountCode);
        sb.append(", memberPhone=").append(memberPhone);
        sb.append(", memberEmail=").append(memberEmail);
        sb.append(", authSalt=").append(authSalt);
        sb.append(", memberPassword=").append(memberPassword);
        sb.append(", authFail=").append(authFail);
        sb.append(", currentStatus=").append(currentStatus);
        sb.append(", registerTime=").append(registerTime);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}