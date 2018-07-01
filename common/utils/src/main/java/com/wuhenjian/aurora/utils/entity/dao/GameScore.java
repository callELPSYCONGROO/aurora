package com.wuhenjian.aurora.utils.entity.dao;

import com.wuhenjian.aurora.utils.entity.bo.Page;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;
import java.util.Date;

@EqualsAndHashCode(callSuper = true)
@Data
public class GameScore extends Page implements Serializable {
    private Long gsId;

    private Long maId;

    private Integer score;

    private Long playGameTotalTime;

    private Integer totalTimes;

    private Integer winCount;

    private Integer lostCount;

    private Integer drawCount;

    private Integer fleeCount;

    private Date lastPlayTime;

    private Integer lastDeviceType;

    private String lastLogonIP;
}