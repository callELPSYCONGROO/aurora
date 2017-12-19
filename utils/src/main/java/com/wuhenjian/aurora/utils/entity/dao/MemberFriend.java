package com.wuhenjian.aurora.utils.entity.dao;

import java.io.Serializable;
import java.util.Date;

public class MemberFriend implements Serializable {
    private Long mfId;

    private Long ownerId;

    private Long guestId;

    private Date createTime;

    private static final long serialVersionUID = 1L;

    public Long getMfId() {
        return mfId;
    }

    public void setMfId(Long mfId) {
        this.mfId = mfId;
    }

    public Long getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
    }

    public Long getGuestId() {
        return guestId;
    }

    public void setGuestId(Long guestId) {
        this.guestId = guestId;
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
        MemberFriend other = (MemberFriend) that;
        return (this.getMfId() == null ? other.getMfId() == null : this.getMfId().equals(other.getMfId()))
            && (this.getOwnerId() == null ? other.getOwnerId() == null : this.getOwnerId().equals(other.getOwnerId()))
            && (this.getGuestId() == null ? other.getGuestId() == null : this.getGuestId().equals(other.getGuestId()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getMfId() == null) ? 0 : getMfId().hashCode());
        result = prime * result + ((getOwnerId() == null) ? 0 : getOwnerId().hashCode());
        result = prime * result + ((getGuestId() == null) ? 0 : getGuestId().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", mfId=").append(mfId);
        sb.append(", ownerId=").append(ownerId);
        sb.append(", guestId=").append(guestId);
        sb.append(", createTime=").append(createTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}