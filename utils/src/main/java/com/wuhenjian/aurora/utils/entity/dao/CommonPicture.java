package com.wuhenjian.aurora.utils.entity.dao;

import com.wuhenjian.aurora.utils.entity.bo.Page;

import java.io.Serializable;
import java.util.Date;

public class CommonPicture extends Page implements Serializable {
    private Long cpId;

    private Integer pType;

    private String picAddress;

    private Date createTime;

    private Integer isShow;

    private static final long serialVersionUID = 1L;

    public Long getCpId() {
        return cpId;
    }

    public void setCpId(Long cpId) {
        this.cpId = cpId;
    }

    public Integer getpType() {
        return pType;
    }

    public void setpType(Integer pType) {
        this.pType = pType;
    }

    public String getPicAddress() {
        return picAddress;
    }

    public void setPicAddress(String picAddress) {
        this.picAddress = picAddress == null ? null : picAddress.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Integer getIsShow() {
        return isShow;
    }

    public void setIsShow(Integer isShow) {
        this.isShow = isShow;
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
        CommonPicture other = (CommonPicture) that;
        return (this.getCpId() == null ? other.getCpId() == null : this.getCpId().equals(other.getCpId()))
            && (this.getpType() == null ? other.getpType() == null : this.getpType().equals(other.getpType()))
            && (this.getPicAddress() == null ? other.getPicAddress() == null : this.getPicAddress().equals(other.getPicAddress()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
            && (this.getIsShow() == null ? other.getIsShow() == null : this.getIsShow().equals(other.getIsShow()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getCpId() == null) ? 0 : getCpId().hashCode());
        result = prime * result + ((getpType() == null) ? 0 : getpType().hashCode());
        result = prime * result + ((getPicAddress() == null) ? 0 : getPicAddress().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getIsShow() == null) ? 0 : getIsShow().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", cpId=").append(cpId);
        sb.append(", pType=").append(pType);
        sb.append(", picAddress=").append(picAddress);
        sb.append(", createTime=").append(createTime);
        sb.append(", isShow=").append(isShow);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}