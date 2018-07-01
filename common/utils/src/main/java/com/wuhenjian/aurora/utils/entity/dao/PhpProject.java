package com.wuhenjian.aurora.utils.entity.dao;

import com.wuhenjian.aurora.utils.entity.bo.Page;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;
import java.util.Date;

@EqualsAndHashCode(callSuper = true)
@Data
public class PhpProject extends Page implements Serializable {
	private Long ppId;

	private String accountName;

	private String repoName;

	private String lang;

	private String defaultBranch;

	private String homepage;

	private String description;

	private Integer fileSize;

	private Integer forksCount;

	private Integer stargazersCount;

	private Integer watchersCount;

	private Integer openIssuesCount;

	private Date createdAt;

	private Date updatedAt;

	private Date pushedAt;

	private String gitUrl;

	private String sshUrl;

	private String cloneUrl;

	private String svnUrl;

	private Date updateTime;
}