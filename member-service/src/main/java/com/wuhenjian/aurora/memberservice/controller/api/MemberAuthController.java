package com.wuhenjian.aurora.memberservice.controller.api;

import com.wuhenjian.aurora.utils.entity.result.ApiResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 無痕剑
 * @date 2017/12/28 9:07
 */
@RestController
@RequestMapping("/memberAuth")
public class MemberAuthController {

	@RequestMapping(value = "/updatePassword", method = RequestMethod.POST)
	public ApiResult updatePassword() {
		//TODO 更新密码
		return ApiResult.success();
	}
}
