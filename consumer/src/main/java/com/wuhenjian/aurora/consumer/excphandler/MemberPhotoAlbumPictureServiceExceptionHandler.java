package com.wuhenjian.aurora.consumer.excphandler;

import com.wuhenjian.aurora.consumer.service.MemberPhotoAlbumPictureService;
import com.wuhenjian.aurora.utils.constant.ResultStatus;
import com.wuhenjian.aurora.utils.entity.dao.MemberPhotoAlbumPicture;
import com.wuhenjian.aurora.utils.exception.BusinessException;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author 無痕剑
 * @date 2018/1/5 11:47
 */
@Component("memberPhotoAlbumPictureServiceExceptionHandler")
public class MemberPhotoAlbumPictureServiceExceptionHandler implements MemberPhotoAlbumPictureService {
	@Override
	public int deleteByPrimaryKey(Long id) throws BusinessException {
		throw new BusinessException(ResultStatus.REMOTE_SERVICE_EXCEPTION);
	}

	@Override
	public int insertSelective(MemberPhotoAlbumPicture m) throws BusinessException {
		throw new BusinessException(ResultStatus.REMOTE_SERVICE_EXCEPTION);
	}

	@Override
	public MemberPhotoAlbumPicture selectByPrimaryKey(Long id) throws BusinessException {
		throw new BusinessException(ResultStatus.REMOTE_SERVICE_EXCEPTION);
	}

	@Override
	public int updateByPrimaryKeySelective(MemberPhotoAlbumPicture m) throws BusinessException {
		throw new BusinessException(ResultStatus.REMOTE_SERVICE_EXCEPTION);
	}

	@Override
	public List<MemberPhotoAlbumPicture> selectByModel(MemberPhotoAlbumPicture m) throws BusinessException {
		throw new BusinessException(ResultStatus.REMOTE_SERVICE_EXCEPTION);
	}
}
