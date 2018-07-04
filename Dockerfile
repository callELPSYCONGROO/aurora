FROM maven:3-jdk-8

MAINTAINER mayh0991@126.com

ENV PATH_APP="/app"
ENV PATH_DATA="/data"
ENV PATH_BUILD="/tmp/build"
# 要构建的项目文件路径
ENV PATH_PROJECT="component/ra"

# 创建目录
RUN mkdir -p $PATH_APP \
    && mkdir -p $PATH_DATA \
    && mkdir -p $PATH_BUILD
# 将项目复制到构将目录中来
COPY . $PATH_BUILD
# 构建应用
RUN cd $PATH_BUILD \
    # 打包
    && mvn -q -Dmaven.test.skip=true package \
    # 拷贝编译结果到工作目录
    && mv $PATH_PROJECT/target/*.jar $PATH_APP \
    # 清除编译文件
    && rm -fr $PATH_BUILD
# 进入工作目录
WORKDIR $PATH_APP
# 挂载目录
VOLUME $PATH_DATA
# 工作端口
EXPOSE 7901
# 运行程序
CMD java -jar $PATH_APP/component-ra-1.0.jar