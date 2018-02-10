package com.wuhenjian.aurora.taskservice.service.impl;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.wuhenjian.aurora.consumer.service.PhpBlogService;
import com.wuhenjian.aurora.taskservice.service.CsdnApiService;
import com.wuhenjian.aurora.utils.HttpClientUtil;
import com.wuhenjian.aurora.utils.JsonUtil;
import com.wuhenjian.aurora.utils.StringUtil;
import com.wuhenjian.aurora.utils.entity.dao.PhpBlog;
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
 * @date 2018/2/7 21:00
 */
@Service("csdnApiService")
public class CsdnApiServiceImpl implements CsdnApiService {

	@Value("${task.csdn.api-path}")
	private String apiPath;

	@Autowired
	private PhpBlogService phpBlogService;

	@Override
	public String oauth2Authorize(String path, Map<String, String> params) throws IOException, BusinessException {
		String url = this.apiPath + path;
		String content = HttpClientUtil.requestGetReturnEntity(url, params);
		JSONObject jsonObject = JSON.parseObject(content);
		String accessToken = jsonObject.getString("access_token");
		if (StringUtil.isBlank(accessToken)) {
			Integer errorCode = jsonObject.getInteger("error_code");
			String errorMsg = jsonObject.getString("error");
			throw new BusinessException(errorCode, errorMsg);
		}
		return accessToken;
	}

	@Override
	public void saveAllBlog(String path, String accessToken) throws IOException, BusinessException {
		String url = this.apiPath + path;
		int page = 1;
		while (true) {
			List<PhpBlog> list = this.getBlogByPage(url, accessToken, page);
			if (list == null || list.isEmpty()) {
				break;
			}
			for (PhpBlog phpBlog : list) {
				phpBlog.setUpdateTime(new Date());
				PhpBlog blog = phpBlogService.selectByTitle(phpBlog.getTitle());
				if (blog != null) {
					phpBlog.setPbId(blog.getPbId());
					phpBlogService.updateByPrimaryKeySelective(phpBlog);
				} else {
					phpBlogService.insertSelective(phpBlog);
				}
			}
			page++;
		}
	}

	/**
	 * CSDN接口分页查询博客
	 * @param url 接口URL
	 * @param accessToken access_token
	 * @param page 页数
	 * @return 结果集
	 * @throws IOException 系统异常
	 * @throws BusinessException API接口异常
	 */
	private List<PhpBlog> getBlogByPage(String url, String accessToken, int page) throws IOException, BusinessException {
		Map<String, String> params = new HashMap<>();
		params.put("access_token", accessToken);
		params.put("page", String.valueOf(page));
		String content = HttpClientUtil.requestGetReturnEntity(url, params);
		JSONObject jsonObject = JSON.parseObject(content);
		Integer errorCode = jsonObject.getInteger("error_code");
		if (errorCode != null) {
			String errorMsg = jsonObject.getString("error");
			throw new BusinessException(errorCode, errorMsg);
		}
		Boolean status = jsonObject.getBoolean("status");
		if (status != null) {
			return null;
		}
		JSONArray jsonArray = jsonObject.getJSONArray("list");
		return jsonArray.toJavaList(PhpBlog.class);
	}

	/**
	 * 更新博客内容详情
	 * @param path 请求路径
	 * @param accessToken access_token
	 */
	@Override
	public void updateAllBlogDetail(String path, String accessToken) throws IOException, BusinessException {
		// 获取所有博客
		List<PhpBlog> list = phpBlogService.selectByModel(new PhpBlog());
		String url = this.apiPath + path;
		Map<String, String> params = new HashMap<>();
		params.put("access_token", accessToken);
		for (PhpBlog p : list) {
			params.put("id", String.valueOf(p.getCsdnId()));
			String entity = HttpClientUtil.requestGetReturnEntity(url, params);
			JSONObject jsonObject = JSON.parseObject(entity);
			Integer errorCode = jsonObject.getInteger("error_code");
			if (errorCode != null) {
				String errorMsg = jsonObject.getString("error");
				throw new BusinessException(errorCode, errorMsg);
			}
			Long id = jsonObject.getLong("id");
			if (id == null) {
				continue;
			}
			PhpBlog phpBlog = JsonUtil.json2Obj(entity, PhpBlog.class);
			p.setCategories(phpBlog.getCategories());
			p.setTags(phpBlog.getTags());
			p.setContent(phpBlog.getContent());
			p.setUpdateTime(new Date());
			phpBlogService.updateByPrimaryKeySelective(p);
		}
	}
}
