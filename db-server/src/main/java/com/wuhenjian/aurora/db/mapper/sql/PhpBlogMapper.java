package com.wuhenjian.aurora.db.mapper.sql;

import com.wuhenjian.aurora.utils.entity.dao.PhpBlog;
import com.wuhenjian.aurora.utils.entity.dao.PhpBlogCriteria;
import java.util.List;

import com.wuhenjian.aurora.utils.entity.vo.PhpBlogVo;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository("phpBlogMapper")
public interface PhpBlogMapper {
    int deleteByCriteria(PhpBlogCriteria criteria);

    int deleteByPrimaryKey(Long pbId);

    int insert(PhpBlog record);

    int insertSelective(PhpBlog record);

    List<PhpBlog> selectByCriteria(PhpBlogCriteria criteria);

    PhpBlog selectByPrimaryKey(Long pbId);

    int updateByCriteriaSelective(@Param("record") PhpBlog record, @Param("criteria") PhpBlogCriteria criteria);

    int updateByCriteria(@Param("record") PhpBlog record, @Param("criteria") PhpBlogCriteria criteria);

    int updateByPrimaryKeySelective(PhpBlog record);

    int updateByPrimaryKey(PhpBlog record);

    int countByModel(PhpBlog model);

    List<PhpBlog> selectByModel(PhpBlog model);

    PhpBlog selectByTitle(@Param("title") String title);

    List<PhpBlogVo> selectForVo(PhpBlog model);
}