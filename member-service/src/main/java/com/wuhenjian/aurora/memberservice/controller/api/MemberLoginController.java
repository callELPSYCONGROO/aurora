package com.wuhenjian.aurora.memberservice.controller.api;

import com.wuhenjian.aurora.memberservice.service.MemberLoginService;
import com.wuhenjian.aurora.utils.StringUtil;
import com.wuhenjian.aurora.utils.entity.TokenInfo;
import com.wuhenjian.aurora.utils.constant.ResultStatus;
import com.wuhenjian.aurora.utils.entity.result.ApiResult;
import com.wuhenjian.aurora.utils.exception.BusinessException;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

/**
 * @author SwordNoTrace
 * @date 2017/12/4 23:13
 */
@RestController
@RequestMapping("/entry")
public class MemberLoginController {

	@Resource(name = "memberLoginService")
	private MemberLoginService memberLoginService;

	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public ApiResult login(String deviceType, String loginType, String memberAccount, String memberPassword, String paramSign, HttpServletRequest request) throws BusinessException {
		if (StringUtil.hasBlank(new String[]{deviceType, loginType, memberAccount, memberPassword, paramSign})) {
			return ApiResult.fail(ResultStatus.PARAM_IS_EMPTY);
		}
		String loginIp;
		if (request.getHeader("x-forwarded-for") == null) {
			loginIp = request.getRemoteAddr();
		} else {
			loginIp = request.getHeader("x-forwarded-for");
		}
		TokenInfo tokenInfo = memberLoginService.login(loginIp, deviceType, loginType, memberAccount, memberPassword, paramSign);
		return ApiResult.success(tokenInfo);
	}

	@RequestMapping(value = "/register", method = RequestMethod.POST)
	public ApiResult register(String deviceType, String registerType, String memberAccount, String memberPassword, String reMemberPassword, String paramSign) throws BusinessException {
		if (StringUtil.hasBlank(new String[]{deviceType, registerType, memberAccount, memberPassword, reMemberPassword, registerType, paramSign})) {
			return ApiResult.fail(ResultStatus.PARAM_IS_EMPTY);
		}
		memberLoginService.register(deviceType, registerType, memberAccount, memberPassword, reMemberPassword, paramSign);
		return ApiResult.success();
	}

	@RequestMapping(value = "/resetPassword", method = RequestMethod.POST)
	public ApiResult resetPassword(String deviceType, String accountType, String memberAccount, String memberPassword, String reMemberPassword, String paramSign) throws BusinessException {
		if (StringUtil.hasBlank(new String[]{deviceType, accountType, memberAccount, memberPassword, reMemberPassword, accountType, paramSign})) {
			return ApiResult.fail(ResultStatus.PARAM_IS_EMPTY);
		}
		memberLoginService.resetPassword(accountType, memberAccount, memberPassword, reMemberPassword, paramSign);
		return ApiResult.success();
	}
}
