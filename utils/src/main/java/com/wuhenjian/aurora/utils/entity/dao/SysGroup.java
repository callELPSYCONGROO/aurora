package com.wuhenjian.aurora.utils.entity.dao;

import com.wuhenjian.aurora.utils.entity.bo.Page;

import java.io.Serializable;

public class SysGroup extends Page implements Serializable {
    private Long sgId;

    private String gname;

    private Integer glevel;

    private Integer gstatus;

    private static final long serialVersionUID = 1L;

    public Long getSgId() {
        return sgId;
    }

    public void setSgId(Long sgId) {
        this.sgId = sgId;
    }

    public String getGname() {
        return gname;
    }

    public void setGname(String gname) {
        this.gname = gname == null ? null : gname.trim();
    }

    public Integer getGlevel() {
        return glevel;
    }

    public void setGlevel(Integer glevel) {
        this.glevel = glevel;
    }

    public Integer getGstatus() {
        return gstatus;
    }

    public void setGstatus(Integer gstatus) {
        this.gstatus = gstatus;
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
        SysGroup other = (SysGroup) that;
        return (this.getSgId() == null ? other.getSgId() == null : this.getSgId().equals(other.getSgId()))
            && (this.getGname() == null ? other.getGname() == null : this.getGname().equals(other.getGname()))
            && (this.getGlevel() == null ? other.getGlevel() == null : this.getGlevel().equals(other.getGlevel()))
            && (this.getGstatus() == null ? other.getGstatus() == null : this.getGstatus().equals(other.getGstatus()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getSgId() == null) ? 0 : getSgId().hashCode());
        result = prime * result + ((getGname() == null) ? 0 : getGname().hashCode());
        result = prime * result + ((getGlevel() == null) ? 0 : getGlevel().hashCode());
        result = prime * result + ((getGstatus() == null) ? 0 : getGstatus().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", sgId=").append(sgId);
        sb.append(", gname=").append(gname);
        sb.append(", glevel=").append(glevel);
        sb.append(", gstatus=").append(gstatus);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}