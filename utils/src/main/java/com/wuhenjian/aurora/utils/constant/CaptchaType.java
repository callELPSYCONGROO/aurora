package com.wuhenjian.aurora.utils.constant;

/**
 * 验证码业务类型
 * @author 無痕剑
 * @date 2017/12/29 11:15
 */
public enum CaptchaType {

	LOGIN(1, "账号登录"),
	REGISTER(2, "账户注册"),
	RESET_PWD(3, "重置密码"),
	UPDATE_PWD(4, "更新密码")
	;

	private Integer code;

	private String name;

	CaptchaType(Integer code, String name) {
		this.code = code;
		this.name = name;
	}

	public Integer getCode() {
		return code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public static String getName(Integer code) {
		for (CaptchaType captchaType : CaptchaType.values()) {
			if (captchaType.getCode().compareTo(code) == 0) {
				return captchaType.getName();
			}
		}
		return null;
	}

	public static Integer getCode(String name) {
		for (CaptchaType captchaType : CaptchaType.values()) {
			if (captchaType.getName().equals(name)) {
				return captchaType.getCode();
			}
		}
		return null;
	}

	public static boolean intCaptchaType(Integer code) {
		for (CaptchaType captchaType : CaptchaType.values()) {
			if (captchaType.getCode().compareTo(code) == 0) {
				return true;
			}
		}
		return false;
	}

	public static boolean strCaptchaType(String name) {
		for (CaptchaType captchaType : CaptchaType.values()) {
			if (captchaType.getName().equals(name)) {
				return true;
			}
		}
		return false;
	}
}
