CREATE DATABASE `aurora`;


CREATE TABLE `t_member_auth`(
    `maId` BIGINT NOT NULL AUTO_INCREMENT COMMENT 'id',
    `accountCode` BIGINT NOT NULL COMMENT '账号',
    `memberPhone` VARCHAR(20) CHARACTER SET utf8mb4 NOT NULL COMMENT '手机（1）',
    `memberEmail` VARCHAR(50) CHARACTER SET utf8mb4 NOT NULL COMMENT '邮箱（2）',
    `authSalt` VARCHAR(10) CHARACTER SET utf8mb4 NOT NULL COMMENT '盐值',
    `memberPassword` VARCHAR(80) CHARACTER SET utf8mb4 NOT NULL COMMENT '密码，最短8位',
    `authFail` INT(2) NOT NULL DEFAULT 0 COMMENT '登录失败次数',
    `currentStatus` INT(2) NOT NULL DEFAULT 0 COMMENT '账号当前状态：0-正常，1-密码错误次数过多，2-管理员锁定',
    `registerTime` DATETIME NOT NULL COMMENT '注册时间',
    `updateTime` DATETIME NOT NULL COMMENT '更新时间',
    
    PRIMARY KEY (`maId`),
    UNIQUE KEY (`accountCode`),
    UNIQUE KEY (`memberPhone`),
    UNIQUE KEY (`memberEmail`)
)ENGINE=INNODB AUTO_INCREMENT=10000001 DEFAULT CHARSET=utf8mb4 COMMENT '用户账号密码表';


CREATE TABLE `t_member_info`(
    `miId` BIGINT NOT NULL AUTO_INCREMENT COMMENT 'id',
    `maId` BIGINT NOT NULL COMMENT '账号密码表id',
    `faceId` BIGINT NOT NULL DEFAULT 0 COMMENT '头像图片id',
    `area` BIGINT NOT NULL DEFAULT 0 COMMENT '地区',
    `nickName` VARCHAR(20) CHARACTER SET utf8mb4 DEFAULT '用户' COMMENT '昵称',
    `memberSign` VARCHAR(100) CHARACTER SET utf8mb4 COMMENT '个性签名',
    `sex` INT(2) NOT NULL DEFAULT 3 COMMENT '性别：1-男，2-女，3-其他',
    `lastLoginTime` DATETIME NOT NULL COMMENT '上次登录时间',
    `lastLoginIP` VARCHAR(30) CHARACTER SET utf8mb4 COMMENT '上次登录IP',
    `lastLoginDevice` INT(2) NOT NULL DEFAULT 0 COMMENT '上次登录设备：0-未知，1-web，2-IOS，3-Andriod',
    
    PRIMARY KEY (`miId`),
    UNIQUE KEY (`maId`)
)ENGINE=INNODB AUTO_INCREMENT=10000001 DEFAULT CHARSET=utf8mb4 COMMENT '用户信息表';


CREATE TABLE `t_member_comment`(
    `mcId` BIGINT NOT NULL AUTO_INCREMENT COMMENT 'id',
    `maId` BIGINT NOT NULL COMMENT '账号密码表id',
    `commentType` INT(2) DEFAULT 1 COMMENT '问题类型：1.游戏问题，2.给开发者',
    `title` VARCHAR(40) CHARACTER SET utf8mb4 COMMENT '标题',
    `content` VARCHAR(100) CHARACTER SET utf8mb4 COMMENT '内容',
    `commentDevice` INT(2) NOT NULL DEFAULT 0 COMMENT '发布设备：0-未知，1-web，2-IOS，3-Andriod',
    `createTime` DATETIME DEFAULT NULL COMMENT '发布时间',
    
    PRIMARY KEY (`mcId`),
    UNIQUE KEY (`maId`, `title`)
)ENGINE=INNODB DEFAULT CHARSET=utf8mb4 COMMENT '用户建议';


