package com.wuhenjian.aurora.memberservice.service;

import com.wuhenjian.aurora.utils.entity.TokenInfo;
import com.wuhenjian.aurora.utils.exception.BusinessException;

/**
 * @author 無痕剑
 * @date 2017/12/21 10:51
 */
public interface MemberLoginService {

	TokenInfo login(String loginType, String memberAccount, String memberPassword, String paramSign) throws BusinessException;

	void register(String registerType, String memberAccount, String memberPassword, String reMemberPassword, String paramSign) throws BusinessException;
}
