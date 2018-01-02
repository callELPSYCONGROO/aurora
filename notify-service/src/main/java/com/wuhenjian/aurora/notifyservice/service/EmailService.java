package com.wuhenjian.aurora.notifyservice.service;

import com.wuhenjian.aurora.utils.entity.param.SendEmailParam;
import com.wuhenjian.aurora.utils.exception.BusinessException;

/**
 * @author 無痕剑
 * @date 2017/12/28 9:36
 */
public interface EmailService {
	/**
	 * 发送验证码模板邮件
	 * @param sendEmailParam from-发件人、to-收件人、subject-标题、title：Html模板标题，captcha-验证码，time-时间，type-事件
	 */
	void sendCaptcha(SendEmailParam sendEmailParam) throws BusinessException;
}
