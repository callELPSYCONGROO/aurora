AURORA
===========

> 基于SpringCloud构建的微服务后端系统



一、模块说明
------

### 项目启动顺序：
1. ra 注册中心

2. config-server 配置中心 

3. db-server 数据持久化层
 
4. 接口层、网关、监控中心可按需启动
 

### 项目分类：
* EUREKA注册中心
    * ra 注册中心
* 配置中心
    * config-server 配置中心 
* 持久层服务
    * db-server 数据持久化层
* 接口层
    * album-service 相册接口
    * auth-service 认证接口
    * file-service 文件接口
    * notify-service 通知接口
    * php-service 个人博客接口
    * rabbitmq-service 消息队列接口
    * game-service 游戏信息接口
    * member-service 用户信息接口
* Zuul网关
    * gateway 网关
* 监控中心
    * monitor 监控
* jar包工具
    * utils 工具类
    * consumer 工具类

* * * * * * * * * *