CREATE TABLE `t_member_friend`(
    `mfId` BIGINT NOT NULL AUTO_INCREMENT COMMENT 'id',
    `ownerId` BIGINT NOT NULL COMMENT '主人ID',
    `guestId` BIGINT NOT NULL COMMENT '好友ID',
    `createTime` DATETIME NOT NULL COMMENT '添加时间',
    
    PRIMARY KEY (`mfId`),
    UNIQUE KEY (`ownerId`, `guestId`)
)ENGINE=INNODB DEFAULT CHARSET=utf8mb4 COMMENT '用户好友';


CREATE TABLE `t_member_push`(
    `mpId` BIGINT NOT NULL AUTO_INCREMENT COMMENT 'id',
    `maId` BIGINT NOT NULL COMMENT '账号密码表id',
    `phone` INT(2) NOT NULL DEFAULT 1 COMMENT '手机广告，0-禁止，1-接收',
    `email` INT(2) NOT NULL DEFAULT 1 COMMENT '邮件广告，0-禁止，1-接收',
    `updateTime` DATETIME NOT NULL COMMENT '修改时间',
    `createTime` DATETIME NOT NULL COMMENT '添加时间',
    
    PRIMARY KEY (`mpId`),
    UNIQUE KEY (`maId`)
)ENGINE=INNODB DEFAULT CHARSET=utf8mb4 COMMENT '用户信息推送服务';


CREATE TABLE `t_member_photo_album`(
    `mpaId` BIGINT NOT NULL AUTO_INCREMENT COMMENT 'id',
    `maId` BIGINT NOT NULL COMMENT '账号密码表id',
    `title` VARCHAR(40) CHARACTER SET utf8mb4 NOT NULL DEFAULT '我的相册' COMMENT '相册标题',
    `des` VARCHAR(40) CHARACTER SET utf8mb4 NOT NULL DEFAULT '这是我的相册' COMMENT '相册描述',
    `model` VARCHAR(20) CHARACTER SET utf8mb4 NOT NULL DEFAULT 'index' COMMENT '相册模板',
    `num` INT NOT NULL DEFAULT 0 COMMENT '照片数量',
    `isShow` INT(2) NOT NULL DEFAULT 1 COMMENT '是否展示，0-不展示，1-展示',
    `updateTime` DATETIME NOT NULL COMMENT '修改时间',
    `createTime` DATETIME NOT NULL COMMENT '添加时间',
    
    PRIMARY KEY (`mpaId`)
)ENGINE=INNODB DEFAULT CHARSET=utf8mb4 COMMENT '用户相册';


CREATE TABLE `t_member_photo_album_picture`(
    `mpapId` BIGINT NOT NULL AUTO_INCREMENT COMMENT 'id',
    `maId` BIGINT NOT NULL COMMENT '账号密码表id',
    `mpaId` BIGINT NOT NULL COMMENT '用户相册表id',
    `relativePath` VARCHAR(50) NOT NULL COMMENT 'zimg的md5值',
    `sort` INT NOT NULL DEFAULT 1 COMMENT '排序',
    `updateTime` DATETIME NOT NULL COMMENT '修改时间',
    `createTime` DATETIME NOT NULL COMMENT '添加时间',
    
    PRIMARY KEY (`mpapId`)
)ENGINE=INNODB DEFAULT CHARSET=utf8mb4 COMMENT '用户相册照片';





CREATE TABLE `t_game_match_info`(
    `gmiId` BIGINT NOT NULL AUTO_INCREMENT COMMENT 'id',
    `offensive` BIGINT NOT NULL COMMENT '进攻方ID',
    `defensive` BIGINT NOT NULL COMMENT '防守方ID',
    `totalRound` INT(3) NOT NULL DEFAULT 0 COMMENT '总轮数',
    `finalResult` INT(2) NOT NULL DEFAULT 3 COMMENT '结果，0-未开局，1-进攻方赢，2-防守方赢，3-平局，4-进攻方逃跑，5-防守方逃跑',
    `startTime` DATETIME NOT NULL COMMENT '开始时间',
    `endTime` DATETIME NOT NULL COMMENT '结束时间',
    `winScore` INT(3) NOT NULL DEFAULT 0 COMMENT '胜利分数',
    `lostScore` INT(3) NOT NULL DEFAULT 0 COMMENT '失败分数',
    `createTime` DATETIME COMMENT '创建时间',
    
    PRIMARY KEY (`gmiId`)
)ENGINE=INNODB DEFAULT CHARSET=utf8mb4 COMMENT '游戏对局信息';


