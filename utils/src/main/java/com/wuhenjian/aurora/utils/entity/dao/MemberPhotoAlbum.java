package com.wuhenjian.aurora.utils.entity.dao;

import com.wuhenjian.aurora.utils.entity.bo.Page;

import java.io.Serializable;
import java.util.Date;

public class MemberPhotoAlbum extends Page implements Serializable {
    private Long mpaId;

    private Long maId;

    private String title;

    private String des;

    private String model;

    private Integer num;

    private Integer isShow;

    private Date updateTime;

    private Date createTime;

    private static final long serialVersionUID = 1L;

    public Long getMpaId() {
        return mpaId;
    }

    public void setMpaId(Long mpaId) {
        this.mpaId = mpaId;
    }

    public Long getMaId() {
        return maId;
    }

    public void setMaId(Long maId) {
        this.maId = maId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public String getDes() {
        return des;
    }

    public void setDes(String des) {
        this.des = des == null ? null : des.trim();
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model == null ? null : model.trim();
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    public Integer getIsShow() {
        return isShow;
    }

    public void setIsShow(Integer isShow) {
        this.isShow = isShow;
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
        MemberPhotoAlbum other = (MemberPhotoAlbum) that;
        return (this.getMpaId() == null ? other.getMpaId() == null : this.getMpaId().equals(other.getMpaId()))
            && (this.getMaId() == null ? other.getMaId() == null : this.getMaId().equals(other.getMaId()))
            && (this.getTitle() == null ? other.getTitle() == null : this.getTitle().equals(other.getTitle()))
            && (this.getDes() == null ? other.getDes() == null : this.getDes().equals(other.getDes()))
            && (this.getModel() == null ? other.getModel() == null : this.getModel().equals(other.getModel()))
            && (this.getNum() == null ? other.getNum() == null : this.getNum().equals(other.getNum()))
            && (this.getIsShow() == null ? other.getIsShow() == null : this.getIsShow().equals(other.getIsShow()))
            && (this.getUpdateTime() == null ? other.getUpdateTime() == null : this.getUpdateTime().equals(other.getUpdateTime()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getMpaId() == null) ? 0 : getMpaId().hashCode());
        result = prime * result + ((getMaId() == null) ? 0 : getMaId().hashCode());
        result = prime * result + ((getTitle() == null) ? 0 : getTitle().hashCode());
        result = prime * result + ((getDes() == null) ? 0 : getDes().hashCode());
        result = prime * result + ((getModel() == null) ? 0 : getModel().hashCode());
        result = prime * result + ((getNum() == null) ? 0 : getNum().hashCode());
        result = prime * result + ((getIsShow() == null) ? 0 : getIsShow().hashCode());
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
        sb.append(", mpaId=").append(mpaId);
        sb.append(", maId=").append(maId);
        sb.append(", title=").append(title);
        sb.append(", des=").append(des);
        sb.append(", model=").append(model);
        sb.append(", num=").append(num);
        sb.append(", isShow=").append(isShow);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", createTime=").append(createTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}