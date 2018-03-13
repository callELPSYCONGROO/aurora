package com.wuhenjian.aurora.db.mapper.sql;

import com.wuhenjian.aurora.utils.entity.dao.SysGroup;
import com.wuhenjian.aurora.utils.entity.dao.SysGroupCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface SysGroupMapper {
    int deleteByCriteria(SysGroupCriteria criteria);

    int deleteByPrimaryKey(Long sgId);

    int insert(SysGroup record);

    int insertSelective(SysGroup record);

    List<SysGroup> selectByCriteria(SysGroupCriteria criteria);

    SysGroup selectByPrimaryKey(Long sgId);

    int updateByCriteriaSelective(@Param("record") SysGroup record, @Param("criteria") SysGroupCriteria criteria);

    int updateByCriteria(@Param("record") SysGroup record, @Param("criteria") SysGroupCriteria criteria);

    int updateByPrimaryKeySelective(SysGroup record);

    int updateByPrimaryKey(SysGroup record);

    int countByModel(SysGroup model);

    List<SysGroup> selectByModel(SysGroup model);
}