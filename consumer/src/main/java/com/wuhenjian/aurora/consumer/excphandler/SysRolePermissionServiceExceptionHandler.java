package com.wuhenjian.aurora.consumer.excphandler;

import com.wuhenjian.aurora.consumer.service.SysRolePermissionService;
import com.wuhenjian.aurora.utils.constant.ResultStatus;
import com.wuhenjian.aurora.utils.entity.dao.SysRolePermission;
import com.wuhenjian.aurora.utils.exception.BusinessException;

import java.util.List;

/**
 * @author 無痕剑
 * @date 2018/3/14 18:33
 */
public class SysRolePermissionServiceExceptionHandler implements SysRolePermissionService {
	@Override
	public void deleteByPrimaryKey(Long id) throws BusinessException {
		throw new BusinessException(ResultStatus.REMOTE_SERVICE_EXCEPTION);
	}

	@Override
	public void insertSelective(SysRolePermission m) throws BusinessException {
		throw new BusinessException(ResultStatus.REMOTE_SERVICE_EXCEPTION);
	}

	@Override
	public SysRolePermission selectByPrimaryKey(Long id) throws BusinessException {
		throw new BusinessException(ResultStatus.REMOTE_SERVICE_EXCEPTION);
	}

	@Override
	public void updateByPrimaryKeySelective(SysRolePermission m) throws BusinessException {
		throw new BusinessException(ResultStatus.REMOTE_SERVICE_EXCEPTION);
	}

	@Override
	public List<SysRolePermission> selectByModel(SysRolePermission m) throws BusinessException {
		throw new BusinessException(ResultStatus.REMOTE_SERVICE_EXCEPTION);
	}
}
