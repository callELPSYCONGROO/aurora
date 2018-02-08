package com.wuhenjian.aurora.taskservice.job;

import com.wuhenjian.aurora.taskservice.service.GithubRepoService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * @author 無痕剑
 * @date 2018/1/11 14:27
 */
@Component
public class GithubRepoJob {

	@Value("${task.github.my}")
	private String myGithub;

	@Resource(name = "githubRepoService")
	private GithubRepoService githubRepoService;

	@Scheduled(cron = "0 0 4 * * ?")
	public void myGithubRepo() {
		try {
			githubRepoService.getAllRepositoriesByAccountName(this.myGithub);
			githubRepoService.updateRepositoriesInfo(this.myGithub);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
