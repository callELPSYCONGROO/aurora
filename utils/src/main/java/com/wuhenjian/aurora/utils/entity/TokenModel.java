package com.wuhenjian.aurora.utils.entity;

import com.wuhenjian.aurora.utils.constant.ResultStatus;
import com.wuhenjian.aurora.utils.exception.BusinessException;

/**
 * Token原型
 * @author 無痕剑
 * @date 2017/12/6 14:58
 */
public class TokenModel {

	private Long accountCode;

	private String uuid;

	private String sign;

	public TokenModel() {
	}

	public TokenModel(Long accountCode, String uuid, String sign) {
		this.accountCode = accountCode;
		this.uuid = uuid;
		this.sign = sign;
	}

	public Long getAccountCode() {
		return accountCode;
	}

	public void setAccountCode(Long accountCode) {
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

	/**
	 * 账号和uuid按照URL键值对格式组成字符串
	 * @return 字符串
	 */
	public String toStringByAccAndUuid() {
		return "accountCode=" + this.accountCode + "&uuid=" + this.uuid;
	}

	@Override
	public String toString() {
		return "accountCode=" + this.accountCode + "&sign=" + this.sign + "&uuid=" + this.uuid;
	}

	public static TokenModel accuuid2Obj(String accAndUuid) throws BusinessException {
		String uuid = null;
		Long accountCode = null;
		String[] split = accAndUuid.split("&");
		for (String s : split) {
			String[] vars = s.split("=");
			if ("accountCode".equals(vars[0])) {
				accountCode = Long.valueOf(vars[1]);
				if (("" + accAndUuid).length() < 10) {
					throw new BusinessException(ResultStatus.ACCOUNTCODE_LENGTH);
				}
			} else if ("uuid".equals(vars[0])) {
				uuid = vars[1];
				if (uuid.length() < 22) {
					throw new BusinessException(ResultStatus.UUID_LENGTH);
				}
			}
		}
		return new TokenModel(accountCode,uuid, null);
	}
}
