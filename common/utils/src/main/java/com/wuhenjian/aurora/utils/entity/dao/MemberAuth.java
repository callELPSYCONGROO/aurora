package com.wuhenjian.aurora.utils.entity.dao;

import com.wuhenjian.aurora.utils.entity.bo.Page;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;
import java.util.Date;

@EqualsAndHashCode(callSuper = true)
@Data
public class MemberAuth extends Page implements Serializable {
    private Long maId;

    private Long accountCode;

    private String memberPhone;

    private String memberEmail;

    private String authSalt;

    private String memberPassword;

    private Integer authFail;

    private Integer currentStatus;

    private Date registerTime;

    private Date updateTime;
}