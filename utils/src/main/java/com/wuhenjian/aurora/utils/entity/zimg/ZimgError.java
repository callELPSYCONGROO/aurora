package com.wuhenjian.aurora.utils.entity.zimg;

/**
 * @author 無痕剑
 * @date 2018/1/3 17:34
 */
public enum ZimgError {

	INTERNAL_ERROR(0, "Internal error"),
	FILE_TYPE_ERROR(1, "File type not support"),
	REQUEST_METHOD_ERROR(2, "Request method error"),
	ACCESS_ERROR(3, "Access error"),
	REQUEST_BODY_PARSE_ERROR(4, "Request body parse error"),
	CONTENT_LENGTH_ERROR(5, "Content-Length error"),
	CONTENT_TYPE_ERROR(6, "Content-Type error"),
	FILE_TOO_LARGE(7, "File too large")
	;

	private Integer code;

	private String message;

	ZimgError(Integer code, String message) {
		this.code = code;
		this.message = message;
	}

	public Integer getCode() {
		return code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
}
