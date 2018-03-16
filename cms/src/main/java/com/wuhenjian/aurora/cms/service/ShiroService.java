package com.wuhenjian.aurora.cms.service;

import com.wuhenjian.aurora.utils.exception.BusinessException;

import java.util.Map;

/**
 * @author 無痕剑
 * @date 2018/3/16 13:41
 */
public interface ShiroService {
    /**
     * 从数据库获取URL请求拦截权限
     */
    Map<String, String> loadFilterChainDefinitionMap() throws BusinessException;

    /**
     * 更新Shiro请求权限
     */
    void updateFilterChainDefinition() throws BusinessException;
}
