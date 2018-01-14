package com.wuhenjian.aurora.consumer.excphandler;

import com.wuhenjian.aurora.consumer.service.MemberPhotoAlbumPictureService;
import com.wuhenjian.aurora.utils.constant.ResultStatus;
import com.wuhenjian.aurora.utils.entity.dao.MemberPhotoAlbumPicture;
import com.wuhenjian.aurora.utils.entity.dto.ApiResult;
import org.springframework.stereotype.Component;

/**
 * @author 無痕剑
 * @date 2018/1/5 11:47
 */
@Component("memberPhotoAlbumPictureServiceExceptionHandler")
public class MemberPhotoAlbumPictureServiceExceptionHandler implements MemberPhotoAlbumPictureService {
	@Override
	public ApiResult deleteByPrimaryKey(Long id) {
		return this.exceptionResult();
	}

	@Override
	public ApiResult insertSelective(MemberPhotoAlbumPicture m) {
		return this.exceptionResult();
	}

	@Override
	public ApiResult selectByPrimaryKey(Long id) {
		return null;
	}

	@Override
	public ApiResult updateByPrimaryKeySelective(MemberPhotoAlbumPicture m) {
		return null;
	}

	@Override
	public ApiResult selectByModel(MemberPhotoAlbumPicture m) {
		return null;
	}

	private ApiResult exceptionResult() {
		return ApiResult.fail(ResultStatus.REMOTE_SERVICE_EXCEPTION);
	}
}
