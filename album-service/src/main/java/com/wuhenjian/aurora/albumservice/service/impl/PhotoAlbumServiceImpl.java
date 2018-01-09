package com.wuhenjian.aurora.albumservice.service.impl;

import com.wuhenjian.aurora.albumservice.service.MemberPhotoAlbumPictureService;
import com.wuhenjian.aurora.albumservice.service.MemberPhotoAlbumService;
import com.wuhenjian.aurora.albumservice.service.PhotoAlbumService;
import com.wuhenjian.aurora.albumservice.service.ZimgService;
import com.wuhenjian.aurora.utils.ApiResultUtil;
import com.wuhenjian.aurora.utils.constant.ResultStatus;
import com.wuhenjian.aurora.utils.entity.dao.MemberPhotoAlbum;
import com.wuhenjian.aurora.utils.entity.dao.MemberPhotoAlbumPicture;
import com.wuhenjian.aurora.utils.entity.dto.ApiResult;
import com.wuhenjian.aurora.utils.entity.vo.MemberPhotoAlbumInfo;
import com.wuhenjian.aurora.utils.entity.vo.MemberPhotoAlbumPictureInfo;
import com.wuhenjian.aurora.utils.exception.BusinessException;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.*;

/**
 * @author 無痕剑
 * @date 2018/1/5 13:25
 */
@Service("photoAlbumService")
public class PhotoAlbumServiceImpl implements PhotoAlbumService {

	@Resource(name = "memberPhotoAlbumService")
	private MemberPhotoAlbumService mpaService;

	@Resource(name = "memberPhotoAlbumPictureService")
	private MemberPhotoAlbumPictureService mpapService;

	@Resource(name = "zimgService")
	private ZimgService zimgService;

	/**
	 * 创建相册
	 * @param mpa 相册
	 */
	public void createAlbum(MemberPhotoAlbum mpa) throws BusinessException {
		ApiResult apiResult = mpaService.insertSelective(mpa);
		ApiResultUtil.isSuccess(apiResult);
	}

	/**
	 * 上传照片
	 * @param maId 用户id
	 * @param mpaId 相册id
	 * @param params 照片集合
	 */
	@Override
	public void uploadPicture(Long maId, Long mpaId, Map<String, Map<String, Object>> params) throws BusinessException {
		ApiResult r1 = mpaService.selectByPrimaryKey(mpaId);
		MemberPhotoAlbum mpa = (MemberPhotoAlbum) ApiResultUtil.getObject(r1);
		if (mpa == null) {
			throw new BusinessException(ResultStatus.MEMBER_ALBUM_NON_EXISTENT);
		}
		if (!mpa.getMaId().equals(maId)) {
			throw new BusinessException(ResultStatus.ALBUM_NOT_BELONG_WITH_MEMBER);
		}
		//上传图片
		ApiResult r2 = zimgService.upload(params);
		List<String> list = (List<String>) ApiResultUtil.getObject(r2);
		if (list == null || list.isEmpty()) {
			throw new BusinessException(ResultStatus.UPLOAD_IMG_FAIL);
		}
		MemberPhotoAlbumPicture mpap = new MemberPhotoAlbumPicture();
		mpap.setMaId(maId);
		mpap.setMpaId(mpaId);
		Date time = new Date();
		mpap.setCreateTime(time);
		mpap.setUpdateTime(time);
		for (String md5 : list) {
			mpap.setRelativePath("/" + md5);
			mpap.setSort((Integer) params.get("file").get("fileSort"));
			ApiResult r3 = mpapService.insertSelective(mpap);
			ApiResultUtil.isSuccess(r3);
		}
		mpa.setNum(mpa.getNum() + list.size());
		mpa.setUpdateTime(time);
		ApiResult r4 = mpaService.updateByPrimaryKeySelective(mpa);
		ApiResultUtil.isSuccess(r4);
	}

	/**
	 * 查看相册
	 * @param mpaId 相册id
	 * @return 相册信息
	 */
	@Override
	public MemberPhotoAlbumInfo viewAlbum(Long maId, Long mpaId) throws BusinessException {
		ApiResult r1 = mpaService.selectByPrimaryKey(mpaId);
		MemberPhotoAlbum mpa = (MemberPhotoAlbum) ApiResultUtil.getObject(r1);
		if (!mpa.getMaId().equals(maId)) {
			throw new BusinessException(ResultStatus.MEMBER_ALBUM_NON_EXISTENT);
		}
		MemberPhotoAlbumPicture mpap = new MemberPhotoAlbumPicture();
		mpap.setMpaId(mpaId);
		ApiResult r2 = mpapService.selectByModel(mpap, null);
		List<MemberPhotoAlbumPicture> pictureList = (List<MemberPhotoAlbumPicture>) ApiResultUtil.getObject(r2);
		MemberPhotoAlbumInfo mpaInfo = new MemberPhotoAlbumInfo();
		mpaInfo.setTitle(mpa.getTitle());
		mpaInfo.setDes(mpa.getDes());
		mpaInfo.setModel(mpa.getModel());
		mpaInfo.setNum(mpa.getNum());
		mpaInfo.setUpdateTime(mpa.getUpdateTime());
		mpaInfo.setCreateTime(mpa.getCreateTime());
		List<MemberPhotoAlbumPictureInfo> pictureInfoList = new ArrayList<>();
		for (MemberPhotoAlbumPicture p : pictureList) {
			MemberPhotoAlbumPictureInfo i = new MemberPhotoAlbumPictureInfo();
			i.setRelativePath(p.getRelativePath());
			i.setSort(p.getSort());
			i.setCreateTime(p.getCreateTime());
			i.setUpdateTime(p.getUpdateTime());
			pictureInfoList.add(i);
		}
		mpaInfo.setPictureInfoList(pictureInfoList);
		return mpaInfo;
	}
}
