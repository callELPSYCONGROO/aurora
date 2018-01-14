package com.wuhenjian.aurora.memberservice.controller.api;

import com.wuhenjian.aurora.memberservice.service.MemberLoginService;
import com.wuhenjian.aurora.utils.StringUtil;
import com.wuhenjian.aurora.utils.entity.bo.TokenInfo;
import com.wuhenjian.aurora.utils.constant.ResultStatus;
import com.wuhenjian.aurora.utils.entity.bo.AuthParam;
import com.wuhenjian.aurora.utils.entity.dto.ApiResult;
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
@RequestMapping("/memberEntry")
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

	/**
	 * 发送邮箱验证码
	 * @param memberAccount 登录账号
	 * @param captchaType 验证码类型
	 * @param timestamp 时间戳
	 * @param paramSign 参数签名
	 * @return 验证码缓存key
	 * @throws BusinessException 发生异常
	 */
	@RequestMapping(value = "/sendCaptcha", method = RequestMethod.POST)
	public ApiResult sendCaptcha(String memberAccount, Integer captchaType, String timestamp, String paramSign) throws BusinessException {
		if (StringUtil.hasBlank(new String[]{memberAccount, String.valueOf(captchaType), timestamp, paramSign})) {
			return ApiResult.fail(ResultStatus.PARAM_IS_EMPTY);
		}
		String captchaKey = memberLoginService.sendCaptcha(memberAccount, captchaType, timestamp, paramSign);
		return ApiResult.success(captchaKey);
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

	/**
	 * 检查账号是否存在
	 * @return 1-存在，2-不存在
	 */
	@RequestMapping(value = "/checkAccount", method = RequestMethod.GET)
	public ApiResult checkAccount(String memberAccount, String accountType, String paramSign) throws BusinessException {
		Integer checkAccount = memberLoginService.checkAccount(memberAccount, accountType, paramSign);
		return ApiResult.success(checkAccount);
	}
}
