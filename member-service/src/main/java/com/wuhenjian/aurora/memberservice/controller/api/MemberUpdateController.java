package com.wuhenjian.aurora.memberservice.controller.api;

import com.wuhenjian.aurora.consumer.service.NotifyService;
import com.wuhenjian.aurora.memberservice.service.MemberUpdateService;
import com.wuhenjian.aurora.utils.ApiResultUtil;
import com.wuhenjian.aurora.utils.StringUtil;
import com.wuhenjian.aurora.utils.constant.CaptchaType;
import com.wuhenjian.aurora.utils.constant.CommonContant;
import com.wuhenjian.aurora.utils.constant.ResultStatus;
import com.wuhenjian.aurora.utils.entity.bo.MemberAcctInfo;
import com.wuhenjian.aurora.utils.entity.dto.ApiResult;
import com.wuhenjian.aurora.utils.exception.BusinessException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

/**
 * @author 無痕剑
 * @date 2017/12/28 9:07
 */
@RestController
@RequestMapping("/memberUpdate")
public class MemberUpdateController {

	@Resource(name = "memberService")
	private MemberUpdateService memberUpdateService;

	@Autowired
	private NotifyService notifyService;

	@RequestMapping(value = "/updatePassword", method = RequestMethod.POST)
	public ApiResult updatePassword(String memberPassword, String reMemberPassword, String captcha, String captchaKey, HttpServletRequest request) throws BusinessException {
		if (StringUtil.hasBlank(new String[]{memberPassword, reMemberPassword, captcha, captchaKey})) {
			return ApiResult.fail(ResultStatus.PARAM_IS_EMPTY);
		}
		MemberAcctInfo mai = (MemberAcctInfo) request.getAttribute(CommonContant.REQUEST_MEMBER_INFO);
		memberUpdateService.updatePassword(mai.getMaId(), memberPassword, reMemberPassword, captcha, captchaKey);
		return ApiResult.success();
	}

	/**
	 * 发送邮箱验证码
	 * @param memberAccount 登录账号
	 * @param captchaType 验证码类型
	 * @return 验证码缓存key
	 * @throws BusinessException 发生异常
	 */
	@RequestMapping(value = "/sendCaptcha", method = RequestMethod.POST)
	public ApiResult sendCaptcha(String memberAccount, Integer captchaType) throws BusinessException {
		if (StringUtil.hasBlank(new String[]{memberAccount, String.valueOf(captchaType)})) {
			return ApiResult.fail(ResultStatus.PARAM_IS_EMPTY);
		}
		if (!CaptchaType.intCaptchaType(captchaType)) {
			throw new BusinessException(ResultStatus.CAPTCHA_TYPE_INVALID);
		}
		ApiResult r1 = notifyService.sendCaptcha(memberAccount, captchaType);
		String captchaKey = (String) ApiResultUtil.getObject(r1);
		return ApiResult.success(captchaKey);
	}
}
