package com.wuhenjian.aurora.utils.entity.vo;

import com.wuhenjian.aurora.utils.entity.dao.PhpBlog;

import java.io.Serializable;
import java.util.Date;

/**
 * @author 無痕剑
 * @date 2018/2/8 17:05
 */
public class PhpBlogVo implements Serializable {

	private Long pbId;

	private String title;

	private String type;

	private String originalUrl;

	private String description;

	private Integer viewCount;

	private Date createdAt;

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


	public Integer getViewCount() {
		return viewCount;
	}

	public void setViewCount(Integer viewCount) {
		this.viewCount = viewCount;
	}

	public Date getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
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
				&& (this.getOriginalUrl() == null ? other.getOriginalUrl() == null : this.getOriginalUrl().equals(other.getOriginalUrl()))
				&& (this.getDescription() == null ? other.getDescription() == null : this.getDescription().equals(other.getDescription()))
				&& (this.getViewCount() == null ? other.getViewCount() == null : this.getViewCount().equals(other.getViewCount()))
				&& (this.getCreatedAt() == null ? other.getCreatedAt() == null : this.getCreatedAt().equals(other.getCreatedAt()));
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((getPbId() == null) ? 0 : getPbId().hashCode());
		result = prime * result + ((getTitle() == null) ? 0 : getTitle().hashCode());
		result = prime * result + ((getType() == null) ? 0 : getType().hashCode());
		result = prime * result + ((getOriginalUrl() == null) ? 0 : getOriginalUrl().hashCode());
		result = prime * result + ((getDescription() == null) ? 0 : getDescription().hashCode());
		result = prime * result + ((getViewCount() == null) ? 0 : getViewCount().hashCode());
		result = prime * result + ((getCreatedAt() == null) ? 0 : getCreatedAt().hashCode());
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
		sb.append(", originalUrl=").append(originalUrl);
		sb.append(", description=").append(description);
		sb.append(", viewCount=").append(viewCount);
		sb.append(", createdAt=").append(createdAt);
		sb.append(", serialVersionUID=").append(serialVersionUID);
		sb.append("]");
		return sb.toString();
	}
}
