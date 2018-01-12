package com.wuhenjian.aurora.utils.constant;

/**
 * 错误码和错误信息
 * @author 無痕剑
 * @date 2017/12/5 12:40
 */
public enum ResultStatus {

	EMPTY_OBJECT(0, ""),

	SUCCESS(1000, "success"),
	//filter
	KEY_PARAM_IS_EMPTY(1001, "The key parameter of the request is empty"),
	//controller
	PARAM_IS_EMPTY(2001, "input param is empty"),
	SYSTEM_EXCEPTION(2002, "system exception"),
	TOKEN_INVALID_CTRL(2003, "token is invalid"),
	DATABASE_EXCEPTION(2004, "database exception"),
	CAPTCHA_TYPE_ERROR(2005, "captcha type is error"),
	RECEIVE_IS_NULL(2006, "receive is null"),
	RECEIVE_EMAIL_FORMAT_ERROR(2007, "Recipient mailbox format error"),
	PASSWORD_MODIFY_COUNT(2008, "password modify count over"),
	SIGN_ERROR(2009, "sign error"),
	TOKEN_OVERDUE(2010, "token is overdue"),
	TIMESTAMP_FORMAT_ERROR(2011, "timestamp is error"),
	TIMESTAMP_OVERTIME(2012, "timestamp over time"),
	DECODE_TOKEN_EXCEPTION(2013, "decode token exception"),
	//service
	REMOTE_SERVICE_EXCEPTION(3001, "Remote call services are exceptions"),
	ACCOUNT_FORMAT_ERROR(3002, "account format error"),
	LOGIN_TYPE_ERROR(3003, "loginType is non-existent"),
	ACCOUNT_NOT_EXIST(3004, "account is non-existent"),
	PASSWORD_INVALID(3005, "password is invalid"),
	MEMBER_AUTH_OVERTIME(3006, "More than 5 times the number of user authentication"),
	MEMBER_LOCKED_BY_ADMIN(3007, "member is locked by admin"),
	SIGN_FAIL(3008, "signature verification failed;"),
	PASSWORD_REPASSWORD_DIFFERENT(3009, "password and repassword is different"),
	REGISTER_TYPE_AND_ACCOUNT_NOT_MATCH(3010, "Registration type and account number do not match"),
	MEMBER_ACCOUNT_EXISTED(3011, "member account has existed"),
	PASSWORD_LENGTH_INVALID(3012, "the length of password is invalid"),
	NEW_OLD_PASSWORD_IS_SAME(3013, "The same new and old ciphers"),
	PARAMS_SIGN_VERIFY_FAIL(3014, "Failure of signature authentication"),
	EMAIL_FAILURE(3015, "service failure"),
	CAPTCHA_ERROR(3016, "captcha is error"),
	HTTPCLIENT_EXCP(3017, "httpclient exception"),
	MAP_EMPTY(3018, "Map Object is Empty"),
	FILE_PARAM_IS_EMPTY(3019, "file param is empty"),
	FILE_TYPE_INVALID(3020, "file type is invalid"),
	MEMBER_ALBUM_NON_EXISTENT(3021, "member album is non-existent"),
	ALBUM_NOT_BELONG_WITH_MEMBER(3022, "this album is not belong with the member"),
	UPLOAD_IMG_FAIL(3023, "picture uploaded fail"),
	DECRYPTION_EXCEPTION(3024, "Decryption exception"),
	ENCODING_EXCEPTION(3024, "Decryption exception"),
		//other
	ACCOUNTCODE_LENGTH(4001, "account length is invalid"),
	UUID_LENGTH(4002, "uuid length is invalid"),
	REPO_NAME_EMPTY(4003, "repo name is empty"),

	END_EXCEPTION(9999, "");

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
