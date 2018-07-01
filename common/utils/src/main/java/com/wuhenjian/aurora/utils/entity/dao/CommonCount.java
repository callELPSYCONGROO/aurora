package com.wuhenjian.aurora.utils.entity.dao;

import java.io.Serializable;

public class CommonCount implements Serializable {
    private Long ccId;

    private Long accountCode;

    private static final long serialVersionUID = 1L;

    public Long getCcId() {
        return ccId;
    }

    public void setCcId(Long ccId) {
        this.ccId = ccId;
    }

    public Long getAccountCode() {
        return accountCode;
    }

    public void setAccountCode(Long accountCode) {
        this.accountCode = accountCode;
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
        CommonCount other = (CommonCount) that;
        return (this.getCcId() == null ? other.getCcId() == null : this.getCcId().equals(other.getCcId()))
            && (this.getAccountCode() == null ? other.getAccountCode() == null : this.getAccountCode().equals(other.getAccountCode()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getCcId() == null) ? 0 : getCcId().hashCode());
        result = prime * result + ((getAccountCode() == null) ? 0 : getAccountCode().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", ccId=").append(ccId);
        sb.append(", accountCode=").append(accountCode);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}