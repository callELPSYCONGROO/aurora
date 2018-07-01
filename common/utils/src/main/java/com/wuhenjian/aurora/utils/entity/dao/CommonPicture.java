package com.wuhenjian.aurora.utils.entity.dao;

import com.wuhenjian.aurora.utils.entity.bo.Page;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;
import java.util.Date;

@EqualsAndHashCode(callSuper = true)
@Data
public class CommonPicture extends Page implements Serializable {
	private Long cpId;

	private Integer pType;

	private String picAddress;

	private Date createTime;

	private Integer isShow;
}