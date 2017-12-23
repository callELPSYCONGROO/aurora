package com.wuhenjian.aurora.gateway.excphandler;

import com.wuhenjian.aurora.gateway.service.RedisService;
import com.wuhenjian.aurora.utils.entity.MemberAcctInfo;
import com.wuhenjian.aurora.utils.entity.constant.ResultStatus;
import com.wuhenjian.aurora.utils.entity.result.ApiResult;
import org.springframework.stereotype.Component;

/**
 * @author Administrator
 * @date 2017/12/23/023 11:43
 */
@Component("redisServiceExceptionHanlder")
public class RedisServiceExceptionHanlder implements RedisService {
    @Override
    public ApiResult setToken(String token, MemberAcctInfo memberAcctInfo) {
        return this.exceptionResult();
    }

    @Override
    public ApiResult getToken(String token) {
        return this.exceptionResult();
    }

    @Override
    public ApiResult del(String key) {
        return this.exceptionResult();
    }

    @Override
    public ApiResult set(String key, String value, Integer expire) {
        return this.exceptionResult();
    }

    @Override
    public ApiResult get(String key) {
        return this.exceptionResult();
    }

    private ApiResult exceptionResult() {
        return ApiResult.fail(ResultStatus.REMOTE_SERVICE_EXCEPTION);
    }
}
