package com.wuhenjian.aurora.memberservice.controller.api;

import com.wuhenjian.aurora.memberservice.service.MemberLoginService;
import com.wuhenjian.aurora.utils.entity.TokenInfo;
import com.wuhenjian.aurora.utils.constant.ResultStatus;
import com.wuhenjian.aurora.utils.entity.param.AuthParam;
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
	public ApiResult login(AuthParam authParam, HttpServletRequest request) throws BusinessException {
		if (authParam.loginParamIsEmpty()) {
			return ApiResult.fail(ResultStatus.PARAM_IS_EMPTY);
		}
		String loginIp;
		if (request.getHeader("x-forwarded-for") == null) {
			loginIp = request.getRemoteAddr();
		} else {
			loginIp = request.getHeader("x-forwarded-for");
		}
		authParam.setLoginIp(loginIp);
		TokenInfo tokenInfo = memberLoginService.login(authParam);
		return ApiResult.success(tokenInfo);
	}

	@RequestMapping(value = "/register", method = RequestMethod.POST)
	public ApiResult register(AuthParam authParam) throws BusinessException {
		if (authParam.registerParamIsEmpty()) {
			return ApiResult.fail(ResultStatus.PARAM_IS_EMPTY);
		}
		memberLoginService.register(authParam);
		return ApiResult.success();
	}

	@RequestMapping(value = "/resetPassword", method = RequestMethod.POST)
	public ApiResult resetPassword(AuthParam authParam) throws BusinessException {
		if (authParam.resetParamIsEmpty()) {
			return ApiResult.fail(ResultStatus.PARAM_IS_EMPTY);
		}
		memberLoginService.resetPassword(authParam);
		return ApiResult.success();
	}
}
