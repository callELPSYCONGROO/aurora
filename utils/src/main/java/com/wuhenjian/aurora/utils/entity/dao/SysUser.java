package com.wuhenjian.aurora.utils.entity.dao;

import com.wuhenjian.aurora.utils.entity.bo.Page;

import java.io.Serializable;
import java.util.Date;

public class SysUser extends Page implements Serializable {
    private Long suId;

    private String uacctount;

    private String upassword;

    private String uemail;

    private String uphone;

    private String uname;

    private String salt;

    private Integer ustatus;

    private Date createTime;

    private Date updateTime;

    private String lastLoginIP;

    private Date lastLoginTime;

    private static final long serialVersionUID = 1L;

    public Long getSuId() {
        return suId;
    }

    public void setSuId(Long suId) {
        this.suId = suId;
    }

    public String getUacctount() {
        return uacctount;
    }

    public void setUacctount(String uacctount) {
        this.uacctount = uacctount == null ? null : uacctount.trim();
    }

    public String getUpassword() {
        return upassword;
    }

    public void setUpassword(String upassword) {
        this.upassword = upassword == null ? null : upassword.trim();
    }

    public String getUemail() {
        return uemail;
    }

    public void setUemail(String uemail) {
        this.uemail = uemail == null ? null : uemail.trim();
    }

    public String getUphone() {
        return uphone;
    }

    public void setUphone(String uphone) {
        this.uphone = uphone == null ? null : uphone.trim();
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname == null ? null : uname.trim();
    }

    public String getSalt() {
        return salt;
    }

    public void setSalt(String salt) {
        this.salt = salt == null ? null : salt.trim();
    }

    public Integer getUstatus() {
        return ustatus;
    }

    public void setUstatus(Integer ustatus) {
        this.ustatus = ustatus;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getLastLoginIP() {
        return lastLoginIP;
    }

    public void setLastLoginIP(String lastLoginIP) {
        this.lastLoginIP = lastLoginIP == null ? null : lastLoginIP.trim();
    }

    public Date getLastLoginTime() {
        return lastLoginTime;
    }

    public void setLastLoginTime(Date lastLoginTime) {
        this.lastLoginTime = lastLoginTime;
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
        SysUser other = (SysUser) that;
        return (this.getSuId() == null ? other.getSuId() == null : this.getSuId().equals(other.getSuId()))
            && (this.getUacctount() == null ? other.getUacctount() == null : this.getUacctount().equals(other.getUacctount()))
            && (this.getUpassword() == null ? other.getUpassword() == null : this.getUpassword().equals(other.getUpassword()))
            && (this.getUemail() == null ? other.getUemail() == null : this.getUemail().equals(other.getUemail()))
            && (this.getUphone() == null ? other.getUphone() == null : this.getUphone().equals(other.getUphone()))
            && (this.getUname() == null ? other.getUname() == null : this.getUname().equals(other.getUname()))
            && (this.getSalt() == null ? other.getSalt() == null : this.getSalt().equals(other.getSalt()))
            && (this.getUstatus() == null ? other.getUstatus() == null : this.getUstatus().equals(other.getUstatus()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
            && (this.getUpdateTime() == null ? other.getUpdateTime() == null : this.getUpdateTime().equals(other.getUpdateTime()))
            && (this.getLastLoginIP() == null ? other.getLastLoginIP() == null : this.getLastLoginIP().equals(other.getLastLoginIP()))
            && (this.getLastLoginTime() == null ? other.getLastLoginTime() == null : this.getLastLoginTime().equals(other.getLastLoginTime()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getSuId() == null) ? 0 : getSuId().hashCode());
        result = prime * result + ((getUacctount() == null) ? 0 : getUacctount().hashCode());
        result = prime * result + ((getUpassword() == null) ? 0 : getUpassword().hashCode());
        result = prime * result + ((getUemail() == null) ? 0 : getUemail().hashCode());
        result = prime * result + ((getUphone() == null) ? 0 : getUphone().hashCode());
        result = prime * result + ((getUname() == null) ? 0 : getUname().hashCode());
        result = prime * result + ((getSalt() == null) ? 0 : getSalt().hashCode());
        result = prime * result + ((getUstatus() == null) ? 0 : getUstatus().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getUpdateTime() == null) ? 0 : getUpdateTime().hashCode());
        result = prime * result + ((getLastLoginIP() == null) ? 0 : getLastLoginIP().hashCode());
        result = prime * result + ((getLastLoginTime() == null) ? 0 : getLastLoginTime().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", suId=").append(suId);
        sb.append(", uacctount=").append(uacctount);
        sb.append(", upassword=").append(upassword);
        sb.append(", uemail=").append(uemail);
        sb.append(", uphone=").append(uphone);
        sb.append(", uname=").append(uname);
        sb.append(", salt=").append(salt);
        sb.append(", ustatus=").append(ustatus);
        sb.append(", createTime=").append(createTime);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", lastLoginIP=").append(lastLoginIP);
        sb.append(", lastLoginTime=").append(lastLoginTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}