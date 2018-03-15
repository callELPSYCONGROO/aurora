package com.wuhenjian.aurora.utils.entity.dao;

import com.wuhenjian.aurora.utils.entity.bo.Page;

import java.io.Serializable;

public class SysFilterChain extends Page implements Serializable {
    private Long sfcId;

    private String url;

    private String filterRole;

    private Integer sort;

    private static final long serialVersionUID = 1L;

    public Long getSfcId() {
        return sfcId;
    }

    public void setSfcId(Long sfcId) {
        this.sfcId = sfcId;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url == null ? null : url.trim();
    }

    public String getFilterRole() {
        return filterRole;
    }

    public void setFilterRole(String filterRole) {
        this.filterRole = filterRole == null ? null : filterRole.trim();
    }

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
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
        SysFilterChain other = (SysFilterChain) that;
        return (this.getSfcId() == null ? other.getSfcId() == null : this.getSfcId().equals(other.getSfcId()))
            && (this.getUrl() == null ? other.getUrl() == null : this.getUrl().equals(other.getUrl()))
            && (this.getFilterRole() == null ? other.getFilterRole() == null : this.getFilterRole().equals(other.getFilterRole()))
            && (this.getSort() == null ? other.getSort() == null : this.getSort().equals(other.getSort()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getSfcId() == null) ? 0 : getSfcId().hashCode());
        result = prime * result + ((getUrl() == null) ? 0 : getUrl().hashCode());
        result = prime * result + ((getFilterRole() == null) ? 0 : getFilterRole().hashCode());
        result = prime * result + ((getSort() == null) ? 0 : getSort().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", sfcId=").append(sfcId);
        sb.append(", url=").append(url);
        sb.append(", filterRole=").append(filterRole);
        sb.append(", sort=").append(sort);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}