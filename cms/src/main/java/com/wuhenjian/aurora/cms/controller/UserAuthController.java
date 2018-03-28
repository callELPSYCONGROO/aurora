package com.wuhenjian.aurora.cms.controller;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author 無痕剑
 * @date 2018/3/14 15:10
 */
@Controller
@RequestMapping("/auth")
public class UserAuthController {

	/**
	 * 进入登录页面
	 */
	@RequestMapping("/login")
	public String login() {
		return "/login";
	}

	/**
	 * 账号登录
	 * @param acctount 账号
	 * @param password 密码
	 * @param verification 验证码
	 * @return 登录成功进入index页面，失败返回认证失败页面
	 */
	@RequestMapping(value = "/toLogin", method = RequestMethod.POST)
	public String toLogin(String acctount, String password, String verification) {
		if (acctount == null || password == null || verification == null) {
			return "/manage/page_403";
		}
		UsernamePasswordToken usernamePasswordToken = new UsernamePasswordToken(acctount, password);
		try {
			SecurityUtils.getSubject().login(usernamePasswordToken);
		} catch (AuthenticationException e) {//TODO 日志分类型记录
			return "/manage/page_403";
		}
		return "/manage/index";
	}
}
