package com.wuhenjian.aurora.cms.config;

import at.pollux.thymeleaf.shiro.dialect.ShiroDialect;
import com.wuhenjian.aurora.cms.shiro.UserShiroRealm;
import org.apache.shiro.mgt.SecurityManager;
import org.apache.shiro.spring.web.ShiroFilterFactoryBean;
import org.apache.shiro.web.mgt.DefaultWebSecurityManager;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.annotation.Resource;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * @author 無痕剑
 * @date 2018/3/14 11:52
 */
@Configuration
public class ShiroConfig {

	@Resource(name = "userShiroRealm")
	private UserShiroRealm userShiroRealm;

	/**
	 * Shiro安全管理器
	 */
	@Bean(name = "securityManager")
	public SecurityManager securityManager() {
		DefaultWebSecurityManager manager = new DefaultWebSecurityManager();
		manager.setRealm(userShiroRealm);
		return manager;
	}

	/**
	 * Shiro的web过滤器工厂
	 * @param securityManager 安全管理器
	 */
	@Bean(name = "shiroFilterFactoryBean")
	public ShiroFilterFactoryBean shiroFilterFactoryBean(SecurityManager securityManager) {
		ShiroFilterFactoryBean factory = new ShiroFilterFactoryBean();
		factory.setSecurityManager(securityManager);
		factory.setLoginUrl("/login");// 登录URL
		factory.setSuccessUrl("/manage/index");// 登录成功跳转页面
		factory.setUnauthorizedUrl("/error/unauthorized");// 访问未授权资源时跳转页面
		/*
		 * key-url链接地址，value-过滤规则
		 * 有序链表结构hashmap，作为shiro过滤链。
		 * 添加顺序即为过滤器执行顺序。
		 */
		Map<String, String> map = new LinkedHashMap<>();
		map.put("/static/**", "anon");
		map.put("/logout", "logout");// 登出过滤链，使用shiro提供的
		map.put("/login", "anon");
		map.put("/**", "authc");
		factory.setFilterChainDefinitionMap(map);
		return factory;
	}

	/**
	 * 添加ShiroDialect 为了在thymeleaf里使用shiro的标签的bean
	 */
	@Bean(name = "shiroDialect")
	public ShiroDialect shiroDialect() {
		return new ShiroDialect();
	}
}
