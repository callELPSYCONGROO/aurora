package com.wuhenjian.aurora.memberservice.service;

import com.wuhenjian.aurora.utils.exception.BusinessException;

/**
 * @author 無痕剑
 * @date 2018/1/2 9:38
 */
public interface MemberUpdateService {

	void updatePassword(Long maId, String memberPassword, String reMemberPassword, String captcha, String captchaKey) throws BusinessException;

	Integer modifyPasswordCount(Long maId) throws BusinessException;

	void addOneModifyPassword(Long maId, Integer lastCount);
}
