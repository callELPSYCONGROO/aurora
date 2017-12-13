package com.wuhenjian.aurora.utils.entity.constant;

import com.wuhenjian.aurora.utils.entity.result.ApiResult;

/**
 * 错误码和错误信息
 * @author 無痕剑
 * @date 2017/12/5 12:40
 */
public enum ResultStatus {

	EMPTY_OBJECT(0, ""),

	SUCCESS(1000, "success"),

	OUT_OF_TIME(1001, "timestamp is out of time"),
	KEY_PARAM_IS_EMPTY(1002, "The key parameter of the request is empty"),
	SIGN_ERROR(1003, "sign error"),
	TOKEN_ISVALID_FILTER(1004, "token is invalid"),

	PARAM_IS_EMPTY(2001, "input param is empty"),
	SYSTEM_EXCEPTION(2002, "system exception"),
	TOKEN_ISVALID_CTRL(2003, "token is invalid"),

	REMOTE_SERVICE_REDIS(3001, "Remote call redis services are exceptions"),

	SHA256_ENCODE(5001, "sha256'encoding is NoSuchAlgorithm or UnsupportedEncoding"),
	BASE64_ENCODE(5002, "base64'encoding is UnsupportedEncoding"),
	RSA_ERROR(5003, "rsa'encoding is InvalidKeyException, BadPaddingException, IllegalBlockSizeException, NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeySpecException"),
	ACCOUNTCODE_LENGTH(5004, "account length is invalid"),
	UUID_LENGTH(5005, "uuid length is invalid"),

	END_EXCEPTION(5999, "")
	;

	private Integer code;

	private String msg;

	ResultStatus(Integer code, String msg) {
		this.code = code;
		this.msg = msg;
	}

	public int getCode() {
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
}
