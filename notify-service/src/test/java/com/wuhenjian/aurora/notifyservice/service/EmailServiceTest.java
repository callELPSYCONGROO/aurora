package com.wuhenjian.aurora.notifyservice.service;

import com.wuhenjian.aurora.notifyservice.BaseSerivceTest;
import com.wuhenjian.aurora.utils.exception.BusinessException;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.HashMap;
import java.util.Map;

/**
 * @author 無痕剑
 * @date 2017/12/28 10:36
 */
public class EmailServiceTest extends BaseSerivceTest {

	@Autowired
	private EmailService emailService;

	@Test
	public void sendEmail() throws BusinessException {
		Map<String,Object> params = new HashMap<>();
		params.put("p", "sa");
		params.put("title", "你看看");
		emailService.sendCaptcha("920297884@qq.com", "mayh0991@126.com", "测试邮件", params);
	}
}
