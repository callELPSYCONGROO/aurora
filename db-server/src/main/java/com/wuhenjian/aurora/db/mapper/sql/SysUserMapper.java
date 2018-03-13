package com.wuhenjian.aurora.db.mapper.sql;

import com.wuhenjian.aurora.utils.entity.dao.SysUser;
import com.wuhenjian.aurora.utils.entity.dao.SysUserCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface SysUserMapper {
    int deleteByCriteria(SysUserCriteria criteria);

    int deleteByPrimaryKey(Long suId);

    int insert(SysUser record);

    int insertSelective(SysUser record);

    List<SysUser> selectByCriteria(SysUserCriteria criteria);

    SysUser selectByPrimaryKey(Long suId);

    int updateByCriteriaSelective(@Param("record") SysUser record, @Param("criteria") SysUserCriteria criteria);

    int updateByCriteria(@Param("record") SysUser record, @Param("criteria") SysUserCriteria criteria);

    int updateByPrimaryKeySelective(SysUser record);

    int updateByPrimaryKey(SysUser record);

    int countByModel(SysUser model);

    List<SysUser> selectByModel(SysUser model);
}