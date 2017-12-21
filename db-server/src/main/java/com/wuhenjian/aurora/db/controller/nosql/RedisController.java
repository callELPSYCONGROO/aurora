package com.wuhenjian.aurora.db.controller.nosql;

import com.wuhenjian.aurora.db.service.RedisService;
import com.wuhenjian.aurora.utils.entity.MemberAcctInfo;
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
@RequestMapping("/nosql/redis")
public class RedisController {

	@Resource(name = "tokenService")
	private RedisService redisService;

	@RequestMapping(value = "/setToken", method = RequestMethod.POST)
	public ApiResult setToken(@RequestParam("token") String token) {
		try {
			redisService.setToken(token, null);//TODO 设置用户信息
		} catch (Exception e) {
			e.printStackTrace();
			return ApiResult.fail(ResultStatus.SYSTEM_EXCEPTION.getCode(), e.getMessage());
		}
		return ApiResult.success();
	}

	@RequestMapping(value = "/getToken", method = RequestMethod.GET)
	public ApiResult getToken(@RequestParam("token") String token) {
		MemberAcctInfo memberAcctInfo;
		try {
			memberAcctInfo = redisService.getToken(token);
		} catch (Exception e) {
			e.printStackTrace();
			return ApiResult.fail(ResultStatus.SYSTEM_EXCEPTION.getCode(), e.getMessage());
		}
		return ApiResult.success(memberAcctInfo);
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
