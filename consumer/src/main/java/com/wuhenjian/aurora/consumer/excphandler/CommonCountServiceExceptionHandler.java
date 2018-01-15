package com.wuhenjian.aurora.consumer.excphandler;

import com.wuhenjian.aurora.consumer.service.CommonCountService;
import com.wuhenjian.aurora.utils.constant.ResultStatus;
import com.wuhenjian.aurora.utils.exception.BusinessException;
import org.springframework.stereotype.Component;

/**
 * @author 無痕剑
 * @date 2017/12/27 11:29
 */
@Component("commonCountServiceExceptionHandler")
public class CommonCountServiceExceptionHandler implements CommonCountService {
	@Override
	public long getAccountCode() throws BusinessException {
		throw new BusinessException(ResultStatus.REMOTE_SERVICE_EXCEPTION);
	}

	@Override
	public int addAccountCode() throws BusinessException {
		throw new BusinessException(ResultStatus.REMOTE_SERVICE_EXCEPTION);
	}
}
