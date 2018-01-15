package com.wuhenjian.aurora.utils.entity.dao;

import com.wuhenjian.aurora.utils.entity.bo.Page;

import java.io.Serializable;
import java.util.Date;

public class PhpProject extends Page implements Serializable {
	private Long ppId;

	private String acctountName;

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

	private static final long serialVersionUID = 1L;

	public Long getPpId() {
		return ppId;
	}

	public void setPpId(Long ppId) {
		this.ppId = ppId;
	}

	public String getAcctountName() {
		return acctountName;
	}

	public void setAcctountName(String acctountName) {
		this.acctountName = acctountName == null ? null : acctountName.trim();
	}

	public String getRepoName() {
		return repoName;
	}

	public void setRepoName(String repoName) {
		this.repoName = repoName == null ? null : repoName.trim();
	}

	public String getLang() {
		return lang;
	}

	public void setLang(String lang) {
		this.lang = lang == null ? null : lang.trim();
	}

	public String getDefaultBranch() {
		return defaultBranch;
	}

	public void setDefaultBranch(String defaultBranch) {
		this.defaultBranch = defaultBranch == null ? null : defaultBranch.trim();
	}

	public String getHomepage() {
		return homepage;
	}

	public void setHomepage(String homepage) {
		this.homepage = homepage == null ? null : homepage.trim();
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description == null ? null : description.trim();
	}

	public Integer getFileSize() {
		return fileSize;
	}

	public void setFileSize(Integer fileSize) {
		this.fileSize = fileSize;
	}

	public Integer getForksCount() {
		return forksCount;
	}

	public void setForksCount(Integer forksCount) {
		this.forksCount = forksCount;
	}

	public Integer getStargazersCount() {
		return stargazersCount;
	}

	public void setStargazersCount(Integer stargazersCount) {
		this.stargazersCount = stargazersCount;
	}

	public Integer getWatchersCount() {
		return watchersCount;
	}

	public void setWatchersCount(Integer watchersCount) {
		this.watchersCount = watchersCount;
	}

	public Integer getOpenIssuesCount() {
		return openIssuesCount;
	}

	public void setOpenIssuesCount(Integer openIssuesCount) {
		this.openIssuesCount = openIssuesCount;
	}

	public Date getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

	public Date getUpdatedAt() {
		return updatedAt;
	}

	public void setUpdatedAt(Date updatedAt) {
		this.updatedAt = updatedAt;
	}

	public Date getPushedAt() {
		return pushedAt;
	}

	public void setPushedAt(Date pushedAt) {
		this.pushedAt = pushedAt;
	}

	public String getGitUrl() {
		return gitUrl;
	}

	public void setGitUrl(String gitUrl) {
		this.gitUrl = gitUrl == null ? null : gitUrl.trim();
	}

	public String getSshUrl() {
		return sshUrl;
	}

	public void setSshUrl(String sshUrl) {
		this.sshUrl = sshUrl == null ? null : sshUrl.trim();
	}

	public String getCloneUrl() {
		return cloneUrl;
	}

	public void setCloneUrl(String cloneUrl) {
		this.cloneUrl = cloneUrl == null ? null : cloneUrl.trim();
	}

	public String getSvnUrl() {
		return svnUrl;
	}

	public void setSvnUrl(String svnUrl) {
		this.svnUrl = svnUrl == null ? null : svnUrl.trim();
	}

	public Date getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

