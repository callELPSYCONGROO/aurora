package com.wuhenjian.aurora.utils.entity.param;

import com.wuhenjian.aurora.utils.StringUtil;

import java.util.*;

/**
 * 认证接口参数
 * @author 無痕剑
 * @date 2017/12/28 17:06
 */
public class AuthParam {
	/** 验证码 */
	private String captcha;
	/** 验证码key */
	private String captchaKey;
	/** 登录ip */
	private String loginIp;
	/** 设备类型 */
	private String deviceType;
	/** 账号类型 */
	private String accountType;
	/** 账号 */
	private String memberAccount;
	/** 密码 */
	private String memberPassword;
	/** 重新输入密码 */
	private String reMemberPassword;
	/** 参数签名 */
	private String paramSign;

	public String getCaptcha() {
		return captcha;
	}

	public void setCaptcha(String captcha) {
		this.captcha = captcha;
	}

	public String getLoginIp() {
		return loginIp;
	}

	public void setLoginIp(String loginIp) {
		this.loginIp = loginIp;
	}

	public String getDeviceType() {
		return deviceType;
	}

	public void setDeviceType(String deviceType) {
		this.deviceType = deviceType;
	}

	public String getAccountType() {
		return accountType;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	public String getMemberAccount() {
		return memberAccount;
	}

	public void setMemberAccount(String memberAccount) {
		this.memberAccount = memberAccount;
	}

	public String getMemberPassword() {
		return memberPassword;
	}

	public void setMemberPassword(String memberPassword) {
		this.memberPassword = memberPassword;
	}

	public String getReMemberPassword() {
		return reMemberPassword;
	}

	public void setReMemberPassword(String reMemberPassword) {
		this.reMemberPassword = reMemberPassword;
	}

	public String getParamSign() {
		return paramSign;
	}

	public void setParamSign(String paramSign) {
		this.paramSign = paramSign;
	}

	public String getCaptchaKey() {
		return captchaKey;
	}

	public void setCaptchaKey(String captchaKey) {
		this.captchaKey = captchaKey;
	}

	/**
	 * 获取所以参数的map对象，不包括paramSign
	 */
	private Map<String,String> getAllParam() {
		Map<String,String> map = new HashMap<>();
		map.put("reMemberPassword", this.reMemberPassword);
		map.put("memberPassword", this.memberPassword);
		map.put("memberAccount", this.memberAccount);
		map.put("accountType", this.accountType);
		map.put("deviceType", this.deviceType);
		map.put("loginIp", this.loginIp);
		map.put("captcha", this.captcha);
		map.put("captchaKey", this.captchaKey);
		return map;
	}

	/**
	 * 判断集合是否为空
	 */
	private boolean isEmpty(Collection<String> paramCollection) {
		List<String> list = new ArrayList<>(paramCollection);
		int size = list.size();
		String[] strings = list.toArray(new String[size]);
		return StringUtil.hasBlank(strings);
	}

	/**
	 * 判断登录需要的参数是否为空
	 */
	public boolean loginParamIsEmpty() {
		return this.isEmpty(this.getLoginParam().values());
	}

	/**
	 * 判断注册参数是否为空
	 */
	public boolean registerParamIsEmpty() {
		return this.isEmpty(this.getRegisterParam().values());
	}

	/**
	 * 判断重置密码参数是否为空
	 */
	public boolean resetParamIsEmpty() {
		return this.isEmpty(this.getResetParam().values());
	}

	/**
	 * 获取登录所需参数集合
	 */
	public Map<String,String> getLoginParam() {
		Map<String, String> allParam = this.getAllParam();
		allParam.remove("loginIp");
		allParam.remove("reMemberPassword");
		return allParam;
	}

	/**
	 * 注册所需参数
	 */
	public Map<String,String> getRegisterParam() {
		Map<String, String> allParam = this.getAllParam();
		allParam.remove("loginIp");
		return allParam;
	}

	/**
	 * 重置密码所需参数
	 */
	public Map<String,String> getResetParam() {
		Map<String, String> allParam = this.getAllParam();
		allParam.remove("loginIp");
		return allParam;
	}
}
