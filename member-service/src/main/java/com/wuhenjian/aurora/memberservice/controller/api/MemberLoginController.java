package com.wuhenjian.aurora.memberservice.controller.api;

import com.wuhenjian.aurora.memberservice.controller.BaseController;
import com.wuhenjian.aurora.utils.entity.result.ApiResult;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * @author SwordNoTrace
 * @date 2017/12/4 23:13
 */
@RestController
public class MemberLoginController extends BaseController{

    @Value("${my.message}")
    private String yige;

    @RequestMapping("yige")
    public String gege() {
        return yige;
    }

    @RequestMapping("login")
    public ApiResult login(String name, String pwd) {
        Map<String,Object> map = new HashMap<>();
        map.put("name", name);
        map.put("pwd", pwd);
        return ApiResult.success(map);
    }
}
