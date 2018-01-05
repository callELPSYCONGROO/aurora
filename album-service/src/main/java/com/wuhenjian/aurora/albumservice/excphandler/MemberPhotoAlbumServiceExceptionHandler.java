package com.wuhenjian.aurora.albumservice.excphandler;

import com.wuhenjian.aurora.albumservice.service.MemberPhotoAlbumService;
import com.wuhenjian.aurora.utils.constant.ResultStatus;
import com.wuhenjian.aurora.utils.entity.Page;
import com.wuhenjian.aurora.utils.entity.dao.MemberPhotoAlbum;
import com.wuhenjian.aurora.utils.entity.dao.MemberPhotoAlbumCriteria;
import com.wuhenjian.aurora.utils.entity.result.ApiResult;
import org.springframework.stereotype.Component;

/**
 * @author 無痕剑
 * @date 2018/1/5 11:49
 */
@Component("memberPhotoAlbumServiceExceptionHandler")
public class MemberPhotoAlbumServiceExceptionHandler implements MemberPhotoAlbumService {
	@Override
	public ApiResult deleteByPrimaryKey(Long id) {
		return this.exceptionResult();
	}

	@Override
	public ApiResult insertSelective(MemberPhotoAlbum record) {
		return this.exceptionResult();
	}

	@Override
	public ApiResult selectByCriteria(MemberPhotoAlbumCriteria criteria, Page page) {
		return this.exceptionResult();
	}

	@Override
	public ApiResult selectByPrimaryKey(Long id) {
		return this.exceptionResult();
	}

	@Override
	public ApiResult updateByPrimaryKeySelective(MemberPhotoAlbum record) {
		return this.exceptionResult();
	}

	@Override
	public ApiResult selectByModel(MemberPhotoAlbum model, Page page) {
		return this.exceptionResult();
	}

	private ApiResult exceptionResult() {
		return ApiResult.fail(ResultStatus.REMOTE_SERVICE_EXCEPTION);
	}
}
