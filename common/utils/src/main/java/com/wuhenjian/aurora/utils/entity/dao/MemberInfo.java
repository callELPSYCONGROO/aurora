package com.wuhenjian.aurora.utils.entity.dao;

import com.wuhenjian.aurora.utils.entity.bo.Page;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;
import java.util.Date;

@EqualsAndHashCode(callSuper = true)
@Data
public class MemberInfo extends Page implements Serializable {
    private Long miId;

    private Long maId;

    private Long faceId;

    private Long area;

    private String nickName;

    private String memberSign;

    private Integer sex;

    private Date lastLoginTime;

    private String lastLoginIP;

    private Integer lastLoginDevice;
}