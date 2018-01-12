package com.wuhenjian.aurora.albumservice.service;

import com.wuhenjian.aurora.albumservice.excphandler.MemberPhotoAlbumPictureServiceExceptionHandler;
import com.wuhenjian.aurora.utils.entity.bo.Page;
import com.wuhenjian.aurora.utils.entity.dao.MemberPhotoAlbumPicture;
import com.wuhenjian.aurora.utils.entity.dao.MemberPhotoAlbumPictureCriteria;
import com.wuhenjian.aurora.utils.entity.dto.ApiResult;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author 無痕剑
 * @date 2018/1/5 11:47
 */
@Service
@FeignClient(value = "db", fallback = MemberPhotoAlbumPictureServiceExceptionHandler.class)
public interface MemberPhotoAlbumPictureService {

	String BASE_PATH = "/sql/memberPhotoAlbumPicture";

	@RequestMapping(value = BASE_PATH + "/delete", method = RequestMethod.POST)
	ApiResult deleteByPrimaryKey(@RequestParam("id") Long id);

	@RequestMapping(value = BASE_PATH + "/insert", method = RequestMethod.POST)
	ApiResult insertSelective(MemberPhotoAlbumPicture record);

	@RequestMapping(value = BASE_PATH + "/selectByQuery", method = RequestMethod.GET)
	ApiResult selectByCriteria(@RequestParam("criteria") MemberPhotoAlbumPictureCriteria criteria, @RequestParam("page") Page page);

	@RequestMapping(value = BASE_PATH + "/selectById", method = RequestMethod.GET)
	ApiResult selectByPrimaryKey(@RequestParam("id") Long id);

	@RequestMapping(value = BASE_PATH + "/update", method = RequestMethod.POST)
	ApiResult updateByPrimaryKeySelective(MemberPhotoAlbumPicture record);

	@RequestMapping(value = BASE_PATH + "/selectByModel", method = RequestMethod.GET)
	ApiResult selectByModel(@RequestParam("model") MemberPhotoAlbumPicture model, @RequestParam("page") Page page);
}
