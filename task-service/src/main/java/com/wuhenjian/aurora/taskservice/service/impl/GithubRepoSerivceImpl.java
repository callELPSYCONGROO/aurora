package com.wuhenjian.aurora.taskservice.service.impl;

import com.wuhenjian.aurora.consumer.service.PhpProjectService;
import com.wuhenjian.aurora.taskservice.service.GithubRepoService;
import com.wuhenjian.aurora.utils.HtmlParserUtil;
import com.wuhenjian.aurora.utils.HttpClientUtil;
import com.wuhenjian.aurora.utils.JsonUtil;
import com.wuhenjian.aurora.utils.StringUtil;
import com.wuhenjian.aurora.utils.constant.ResultStatus;
import com.wuhenjian.aurora.utils.entity.dao.PhpProject;
import com.wuhenjian.aurora.utils.exception.BusinessException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

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

	@Value("${task.github.api-path}")
	private String apiPath;

	@Value("${task.github.base-path}")
	private String basePath;

	@Value("${task.github.param.tab}")
	private String tab;

	@Value("${task.github.param.repo}")
	private String repo;

	@Value("${task.github.param.page}")
	private String page;

	@Autowired
	private PhpProjectService phpProjectService;

	/**
	 * 通过账户名得到其下所有公开的源
	 * @param accountName 账户名
	 */
	@Override
	public void getAllRepositoriesByAccountName(String accountName) throws IOException, BusinessException {
		int currentPage = 1;
		int max = 0;
		Map<String, String> params = new HashMap<>();
		params.put(this.tab, this.repo);
		do {
			params.put(this.page, String.valueOf(currentPage));
			String url = this.basePath + accountName;
			String html = HttpClientUtil.requestGetReturnEntity(url, params);
			if (currentPage == 1) {
				max = HtmlParserUtil.getGithubRepoMaxPage(html);
			}
			List<String> repoNames = HtmlParserUtil.getGithubRepoName(html);
			for (String repoName : repoNames) {
				if (StringUtil.isBlank(repoName)) {
					throw new BusinessException(ResultStatus.REPO_NAME_EMPTY);
				}
				PhpProject phpProject = phpProjectService.selectByAcctAndRepo(accountName, repoName);
				if (phpProject != null) {
					continue;
				}
				PhpProject p = new PhpProject();
				p.setAccountName(accountName);
				p.setRepoName(repoName);
				p.setUpdateTime(new Date());
				phpProjectService.insertSelective(p);
			}
			currentPage++;
		} while (currentPage <= max);
	}

	/**
	 * 更新账户下的所有源的信息
	 * @param accountName 账户
	 */
	@Override
	public void updateRepositoriesInfo(String accountName) throws BusinessException, IOException {
		PhpProject phpProject = new PhpProject();
		phpProject.setAccountName(accountName);
		//查询该帐号下所有源
		List<PhpProject> list = phpProjectService.selectByModel(phpProject);
		for (PhpProject p : list) {
			String api = this.apiPath + accountName + "/" + p.getRepoName();
			String method = HttpClientUtil.requestGetReturnEntity(api, null);
			p = JsonUtil.json2PhpProjectObj(method, p);
			p.setUpdateTime(new Date());
			phpProjectService.updateByPrimaryKeySelective(p);
		}
	}
}
