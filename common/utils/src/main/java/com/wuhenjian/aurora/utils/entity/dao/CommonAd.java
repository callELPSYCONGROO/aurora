package com.wuhenjian.aurora.utils.entity.dao;

import com.wuhenjian.aurora.utils.entity.bo.Page;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;
import java.util.Date;

@EqualsAndHashCode(callSuper = true)
@Data
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
}