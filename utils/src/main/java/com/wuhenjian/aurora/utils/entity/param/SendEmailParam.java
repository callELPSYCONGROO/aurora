package com.wuhenjian.aurora.utils.entity.param;

import java.io.File;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * 发送邮件参数
 * @author 無痕剑
 * @date 2017/12/28 16:31
 */
public class SendEmailParam {
	/** 发件人 */
	private String from;
	/** 收件人 */
	private String to;
	/** 邮件标题 */
	private String subject;
	/** 模板标题 */
	private String title;
	/** 验证码，仅验证码邮件需要 */
	private String captcha;
	/** 时间 */
	private Date time;
	/** 事件类型 */
	private String type;
	/** 附件 */
	private Map<String,File> attachments;

	public String getFrom() {
		return from;
	}

	public void setFrom(String from) {
		this.from = from;
	}

	public String getTo() {
		return to;
	}

	public void setTo(String to) {
		this.to = to;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getCaptcha() {
		return captcha;
	}

	public void setCaptcha(String captcha) {
		this.captcha = captcha;
	}

	public Date getTime() {
		return time;
	}

	public void setTime(Date time) {
		this.time = time;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Map<String, File> getAttachments() {
		return attachments;
	}

	public void setAttachments(Map<String, File> attachments) {
		this.attachments = attachments;
	}

	public Map<String,Object> getCptchaParams() {
		Map<String,Object> map = new HashMap<>();
		map.put("type", this.type);
		map.put("time", this.time);
		map.put("title", this.title);
		map.put("captcha", this.captcha);
		return map;
	}
}
