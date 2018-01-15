package com.wuhenjian.aurora.consumer.excphandler;

import com.wuhenjian.aurora.consumer.service.RedisService;
import com.wuhenjian.aurora.utils.constant.ResultStatus;
import com.wuhenjian.aurora.utils.entity.bo.MemberAcctInfo;
import com.wuhenjian.aurora.utils.entity.dto.ApiResult;
import com.wuhenjian.aurora.utils.exception.BusinessException;
import org.springframework.stereotype.Component;

/**
 * @author Administrator
 * @date 2017/12/23/023 11:43
 */
@Component("redisServiceExceptionHanlder")
public class RedisServiceExceptionHanlder implements RedisService {
    @Override
    public void setToken(String token, MemberAcctInfo memberAcctInfo) throws BusinessException {
        throw new BusinessException(ResultStatus.REMOTE_SERVICE_EXCEPTION);
    }

    @Override
    public MemberAcctInfo getToken(String token) throws BusinessException {
        throw new BusinessException(ResultStatus.REMOTE_SERVICE_EXCEPTION);
    }

    @Override
    public void del(String key) throws BusinessException {
        throw new BusinessException(ResultStatus.REMOTE_SERVICE_EXCEPTION);
    }

    @Override
    public void set(String key, String value, Integer expire) throws BusinessException {
        throw new BusinessException(ResultStatus.REMOTE_SERVICE_EXCEPTION);
    }

    @Override
    public String get(String key) throws BusinessException {
        throw new BusinessException(ResultStatus.REMOTE_SERVICE_EXCEPTION);
    }
}
