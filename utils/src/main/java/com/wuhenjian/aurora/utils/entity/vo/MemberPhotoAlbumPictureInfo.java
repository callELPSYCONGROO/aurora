package com.wuhenjian.aurora.utils.entity.vo;

import java.io.Serializable;
import java.util.Date;

/**
 * @author SwordNoTrace
 * @date 2018/1/6 18:27
 */
public class MemberPhotoAlbumPictureInfo implements Serializable {

	private String relativePath;

	private Integer sort;

	private Date updateTime;

	private Date createTime;

	public String getRelativePath() {
		return relativePath;
	}

	public void setRelativePath(String relativePath) {
		this.relativePath = relativePath;
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
}
