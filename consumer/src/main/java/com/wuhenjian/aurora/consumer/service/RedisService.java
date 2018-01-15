package com.wuhenjian.aurora.consumer.service;

import com.wuhenjian.aurora.consumer.excphandler.RedisServiceExceptionHanlder;
import com.wuhenjian.aurora.utils.entity.bo.MemberAcctInfo;
import com.wuhenjian.aurora.utils.exception.BusinessException;
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
    void setToken(@RequestParam("token") String token, MemberAcctInfo memberAcctInfo) throws BusinessException;

    @RequestMapping(value = BASE_PATH + "/getToken", method = RequestMethod.GET)
    MemberAcctInfo getToken(@RequestParam("token") String token) throws BusinessException;

    @RequestMapping(value = BASE_PATH + "/del", method = RequestMethod.POST)
    void del(@RequestParam("key") String key) throws BusinessException;

    @RequestMapping(value = BASE_PATH + "set", method = RequestMethod.POST)
    void set(@RequestParam("key") String key, @RequestParam("value") String value, @RequestParam("expire") Integer expire) throws BusinessException;

    @RequestMapping(value = BASE_PATH + "/get", method = RequestMethod.GET)
    String get(@RequestParam("key") String key) throws BusinessException;
}
