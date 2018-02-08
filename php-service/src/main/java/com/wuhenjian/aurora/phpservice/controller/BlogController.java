package com.wuhenjian.aurora.phpservice.controller;

import com.wuhenjian.aurora.consumer.service.PhpBlogService;
import com.wuhenjian.aurora.utils.entity.dao.PhpBlog;
import com.wuhenjian.aurora.utils.entity.dto.ApiResult;
import com.wuhenjian.aurora.utils.entity.vo.PhpBlogVo;
import com.wuhenjian.aurora.utils.exception.BusinessException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author 無痕剑
 * @date 2018/2/8 15:00
 */
@RestController
@RequestMapping("/blog")
public class BlogController {

	@Autowired
	private PhpBlogService phpBlogService;

	@RequestMapping(value = "getBlogList", method = RequestMethod.GET)
	public ApiResult getBlogList(Integer num, Integer size) throws BusinessException {
		int pageNum = num == null || num <= 0 ? 1 : num;
		int pageSize = size == null || size <= 0 ? 15 : size;
		PhpBlog phpBlog = new PhpBlog();
		phpBlog.setNum(pageNum);
		phpBlog.setSize(pageSize);
		phpBlog.setOrderBy("viewCount DESC");
		List<PhpBlogVo> list = phpBlogService.selectForVo(phpBlog);
		return ApiResult.success(list);
	}
}
