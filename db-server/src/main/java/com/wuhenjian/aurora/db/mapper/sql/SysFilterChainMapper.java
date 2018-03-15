package com.wuhenjian.aurora.db.mapper.sql;

import com.wuhenjian.aurora.utils.entity.dao.SysFilterChain;
import com.wuhenjian.aurora.utils.entity.dao.SysFilterChainCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface SysFilterChainMapper {
    int deleteByCriteria(SysFilterChainCriteria criteria);

    int deleteByPrimaryKey(Long sfcId);

    int insert(SysFilterChain record);

    int insertSelective(SysFilterChain record);

    List<SysFilterChain> selectByCriteria(SysFilterChainCriteria criteria);

    SysFilterChain selectByPrimaryKey(Long sfcId);

    int updateByCriteriaSelective(@Param("record") SysFilterChain record, @Param("criteria") SysFilterChainCriteria criteria);

    int updateByCriteria(@Param("record") SysFilterChain record, @Param("criteria") SysFilterChainCriteria criteria);

    int updateByPrimaryKeySelective(SysFilterChain record);

    int updateByPrimaryKey(SysFilterChain record);

    int countByModel(SysFilterChain model);

    List<SysFilterChain> selectByModel(SysFilterChain model);
}