package com.wuhenjian.aurora.utils.entity.constant;

/**
 * 错误码和错误信息
 * @author 無痕剑
 * @date 2017/12/5 12:40
 */
public enum ResultStatus {

	SUCCESS(1000, "success"),

	OUT_OF_TIME(1001, "timestamp is out of time"),
	KEY_PARAM_IS_EMPTY(1002, "The key parameter of the request is empty"),
	SIGN_ERROR(1003, "sign error"),

	PARAM_IS_EMPTY(2001, "input param is empty"),

	SHA256_ENCODE(5001, "sha256'encoding is NoSuchAlgorithm or UnsupportedEncoding"),
	BASE64_ENCODE(5002, "base64'encoding is UnsupportedEncoding"),
	RSA_ERROR(5003, "rsa'encoding is InvalidKeyException, BadPaddingException, IllegalBlockSizeException, NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeySpecException");

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
