package com.wuhenjian.aurora.albumservice.service;

import com.wuhenjian.aurora.utils.entity.dao.MemberPhotoAlbum;
import com.wuhenjian.aurora.utils.entity.vo.MemberPhotoAlbumInfo;
import com.wuhenjian.aurora.utils.exception.BusinessException;

import java.util.Map;

/**
 * @author 無痕剑
 * @date 2018/1/5 13:25
 */
public interface PhotoAlbumService {
	/**
	 * 创建相册
	 * @param mpa 相册
	 */
	void createAlbum(MemberPhotoAlbum mpa) throws BusinessException;

	/**
	 * 上传照片
	 * @param maId 用户id
	 * @param mpaId 相册id
	 * @param params 照片集合
	 */
	void uploadPicture(Long maId, Long mpaId, Map<String, Map<String, Object>> params) throws BusinessException;

	/**
	 * 查看相册
	 * @param maId 用户id
	 * @param mpaId 相册id
	 * @return 相册信息
	 */
	MemberPhotoAlbumInfo viewAlbum(Long maId, Long mpaId) throws BusinessException;
}