CREATE TABLE `t_game_score`(
    `gsId` BIGINT NOT NULL AUTO_INCREMENT COMMENT 'id',
    `maId` BIGINT NOT NULL COMMENT '用户账号密码表id',
    `score` INT NOT NULL DEFAULT 0 COMMENT '总分数',
    `playGameTotalTime` BIGINT NOT NULL DEFAULT 0 COMMENT '游戏时长',
    `totalTimes` INT NOT NULL DEFAULT 0 COMMENT '总共对局次数',
    `winCount` INT NOT NULL DEFAULT 0 COMMENT '胜率次数',
    `lostCount` INT NOT NULL DEFAULT 0 COMMENT '失败次数',
    `drawCount` INT NOT NULL DEFAULT 0 COMMENT '平局次数',
    `fleeCount` INT NOT NULL DEFAULT 0 COMMENT '逃跑次数',
    `lastPlayTime` DATETIME NOT NULL COMMENT '上次游戏时间',
    `lastDeviceType` INT(2) NOT NULL DEFAULT 0 COMMENT '发布设备：0-未知，1-web，2-IOS，3-Andriod',
    `lastLogonIP` VARCHAR(30) CHARACTER SET utf8mb4 COMMENT '上次登录IP',
    
    PRIMARY KEY (`gsId`),
    UNIQUE KEY (`maId`)
)ENGINE=INNODB DEFAULT CHARSET=utf8mb4 COMMENT '用户游戏分数';






CREATE TABLE `t_common_ad`(
    `caId` BIGINT NOT NULL AUTO_INCREMENT COMMENT 'id',
    `adType` INT(2) NOT NULL COMMENT '类型',
    `adTitle` VARCHAR(50) CHARACTER SET utf8mb4 NOT NULL COMMENT '标题',
    `adContent` VARCHAR(200) CHARACTER SET utf8mb4 COMMENT '内容',
    `imageId` BIGINT NOT NULL COMMENT '图片id',
    `imageLink` VARCHAR(256) CHARACTER SET utf8mb4 COMMENT '图片外链接',
    `updateTime` DATETIME NOT NULL COMMENT '更新时间',
    `createTime` DATETIME NOT NULL COMMENT '创建时间',
    `createUser` BIGINT NOT NULL COMMENT '创建人',
    
    PRIMARY KEY (`caId`)
)ENGINE=INNODB DEFAULT CHARSET=utf8mb4 COMMENT '广告';


CREATE TABLE `t_common_picture`(
    `cpId` BIGINT NOT NULL AUTO_INCREMENT COMMENT 'id',
    `pType` INT(2) NOT NULL DEFAULT 1 COMMENT '图片类型，1-用户头像，2-广告',
    `picAddress` VARCHAR(256) CHARACTER SET utf8mb4 NOT NULL DEFAULT '' COMMENT '图片地址',
    `createTime` DATETIME NOT NULL COMMENT '创建时间',
    `isShow` INT(2) NOT NULL DEFAULT 1 COMMENT '是否展示，0-不展示，1-展示',
    
    PRIMARY KEY (`cpId`)
)ENGINE=INNODB DEFAULT CHARSET=utf8mb4 COMMENT '图片表';


CREATE TABLE `t_common_count`(
    `ccId` BIGINT NOT NULL AUTO_INCREMENT COMMENT 'id',
    `accountCode` BIGINT NOT NULL DEFAULT 10001 COMMENT '账号，从10001开始，先获取，再自增',
    
    PRIMARY KEY (`ccId`)
)ENGINE=INNODB DEFAULT CHARSET=utf8mb4 COMMENT '计数表';




