package com.wuhenjian.aurora.taskservice.service.impl;

import com.wuhenjian.aurora.taskservice.service.GithubRepoService;
import com.wuhenjian.aurora.taskservice.service.PhpProjectService;
import com.wuhenjian.aurora.utils.HtmlParserUtil;
import com.wuhenjian.aurora.utils.HttpClientUtil;
import com.wuhenjian.aurora.utils.entity.dao.PhpProject;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.io.IOException;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author 無痕剑
 * @date 2018/1/11 14:29
 */
@Service("githubRepoService")
public class GithubRepoSerivceImpl implements GithubRepoService {

	@Resource(name = "phpProjectService")
	private PhpProjectService phpProjectService;

	/**
	 * 通过账户名得到其下所有公开的源
	 * @param accountName 账户名
	 */
	@Override
	public void getAllRepositoriesByAccountName(String accountName) throws IOException {
		int currentPage = 1;
		int max = 0;
		Map<String, String> params = new HashMap<>();
		params.put(GithubRepoService.TAB, GithubRepoService.REPO);
		do {
			params.put(GithubRepoService.PAGE, String.valueOf(currentPage));
			String url = GithubRepoService.BASE_PATH + accountName;
			String html = HttpClientUtil.getMethod(url, params);
			if (currentPage == 1) {
				max = HtmlParserUtil.getGithubRepoMaxPage(html);
			}
			List<String> repoNames = HtmlParserUtil.getGithubRepoName(html);
			for (String repoName : repoNames) {
				PhpProject p = new PhpProject();
				p.setAcctountName(accountName);
				p.setRepoName(repoName);
				p.setUpdateTime(new Date());
				phpProjectService.insertSelective(p);
			}
			currentPage++;
		} while (currentPage <= max);
	}
}
