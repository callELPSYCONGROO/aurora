package com.wuhenjian.aurora.taskservice.job;

import com.wuhenjian.aurora.taskservice.service.GithubRepoService;
import com.wuhenjian.aurora.utils.exception.BusinessException;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.io.IOException;

/**
 * @author 無痕剑
 * @date 2018/1/11 14:27
 */
@Component
public class GithubRepoJob {

	@Resource(name = "githubRepoService")
	private GithubRepoService githubRepoService;

	@Scheduled(cron = "0 0 4 * * ?")
	public void myGithubRepo() {
		String myGithub = "callELPSYCONGROO";
		try {
			githubRepoService.getAllRepositoriesByAccountName(myGithub);
			githubRepoService.updateRepositoriesInfo(myGithub);
		} catch (IOException | BusinessException e) {
			e.printStackTrace();
		}
	}
}
