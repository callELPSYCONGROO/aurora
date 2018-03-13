package com.wuhenjian.aurora.db.mapper.sql;

import com.wuhenjian.aurora.utils.entity.dao.SysUserGroup;
import com.wuhenjian.aurora.utils.entity.dao.SysUserGroupCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface SysUserGroupMapper {
    int deleteByCriteria(SysUserGroupCriteria criteria);

    int deleteByPrimaryKey(Long sugId);

    int insert(SysUserGroup record);

    int insertSelective(SysUserGroup record);

    List<SysUserGroup> selectByCriteria(SysUserGroupCriteria criteria);

    SysUserGroup selectByPrimaryKey(Long sugId);

    int updateByCriteriaSelective(@Param("record") SysUserGroup record, @Param("criteria") SysUserGroupCriteria criteria);

    int updateByCriteria(@Param("record") SysUserGroup record, @Param("criteria") SysUserGroupCriteria criteria);

    int updateByPrimaryKeySelective(SysUserGroup record);

    int updateByPrimaryKey(SysUserGroup record);

    int countByModel(SysUserGroup model);

    List<SysUserGroup> selectByModel(SysUserGroup model);
}