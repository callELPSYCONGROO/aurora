package com.wuhenjian.aurora.utils.entity.dao;

import com.wuhenjian.aurora.utils.entity.bo.Page;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;
import java.util.Date;

@EqualsAndHashCode(callSuper = true)
@Data
public class MemberComment extends Page implements Serializable {
    private Long mcId;

    private Long maId;

    private Integer commentType;

    private String title;

    private Integer commentDevice;

    private Date createTime;

    private String content;
}