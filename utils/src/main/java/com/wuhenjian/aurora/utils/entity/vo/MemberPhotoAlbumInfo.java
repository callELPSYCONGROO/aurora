package com.wuhenjian.aurora.utils.entity.vo;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * @author SwordNoTrace
 * @date 2018/1/6 18:21
 */
public class MemberPhotoAlbumInfo implements Serializable {
	private String title;

	private String des;

	private String model;

	private Integer num;

	private Date updateTime;

	private Date createTime;

	private List<MemberPhotoAlbumPictureInfo> pictureInfoList;

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDes() {
		return des;
	}

	public void setDes(String des) {
		this.des = des;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public Integer getNum() {
		return num;
	}

	public void setNum(Integer num) {
		this.num = num;
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

	public List<MemberPhotoAlbumPictureInfo> getPictureInfoList() {
		return pictureInfoList;
	}

	public void setPictureInfoList(List<MemberPhotoAlbumPictureInfo> pictureInfoList) {
		this.pictureInfoList = pictureInfoList;
	}
}
