package com.wuhenjian.aurora.cms.service.impl;

import com.wuhenjian.aurora.cms.service.UserAuthService;
import com.wuhenjian.aurora.consumer.service.SysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("userAuthService")
public class UserAuthServiceImpl implements UserAuthService {

    @Autowired
    private SysUserService sysUserService;

}
