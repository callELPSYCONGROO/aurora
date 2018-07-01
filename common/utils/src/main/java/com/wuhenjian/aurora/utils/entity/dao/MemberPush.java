package com.wuhenjian.aurora.utils.entity.dao;

import com.wuhenjian.aurora.utils.entity.bo.Page;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;
import java.util.Date;

@EqualsAndHashCode(callSuper = true)
@Data
public class MemberPush extends Page implements Serializable {
    private Long mpId;

    private Long maId;

    private Integer phone;

    private Integer email;

    private Date updateTime;

    private Date createTime;
}