package com.wuhenjian.aurora.authservice.controller;

import com.wuhenjian.aurora.consumer.service.RedisService;
import com.wuhenjian.aurora.utils.ApiResultUtil;
import com.wuhenjian.aurora.utils.AuthUtil;
import com.wuhenjian.aurora.utils.constant.ResultStatus;
import com.wuhenjian.aurora.utils.entity.dto.ApiResult;
import com.wuhenjian.aurora.utils.exception.BusinessException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 無痕剑
 * @date 2018/1/11 12:49
 */
@RestController
public class TokenAuthController {

	@Autowired
	private RedisService redisService;

	/**
	 * 解析、验证Token，返回Token中的用户信息
	 * @param accessToken 加密token
	 * @return 用户信息
	 * @throws BusinessException 发生异常
	 */
	@RequestMapping("/token")
	public ApiResult token(String accessToken) throws BusinessException {
		//解析token
		String token;
		try {
			token = AuthUtil.decodeToken(accessToken);
		} catch (Exception e) {
			return ApiResult.fail(ResultStatus.DECODE_TOKEN_EXCEPTION);
		}
		//判断token是否过期
		ApiResult r1 = redisService.getToken(token);
		Object mai = ApiResultUtil.getObject(r1);
		if (mai == null) {
			return ApiResult.fail(ResultStatus.TOKEN_OVERDUE);
		}
		return ApiResult.success(mai);
	}
}
