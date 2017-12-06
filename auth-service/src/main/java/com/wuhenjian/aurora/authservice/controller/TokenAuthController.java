package com.wuhenjian.aurora.authservice.controller;

import com.wuhenjian.aurora.authservice.service.TokenAuthService;
import com.wuhenjian.aurora.utils.entity.TokenInfo;
import com.wuhenjian.aurora.utils.entity.constant.ResultStatus;
import com.wuhenjian.aurora.utils.entity.result.ApiResult;
import com.wuhenjian.aurora.utils.exception.BusinessException;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
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
	 * 根据accountCode创建Token
	 * @param accountCode 用户账号
	 * @return 结果集
	 */
	@RequestMapping("create")
	public ApiResult createToken(@RequestParam("accountCode") Long accountCode) {
		if (accountCode == null) {
			return ApiResult.fail(ResultStatus.PARAM_IS_EMPTY);
		}
		TokenInfo tokenInfo = tokenAuthService.createToken(accountCode);
		return ApiResult.success(tokenInfo);
	}

}
