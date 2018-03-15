package com.wuhenjian.aurora.consumer.excphandler;

import com.wuhenjian.aurora.consumer.service.SysMenuService;
import com.wuhenjian.aurora.utils.constant.ResultStatus;
import com.wuhenjian.aurora.utils.entity.dao.SysMenu;
import com.wuhenjian.aurora.utils.entity.vo.GithubRepo;
import com.wuhenjian.aurora.utils.exception.BusinessException;

import java.util.List;

/**
 * @author 無痕剑
 * @date 2018/3/14 18:33
 */
public class SysMenuServiceExceptionHandler implements SysMenuService {
	@Override
	public void deleteByPrimaryKey(Long id) throws BusinessException {
		throw new BusinessException(ResultStatus.REMOTE_SERVICE_EXCEPTION);
	}

	@Override
	public void insertSelective(SysMenu m) throws BusinessException {
		throw new BusinessException(ResultStatus.REMOTE_SERVICE_EXCEPTION);
	}

	@Override
	public SysMenu selectByPrimaryKey(Long id) throws BusinessException {
		throw new BusinessException(ResultStatus.REMOTE_SERVICE_EXCEPTION);
	}

	@Override
	public List<SysMenu> selectBySuId(Long suId) throws BusinessException {
		throw new BusinessException(ResultStatus.REMOTE_SERVICE_EXCEPTION);
	}

	@Override
	public void updateByPrimaryKeySelective(SysMenu m) throws BusinessException {
		throw new BusinessException(ResultStatus.REMOTE_SERVICE_EXCEPTION);
	}

	@Override
	public List<SysMenu> selectByModel(SysMenu m) throws BusinessException {
		throw new BusinessException(ResultStatus.REMOTE_SERVICE_EXCEPTION);
	}
}
