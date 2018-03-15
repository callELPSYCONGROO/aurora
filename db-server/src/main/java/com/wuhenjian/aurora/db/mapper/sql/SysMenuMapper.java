package com.wuhenjian.aurora.db.mapper.sql;

import com.wuhenjian.aurora.utils.entity.dao.SysMenu;
import com.wuhenjian.aurora.utils.entity.dao.SysMenuCriteria;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SysMenuMapper {
    int deleteByCriteria(SysMenuCriteria criteria);

    int deleteByPrimaryKey(Long smId);

    int insert(SysMenu record);

    int insertSelective(SysMenu record);

    List<SysMenu> selectByCriteria(SysMenuCriteria criteria);

    SysMenu selectByPrimaryKey(Long smId);

    int updateByCriteriaSelective(@Param("record") SysMenu record, @Param("criteria") SysMenuCriteria criteria);

    int updateByCriteria(@Param("record") SysMenu record, @Param("criteria") SysMenuCriteria criteria);

    int updateByPrimaryKeySelective(SysMenu record);

    int updateByPrimaryKey(SysMenu record);

    int countByModel(SysMenu model);

    List<SysMenu> selectByModel(SysMenu model);

    List<SysMenu> selectBySuId(@Param("suId") Long suId);
}