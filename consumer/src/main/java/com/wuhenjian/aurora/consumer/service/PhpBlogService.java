package com.wuhenjian.aurora.consumer.service;

import com.wuhenjian.aurora.consumer.excphandler.PhpBlogServiceExceptionHandler;
import com.wuhenjian.aurora.utils.entity.dao.PhpBlog;
import com.wuhenjian.aurora.utils.exception.BusinessException;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
 * @author 無痕剑
 * @date 2018/2/7 22:37
 */
@Service
@FeignClient(value = "db", fallback = PhpBlogServiceExceptionHandler.class)
public interface PhpBlogService {
	String BASE_PATH = "/sql/phpBlog";

	@RequestMapping(value = BASE_PATH + "/selectById", method = RequestMethod.GET)
	PhpBlog selectByPrimaryKey(@RequestParam("id") Long id) throws BusinessException;

	@RequestMapping(value = BASE_PATH + "/selectByModel", method = RequestMethod.POST)
	List<PhpBlog> selectByModel(@RequestBody(required = false) PhpBlog m) throws BusinessException;

	@RequestMapping(value = BASE_PATH + "/update", method = RequestMethod.POST)
	void updateByPrimaryKeySelective(@RequestBody PhpBlog m) throws BusinessException;

	@RequestMapping(value = BASE_PATH + "/insert", method = RequestMethod.POST)
	void insertSelective(@RequestBody PhpBlog m) throws BusinessException;

	@RequestMapping(value = BASE_PATH + "/delete", method = RequestMethod.POST)
	void deleteByPrimaryKey(@RequestParam("id") Long id) throws BusinessException;

	@RequestMapping(value = BASE_PATH + "/selectByTitle", method = RequestMethod.GET)
	PhpBlog selectByTitle(@RequestParam("title") String title) throws BusinessException;
}
