package com.wuhenjian.aurora.utils.entity.dao;

import com.wuhenjian.aurora.utils.entity.bo.Page;

import java.io.Serializable;
import java.util.Date;

public class CommonAd extends Page implements Serializable {
    private Long caId;

    private Integer adType;

    private String adTitle;

    private Long imageId;

    private String imageLink;

    private Date updateTime;

    private Date createTime;

    private Long createUser;

    private String adContent;

    private static final long serialVersionUID = 1L;

    public Long getCaId() {
        return caId;
    }

    public void setCaId(Long caId) {
        this.caId = caId;
    }

    public Integer getAdType() {
        return adType;
    }

    public void setAdType(Integer adType) {
        this.adType = adType;
    }

    public String getAdTitle() {
        return adTitle;
    }

    public void setAdTitle(String adTitle) {
        this.adTitle = adTitle == null ? null : adTitle.trim();
    }

    public Long getImageId() {
        return imageId;
    }

    public void setImageId(Long imageId) {
        this.imageId = imageId;
    }

    public String getImageLink() {
        return imageLink;
    }

    public void setImageLink(String imageLink) {
        this.imageLink = imageLink == null ? null : imageLink.trim();
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

    public Long getCreateUser() {
        return createUser;
    }

    public void setCreateUser(Long createUser) {
        this.createUser = createUser;
    }

    public String getAdContent() {
        return adContent;
    }

    public void setAdContent(String adContent) {
        this.adContent = adContent == null ? null : adContent.trim();
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
        CommonAd other = (CommonAd) that;
        return (this.getCaId() == null ? other.getCaId() == null : this.getCaId().equals(other.getCaId()))
            && (this.getAdType() == null ? other.getAdType() == null : this.getAdType().equals(other.getAdType()))
            && (this.getAdTitle() == null ? other.getAdTitle() == null : this.getAdTitle().equals(other.getAdTitle()))
            && (this.getImageId() == null ? other.getImageId() == null : this.getImageId().equals(other.getImageId()))
            && (this.getImageLink() == null ? other.getImageLink() == null : this.getImageLink().equals(other.getImageLink()))
            && (this.getUpdateTime() == null ? other.getUpdateTime() == null : this.getUpdateTime().equals(other.getUpdateTime()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
            && (this.getCreateUser() == null ? other.getCreateUser() == null : this.getCreateUser().equals(other.getCreateUser()))
            && (this.getAdContent() == null ? other.getAdContent() == null : this.getAdContent().equals(other.getAdContent()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getCaId() == null) ? 0 : getCaId().hashCode());
        result = prime * result + ((getAdType() == null) ? 0 : getAdType().hashCode());
        result = prime * result + ((getAdTitle() == null) ? 0 : getAdTitle().hashCode());
        result = prime * result + ((getImageId() == null) ? 0 : getImageId().hashCode());
        result = prime * result + ((getImageLink() == null) ? 0 : getImageLink().hashCode());
        result = prime * result + ((getUpdateTime() == null) ? 0 : getUpdateTime().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getCreateUser() == null) ? 0 : getCreateUser().hashCode());
        result = prime * result + ((getAdContent() == null) ? 0 : getAdContent().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", caId=").append(caId);
        sb.append(", adType=").append(adType);
        sb.append(", adTitle=").append(adTitle);
        sb.append(", imageId=").append(imageId);
        sb.append(", imageLink=").append(imageLink);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", createTime=").append(createTime);
        sb.append(", createUser=").append(createUser);
        sb.append(", adContent=").append(adContent);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}