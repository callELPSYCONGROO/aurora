package com.wuhenjian.aurora.albumservice.excphandler;

import com.wuhenjian.aurora.albumservice.service.MemberPhotoAlbumPictureService;
import com.wuhenjian.aurora.utils.constant.ResultStatus;
import com.wuhenjian.aurora.utils.entity.Page;
import com.wuhenjian.aurora.utils.entity.dao.MemberPhotoAlbumPicture;
import com.wuhenjian.aurora.utils.entity.dao.MemberPhotoAlbumPictureCriteria;
import com.wuhenjian.aurora.utils.entity.result.ApiResult;
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
	public ApiResult insertSelective(MemberPhotoAlbumPicture record) {
		return this.exceptionResult();
	}

	@Override
	public ApiResult selectByCriteria(MemberPhotoAlbumPictureCriteria criteria, Page page) {
		return this.exceptionResult();
	}

	@Override
	public ApiResult selectByPrimaryKey(Long id) {
		return this.exceptionResult();
	}

	@Override
	public ApiResult updateByPrimaryKeySelective(MemberPhotoAlbumPicture record) {
		return this.exceptionResult();
	}

	@Override
	public ApiResult selectByModel(MemberPhotoAlbumPicture model, Page page) {
		return this.exceptionResult();
	}

	private ApiResult exceptionResult() {
		return ApiResult.fail(ResultStatus.REMOTE_SERVICE_EXCEPTION);
	}
}
