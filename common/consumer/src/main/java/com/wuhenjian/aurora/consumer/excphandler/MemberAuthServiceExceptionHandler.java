package com.wuhenjian.aurora.consumer.excphandler;

import com.wuhenjian.aurora.consumer.service.MemberAuthService;
import com.wuhenjian.aurora.utils.constant.ResultStatus;
import com.wuhenjian.aurora.utils.entity.dao.MemberAuth;
import com.wuhenjian.aurora.utils.entity.dto.ApiResult;
import com.wuhenjian.aurora.utils.exception.BusinessException;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author 無痕剑
 * @date 2017/12/21 11:33
 */
@Component("memberAuthServiceExceptionHandler")
public class MemberAuthServiceExceptionHandler implements MemberAuthService {
	@Override
	public void deleteByPrimaryKey(Long id) throws BusinessException {
		throw new BusinessException(ResultStatus.REMOTE_SERVICE_EXCEPTION);
	}

	@Override
	public void insertSelective(MemberAuth m) throws BusinessException {
		throw new BusinessException(ResultStatus.REMOTE_SERVICE_EXCEPTION);
	}

	@Override
	public MemberAuth selectByPrimaryKey(Long id) throws BusinessException {
		throw new BusinessException(ResultStatus.REMOTE_SERVICE_EXCEPTION);
	}

	@Override
	public void updateByPrimaryKeySelective(MemberAuth m) throws BusinessException {
		throw new BusinessException(ResultStatus.REMOTE_SERVICE_EXCEPTION);
	}

	@Override
	public List<MemberAuth> selectByModel(MemberAuth m) throws BusinessException {
		throw new BusinessException(ResultStatus.REMOTE_SERVICE_EXCEPTION);
	}

	@Override
	public MemberAuth selectByPhone(String phone) throws BusinessException {
		throw new BusinessException(ResultStatus.REMOTE_SERVICE_EXCEPTION);
	}

	@Override
	public MemberAuth selectByEmail(String email) throws BusinessException {
		throw new BusinessException(ResultStatus.REMOTE_SERVICE_EXCEPTION);
	}
}
