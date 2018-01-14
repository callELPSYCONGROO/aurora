package com.wuhenjian.aurora.taskservice.service;

import com.wuhenjian.aurora.utils.exception.BusinessException;

import java.beans.IntrospectionException;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;

/**
 * @author 無痕剑
 * @date 2018/1/11 14:28
 */
public interface GithubRepoService {
	/** GitHub接口 */
	String API_PATH = "https://api.github.com/repos/";
	/** GitHub链接 */
	String BASE_PATH = "https://github.com/";
	/** 源参数 */
	String TAB = "tab";
	String REPO = "repositories";
	String PAGE = "page";
	/**
	 * 通过账户名得到其下所有公开的源
	 * @param accountName 账户名
	 */
	void getAllRepositoriesByAccountName(String accountName) throws IOException, BusinessException, IllegalAccessException, IntrospectionException, InvocationTargetException;

	/**
	 * 更新账户下的所有源的信息
	 * @param accountName 账户
	 */
	void updateRepositoriesInfo(String accountName) throws BusinessException, IOException, IllegalAccessException, IntrospectionException, InvocationTargetException;
}
