package com.wuhenjian.aurora.utils.exception;

import com.wuhenjian.aurora.utils.entity.constant.ResultStatus;
import com.wuhenjian.aurora.utils.entity.result.ApiResult;

/**
 * 业务处理异常
 * @author 無痕剑
 * @date 2017/12/5 11:13
 */
public class BusinessException extends Exception {

	private Integer code;

	private String msg;

	private ResultStatus rs;

	public BusinessException(Integer code, String msg) {
		super(msg);
		this.code = code;
		this.msg = msg;
		this.rs = ResultStatus.EMPTY_OBJECT;
		this.rs.setCode(code);
		this.rs.setMsg(msg);
	}

	public BusinessException(ResultStatus rs) {
		super(rs.getMsg());
		this.msg = rs.getMsg();
		this.code = rs.getCode();
		this.rs = rs;
	}

	public BusinessException(ApiResult apiResult) {
		super(apiResult.getMsg());
		this.msg = apiResult.getMsg();
		this.code = apiResult.getCode();
		this.rs = ResultStatus.EMPTY_OBJECT;
		this.rs.setCode(apiResult.getCode());
		this.rs.setMsg(apiResult.getMsg());
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

	public ResultStatus getRs() {
		return rs;
	}

	public void setRs(ResultStatus rs) {
		this.rs = rs;
	}
}
