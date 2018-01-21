package com.wuhenjian.aurora.gateway.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.filter.CorsFilter;

/**
 * @author 無痕剑
 * @date 2018/1/18 13:49
 */
@Configuration
public class CorsConfig {

	@Value("${cors.cookies}")
	private boolean cookies;
	@Value("${cors.origin-url}")
	private String originUrl;
	@Value("${cors.headers-list}")
	private String headersList;
	@Value("${cors.max-age}")
	private long maxAge;
	@Value("${cors.method-list}")
	private String methodList;
	@Value("${cors.filter-path}")
	private String filterPath;

	/**
	 * 跨域请求配置
	 */
	@Bean
	public CorsFilter corsFilter() {
		String[] headers = headersList.split(",");
		String[] methods = methodList.split(",");
		CorsConfiguration configuration = new CorsConfiguration();
		// 允许cookies跨域
		configuration.setAllowCredentials(cookies);
		// 允许向该服务器提交请求的URI，*表示全部允许。
		configuration.addAllowedOrigin(originUrl);
		for (String header : headers) {
			// 允许访问的头信息,*表示全部
			configuration.addAllowedHeader(header);
		}
		// 预检请求的缓存时间（秒），即在这个时间段里，对于相同的跨域请求不会再预检了
		configuration.setMaxAge(maxAge);
		for (String method : methods) {
			// 允许提交请求的方法，*表示全部允许，也可以单独设置GET、PUT等
			configuration.addAllowedMethod(method);
		}
		UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
		source.registerCorsConfiguration(filterPath, configuration);
		return new CorsFilter(source);
	}
}
