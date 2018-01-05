package com.wuhenjian.aurora.db.controller.sql;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.wuhenjian.aurora.db.mapper.sql.MemberPhotoAlbumMapper;
import com.wuhenjian.aurora.utils.entity.Page;
import com.wuhenjian.aurora.utils.entity.dao.MemberPhotoAlbum;
import com.wuhenjian.aurora.utils.entity.dao.MemberPhotoAlbumCriteria;
import com.wuhenjian.aurora.utils.entity.result.ApiResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author 無痕剑
 * @date 2018/1/5 10:28
 */
@RestController
@RequestMapping(AbstractSqlBaseController.BASE_PATH + "/memberPhotoAlbum")
public class MemberPhotoAlbumController extends AbstractSqlBaseController<MemberPhotoAlbum,MemberPhotoAlbumCriteria> {

	@Resource(name = "memberPhotoAlbumMapper")
	private MemberPhotoAlbumMapper mapper;

	@Override
	public ApiResult deleteByPrimaryKey(Long id) {
		mapper.deleteByPrimaryKey(id);
		return ApiResult.success();
	}

	@Override
	public ApiResult insertSelective(MemberPhotoAlbum record) {
		mapper.insertSelective(record);
		return ApiResult.success(record);
	}

	@Override
	public ApiResult selectByCriteria(MemberPhotoAlbumCriteria criteria, Page page) {
		if (page != null && !page.isNull()) {
			PageHelper.startPage(page.getNum(), page.getSize(), page.getOrderBy());
		}
		List<MemberPhotoAlbum> list = mapper.selectByCriteria(criteria);
		if (page != null && !page.isNull()) {
			PageInfo<MemberPhotoAlbum> pageInfo = new PageInfo<>(list);
			return ApiResult.success(pageInfo);
		} else {
			return ApiResult.success(list);
		}
	}

	@Override
	public ApiResult selectByPrimaryKey(Long id) {
		MemberPhotoAlbum m = mapper.selectByPrimaryKey(id);
		return ApiResult.success(m);
	}

	@Override
	public ApiResult updateByPrimaryKeySelective(MemberPhotoAlbum record) {
		mapper.updateByPrimaryKeySelective(record);
		return ApiResult.success();
	}

	@Override
	public ApiResult selectByModel(MemberPhotoAlbum model, Page page) {
		if (page != null && !page.isNull()) {
			PageHelper.startPage(page.getNum(), page.getSize(), page.getOrderBy());
		}
		List<MemberPhotoAlbum> list = mapper.selectByModel(model);
		if (page != null && !page.isNull()) {
			PageInfo<MemberPhotoAlbum> pageInfo = new PageInfo<>(list);
			return ApiResult.success(pageInfo);
		} else {
			return ApiResult.success(list);
		}
	}
}
