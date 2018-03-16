package com.wuhenjian.aurora.cms.service.impl;

import com.wuhenjian.aurora.cms.service.ShiroService;
import com.wuhenjian.aurora.consumer.service.SysFilterChainService;
import com.wuhenjian.aurora.utils.constant.ResultStatus;
import com.wuhenjian.aurora.utils.entity.dao.SysFilterChain;
import com.wuhenjian.aurora.utils.exception.BusinessException;
import org.apache.shiro.spring.web.ShiroFilterFactoryBean;
import org.apache.shiro.web.filter.mgt.DefaultFilterChainManager;
import org.apache.shiro.web.filter.mgt.PathMatchingFilterChainResolver;
import org.apache.shiro.web.servlet.AbstractShiroFilter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/**
 * @author 無痕剑
 * @date 2018/3/16 13:44
 */
@Service("shiroService")
public class ShiroServiceImpl implements ShiroService {

    @Autowired
    private SysFilterChainService sysFilterChainService;

    @Autowired
    private ShiroFilterFactoryBean shiroFilterFactoryBean;

    @Override
    public Map<String, String> loadFilterChainDefinitionMap() throws BusinessException {
        SysFilterChain model = new SysFilterChain();
        model.setOrderBy("sort");
        List<SysFilterChain> sysFilterChains = sysFilterChainService.selectByModel(model);
        Map<String, String> map = new LinkedHashMap<>();
        for (SysFilterChain sfc : sysFilterChains) {
            map.put(sfc.getUrl(), sfc.getFilterRole());
        }
        return map;
    }

    @Override
    public synchronized void updateFilterChainDefinition() throws BusinessException {
        AbstractShiroFilter shiroFilter;
        try {
            shiroFilter = (AbstractShiroFilter) shiroFilterFactoryBean.getObject();
        } catch (Exception e) {
            throw new BusinessException(ResultStatus.UPDATE_FILTER_CHAIN_DEFINITION_FAIL);
        }
        PathMatchingFilterChainResolver filterChainResolver = (PathMatchingFilterChainResolver) shiroFilter.getFilterChainResolver();
        DefaultFilterChainManager manager = (DefaultFilterChainManager) filterChainResolver.getFilterChainManager();
        manager.getFilterChains().clear();// 清空旧权限
        shiroFilterFactoryBean.getFilterChainDefinitionMap().clear();// 清空旧权限
        shiroFilterFactoryBean.setFilterChainDefinitionMap(this.loadFilterChainDefinitionMap());
        Map<String, String> map = shiroFilterFactoryBean.getFilterChainDefinitionMap();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            String url = entry.getKey();
            String permission = entry.getValue().trim().replace(" ", "");
            manager.createChain(url, permission);
        }
    }
}
