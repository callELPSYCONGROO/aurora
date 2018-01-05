package com.wuhenjian.aurora.utils.entity.dao;

import java.io.Serializable;
import java.util.Date;

public class MemberPhotoAlbumPicture implements Serializable {
    private Long mpapId;

    private Long maId;

    private Long mpaId;

    private String relativePath;

    private Integer sort;

    private Date updateTime;

    private Date createTime;

    private static final long serialVersionUID = 1L;

    public Long getMpapId() {
        return mpapId;
    }

    public void setMpapId(Long mpapId) {
        this.mpapId = mpapId;
    }

    public Long getMaId() {
        return maId;
    }

    public void setMaId(Long maId) {
        this.maId = maId;
    }

    public Long getMpaId() {
        return mpaId;
    }

    public void setMpaId(Long mpaId) {
        this.mpaId = mpaId;
    }

    public String getRelativePath() {
        return relativePath;
    }

    public void setRelativePath(String relativePath) {
        this.relativePath = relativePath == null ? null : relativePath.trim();
    }

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
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
        MemberPhotoAlbumPicture other = (MemberPhotoAlbumPicture) that;
        return (this.getMpapId() == null ? other.getMpapId() == null : this.getMpapId().equals(other.getMpapId()))
            && (this.getMaId() == null ? other.getMaId() == null : this.getMaId().equals(other.getMaId()))
            && (this.getMpaId() == null ? other.getMpaId() == null : this.getMpaId().equals(other.getMpaId()))
            && (this.getRelativePath() == null ? other.getRelativePath() == null : this.getRelativePath().equals(other.getRelativePath()))
            && (this.getSort() == null ? other.getSort() == null : this.getSort().equals(other.getSort()))
            && (this.getUpdateTime() == null ? other.getUpdateTime() == null : this.getUpdateTime().equals(other.getUpdateTime()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getMpapId() == null) ? 0 : getMpapId().hashCode());
        result = prime * result + ((getMaId() == null) ? 0 : getMaId().hashCode());
        result = prime * result + ((getMpaId() == null) ? 0 : getMpaId().hashCode());
        result = prime * result + ((getRelativePath() == null) ? 0 : getRelativePath().hashCode());
        result = prime * result + ((getSort() == null) ? 0 : getSort().hashCode());
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
        sb.append(", mpapId=").append(mpapId);
        sb.append(", maId=").append(maId);
        sb.append(", mpaId=").append(mpaId);
        sb.append(", relativePath=").append(relativePath);
        sb.append(", sort=").append(sort);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", createTime=").append(createTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}