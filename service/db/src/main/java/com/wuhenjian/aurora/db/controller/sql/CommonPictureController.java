package com.wuhenjian.aurora.db.controller.sql;

import com.github.pagehelper.PageHelper;
import com.wuhenjian.aurora.db.mapper.sql.CommonPictureMapper;
import com.wuhenjian.aurora.utils.constant.CommonContant;
import com.wuhenjian.aurora.utils.entity.dao.CommonPicture;
import com.wuhenjian.aurora.utils.exception.BusinessException;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author 無痕剑
 * @date 2017/12/19 15:29
 */
@RestController
@RequestMapping(CommonContant.SQL + "/commonPicture")
public class CommonPictureController {

	@Resource(name = "commonPictureMapper")
	private CommonPictureMapper mapper;

	@RequestMapping(value = "/selectById", method = RequestMethod.GET)
	public CommonPicture selectByPrimaryKey(@RequestParam("id") Long id) {
		return mapper.selectByPrimaryKey(id);
	}

	@RequestMapping(value = "/selectByModel", method = RequestMethod.POST)
	public List<CommonPicture> selectByModel(@RequestBody(required = false) CommonPicture m) throws BusinessException {
		if (m != null && !m.isNullPage()) {
			PageHelper.startPage(m.getNum(), m.getSize(), m.getOrderBy());
		}
		return mapper.selectByModel(m);
	}

	@RequestMapping(value = "/update", method = RequestMethod.POST)
	public void updateByPrimaryKeySelective(@RequestBody CommonPicture m) {
		mapper.updateByPrimaryKeySelective(m);
	}

	@RequestMapping(value = "/insert", method = RequestMethod.POST)
	public void insertSelective(@RequestBody CommonPicture m) {
		mapper.insertSelective(m);
	}

	@RequestMapping(value = "/delete", method = RequestMethod.POST)
	public void deleteByPrimaryKey(@RequestParam("id") Long id) {
		mapper.deleteByPrimaryKey(id);
	}
}
