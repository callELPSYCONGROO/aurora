package com.wuhenjian.aurora.utils.entity.constant;

/**
 * 错误码和错误信息
 * @author 無痕剑
 * @date 2017/12/5 12:40
 */
public enum ResultStatus {

	EMPTY_OBJECT(0, ""),

	SUCCESS(1000, "success"),
	//filter
	OUT_OF_TIME(1001, "timestamp is out of time"),
	KEY_PARAM_IS_EMPTY(1002, "The key parameter of the request is empty"),
	SIGN_ERROR(1003, "sign error"),
	TOKEN_ISVALID_FILTER(1004, "token is invalid"),
	TOKEN_OVERDUE(1005, "token is overdue"),
	//controller
	PARAM_IS_EMPTY(2001, "input param is empty"),
	SYSTEM_EXCEPTION(2002, "system exception"),
	TOKEN_ISVALID_CTRL(2003, "token is invalid"),
	//service
	REMOTE_SERVICE_EXCEPTION(3001, "Remote call services are exceptions"),
	ACCOUNT_FORMAT_ERROR(3002, "account format error"),
	LOGIN_TYPE_ERROR(3003, "loginType is non-existent"),
	ACCOUNT_NOT_EXIST(3004, "account is non-existent"),
	PASSWORD_ISVALID(3005, "password is invalid"),
	MEMBER_AUTH_OVERTIME(3006, "More than 5 times the number of user authentication"),
	MEMBER_LOCKED_BY_ADMIN(3007, "member is locked by admin"),
	LOGIN_SIGN_ERROR(3008, "signature verification failed;"),
	PASSWORD_REPASSWORD_DIFFERENT(3009, "password and repassword is different"),
	//other
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
