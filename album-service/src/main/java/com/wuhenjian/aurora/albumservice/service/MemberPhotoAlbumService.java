package com.wuhenjian.aurora.albumservice.service;

import com.wuhenjian.aurora.albumservice.excphandler.MemberPhotoAlbumServiceExceptionHandler;
import com.wuhenjian.aurora.utils.entity.Page;
import com.wuhenjian.aurora.utils.entity.dao.MemberPhotoAlbum;
import com.wuhenjian.aurora.utils.entity.dao.MemberPhotoAlbumCriteria;
import com.wuhenjian.aurora.utils.entity.result.ApiResult;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author 無痕剑
 * @date 2018/1/5 11:46
 */
@Service
@FeignClient(value = "db", fallback = MemberPhotoAlbumServiceExceptionHandler.class)
public interface MemberPhotoAlbumService {

	String BASE_PATH = "/sql/memberPhotoAlbum";

	@RequestMapping(value = BASE_PATH + "/delete", method = RequestMethod.POST)
	ApiResult deleteByPrimaryKey(Long id);

	@RequestMapping(value = BASE_PATH + "/insert", method = RequestMethod.POST)
	ApiResult insertSelective(MemberPhotoAlbum record);

	@RequestMapping(value = BASE_PATH + "/selectByQuery", method = RequestMethod.GET)
	ApiResult selectByCriteria(MemberPhotoAlbumCriteria criteria, Page page);

	@RequestMapping(value = BASE_PATH + "/selectById", method = RequestMethod.GET)
	ApiResult selectByPrimaryKey(Long id);

	@RequestMapping(value = BASE_PATH + "/update", method = RequestMethod.POST)
	ApiResult updateByPrimaryKeySelective(MemberPhotoAlbum record);

	@RequestMapping(value = BASE_PATH + "/selectByModel", method = RequestMethod.GET)
	ApiResult selectByModel(MemberPhotoAlbum model, Page page);
}
