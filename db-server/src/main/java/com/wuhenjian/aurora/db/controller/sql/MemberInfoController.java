package com.wuhenjian.aurora.db.controller.sql;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.wuhenjian.aurora.db.mapper.sql.MemberInfoMapper;
import com.wuhenjian.aurora.utils.BeanUtil;
import com.wuhenjian.aurora.utils.constant.ResultStatus;
import com.wuhenjian.aurora.utils.entity.bo.MemberAcctInfo;
import com.wuhenjian.aurora.utils.entity.bo.Page;
import com.wuhenjian.aurora.utils.entity.dao.MemberInfo;
import com.wuhenjian.aurora.utils.entity.dto.ApiResult;
import com.wuhenjian.aurora.utils.exception.BusinessException;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * @author 無痕剑
 * @date 2017/12/19 15:31
 */
@RestController
@RequestMapping(AbstractSqlBaseController.BASE_PATH + "/memberInfo")
public class MemberInfoController extends AbstractSqlBaseController<MemberInfo> {

	@Resource(name = "memberInfoMapper")
	private MemberInfoMapper mapper;

	@Override
	public ApiResult deleteByPrimaryKey(Long id) {
		mapper.deleteByPrimaryKey(id);
		return ApiResult.success();
	}

	@Override
	public ApiResult insertSelective(MemberInfo m) {
		mapper.insertSelective(m);
		return ApiResult.success(m);
	}

	@Override
	public ApiResult selectByPrimaryKey(Long id) {
		MemberInfo m = mapper.selectByPrimaryKey(id);
		return ApiResult.success(m);
	}

	@Override
	public ApiResult updateByPrimaryKeySelective(MemberInfo m) {
		mapper.updateByPrimaryKeySelective(m);
		return ApiResult.success(m);
	}

	@Override
	public ApiResult selectByModel(MemberInfo m) throws BusinessException {
		boolean pageFlag = !m.isNullPage();
		if (pageFlag) {
			PageHelper.startPage(m.getNum(), m.getSize(), m.getOrderBy());
		}
		List<MemberInfo> list = mapper.selectByModel(m);
		if (pageFlag) {
			PageInfo<MemberInfo> pageInfo = new PageInfo<>(list);
			return ApiResult.success(pageInfo);
		} else {
			return ApiResult.success(list);
		}
	}

	@RequestMapping(value = "selectByMaid", method = RequestMethod.GET)
	public ApiResult selectByMaid(@RequestParam("maId") Long maId) {
		MemberAcctInfo memberAcctInfo = mapper.selectByMaid(maId);
		return ApiResult.success(memberAcctInfo);
	}

	@RequestMapping(value = "/updateMemberInfoByMaId", method = RequestMethod.POST)
	public ApiResult updateMemberInfoByMaId(MemberInfo m) {
		mapper.updateMemberInfoByMaId(m);
		return ApiResult.success();
	}
}
