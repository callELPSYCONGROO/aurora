package com.wuhenjian.aurora.memberservice.controller.api;

import com.wuhenjian.aurora.memberservice.controller.BaseController;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
}
