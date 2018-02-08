package com.wuhenjian.aurora.taskservice.job;

import com.wuhenjian.aurora.taskservice.service.CsdnApiService;
import com.wuhenjian.aurora.utils.exception.BusinessException;
import com.wuhenjian.aurora.utils.security.RSAUtil;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.Map;

/**
 * @author 無痕剑
 * @date 2018/2/7 20:59
 */
@Component
public class CsdnBlogJob {

	@Value("${task.csdn.app-key}")
	private String clientId;

	@Value("${task.csdn.app-secret}")
	private String clientSecret;

	@Value("${task.csdn.username}")
	private String grantType;

	@Value("${task.csdn.password}")
	private String username;

	@Value("${task.csdn.password}")
	private String password;

	@Value("${task.csdn.oauth-path}")
	private String oauthPath;

	@Value("${task.csdn.getarticlelist-path}")
	private String getArticleListPath;

	@Resource(name = "csdnApiService")
	private CsdnApiService csdnApiService;

	@Scheduled(cron = "0 0 3 * * ?")
	public void getAllBlog() {
		Map<String, String> params = new HashMap<>();
		params.put("grant_type", "password");
		try {
			params.put("client_id", RSAUtil.decrypt(clientId));
			params.put("client_secret", RSAUtil.decrypt(clientSecret));
			params.put("username", RSAUtil.decrypt(username));
			params.put("password", RSAUtil.decrypt(password));
			String accessToken = csdnApiService.oauth2Authorize(this.oauthPath, params);
			csdnApiService.saveAllBlog(this.getArticleListPath, accessToken);
		} catch (BusinessException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
