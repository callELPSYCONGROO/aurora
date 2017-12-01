package com.wuhenjian.aurora.business.asd;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 無痕剑
 * @date 2017/11/30 14:00
 */
@RestController
public class TestCtrl {
	@Value("${yige}")
	private String username;

	@RequestMapping("username")
	public String getUsername() {
		return username;
	}
}
