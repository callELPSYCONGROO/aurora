package com.wuhenjian.aurora.notifyservice.service.impl;

import com.wuhenjian.aurora.notifyservice.service.EmailService;
import com.wuhenjian.aurora.utils.constant.ResultStatus;
import com.wuhenjian.aurora.utils.entity.param.SendEmailParam;
import com.wuhenjian.aurora.utils.exception.BusinessException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;
import org.thymeleaf.TemplateEngine;
import org.thymeleaf.context.Context;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;

/**
 * @author 無痕剑
 * @date 2017/12/28 9:37
 */
@Service("emailService")
public class EmailServiceImpl implements EmailService {

	@Autowired
	private JavaMailSender javaMailSender;
	
	@Autowired
	private TemplateEngine templateEngine;

	/**
	 * 发送验证码模板邮件
	 * @param sendEmailParam from-发件人、to-收件人、subject-标题、title：Html模板标题，captcha-验证码，time-时间，type-事件
	 */
	@Override
	public void sendCaptcha(SendEmailParam sendEmailParam) throws BusinessException {
		MimeMessage message = javaMailSender.createMimeMessage();
		MimeMessageHelper helper;
		try {
			helper = new MimeMessageHelper(message, true);
			helper.setFrom(sendEmailParam.getFrom());
			helper.setTo(sendEmailParam.getTo());
			helper.setSubject(sendEmailParam.getSubject());
			//创建模板
			Context context = new Context();
			context.setVariables(sendEmailParam.getCptchaParams());
			String emailContext = templateEngine.process("emailCaptchaTemplate", context);
			helper.setText(emailContext, true);
		} catch (MessagingException e) {
			throw new BusinessException(ResultStatus.EMAIL_FAILURE);
		}
		javaMailSender.send(message);
	}
}
