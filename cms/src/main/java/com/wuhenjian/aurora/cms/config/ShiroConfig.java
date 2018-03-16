package com.wuhenjian.aurora.cms.config;

import at.pollux.thymeleaf.shiro.dialect.ShiroDialect;
import com.wuhenjian.aurora.cms.shiro.UserCredentialsMatcher;
import com.wuhenjian.aurora.cms.shiro.UserShiroRealm;
import com.wuhenjian.aurora.consumer.service.SysFilterChainService;
import com.wuhenjian.aurora.utils.entity.dao.SysFilterChain;
import com.wuhenjian.aurora.utils.exception.BusinessException;
import org.apache.shiro.cache.ehcache.EhCacheManager;
import org.apache.shiro.mgt.SecurityManager;
import org.apache.shiro.spring.LifecycleBeanPostProcessor;
import org.apache.shiro.spring.security.interceptor.AuthorizationAttributeSourceAdvisor;
import org.apache.shiro.spring.web.ShiroFilterFactoryBean;
import org.apache.shiro.web.mgt.DefaultWebSecurityManager;
import org.springframework.aop.framework.autoproxy.DefaultAdvisorAutoProxyCreator;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.DependsOn;
import org.springframework.core.annotation.Order;
import org.springframework.web.filter.DelegatingFilterProxy;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/**
 * @author 無痕剑
 * @date 2018/3/14 11:52
 */
@Configuration
@Order
public class ShiroConfig {

	@Bean(name = "userCredentialsMatcher")
	public UserCredentialsMatcher userCredentialsMatcher() {
		return new UserCredentialsMatcher();
	}

	@Bean(name = "ehCacheManager")
	@DependsOn("lifecycleBeanPostProcessor")
	public EhCacheManager ehCacheManager() {
		EhCacheManager ehCacheManager = new EhCacheManager();
		ehCacheManager.setCacheManagerConfigFile("classpath:config/ehcache-shiro.fxml");
		return ehCacheManager;
	}

	@Bean(name = "userShiroRealm")
	@DependsOn("lifecycleBeanPostProcessor")
	public UserShiroRealm userShiroRealm(UserCredentialsMatcher userCredentialsMatcher,
                                         EhCacheManager ehCacheManager) {
		UserShiroRealm userShiroRealm = new UserShiroRealm();
		userShiroRealm.setCacheManager(ehCacheManager);
		userShiroRealm.setCredentialsMatcher(userCredentialsMatcher);
		return userShiroRealm;
	}

	/**
	 * Shiro安全管理器
	 */
	@Bean(name = "securityManager")
	public SecurityManager securityManager(UserShiroRealm userShiroRealm,
                                           EhCacheManager ehCacheManager) {
		DefaultWebSecurityManager manager = new DefaultWebSecurityManager();
		manager.setRealm(userShiroRealm);
		manager.setCacheManager(ehCacheManager);
		return manager;
	}

	/**
	 * Shiro的web过滤器工厂
	 */
	@Bean
	public ShiroFilterFactoryBean shiroFilterFactoryBean(SecurityManager securityManager,
                                                         SysFilterChainService sysFilterChainService)
            throws BusinessException {
		ShiroFilterFactoryBean factory = new ShiroFilterFactoryBean();
		factory.setSecurityManager(securityManager);
		factory.setLoginUrl("/login");// 登录URL
		factory.setSuccessUrl("/index");// 登录成功跳转页面
		factory.setUnauthorizedUrl("/error/unauthorized");// 访问未授权资源时跳转页面
        SysFilterChain model = new SysFilterChain();
        model.setOrderBy("sort");
        List<SysFilterChain> sysFilterChains = sysFilterChainService.selectByModel(model);// 查询数据库获取权限
        Map<String, String> map = new LinkedHashMap<>();
        for (SysFilterChain sfc : sysFilterChains) {// 添加动态URL权限拦截
            map.put(sfc.getUrl(), sfc.getFilterRole());
        }
		factory.setFilterChainDefinitionMap(map);
		return factory;
	}

	@Bean(name = "filterRegistrationBean")
	public FilterRegistrationBean filterRegistrationBean() {
        DelegatingFilterProxy delegatingFilterProxy = new DelegatingFilterProxy("shiroFilterFactoryBean");
        FilterRegistrationBean filterRegistrationBean = new FilterRegistrationBean();
        filterRegistrationBean.setFilter(delegatingFilterProxy);
        return filterRegistrationBean;
    }

	/**
	 * Shiro生命周期交给Spring管理
	 */
	@Bean(name = "lifecycleBeanPostProcessor")
	public LifecycleBeanPostProcessor lifecycleBeanPostProcessor() {
		return new LifecycleBeanPostProcessor();
	}

	/**
	 * 开启Shiro的注解(如@RequiresRoles,@RequiresPermissions)，
	 * 需借助SpringAOP扫描使用Shiro注解的类，并在必要时进行安全逻辑验证。
	 * 配置以下两个bean(DefaultAdvisorAutoProxyCreator(可选)和AuthorizationAttributeSourceAdvisor)即可实现此功能
	 */
	@Bean(name = "defaultAdvisorAutoProxyCreator")
	@DependsOn("lifecycleBeanPostProcessor")
	public DefaultAdvisorAutoProxyCreator defaultAdvisorAutoProxyCreator() {
		DefaultAdvisorAutoProxyCreator proxyCreator = new DefaultAdvisorAutoProxyCreator();
		proxyCreator.setProxyTargetClass(true);
		return proxyCreator;
	}

	@Bean(name = "authorizationAttributeSourceAdvisor")
	public AuthorizationAttributeSourceAdvisor authorizationAttributeSourceAdvisor(SecurityManager securityManager) {
		AuthorizationAttributeSourceAdvisor advisor = new AuthorizationAttributeSourceAdvisor();
		advisor.setSecurityManager(securityManager);
		return advisor;
	}

	/**
	 * 添加ShiroDialect 为了在thymeleaf里使用shiro的标签的bean
	 */
	@Bean(name = "shiroDialect")
	public ShiroDialect shiroDialect() {
		return new ShiroDialect();
	}
}
