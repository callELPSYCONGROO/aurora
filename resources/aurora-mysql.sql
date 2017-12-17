CREATE DATABASE `aurora`;


CREATE TABLE `t_member_auth`(
    `maId` BIGINT NOT NULL AUTO_INCREMENT COMMENT 'id',
    `accountCode` BIGINT NOT NULL COMMENT '账号',
    `memberPhone` VARCHAR(20) NOT NULL COMMENT '手机',
    `memberEmail` VARCHAR(50) NOT NULL COMMENT '邮箱',
    `authSalt` VARCHAR(10) NOT NULL COMMENT '盐值',
    `memberPassword` VARCHAR(20) NOT NULL COMMENT '密码，最短8位',
    `authFail` INT(2) NOT NULL DEFAULT 0 COMMENT '登录失败次数',
    `currentStatus` INT(2) NOT NULL DEFAULT 0 COMMENT '账号当前状态：0-正常，1-密码错误次数过多，2-管理员锁定',
    `registerTime` DATETIME NOT NULL COMMENT '注册时间',
    `updateTime` DATETIME NOT NULL COMMENT '更新时间',
    
    PRIMARY KEY (`maId`),
    UNIQUE KEY (`accountCode`),
    UNIQUE KEY (`memberPhone`),
    UNIQUE KEY (`memberEmail`)
)ENGINE=INNODB AUTO_INCREMENT=10000001 DEFAULT CHARSET=utf8 COMMENT '用户账号密码表';


CREATE TABLE `t_member_info`(
    `miId` BIGINT NOT NULL AUTO_INCREMENT COMMENT 'id',
    `maId` BIGINT NOT NULL COMMENT '账号密码表id',
    `faceId` BIGINT DEFAULT NULL COMMENT '头像图片id',
    `area` BIGINT DEFAULT NULL COMMENT '地区',
    `nickName` VARCHAR(20) DEFAULT NULL COMMENT '昵称',
    `memberSign` VARCHAR(100) DEFAULT NULL COMMENT '个性签名',
    `sex` INT(2) DEFAULT 3 COMMENT '性别：1-男，2-女，3-其他',
    `lastLoginTime` DATETIME DEFAULT NULL COMMENT '上次登录时间',
    `lastLoginIP` VARCHAR(30) DEFAULT NULL COMMENT '上次登录IP',
    `lastLoginDevice` INT(2) DEFAULT NULL COMMENT '上次登录设备：0-未知，1-web，2-IOS，3-Andriod',
    
    PRIMARY KEY (`miId`),
    UNIQUE KEY (`maId`)
)ENGINE=INNODB AUTO_INCREMENT=10000001 DEFAULT CHARSET=utf8 COMMENT '用户信息表';


CREATE TABLE `t_member_comment`(
    `mcId` BIGINT NOT NULL AUTO_INCREMENT COMMENT 'id',
    `maId` BIGINT NOT NULL COMMENT '账号密码表id',
    `commentType` INT(2) DEFAULT 1 COMMENT '问题类型：1.游戏问题，2.给开发者',
    `title` VARCHAR(40) DEFAULT NULL COMMENT '标题',
    `content` TEXT DEFAULT NULL COMMENT '内容',
    `commentDevice` INT(2) DEFAULT 0 COMMENT '发布设备：0-未知，1-web，2-IOS，3-Andriod',
    `createTime` DATETIME DEFAULT NULL COMMENT '发布时间',
    
    PRIMARY KEY (`mcId`),
    UNIQUE KEY (`maId`, `title`)
)ENGINE=INNODB DEFAULT CHARSET=utf8 COMMENT '用户建议';


CREATE TABLE `t_member_picture`(
    `mpId` BIGINT NOT NULL AUTO_INCREMENT COMMENT 'id',
    `maId` BIGINT NOT NULL COMMENT '账号密码表id',
    `pType` INT(2) DEFAULT 1 COMMENT '图片类型：1.游戏问题，2.给开发者',
    `picAddress` VARCHAR(256) DEFAULT NULL COMMENT '图片地址',
    `content` TEXT DEFAULT NULL COMMENT '内容',
    `createTime` DATETIME DEFAULT NULL COMMENT '创建时间',
    
    PRIMARY KEY (`mpId`)
)ENGINE=INNODB DEFAULT CHARSET=utf8 COMMENT '用户图片表';


CREATE TABLE `t_member_friend`(
    `mfId` BIGINT NOT NULL AUTO_INCREMENT COMMENT 'id',
    `ownerId` BIGINT NOT NULL COMMENT '主人ID',
    `guestId` BIGINT NOT NULL COMMENT '好友ID',
    `createTime` DATETIME DEFAULT NULL COMMENT '添加时间',
    
    PRIMARY KEY (`mfId`),
	UNIQUE KEY (`ownerId`, `guestId`)
)ENGINE=INNODB DEFAULT CHARSET=utf8 COMMENT '用户好友';







CREATE TABLE `t_game_match_info`(
    `gmiId` BIGINT NOT NULL AUTO_INCREMENT COMMENT 'id',
    `offensive` BIGINT NOT NULL COMMENT '进攻方ID',
    `defensive` BIGINT NOT NULL COMMENT '防守方ID',
	`totalRound` INT(3) DEFAULT 0 COMMENT '总轮数',
	`finalResult` INT(2) DEFAULT 3 COMMENT '结果，0-未开局，1-进攻方赢，2-防守方赢，3-平局，4-进攻方逃跑，5-防守方逃跑',
    `startTime` DATETIME DEFAULT NULL COMMENT '开始时间',
    `endTime` DATETIME DEFAULT NULL COMMENT '结束时间',
    `winScore` INT(3) DEFAULT 0 COMMENT '胜利分数',
    `lostScore` INT(3) DEFAULT 0 COMMENT '失败分数',
    `createTime` DATETIME DEFAULT NULL COMMENT '创建时间',
    
    PRIMARY KEY (`gmiId`)
)ENGINE=INNODB DEFAULT CHARSET=utf8 COMMENT '游戏对局信息';


CREATE TABLE `t_game_match_info`(
    `gmiId` BIGINT NOT NULL AUTO_INCREMENT COMMENT 'id',
    `offensive` BIGINT NOT NULL COMMENT '进攻方ID',
    `defensive` BIGINT NOT NULL COMMENT '防守方ID',
	`totalRound` INT(3) DEFAULT 0 COMMENT '总轮数',
	`finalResult` INT(2) DEFAULT 3 COMMENT '结果，0-未开局，1-进攻方赢，2-防守方赢，3-平局，4-进攻方逃跑，5-防守方逃跑',
    `startTime` DATETIME DEFAULT NULL COMMENT '开始时间',
    `endTime` DATETIME DEFAULT NULL COMMENT '结束时间',
    `winScore` INT(3) DEFAULT 0 COMMENT '胜利分数',
    `lostScore` INT(3) DEFAULT 0 COMMENT '失败分数',
    `createTime` DATETIME DEFAULT NULL COMMENT '创建时间',
    
    PRIMARY KEY (`gmiId`)
)ENGINE=INNODB DEFAULT CHARSET=utf8 COMMENT '游戏对局信息';
































