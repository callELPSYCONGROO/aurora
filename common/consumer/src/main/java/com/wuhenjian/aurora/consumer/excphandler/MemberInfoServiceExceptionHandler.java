package com.wuhenjian.aurora.consumer.excphandler;

import com.wuhenjian.aurora.consumer.service.MemberInfoService;
import com.wuhenjian.aurora.utils.constant.ResultStatus;
import com.wuhenjian.aurora.utils.entity.bo.MemberAcctInfo;
import com.wuhenjian.aurora.utils.entity.dao.MemberInfo;
import com.wuhenjian.aurora.utils.exception.BusinessException;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author 無痕剑
 * @date 2017/12/21 11:33
 */
@Component("memberInfoServiceExceptionHandler")
public class MemberInfoServiceExceptionHandler implements MemberInfoService {
	@Override
	public void deleteByPrimaryKey(Long id) throws BusinessException {
		throw new BusinessException(ResultStatus.REMOTE_SERVICE_EXCEPTION);
	}

	@Override
	public void insertSelective(MemberInfo m) throws BusinessException {
		throw new BusinessException(ResultStatus.REMOTE_SERVICE_EXCEPTION);
	}

	@Override
	public MemberInfo selectByPrimaryKey(Long id) throws BusinessException {
		throw new BusinessException(ResultStatus.REMOTE_SERVICE_EXCEPTION);
	}

	@Override
	public void updateByPrimaryKeySelective(MemberInfo m) throws BusinessException {
		throw new BusinessException(ResultStatus.REMOTE_SERVICE_EXCEPTION);
	}

	@Override
	public List<MemberInfo> selectByModel(MemberInfo m) throws BusinessException {
		throw new BusinessException(ResultStatus.REMOTE_SERVICE_EXCEPTION);
	}

	@Override
	public MemberAcctInfo selectByMaid(Long maId) throws BusinessException {
		throw new BusinessException(ResultStatus.REMOTE_SERVICE_EXCEPTION);
	}

	@Override
	public void updateMemberInfoByMaId(MemberInfo m) throws BusinessException {
		throw new BusinessException(ResultStatus.REMOTE_SERVICE_EXCEPTION);
	}
}
