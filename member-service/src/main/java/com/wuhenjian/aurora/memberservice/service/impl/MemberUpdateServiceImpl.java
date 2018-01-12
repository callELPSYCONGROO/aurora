package com.wuhenjian.aurora.memberservice.service.impl;

import com.wuhenjian.aurora.memberservice.service.MemberAuthService;
import com.wuhenjian.aurora.memberservice.service.MemberUpdateService;
import com.wuhenjian.aurora.memberservice.service.RedisService;
import com.wuhenjian.aurora.utils.*;
import com.wuhenjian.aurora.utils.constant.CommonContant;
import com.wuhenjian.aurora.utils.constant.MemberStatus;
import com.wuhenjian.aurora.utils.constant.ResultStatus;
import com.wuhenjian.aurora.utils.entity.dao.MemberAuth;
import com.wuhenjian.aurora.utils.entity.dto.ApiResult;
import com.wuhenjian.aurora.utils.exception.BusinessException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

/**
 * @author 無痕剑
 * @date 2018/1/2 9:39
 */
@Service("memberService")
public class MemberUpdateServiceImpl implements MemberUpdateService {

	@Autowired
	private MemberAuthService memberAuthService;

	@Autowired
	private RedisService redisService;

	@Override
	public void updatePassword(Long maId, String memberPassword, String reMemberPassword, String captcha, String captchaKey) throws BusinessException {
		//是否超过修改密码次数
		Integer modifyPasswordCount = this.modifyPasswordCount(maId);
		if (modifyPasswordCount != null && modifyPasswordCount > 2) {
			throw new BusinessException(ResultStatus.PASSWORD_MODIFY_COUNT);
		}
		//两次输入密码是否相同
		if (!memberPassword.equals(reMemberPassword)) {
			throw new BusinessException(ResultStatus.PASSWORD_REPASSWORD_DIFFERENT);
		}
		//验证验证码
		ApiResult r1 = redisService.get(captchaKey);
		String redisCaptcha = (String) ApiResultUtil.getObject(r1);
		if (!captcha.equals(redisCaptcha)) {
			throw new BusinessException(ResultStatus.CAPTCHA_ERROR);
		}
		String password;
		try {
			password = AuthUtil.convert2Plaintext(memberPassword);
		} catch (Exception e) {
			throw new BusinessException(ResultStatus.DECRYPTION_EXCEPTION);
		}
		//密码长度
		if (StringUtil.moreThanLength(password, 16) || StringUtil.lessThanLength(password, 8)) {
			throw new BusinessException(ResultStatus.PASSWORD_LENGTH_INVALID);
		}
		ApiResult r2 = memberAuthService.selectByPrimaryKey(maId);
		MemberAuth ma = (MemberAuth) ApiResultUtil.getObject(r2);
		if (ma == null) {
			throw new BusinessException(ResultStatus.ACCOUNT_NOT_EXIST);
		}
		//管理员锁定
		if (MemberStatus.ADMIN_LOCKED.getCode().equals(ma.getCurrentStatus())) {
			throw new BusinessException(ResultStatus.MEMBER_LOCKED_BY_ADMIN);
		}
		//密码错误次数过多被锁定
		if (MemberStatus.ERROR_PASSWORD_LOCKED.getCode().equals(ma.getCurrentStatus())) {
			throw new BusinessException(ResultStatus.MEMBER_AUTH_OVERTIME);
		}
		String passwordEncrypt = AuthUtil.passwordEncrypt(password, ma.getAuthSalt());
		//新旧密码相同
		if (ma.getMemberPassword().equals(passwordEncrypt)) {
			throw new BusinessException(ResultStatus.NEW_OLD_PASSWORD_IS_SAME);
		}
		String newSalt = UUIDUtil.getRandomString(6);
		String newPassword = AuthUtil.passwordEncrypt(password, newSalt);
		//更新密码
		MemberAuth memberAuth = new MemberAuth();
		memberAuth.setMaId(ma.getMaId());
		memberAuth.setMemberPassword(newPassword);
		memberAuth.setAuthSalt(newSalt);
		memberAuth.setAuthFail(0);
		memberAuth.setUpdateTime(new Date());
		memberAuthService.updateByPrimaryKeySelective(memberAuth);
		//增加一次修改
		addOneModifyPassword(maId, modifyPasswordCount);
	}

	@Override
	public Integer modifyPasswordCount(Long maId) throws BusinessException {
		ApiResult r1 = redisService.get(CommonContant.MEMBER_REDIS_PRE + CommonContant.SEPARATOR + maId);
		String count = (String) ApiResultUtil.getObject(r1);
		return Integer.valueOf(count);
	}

	@Override
	public void addOneModifyPassword(Long maId, Integer lastCount) {
		redisService.set(CommonContant.MEMBER_REDIS_PRE + CommonContant.SEPARATOR + maId, lastCount == null ? "1" : String.valueOf(lastCount + 1), DateUtil.ONE_DAY_S);
	}
}
