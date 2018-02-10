package com.wuhenjian.aurora.utils.entity.dao;

import com.wuhenjian.aurora.utils.entity.bo.Page;

import java.io.Serializable;
import java.util.Date;

public class PhpBlog extends Page implements Serializable {
    private Long pbId;

    private String title;

    private String type;

    private Long csdnId;

    private String categories;

    private String tags;

    private String originalUrl;

    private String description;

    private Integer bury;

    private Integer digg;

    private Integer channel;

    private Integer commentCount;

    private Integer viewCount;

    private Integer phpViewCount;

    private Date createdAt;

    private Date updateTime;

    private String content;

    private static final long serialVersionUID = 1L;

    public Long getPbId() {
        return pbId;
    }

    public void setPbId(Long pbId) {
        this.pbId = pbId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public Long getCsdnId() {
        return csdnId;
    }

    public void setCsdnId(Long csdnId) {
        this.csdnId = csdnId;
    }

    public String getCategories() {
        return categories;
    }

    public void setCategories(String categories) {
        this.categories = categories == null ? null : categories.trim();
    }

    public String getTags() {
        return tags;
    }

    public void setTags(String tags) {
        this.tags = tags == null ? null : tags.trim();
    }

    public String getOriginalUrl() {
        return originalUrl;
    }

    public void setOriginalUrl(String originalUrl) {
        this.originalUrl = originalUrl == null ? null : originalUrl.trim();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public Integer getBury() {
        return bury;
    }

    public void setBury(Integer bury) {
        this.bury = bury;
    }

    public Integer getDigg() {
        return digg;
    }

    public void setDigg(Integer digg) {
        this.digg = digg;
    }

    public Integer getChannel() {
        return channel;
    }

    public void setChannel(Integer channel) {
        this.channel = channel;
    }

    public Integer getCommentCount() {
        return commentCount;
    }

    public void setCommentCount(Integer commentCount) {
        this.commentCount = commentCount;
    }

    public Integer getViewCount() {
        return viewCount;
    }

    public void setViewCount(Integer viewCount) {
        this.viewCount = viewCount;
    }

    public Integer getPhpViewCount() {
        return phpViewCount;
    }

    public void setPhpViewCount(Integer phpViewCount) {
        this.phpViewCount = phpViewCount;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
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
        PhpBlog other = (PhpBlog) that;
        return (this.getPbId() == null ? other.getPbId() == null : this.getPbId().equals(other.getPbId()))
            && (this.getTitle() == null ? other.getTitle() == null : this.getTitle().equals(other.getTitle()))
            && (this.getType() == null ? other.getType() == null : this.getType().equals(other.getType()))
            && (this.getCsdnId() == null ? other.getCsdnId() == null : this.getCsdnId().equals(other.getCsdnId()))
            && (this.getCategories() == null ? other.getCategories() == null : this.getCategories().equals(other.getCategories()))
            && (this.getTags() == null ? other.getTags() == null : this.getTags().equals(other.getTags()))
            && (this.getOriginalUrl() == null ? other.getOriginalUrl() == null : this.getOriginalUrl().equals(other.getOriginalUrl()))
            && (this.getDescription() == null ? other.getDescription() == null : this.getDescription().equals(other.getDescription()))
            && (this.getBury() == null ? other.getBury() == null : this.getBury().equals(other.getBury()))
            && (this.getDigg() == null ? other.getDigg() == null : this.getDigg().equals(other.getDigg()))
            && (this.getChannel() == null ? other.getChannel() == null : this.getChannel().equals(other.getChannel()))
            && (this.getCommentCount() == null ? other.getCommentCount() == null : this.getCommentCount().equals(other.getCommentCount()))
            && (this.getViewCount() == null ? other.getViewCount() == null : this.getViewCount().equals(other.getViewCount()))
            && (this.getPhpViewCount() == null ? other.getPhpViewCount() == null : this.getPhpViewCount().equals(other.getPhpViewCount()))
            && (this.getCreatedAt() == null ? other.getCreatedAt() == null : this.getCreatedAt().equals(other.getCreatedAt()))
            && (this.getUpdateTime() == null ? other.getUpdateTime() == null : this.getUpdateTime().equals(other.getUpdateTime()))
            && (this.getContent() == null ? other.getContent() == null : this.getContent().equals(other.getContent()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getPbId() == null) ? 0 : getPbId().hashCode());
        result = prime * result + ((getTitle() == null) ? 0 : getTitle().hashCode());
        result = prime * result + ((getType() == null) ? 0 : getType().hashCode());
        result = prime * result + ((getCsdnId() == null) ? 0 : getCsdnId().hashCode());
        result = prime * result + ((getCategories() == null) ? 0 : getCategories().hashCode());
        result = prime * result + ((getTags() == null) ? 0 : getTags().hashCode());
        result = prime * result + ((getOriginalUrl() == null) ? 0 : getOriginalUrl().hashCode());
        result = prime * result + ((getDescription() == null) ? 0 : getDescription().hashCode());
        result = prime * result + ((getBury() == null) ? 0 : getBury().hashCode());
        result = prime * result + ((getDigg() == null) ? 0 : getDigg().hashCode());
        result = prime * result + ((getChannel() == null) ? 0 : getChannel().hashCode());
        result = prime * result + ((getCommentCount() == null) ? 0 : getCommentCount().hashCode());
        result = prime * result + ((getViewCount() == null) ? 0 : getViewCount().hashCode());
        result = prime * result + ((getPhpViewCount() == null) ? 0 : getPhpViewCount().hashCode());
        result = prime * result + ((getCreatedAt() == null) ? 0 : getCreatedAt().hashCode());
        result = prime * result + ((getUpdateTime() == null) ? 0 : getUpdateTime().hashCode());
        result = prime * result + ((getContent() == null) ? 0 : getContent().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", pbId=").append(pbId);
        sb.append(", title=").append(title);
        sb.append(", type=").append(type);
        sb.append(", csdnId=").append(csdnId);
        sb.append(", categories=").append(categories);
        sb.append(", tags=").append(tags);
        sb.append(", originalUrl=").append(originalUrl);
        sb.append(", description=").append(description);
        sb.append(", bury=").append(bury);
        sb.append(", digg=").append(digg);
        sb.append(", channel=").append(channel);
        sb.append(", commentCount=").append(commentCount);
        sb.append(", viewCount=").append(viewCount);
        sb.append(", phpViewCount=").append(phpViewCount);
        sb.append(", createdAt=").append(createdAt);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", content=").append(content);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}