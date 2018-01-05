package com.wuhenjian.aurora.db.controller.sql;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.wuhenjian.aurora.db.mapper.sql.MemberPhotoAlbumMapper;
import com.wuhenjian.aurora.db.mapper.sql.MemberPhotoAlbumPictureMapper;
import com.wuhenjian.aurora.utils.entity.Page;
import com.wuhenjian.aurora.utils.entity.dao.MemberPhotoAlbumPicture;
import com.wuhenjian.aurora.utils.entity.dao.MemberPhotoAlbumPictureCriteria;
import com.wuhenjian.aurora.utils.entity.result.ApiResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author 無痕剑
 * @date 2018/1/5 10:37
 */
@RestController
@RequestMapping(AbstractSqlBaseController.BASE_PATH + "/memberPhotoAlbumPicture")
public class MemberPhotoAlbumPictureController extends AbstractSqlBaseController<MemberPhotoAlbumPicture,MemberPhotoAlbumPictureCriteria> {

	@Resource(name = "memberPhotoAlbumPictureMapper")
	private MemberPhotoAlbumPictureMapper mapper;

	@Override
	public ApiResult deleteByPrimaryKey(Long id) {
		mapper.deleteByPrimaryKey(id);
		return ApiResult.success();
	}

	@Override
	public ApiResult insertSelective(MemberPhotoAlbumPicture record) {
		mapper.insertSelective(record);
		return ApiResult.success(record);
	}

	@Override
	public ApiResult selectByCriteria(MemberPhotoAlbumPictureCriteria criteria, Page page) {
		if (page != null && !page.isNull()) {
			PageHelper.startPage(page.getNum(), page.getSize(), page.getOrderBy());
		}
		List<MemberPhotoAlbumPicture> list = mapper.selectByCriteria(criteria);
		if (page != null && !page.isNull()) {
			PageInfo<MemberPhotoAlbumPicture> pageInfo = new PageInfo<>(list);
			return ApiResult.success(pageInfo);
		} else {
			return ApiResult.success(list);
		}
	}

	@Override
	public ApiResult selectByPrimaryKey(Long id) {
		MemberPhotoAlbumPicture m = mapper.selectByPrimaryKey(id);
		return ApiResult.success(m);
	}

	@Override
	public ApiResult updateByPrimaryKeySelective(MemberPhotoAlbumPicture record) {
		mapper.updateByPrimaryKeySelective(record);
		return ApiResult.success();
	}

	@Override
	public ApiResult selectByModel(MemberPhotoAlbumPicture model, Page page) {
		if (page != null && !page.isNull()) {
			PageHelper.startPage(page.getNum(), page.getSize(), page.getOrderBy());
		}
		List<MemberPhotoAlbumPicture> list = mapper.selectByModel(model);
		if (page != null && !page.isNull()) {
			PageInfo<MemberPhotoAlbumPicture> pageInfo = new PageInfo<>(list);
			return ApiResult.success(pageInfo);
		} else {
			return ApiResult.success(list);
		}
	}
}