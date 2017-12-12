package com.wuhenjian.aurora.utils.entity.result;

import com.wuhenjian.aurora.utils.entity.constant.ResultStatus;
import com.wuhenjian.aurora.utils.exception.BusinessException;

import java.io.Serializable;

/**
 * API接口返回结果
 * @author 無痕剑
 * @date 2017/12/5 10:30
 */
public class ApiResult implements Serializable {

	private Integer code;

	private String msg;

	private Object data;

	public ApiResult(Integer code, String msg, Object data) {
		this.code = code;
		this.msg = msg;
		this.data = data;
	}

	public ApiResult(ResultStatus rs, Object data) {
		this.code = rs.getCode();
		this.msg = rs.getMsg();
		this.data = data;
	}

	public static ApiResult fail(ResultStatus rs) {
		return new ApiResult(rs, null);
	}

	public static ApiResult fail(BusinessException be) {
		return new ApiResult(be.getCode(), be.getMsg(), null);
	}

	public static ApiResult success() {
		return new ApiResult(ResultStatus.SUCCESS, null);
	}

	public static ApiResult success(Object data) {
		return new ApiResult(ResultStatus.SUCCESS, data);
	}

	public static ApiResult fail(Integer code, String msg) {
		return new ApiResult(code, msg, null);
	}

	public Integer getCode() {
		return code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}

	/**
	 * 得到对应类型的数据
	 * @param cla 类型
	 * @return 数据
	 */
	public Object getData(Class cla) {
		return cla.cast(this.data);
	}
}
