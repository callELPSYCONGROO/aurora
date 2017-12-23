package com.wuhenjian.aurora.authservice.controller;

import com.wuhenjian.aurora.authservice.service.TokenAuthService;
import com.wuhenjian.aurora.utils.entity.TokenInfo;
import com.wuhenjian.aurora.utils.entity.TokenModel;
import com.wuhenjian.aurora.utils.entity.constant.ResultStatus;
import com.wuhenjian.aurora.utils.entity.result.ApiResult;
import com.wuhenjian.aurora.utils.exception.BusinessException;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * Token认证
 * @author 無痕剑
 * @date 2017/12/6 14:53
 */
@RestController
@RequestMapping("/auth/token")
public class TokenAuthController {

	@Resource(name = "tokenAuthService")
	private TokenAuthService tokenAuthService;

	/**
	 * 创建Token
	 * @return 结果集
	 * @throws BusinessException 发生异常
	 */
	@RequestMapping(value = "/create", method = RequestMethod.POST)
	public ApiResult createToken() throws BusinessException {
		TokenInfo tokenInfo = tokenAuthService.createToken();
		return ApiResult.success(tokenInfo);
	}

	/**
	 * 验证Token是否合法
	 * @param token token
	 * @return 返回code=1000为合法
	 */
	@RequestMapping(value = "/authToken", method = RequestMethod.GET)
	public ApiResult authToken(String token) {
		if (token == null) {
			return ApiResult.fail(ResultStatus.PARAM_IS_EMPTY);
		}
		boolean flag = tokenAuthService.authToken(token);
		return flag ? ApiResult.success() : ApiResult.fail(ResultStatus.TOKEN_ISVALID_CTRL);
	}

	/**
	 * 解密token获取uuid
	 * @param token token
	 * @return uuid
	 * @throws BusinessException 解密异常
	 */
	@RequestMapping(value = "/decodeToken", method = RequestMethod.GET)
	public ApiResult decodeToken(String token) throws BusinessException {
		if (token == null) {
			return ApiResult.fail(ResultStatus.PARAM_IS_EMPTY);
		}
		String uuid = tokenAuthService.decodeToken(token);
		return ApiResult.success(uuid);
	}
}