CREATE TABLE `t_php_project`(
    `ppId` BIGINT NOT NULL AUTO_INCREMENT COMMENT 'id',
    `accountName` VARCHAR(25) CHARACTER SET utf8mb4 NOT NULL COMMENT '账户名称',
    `repoName` VARCHAR(50) CHARACTER SET utf8mb4 NOT NULL COMMENT '源名称',
    `lang` VARCHAR(10) CHARACTER SET utf8mb4 COMMENT '语言',
    `defaultBranch` VARCHAR(20) CHARACTER SET utf8mb4 DEFAULT 'master' COMMENT '默认分支',
    `homepage` VARCHAR(256) CHARACTER SET utf8mb4 COMMENT '项目主页',
    `description` VARCHAR(256) CHARACTER SET utf8mb4 COMMENT '描述',
    `fileSize` INT NOT NULL DEFAULT 0 COMMENT '文件数量size',
    `forksCount` INT NOT NULL DEFAULT 0 COMMENT '创建分支数',
    `stargazersCount` INT NOT NULL DEFAULT 0 COMMENT '点赞人数',
    `watchersCount` INT NOT NULL DEFAULT 0 COMMENT '关注人数',
    `openIssuesCount` INT NOT NULL DEFAULT 0 COMMENT '开放式问题的计数',
    `createdAt` DATETIME COMMENT '创建时间',
    `updatedAt` DATETIME COMMENT '更新时间',
    `pushedAt` DATETIME COMMENT '推送时间',
    `gitUrl` VARCHAR(256) CHARACTER SET utf8mb4 COMMENT 'git地址',
    `sshUrl` VARCHAR(256) CHARACTER SET utf8mb4 COMMENT 'ssh地址',
    `cloneUrl` VARCHAR(256) CHARACTER SET utf8mb4 COMMENT '克隆地址',
    `svnUrl` VARCHAR(256) CHARACTER SET utf8mb4 COMMENT 'svn地址',
    
    `updateTime` DATETIME NOT NULL COMMENT '更新时间',
    
    PRIMARY KEY (`ppId`),
    UNIQUE KEY (`accountName`,`repoName`)
)ENGINE=INNODB DEFAULT CHARSET=utf8mb4 COMMENT '工程项目表';

CREATE TABLE `t_php_blog`(
    `pbId` BIGINT NOT NULL AUTO_INCREMENT COMMENT 'id',
    `title` VARCHAR(100) CHARACTER SET utf8mb4 NOT NULL COMMENT '文章标题',
    `type` VARCHAR(20) CHARACTER SET utf8mb4 NOT NULL COMMENT '文章类型',
    `csdnId` BIGINT NOT NULL COMMENT 'CSDN的文章ID',
    `originalUrl` VARCHAR(256) CHARACTER SET utf8mb4 COMMENT '原文地址',
    `description` VARCHAR(256) CHARACTER SET utf8mb4 COMMENT '描述',
    `bury` INT NOT NULL DEFAULT 0 COMMENT '埋葬',
    `digg` INT NOT NULL DEFAULT 0 COMMENT '掘客',
    `channel` INT NOT NULL DEFAULT 0 COMMENT '频道',
    `commentAllowed` INT(2) NOT NULL DEFAULT 1 COMMENT '允许评论，1-允许，2-不允许',
    `commentCount` INT NOT NULL DEFAULT 0 COMMENT '评论次数',
    `viewCount` INT NOT NULL DEFAULT 0 COMMENT '浏览次数',
    `createdAt` DATETIME COMMENT '创建时间',

    `updateTime` DATETIME NOT NULL COMMENT '更新时间',

    PRIMARY KEY (`pbId`),
    UNIQUE KEY (`title`)
)ENGINE=INNODB DEFAULT CHARSET=utf8mb4 COMMENT '个人博客';



INSERT INTO `t_common_count` (`ccid`) VALUES (NULL);









