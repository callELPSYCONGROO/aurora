package com.wuhenjian.aurora.consumer.service;

import com.wuhenjian.aurora.consumer.excphandler.MemberPhotoAlbumPictureServiceExceptionHandler;
import com.wuhenjian.aurora.utils.entity.dao.MemberPhotoAlbumPicture;
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
 * @date 2018/1/5 11:47
 */
@Service
@FeignClient(value = "db", fallback = MemberPhotoAlbumPictureServiceExceptionHandler.class)
public interface MemberPhotoAlbumPictureService {

	String BASE_PATH = "/sql/memberPhotoAlbumPicture";

	@RequestMapping(value = BASE_PATH + "/delete", method = RequestMethod.POST)
	void deleteByPrimaryKey(@RequestParam("id") Long id) throws BusinessException;

	@RequestMapping(value = BASE_PATH + "/insert", method = RequestMethod.POST)
	void insertSelective(@RequestBody MemberPhotoAlbumPicture m) throws BusinessException;

	@RequestMapping(value = BASE_PATH + "/selectById", method = RequestMethod.GET)
	MemberPhotoAlbumPicture selectByPrimaryKey(@RequestParam("id") Long id) throws BusinessException;

	@RequestMapping(value = BASE_PATH + "/update", method = RequestMethod.POST)
	void updateByPrimaryKeySelective(@RequestBody MemberPhotoAlbumPicture m) throws BusinessException;

	@RequestMapping(value = BASE_PATH + "/selectByModel", method = RequestMethod.GET)
	List<MemberPhotoAlbumPicture> selectByModel(@RequestParam MemberPhotoAlbumPicture m) throws BusinessException;
}
