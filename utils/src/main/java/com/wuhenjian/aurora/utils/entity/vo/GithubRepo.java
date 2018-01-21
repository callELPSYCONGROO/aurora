package com.wuhenjian.aurora.utils.entity.vo;

import java.io.Serializable;

/**
 * @author SwordNoTrace
 * @date 2018/1/20 14:56
 */
public class GithubRepo implements Serializable {

	private String accountName;

	private String repoName;

	public String getAccountName() {
		return accountName;
	}

	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}

	public String getRepoName() {
		return repoName;
	}

	public void setRepoName(String repoName) {
		this.repoName = repoName;
	}
}
