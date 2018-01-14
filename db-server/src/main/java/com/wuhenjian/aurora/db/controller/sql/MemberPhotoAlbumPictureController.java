package com.wuhenjian.aurora.db.controller.sql;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.wuhenjian.aurora.db.mapper.sql.MemberPhotoAlbumPictureMapper;
import com.wuhenjian.aurora.utils.BeanUtil;
import com.wuhenjian.aurora.utils.constant.ResultStatus;
import com.wuhenjian.aurora.utils.entity.bo.Page;
import com.wuhenjian.aurora.utils.entity.dao.MemberPhotoAlbumPicture;
import com.wuhenjian.aurora.utils.entity.dto.ApiResult;
import com.wuhenjian.aurora.utils.exception.BusinessException;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * @author 無痕剑
 * @date 2018/1/5 10:37
 */
@RestController
@RequestMapping(AbstractSqlBaseController.BASE_PATH + "/memberPhotoAlbumPicture")
public class MemberPhotoAlbumPictureController extends AbstractSqlBaseController<MemberPhotoAlbumPicture> {

	@Resource(name = "memberPhotoAlbumPictureMapper")
	private MemberPhotoAlbumPictureMapper mapper;

	@Override
	public ApiResult deleteByPrimaryKey(Long id) {
		mapper.deleteByPrimaryKey(id);
		return ApiResult.success();
	}

	@Override
	public ApiResult insertSelective(MemberPhotoAlbumPicture m) {
		mapper.insertSelective(m);
		return ApiResult.success(m);
	}

	@Override
	public ApiResult selectByPrimaryKey(Long id) {
		MemberPhotoAlbumPicture m = mapper.selectByPrimaryKey(id);
		return ApiResult.success(m);
	}

	@Override
	public ApiResult updateByPrimaryKeySelective(MemberPhotoAlbumPicture m) {
		mapper.updateByPrimaryKeySelective(m);
		return ApiResult.success(m);
	}

	@Override
	public ApiResult selectByModel(MemberPhotoAlbumPicture m) throws BusinessException {
		boolean pageFlag = !m.isNullPage();
		if (pageFlag) {
			PageHelper.startPage(m.getNum(), m.getSize(), m.getOrderBy());
		}
		List<MemberPhotoAlbumPicture> list = mapper.selectByModel(m);
		if (pageFlag) {
			PageInfo<MemberPhotoAlbumPicture> pageInfo = new PageInfo<>(list);
			return ApiResult.success(pageInfo);
		} else {
			return ApiResult.success(list);
		}
	}
}