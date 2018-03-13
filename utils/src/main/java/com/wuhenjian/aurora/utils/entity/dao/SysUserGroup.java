package com.wuhenjian.aurora.utils.entity.dao;

import com.wuhenjian.aurora.utils.entity.bo.Page;

import java.io.Serializable;

public class SysUserGroup extends Page implements Serializable {
    private Long sugId;

    private Long sgId;

    private Long suId;

    private static final long serialVersionUID = 1L;

    public Long getSugId() {
        return sugId;
    }

    public void setSugId(Long sugId) {
        this.sugId = sugId;
    }

    public Long getSgId() {
        return sgId;
    }

    public void setSgId(Long sgId) {
        this.sgId = sgId;
    }

    public Long getSuId() {
        return suId;
    }

    public void setSuId(Long suId) {
        this.suId = suId;
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
        SysUserGroup other = (SysUserGroup) that;
        return (this.getSugId() == null ? other.getSugId() == null : this.getSugId().equals(other.getSugId()))
            && (this.getSgId() == null ? other.getSgId() == null : this.getSgId().equals(other.getSgId()))
            && (this.getSuId() == null ? other.getSuId() == null : this.getSuId().equals(other.getSuId()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getSugId() == null) ? 0 : getSugId().hashCode());
        result = prime * result + ((getSgId() == null) ? 0 : getSgId().hashCode());
        result = prime * result + ((getSuId() == null) ? 0 : getSuId().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", sugId=").append(sugId);
        sb.append(", sgId=").append(sgId);
        sb.append(", suId=").append(suId);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}