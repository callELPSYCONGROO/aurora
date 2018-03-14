package com.wuhenjian.aurora.cms.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author 無痕剑
 * @date 2018/3/14 15:10
 */
@Controller

public class LoginController {
	@RequestMapping("/login")
	public String login() {
		return "index";
	}
}
