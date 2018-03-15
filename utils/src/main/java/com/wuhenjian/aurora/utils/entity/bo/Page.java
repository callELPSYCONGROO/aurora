package com.wuhenjian.aurora.utils.entity.bo;

import com.wuhenjian.aurora.utils.constant.ResultStatus;
import com.wuhenjian.aurora.utils.exception.BusinessException;

/**
 * 分页信息
 * @author 無痕剑
 * @date 2017/12/19 16:09
 */
public class Page {
	/** 页码 */
	private Integer num;
	/** 页面尺寸 */
	private Integer size;
	/** 排序 */
	private String orderBy;

	public  Page(){}

	public Page(Integer num, Integer size, String orderBy) {
		this.num = num;
		this.size = size;
		this.orderBy = orderBy;
	}

	public Integer getNum() {
		return num;
	}

	public void setNum(Integer num) {
		this.num = num;
	}

	public Integer getSize() {
		return size;
	}

	public void setSize(Integer size) {
		this.size = size;
	}

	public String getOrderBy() {
		return orderBy;
	}

	public void setOrderBy(String orderBy) {
		this.orderBy = orderBy;
	}

	public boolean isNullPage() throws BusinessException {
		if (this.num == null && this.size != null) {
			throw new BusinessException(ResultStatus.PAGE_PARAM_INVALID);
		}
		if (this.num != null && this.size == null) {
			throw new BusinessException(ResultStatus.PAGE_PARAM_INVALID);
		}
		return this.num == null && this.size == null;
	}

	public boolean hasOrderBy() {
		return this.orderBy != null;
	}
}
