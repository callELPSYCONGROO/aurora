package com.wuhenjian.aurora.utils.constant;

/**
 * @author 無痕剑
 * @date 2018/2/7 14:55
 */
public enum CsdnErrorCode {

	SUCCESS(1000, "success", "成功"),
	INVALID_TOKEN(2010, "invalid token", "token不可用"),
	PARAMETER_LOST(4010, "parameter lost", "缺少必填参数"),
	INVALID_EQUEST(4030, "invalid request", "请求不可用"),
	ACCESS_DENIED(4031, "access denied", "请求被拒绝"),
	REQUEST_TOO_MUCH(4032, "request too much", "请求数过多"),
	INVALID_CODE(4034, "invalid code", "code不可用"),
	INVALID_ACCESS_TOKEN(4050, "invalid access token", "access_token不可用"),
	SYSTEM_UNKNOWN_ERROR(5010, "system error", "未知的系统错误"),
	USERNAME_OR_PASSWORD_INCORRECT(5011, "username or password incorrect", "用户名或密码错误"),
	REQUEST_FAILED(5021, "request failed", "接口返回状态为false"),
	SYSTEM_INSIDE_ERROR(6010, "request failed, try again", "内部api调用失败")
	;

	private Integer code;

	private String enMsg;

	private String cnMsg;

	CsdnErrorCode(Integer code, String enMsg, String cnMsg) {
		this.code = code;
		this.enMsg = enMsg;
		this.cnMsg = cnMsg;
	}

	public Integer getCode() {
		return code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}

	public String getEnMsg() {
		return enMsg;
	}

	public void setEnMsg(String enMsg) {
		this.enMsg = enMsg;
	}

	public String getCnMsg() {
		return cnMsg;
	}

	public void setCnMsg(String cnMsg) {
		this.cnMsg = cnMsg;
	}

	public static String getEnMsgByCode(Integer code) {
		for (CsdnErrorCode cec : CsdnErrorCode.values()) {
			if (cec.getCode().equals(code)) {
				return cec.getEnMsg();
			}
		}
		return null;
	}

	public static String getCnMsgByCode(Integer code) {
		for (CsdnErrorCode cec : CsdnErrorCode.values()) {
			if (cec.getCode().equals(code)) {
				return cec.getCnMsg();
			}
		}
		return null;
	}
}