	@Override
	public boolean equals(Object that) {
		if (this == that) {
			return true;
		}
		if (that == null) {
			return false;
		}
		if (getClass() != that.getClass()) {
			return false;
		}
		PhpProject other = (PhpProject) that;
		return (this.getPpId() == null ? other.getPpId() == null : this.getPpId().equals(other.getPpId()))
				&& (this.getAcctountName() == null ? other.getAcctountName() == null : this.getAcctountName().equals(other.getAcctountName()))
				&& (this.getRepoName() == null ? other.getRepoName() == null : this.getRepoName().equals(other.getRepoName()))
				&& (this.getLang() == null ? other.getLang() == null : this.getLang().equals(other.getLang()))
				&& (this.getDefaultBranch() == null ? other.getDefaultBranch() == null : this.getDefaultBranch().equals(other.getDefaultBranch()))
				&& (this.getHomepage() == null ? other.getHomepage() == null : this.getHomepage().equals(other.getHomepage()))
				&& (this.getDescription() == null ? other.getDescription() == null : this.getDescription().equals(other.getDescription()))
				&& (this.getFileSize() == null ? other.getFileSize() == null : this.getFileSize().equals(other.getFileSize()))
				&& (this.getForksCount() == null ? other.getForksCount() == null : this.getForksCount().equals(other.getForksCount()))
				&& (this.getStargazersCount() == null ? other.getStargazersCount() == null : this.getStargazersCount().equals(other.getStargazersCount()))
				&& (this.getWatchersCount() == null ? other.getWatchersCount() == null : this.getWatchersCount().equals(other.getWatchersCount()))
				&& (this.getOpenIssuesCount() == null ? other.getOpenIssuesCount() == null : this.getOpenIssuesCount().equals(other.getOpenIssuesCount()))
				&& (this.getCreatedAt() == null ? other.getCreatedAt() == null : this.getCreatedAt().equals(other.getCreatedAt()))
				&& (this.getUpdatedAt() == null ? other.getUpdatedAt() == null : this.getUpdatedAt().equals(other.getUpdatedAt()))
				&& (this.getPushedAt() == null ? other.getPushedAt() == null : this.getPushedAt().equals(other.getPushedAt()))
				&& (this.getGitUrl() == null ? other.getGitUrl() == null : this.getGitUrl().equals(other.getGitUrl()))
				&& (this.getSshUrl() == null ? other.getSshUrl() == null : this.getSshUrl().equals(other.getSshUrl()))
				&& (this.getCloneUrl() == null ? other.getCloneUrl() == null : this.getCloneUrl().equals(other.getCloneUrl()))
				&& (this.getSvnUrl() == null ? other.getSvnUrl() == null : this.getSvnUrl().equals(other.getSvnUrl()))
				&& (this.getUpdateTime() == null ? other.getUpdateTime() == null : this.getUpdateTime().equals(other.getUpdateTime()));
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((getPpId() == null) ? 0 : getPpId().hashCode());
		result = prime * result + ((getAcctountName() == null) ? 0 : getAcctountName().hashCode());
		result = prime * result + ((getRepoName() == null) ? 0 : getRepoName().hashCode());
		result = prime * result + ((getLang() == null) ? 0 : getLang().hashCode());
		result = prime * result + ((getDefaultBranch() == null) ? 0 : getDefaultBranch().hashCode());
		result = prime * result + ((getHomepage() == null) ? 0 : getHomepage().hashCode());
		result = prime * result + ((getDescription() == null) ? 0 : getDescription().hashCode());
		result = prime * result + ((getFileSize() == null) ? 0 : getFileSize().hashCode());
		result = prime * result + ((getForksCount() == null) ? 0 : getForksCount().hashCode());
		result = prime * result + ((getStargazersCount() == null) ? 0 : getStargazersCount().hashCode());
		result = prime * result + ((getWatchersCount() == null) ? 0 : getWatchersCount().hashCode());
		result = prime * result + ((getOpenIssuesCount() == null) ? 0 : getOpenIssuesCount().hashCode());
		result = prime * result + ((getCreatedAt() == null) ? 0 : getCreatedAt().hashCode());
		result = prime * result + ((getUpdatedAt() == null) ? 0 : getUpdatedAt().hashCode());
		result = prime * result + ((getPushedAt() == null) ? 0 : getPushedAt().hashCode());
		result = prime * result + ((getGitUrl() == null) ? 0 : getGitUrl().hashCode());
		result = prime * result + ((getSshUrl() == null) ? 0 : getSshUrl().hashCode());
		result = prime * result + ((getCloneUrl() == null) ? 0 : getCloneUrl().hashCode());
		result = prime * result + ((getSvnUrl() == null) ? 0 : getSvnUrl().hashCode());
		result = prime * result + ((getUpdateTime() == null) ? 0 : getUpdateTime().hashCode());
		return result;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(getClass().getSimpleName());
		sb.append(" [");
		sb.append("Hash = ").append(hashCode());
		sb.append(", ppId=").append(ppId);
		sb.append(", acctountName=").append(acctountName);
		sb.append(", repoName=").append(repoName);
		sb.append(", lang=").append(lang);
		sb.append(", defaultBranch=").append(defaultBranch);
		sb.append(", homepage=").append(homepage);
		sb.append(", description=").append(description);
		sb.append(", fileSize=").append(fileSize);
		sb.append(", forksCount=").append(forksCount);
		sb.append(", stargazersCount=").append(stargazersCount);
		sb.append(", watchersCount=").append(watchersCount);
		sb.append(", openIssuesCount=").append(openIssuesCount);
		sb.append(", createdAt=").append(createdAt);
		sb.append(", updatedAt=").append(updatedAt);
		sb.append(", pushedAt=").append(pushedAt);
		sb.append(", gitUrl=").append(gitUrl);
		sb.append(", sshUrl=").append(sshUrl);
		sb.append(", cloneUrl=").append(cloneUrl);
		sb.append(", svnUrl=").append(svnUrl);
		sb.append(", updateTime=").append(updateTime);
		sb.append(", serialVersionUID=").append(serialVersionUID);
		sb.append("]");
		return sb.toString();
	}
}