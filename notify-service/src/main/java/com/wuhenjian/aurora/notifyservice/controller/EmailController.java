package com.wuhenjian.aurora.notifyservice.controller;

import com.wuhenjian.aurora.consumer.service.RedisService;
import com.wuhenjian.aurora.notifyservice.service.EmailService;
import com.wuhenjian.aurora.utils.DateUtil;
import com.wuhenjian.aurora.utils.StringUtil;
import com.wuhenjian.aurora.utils.UUIDUtil;
import com.wuhenjian.aurora.utils.constant.CaptchaType;
import com.wuhenjian.aurora.utils.constant.CommonContant;
import com.wuhenjian.aurora.utils.constant.ResultStatus;
import com.wuhenjian.aurora.utils.entity.bo.SendEmailParam;
import com.wuhenjian.aurora.utils.entity.dto.ApiResult;
import com.wuhenjian.aurora.utils.exception.BusinessException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.Date;

/**
 * @author 無痕剑
 * @date 2017/12/28 16:27
 */
@RestController
@RequestMapping("/email")
public class EmailController {

	@Value("email.from.address")
	private String from;

	@Resource(name = "emailService")
	private EmailService emailService;

	@Autowired
	private RedisService redisService;

	/**
	 * 获取邮箱验证码
	 * @param to 收件人
	 * @return 验证码redis缓存的key
	 * @throws BusinessException 发生异常
	 */
	@RequestMapping(value = "/sendCaptcha", method = RequestMethod.POST)
	public ApiResult sendCaptcha(String to, Integer type) throws BusinessException {
		String typeStr = CaptchaType.getName(type);
		if (typeStr == null) {
			throw new BusinessException(ResultStatus.CAPTCHA_TYPE_ERROR);
		}
		if (to == null) {
			throw new BusinessException(ResultStatus.RECEIVE_IS_NULL);
		}
		if (!StringUtil.isEmail(to)) {
			throw new BusinessException(ResultStatus.RECEIVE_EMAIL_FORMAT_ERROR);
		}
		String captchaKey = UUIDUtil.getUuid(CommonContant.CAPTCHA_RADIX);
		String captcha = UUIDUtil.getRandomString(6);
		SendEmailParam sendEmailParam = new SendEmailParam();
		sendEmailParam.setFrom(from);
		sendEmailParam.setTo(to);
		sendEmailParam.setCaptcha(captcha);
		sendEmailParam.setSubject("【AURORA】" + typeStr + "验证码");
		sendEmailParam.setType(typeStr);
		sendEmailParam.setTime(new Date());
		sendEmailParam.setTitle("【AURORA】" + typeStr + "验证码");
		emailService.sendCaptcha(sendEmailParam);
		redisService.set(captchaKey, captcha, DateUtil.FIVE_MIN_S);
		return ApiResult.success(captchaKey);
	}
}
