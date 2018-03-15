package com.wuhenjian.aurora.consumer.excphandler;

import com.wuhenjian.aurora.consumer.service.SysFilterChainService;
import com.wuhenjian.aurora.utils.constant.ResultStatus;
import com.wuhenjian.aurora.utils.entity.dao.SysFilterChain;
import com.wuhenjian.aurora.utils.entity.vo.GithubRepo;
import com.wuhenjian.aurora.utils.exception.BusinessException;

import java.util.List;

/**
 * @author 無痕剑
 * @date 2018/3/14 18:33
 */
public class SysFilterChainServiceExceptionHandler implements SysFilterChainService {
	@Override
	public void deleteByPrimaryKey(Long id) throws BusinessException {
		throw new BusinessException(ResultStatus.REMOTE_SERVICE_EXCEPTION);
	}

	@Override
	public void insertSelective(SysFilterChain m) throws BusinessException {
		throw new BusinessException(ResultStatus.REMOTE_SERVICE_EXCEPTION);
	}

	@Override
	public SysFilterChain selectByPrimaryKey(Long id) throws BusinessException {
		throw new BusinessException(ResultStatus.REMOTE_SERVICE_EXCEPTION);
	}

	@Override
	public void updateByPrimaryKeySelective(SysFilterChain m) throws BusinessException {
		throw new BusinessException(ResultStatus.REMOTE_SERVICE_EXCEPTION);
	}

	@Override
	public List<SysFilterChain> selectByModel(SysFilterChain m) throws BusinessException {
		throw new BusinessException(ResultStatus.REMOTE_SERVICE_EXCEPTION);
	}
}
