package com.wuhenjian.aurora.db.controller;

import com.wuhenjian.aurora.db.service.TokenService;
import com.wuhenjian.aurora.utils.entity.MemberInfo;
import com.wuhenjian.aurora.utils.entity.result.ApiResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 無痕剑
 * @date 2017/12/8 16:34
 */
@RestController
public class TestCtrl {

	@Autowired
	private TokenService tokenService;

	@RequestMapping("/get/{token}")
	public Object get(@PathVariable("token") String token) {
		return ApiResult.success(tokenService.getToken(token));
	}

	@RequestMapping("/add/{token}")
	public Object add(@PathVariable("token") String token) {
		MemberInfo info = new MemberInfo();
		info.setAge("23");
		info.setName("杀马特");
		info.setSex("Man");
		tokenService.setToken(token, info, 60);
		return ApiResult.success();
	}

	@RequestMapping("/del/{token}")
	public Object del(@PathVariable("token") String token) {
		tokenService.delToken(token);
		return ApiResult.success();
	}
}
