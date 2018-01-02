package com.wuhenjian.aurora.memberservice.service;

import com.wuhenjian.aurora.utils.entity.TokenInfo;
import com.wuhenjian.aurora.utils.entity.param.AuthParam;
import com.wuhenjian.aurora.utils.exception.BusinessException;

/**
 * @author 無痕剑
 * @date 2017/12/21 10:51
 */
public interface MemberLoginService {

	TokenInfo login(AuthParam authParam) throws BusinessException;

	void register(AuthParam authParam) throws BusinessException;

	void resetPassword(AuthParam authParam) throws BusinessException;

	/**
	 * 检查账号是否存在
	 * @param memberAccount 账号
	 * @param accountType 账号类型
	 * @param paramSign 签名
	 */
	Integer checkAccount(String memberAccount, String accountType, String paramSign) throws BusinessException;
}
