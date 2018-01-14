package com.wuhenjian.aurora.utils.entity.dao;

import com.wuhenjian.aurora.utils.entity.bo.Page;

import java.io.Serializable;
import java.util.Date;

public class MemberPush extends Page implements Serializable {
    private Long mpId;

    private Long maId;

    private Integer phone;

    private Integer email;

    private Date updateTime;

    private Date createTime;

    private static final long serialVersionUID = 1L;

    public Long getMpId() {
        return mpId;
    }

    public void setMpId(Long mpId) {
        this.mpId = mpId;
    }

    public Long getMaId() {
        return maId;
    }

    public void setMaId(Long maId) {
        this.maId = maId;
    }

    public Integer getPhone() {
        return phone;
    }

    public void setPhone(Integer phone) {
        this.phone = phone;
    }

    public Integer getEmail() {
        return email;
    }

    public void setEmail(Integer email) {
        this.email = email;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
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
        MemberPush other = (MemberPush) that;
        return (this.getMpId() == null ? other.getMpId() == null : this.getMpId().equals(other.getMpId()))
            && (this.getMaId() == null ? other.getMaId() == null : this.getMaId().equals(other.getMaId()))
            && (this.getPhone() == null ? other.getPhone() == null : this.getPhone().equals(other.getPhone()))
            && (this.getEmail() == null ? other.getEmail() == null : this.getEmail().equals(other.getEmail()))
            && (this.getUpdateTime() == null ? other.getUpdateTime() == null : this.getUpdateTime().equals(other.getUpdateTime()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getMpId() == null) ? 0 : getMpId().hashCode());
        result = prime * result + ((getMaId() == null) ? 0 : getMaId().hashCode());
        result = prime * result + ((getPhone() == null) ? 0 : getPhone().hashCode());
        result = prime * result + ((getEmail() == null) ? 0 : getEmail().hashCode());
        result = prime * result + ((getUpdateTime() == null) ? 0 : getUpdateTime().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", mpId=").append(mpId);
        sb.append(", maId=").append(maId);
        sb.append(", phone=").append(phone);
        sb.append(", service=").append(email);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", createTime=").append(createTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}