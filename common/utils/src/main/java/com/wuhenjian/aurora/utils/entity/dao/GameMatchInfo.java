package com.wuhenjian.aurora.utils.entity.dao;

import com.wuhenjian.aurora.utils.entity.bo.Page;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;
import java.util.Date;

@EqualsAndHashCode(callSuper = true)
@Data
public class GameMatchInfo extends Page implements Serializable {
    private Long gmiId;

    private Long offensive;

    private Long defensive;

    private Integer totalRound;

    private Integer finalResult;

    private Date startTime;

    private Date endTime;

    private Integer winScore;

    private Integer lostScore;

    private Date createTime;
}