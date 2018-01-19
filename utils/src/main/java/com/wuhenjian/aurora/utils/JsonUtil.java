package com.wuhenjian.aurora.utils;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.wuhenjian.aurora.utils.entity.dao.PhpProject;

import java.util.Date;

/**
 * Json工具
 * @author 無痕剑
 * @date 2017/12/5 12:29
 */
public class JsonUtil {

	private JsonUtil() {}

	/**
	 * 将对象转换为Json字符串
	 * @param obj 对象
	 * @return Json字符串
	 */
	public static String obj2Json(Object obj) {
		return JSON.toJSONString(obj);
	}

	/**
	 * 将Json字符串转换成对象
	 * @param jsonString json字符串
	 * @param cla 对象类型
	 * @return 对象
	 */
	public static <T> T json2Obj(String jsonString, Class<T> cla) {
		return JSON.parseObject(jsonString, cla);
	}

	/**
	 * 将Json字符串转换成Object对象
	 * @param jsonString json字符串
	 * @return 对象
	 */
	public static Object json2Obj(String jsonString) {
		return JSON.parseObject(jsonString);
	}

	public static PhpProject json2PhpProjectObj(String jsonString, PhpProject p) {
		JSONObject jsonObject = JSON.parseObject(jsonString);
		String repoName = jsonObject.getString("name");
		String description = jsonObject.getString("description");
		String lang = jsonObject.getString("language");
		String defaultBranch = jsonObject.getString("default_branch");
		String homepage = jsonObject.getString("html_url");
		Integer fileSize = jsonObject.getInteger("size");
		Integer forksCount = jsonObject.getInteger("forks_count");
		Integer stargazersCount = jsonObject.getInteger("stargazers_count");
		Integer watchersCount = jsonObject.getInteger("watchers_count");
		Integer openIssuesCount = jsonObject.getInteger("open_issues_count");
		Date createdAt = jsonObject.getDate("created_at");
		Date updatedAt = jsonObject.getDate("updated_at");
		Date pushAt = jsonObject.getDate("push_at");
		String svnUrl = jsonObject.getString("svn_url");
		String sshUrl = jsonObject.getString("ssh_url");
		String cloneUrl = jsonObject.getString("clone_url");
		String gitUrl = jsonObject.getString("git_url");
		p.setRepoName(repoName);
		p.setCloneUrl(cloneUrl);
		p.setSshUrl(sshUrl);
		p.setSvnUrl(svnUrl);
		p.setGitUrl(gitUrl);
		p.setWatchersCount(watchersCount);
		p.setOpenIssuesCount(openIssuesCount);
		p.setStargazersCount(stargazersCount);
		p.setForksCount(forksCount);
		p.setFileSize(fileSize);
		p.setCreatedAt(createdAt);
		p.setPushedAt(pushAt);
		p.setUpdatedAt(updatedAt);
		p.setHomepage(homepage);
		p.setLang(lang);
		p.setDefaultBranch(defaultBranch);
		p.setDescription(description);
		return p;
	}
}
