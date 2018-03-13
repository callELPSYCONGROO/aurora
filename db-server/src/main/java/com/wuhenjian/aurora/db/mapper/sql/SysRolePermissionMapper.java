package com.wuhenjian.aurora.db.mapper.sql;

import com.wuhenjian.aurora.utils.entity.dao.SysRolePermission;
import com.wuhenjian.aurora.utils.entity.dao.SysRolePermissionCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface SysRolePermissionMapper {
    int deleteByCriteria(SysRolePermissionCriteria criteria);

    int deleteByPrimaryKey(Long srpId);

    int insert(SysRolePermission record);

    int insertSelective(SysRolePermission record);

    List<SysRolePermission> selectByCriteria(SysRolePermissionCriteria criteria);

    SysRolePermission selectByPrimaryKey(Long srpId);

    int updateByCriteriaSelective(@Param("record") SysRolePermission record, @Param("criteria") SysRolePermissionCriteria criteria);

    int updateByCriteria(@Param("record") SysRolePermission record, @Param("criteria") SysRolePermissionCriteria criteria);

    int updateByPrimaryKeySelective(SysRolePermission record);

    int updateByPrimaryKey(SysRolePermission record);

    int countByModel(SysRolePermission model);

    List<SysRolePermission> selectByModel(SysRolePermission model);
}