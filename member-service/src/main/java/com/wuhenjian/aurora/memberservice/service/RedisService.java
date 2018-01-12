package com.wuhenjian.aurora.memberservice.service;

import com.wuhenjian.aurora.memberservice.excphandler.RedisServiceExceptionHanlder;
import com.wuhenjian.aurora.utils.entity.bo.MemberAcctInfo;
import com.wuhenjian.aurora.utils.entity.dto.ApiResult;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author Administrator
 * @date 2017/12/23/023 11:42
 */
@Service
@FeignClient(value = "db", fallback = RedisServiceExceptionHanlder.class)
public interface RedisService {
    String BASE_PATH = "/nosql/redis";

    @RequestMapping(value = BASE_PATH + "/setToken", method = RequestMethod.POST)
    ApiResult setToken(@RequestParam("token") String token, MemberAcctInfo memberAcctInfo);

    @RequestMapping(value = BASE_PATH + "/getToken", method = RequestMethod.GET)
    ApiResult getToken(@RequestParam("token") String token);

    @RequestMapping(value = BASE_PATH + "/del", method = RequestMethod.POST)
    ApiResult del(@RequestParam("key") String key);

    @RequestMapping(value = BASE_PATH + "set", method = RequestMethod.POST)
    ApiResult set(@RequestParam("key") String key, @RequestParam("value") String value, @RequestParam("expire") Integer expire);

    @RequestMapping(value = BASE_PATH + "/get", method = RequestMethod.GET)
    ApiResult get(@RequestParam("key") String key);
}
