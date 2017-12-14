package com.wuhenjian.aurora.db.controller;

import com.wuhenjian.aurora.db.service.RedisService;
import com.wuhenjian.aurora.utils.entity.MemberInfo;
import com.wuhenjian.aurora.utils.entity.constant.ResultStatus;
import com.wuhenjian.aurora.utils.entity.result.ApiResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author 無痕剑
 * @date 2017/12/8 16:34
 */
@RestController
@RequestMapping("/redis")
public class RedisController {

	@Resource(name = "tokenService")
	private RedisService redisService;

	@RequestMapping(value = "/setToken", method = RequestMethod.POST)
	public ApiResult setToken(@RequestParam("token") String token) {
		try {
			redisService.setToken(token, null);
		} catch (Exception e) {
			e.printStackTrace();
			return ApiResult.fail(ResultStatus.SYSTEM_EXCEPTION.getCode(), e.getMessage());
		}
		return ApiResult.success();
	}

	@RequestMapping(value = "/getToken", method = RequestMethod.GET)
	public ApiResult getToken(@RequestParam("token") String token) {
		MemberInfo memberInfo;
		try {
			memberInfo = redisService.getToken(token);
		} catch (Exception e) {
			e.printStackTrace();
			return ApiResult.fail(ResultStatus.SYSTEM_EXCEPTION.getCode(), e.getMessage());
		}
		return ApiResult.success(memberInfo);
	}

	@RequestMapping(value = "/delToken", method = RequestMethod.POST)
	public ApiResult delToken(@RequestParam("token") String token) {
		try {
			redisService.delToken(token);
		} catch (Exception e) {
			e.printStackTrace();
			return ApiResult.fail(ResultStatus.SYSTEM_EXCEPTION.getCode(), e.getMessage());
		}
		return ApiResult.success();
	}
}
