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
    `lastLoginDevice` INT(2) DEFAULT NULL COMMENT '上次登录设备：1-web，2-IOS，3-Andriod',
    
    PRIMARY KEY (`miId`),
    UNIQUE KEY (`maId`)
)ENGINE=INNODB AUTO_INCREMENT=10000001 DEFAULT CHARSET=utf8 COMMENT '用户信息表';


CREATE TABLE `t_member_comment`(
    `mcId` BIGINT NOT NULL AUTO_INCREMENT COMMENT 'id',
    `maId` BIGINT NOT NULL COMMENT '账号密码表id',
    `title` VARCHAR(40) DEFAULT NULL COMMENT '标题',
    `content` TEXT DEFAULT NULL COMMENT '内容',
    `memberSign` VARCHAR(100) DEFAULT NULL COMMENT '个性签名',
    `sex` INT(2) DEFAULT 3 COMMENT '性别：1-男，2-女，3-其他',
    `lastLoginTime` DATETIME DEFAULT NULL COMMENT '上次登录时间',
    `lastLoginIP` VARCHAR(30) DEFAULT NULL COMMENT '上次登录IP',
    `lastLoginDevice` INT(2) DEFAULT NULL COMMENT '上次登录设备：1-web，2-IOS，3-Andriod',
    
    PRIMARY KEY (`maId`),
    UNIQUE KEY (`accountCode`),
    UNIQUE KEY (`memberPhone`),
    UNIQUE KEY (`memberEmail`)
)ENGINE=INNODB DEFAULT CHARSET=utf8 COMMENT '用户建议';








