package com.wuhenjian.aurora.consumer.service;

import com.wuhenjian.aurora.consumer.excphandler.MemberPhotoAlbumServiceExceptionHandler;
import com.wuhenjian.aurora.utils.entity.dao.MemberPhotoAlbum;
import com.wuhenjian.aurora.utils.entity.dto.ApiResult;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author 無痕剑
 * @date 2018/1/5 11:46
 */
@Service
@FeignClient(value = "db", fallback = MemberPhotoAlbumServiceExceptionHandler.class)
public interface MemberPhotoAlbumService {

	String BASE_PATH = "/sql/memberPhotoAlbum";

	@RequestMapping(value = BASE_PATH + "/delete", method = RequestMethod.POST)
	ApiResult deleteByPrimaryKey(@RequestParam("id") Long id);

	@RequestMapping(value = BASE_PATH + "/insert", method = RequestMethod.POST)
	ApiResult insertSelective(@RequestBody MemberPhotoAlbum m);

	@RequestMapping(value = BASE_PATH + "/selectById", method = RequestMethod.GET)
	ApiResult selectByPrimaryKey(@RequestParam("id") Long id);

	@RequestMapping(value = BASE_PATH + "/update", method = RequestMethod.POST)
	ApiResult updateByPrimaryKeySelective(@RequestBody MemberPhotoAlbum m);

	@RequestMapping(value = BASE_PATH + "/selectByModel", method = RequestMethod.GET)
	ApiResult selectByModel(@RequestParam MemberPhotoAlbum m);
}
