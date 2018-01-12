package com.wuhenjian.aurora.taskservice.service.impl;

import com.wuhenjian.aurora.taskservice.service.GithubRepoService;
import com.wuhenjian.aurora.taskservice.service.PhpProjectService;
import com.wuhenjian.aurora.utils.*;
import com.wuhenjian.aurora.utils.constant.ResultStatus;
import com.wuhenjian.aurora.utils.entity.dao.PhpProject;
import com.wuhenjian.aurora.utils.entity.dto.ApiResult;
import com.wuhenjian.aurora.utils.exception.BusinessException;
import org.springframework.beans.factory.annotation.Autowired;
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
		params.put(TAB, REPO);
		do {
			params.put(PAGE, String.valueOf(currentPage));
			String url = BASE_PATH + accountName;
			String html = HttpClientUtil.getMethod(url, params);
			if (currentPage == 1) {
				max = HtmlParserUtil.getGithubRepoMaxPage(html);
			}
			List<String> repoNames = HtmlParserUtil.getGithubRepoName(html);
			for (String repoName : repoNames) {
				if (StringUtil.isBlank(repoName)) {
					throw new BusinessException(ResultStatus.REPO_NAME_EMPTY);
				}
				ApiResult r1 = phpProjectService.selectByAcctAndRepo(accountName, repoName);
				Object object = ApiResultUtil.getObject(r1);
				if (object != null) {
					continue;
				}
				PhpProject p = new PhpProject();
				p.setAcctountName(accountName);
				p.setRepoName(repoName);
				p.setUpdateTime(new Date());
				ApiResult r2 = phpProjectService.insertSelective(p);
				ApiResultUtil.isSuccess(r2);
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
		phpProject.setAcctountName(accountName);
		//查询该帐号下所有源
		ApiResult r1 = phpProjectService.selectByModel(phpProject, null);
		List<PhpProject> list = (List<PhpProject>) ApiResultUtil.getObject(r1);
		for (PhpProject p : list) {
			String api = API_PATH + accountName + "/" + p.getRepoName();
			String method = HttpClientUtil.getMethod(api, null);
			p = JsonUtil.json2PhpProjectObj(method, p);
			p.setUpdateTime(new Date());
			ApiResult r2 = phpProjectService.updateByPrimaryKeySelective(p);
			ApiResultUtil.isSuccess(r2);
		}
	}
}
