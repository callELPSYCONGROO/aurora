package com.wuhenjian.aurora.db.controller.sql;

import com.github.pagehelper.PageHelper;
import com.wuhenjian.aurora.db.mapper.sql.MemberPhotoAlbumMapper;
import com.wuhenjian.aurora.utils.constant.CommonContant;
import com.wuhenjian.aurora.utils.entity.dao.MemberPhotoAlbum;
import com.wuhenjian.aurora.utils.exception.BusinessException;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author 無痕剑
 * @date 2018/1/5 10:28
 */
@RestController
@RequestMapping(CommonContant.SQL + "/memberPhotoAlbum")
public class MemberPhotoAlbumController {

	@Resource(name = "memberPhotoAlbumMapper")
	private MemberPhotoAlbumMapper mapper;

	@RequestMapping(value = "/selectById", method = RequestMethod.GET)
	public  MemberPhotoAlbum selectByPrimaryKey(@RequestParam("id")Long id) {
		return mapper.selectByPrimaryKey(id);
	}

	@RequestMapping(value = "/selectByModel", method = RequestMethod.POST)
	public List< MemberPhotoAlbum> selectByModel(@RequestBody(required = false)  MemberPhotoAlbum m) throws BusinessException {
		if (m != null && !m.isNullPage()) {
			PageHelper.startPage(m.getNum(), m.getSize(), m.getOrderBy());
		}
		return mapper.selectByModel(m);
	}

	@RequestMapping(value = "/update", method = RequestMethod.POST)
	public int updateByPrimaryKeySelective(@RequestBody MemberPhotoAlbum m) {
		return mapper.updateByPrimaryKeySelective(m);
	}

	@RequestMapping(value = "/insert", method = RequestMethod.POST)
	public int insertSelective(@RequestBody MemberPhotoAlbum m) {
		return mapper.insertSelective(m);
	}

	@RequestMapping(value = "/delete", method = RequestMethod.POST)
	public int deleteByPrimaryKey(@RequestParam("id") Long id) {
		return mapper.deleteByPrimaryKey(id);
	}
}
