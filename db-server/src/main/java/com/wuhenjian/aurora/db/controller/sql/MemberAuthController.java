package com.wuhenjian.aurora.db.controller.sql;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.wuhenjian.aurora.db.mapper.sql.MemberAuthMapper;
import com.wuhenjian.aurora.utils.BeanUtil;
import com.wuhenjian.aurora.utils.constant.ResultStatus;
import com.wuhenjian.aurora.utils.entity.bo.Page;
import com.wuhenjian.aurora.utils.entity.dao.MemberAuth;
import com.wuhenjian.aurora.utils.entity.dto.ApiResult;
import com.wuhenjian.aurora.utils.exception.BusinessException;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * @author 無痕剑
 * @date 2017/12/19 15:30
 */
@RestController
@RequestMapping(AbstractSqlBaseController.BASE_PATH + "/memberAuth")
public class MemberAuthController extends AbstractSqlBaseController<MemberAuth> {

	@Resource(name = "memberAuthMapper")
	private MemberAuthMapper mapper;

	@Override
	public ApiResult deleteByPrimaryKey(Long id) {
		mapper.deleteByPrimaryKey(id);
		return ApiResult.success();
	}

	@Override
	public ApiResult insertSelective(MemberAuth m) {
		mapper.insertSelective(m);
		return ApiResult.success(m);
	}

	@Override
	public ApiResult selectByPrimaryKey(Long id) {
		MemberAuth m = mapper.selectByPrimaryKey(id);
		return ApiResult.success(m);
	}

	@Override
	public ApiResult updateByPrimaryKeySelective(MemberAuth m) {
		mapper.updateByPrimaryKeySelective(m);
		return ApiResult.success(m);
	}

	@Override
	public ApiResult selectByModel(MemberAuth m) throws BusinessException {
		boolean pageFlag = !m.isNullPage();
		if (pageFlag) {
			PageHelper.startPage(m.getNum(), m.getSize(), m.getOrderBy());
		}
		List<MemberAuth> list = mapper.selectByModel(m);
		if (pageFlag) {
			PageInfo<MemberAuth> pageInfo = new PageInfo<>(list);
			return ApiResult.success(pageInfo);
		} else {
			return ApiResult.success(list);
		}
	}

	@RequestMapping(value = "/selectByPhone", method = RequestMethod.GET)
	public ApiResult selectByPhone(@RequestParam("phone") String phone) {
		MemberAuth memberAuth = mapper.selectByPhone(phone);
		return ApiResult.success(memberAuth);
	}

	@RequestMapping(value = "/selectByEmail", method = RequestMethod.GET)
	public ApiResult selectByEmail(@RequestParam("email") String email) {
		MemberAuth memberAuth = mapper.selectByEmail(email);
		return ApiResult.success(memberAuth);
	}
}
