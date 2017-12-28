package com.wuhenjian.aurora.notifyservice.controller;

import com.wuhenjian.aurora.notifyservice.service.EmailService;
import com.wuhenjian.aurora.utils.entity.param.SendEmailParam;
import com.wuhenjian.aurora.utils.entity.result.ApiResult;
import com.wuhenjian.aurora.utils.exception.BusinessException;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author 無痕剑
 * @date 2017/12/28 16:27
 */
@RestController
@RequestMapping("/email")
public class EmailController {

	@Resource(name = "emailService")
	private EmailService emailService;

	@RequestMapping(value = "sendCaptcha", method = RequestMethod.POST)
	public ApiResult sendCaptcha(SendEmailParam sendEmailParam) throws BusinessException {
		emailService.sendCaptcha(sendEmailParam);
		return ApiResult.success();
	}
}
