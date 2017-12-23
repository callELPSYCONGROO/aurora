package com.wuhenjian.aurora.memberservice.service;

import com.wuhenjian.aurora.memberservice.excphandler.RedisServiceExceptionHanlder;
import com.wuhenjian.aurora.utils.entity.MemberAcctInfo;
import com.wuhenjian.aurora.utils.entity.result.ApiResult;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author Administrator
 * @date 2017/12/23/023 11:42
 */
@Service
@FeignClient(value = "db", fallback = RedisServiceExceptionHanlder.class)
public interface RedisService {
    String BASE_PATH = "/nosql/redis";

    @RequestMapping(value = BASE_PATH + "/setToken", method = RequestMethod.POST)
    ApiResult  setToken(String token, MemberAcctInfo memberAcctInfo);

    @RequestMapping(value = BASE_PATH + "/getToken", method = RequestMethod.GET)
    ApiResult getToken(String token);

    @RequestMapping(value = BASE_PATH + "/del", method = RequestMethod.POST)
    ApiResult del(String key);

    @RequestMapping(value = BASE_PATH + "set", method = RequestMethod.POST)
    ApiResult set(String key, String value, Integer expire);

    @RequestMapping(value = BASE_PATH + "/get", method = RequestMethod.GET)
    ApiResult get(String key);
}
