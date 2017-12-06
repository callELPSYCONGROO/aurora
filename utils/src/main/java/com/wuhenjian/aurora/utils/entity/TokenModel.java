package com.wuhenjian.aurora.utils.entity;

/**
 * Token原型
 * @author 無痕剑
 * @date 2017/12/6 14:58
 */
public class TokenModel {

	private String accountCode;

	private String uuid;

	private String sign;

	public String getAccountCode() {
		return accountCode;
	}

	public void setAccountCode(String accountCode) {
		this.accountCode = accountCode;
	}

	public String getUuid() {
		return uuid;
	}

	public void setUuid(String uuid) {
		this.uuid = uuid;
	}

	public String getSign() {
		return sign;
	}

	public void setSign(String sign) {
		this.sign = sign;
	}

	public String toStringByAccAndUuid() {
		return this.accountCode + "_" + this.uuid;
	}

	@Override
	public String toString() {
		return this.sign + "_" + this.accountCode + "_" + this.sign;
	}
}
