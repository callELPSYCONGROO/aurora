package com.wuhenjian.aurora.taskservice.service;

import java.io.IOException;

/**
 * @author 無痕剑
 * @date 2018/1/11 14:28
 */
public interface GithubRepoService {
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
	void getAllRepositoriesByAccountName(String accountName) throws IOException;
}
