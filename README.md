# Dubbo Monitor for Spring Boot

#### 声明：版权归原项目所有  [yjmyzz的fork](!https://gitee.com/yjmyzz/dubbo-monitor)  [韩都衣舍dubbo-monitor](!https://gitee.com/handu/dubbo-monitor)

#### 计划：研究[dubbo side projects ops](!https://github.com/apache/incubator-dubbo-ops)考虑如何保持一致


### 升级日志
>#### 2018-01-30
>
> 1. 切换到阿里官方2.6.0版本，System页dubbo版本显示为Version.getVersion()值
> 2. 删除原mongodb分支
> 3. 简化本README.md

>#### 2018-01-15
>
> 1. 改造为Spring Boot方式，可用java -jar方式启动，目前仍使用dubbox的2.8.4版本，官方dubbo恢复更新，后续考虑切换回来

### 启动方式

`第一种方式`：使用命令行传参启动

```
nohup java -jar target/dubbo-monitor.jar --server.port=8080
--dubbo.registry.address=zookeeper://127.0.0.1:2181 --dubbo.protocal.port=6060 
--db.host=127.0.0.1 --db.port=3306 --db.username=root --db.passport=12345678
--manager.username=admin --manager.password=admin
-server -Xms500m -Xmn200m -Xmx500m -XX:+UseParallelGC -XX:+HeapDumpOnOutOfMemoryError 
-XX:HeapDumpPath=./dump.log  -XX:ErrorFile=./crash.log -Djava.security.egd=file:/dev/./urandom &
```

`第二种方式`：使用Spring Cloud Config配置启动(推荐)

```
nohup java -jar target/dubbo-monitor.jar --server.port=8080
--spring.cloud.config.uri=http://127.0.0.1:9999 --spring.cloud.config.profile=dev --spring.cloud.config.label=dev
-server -Xms500m -Xmn200m -Xmx500m -XX:+UseParallelGC -XX:+HeapDumpOnOutOfMemoryError 
-XX:HeapDumpPath=./dump.log  -XX:ErrorFile=./crash.log -Djava.security.egd=file:/dev/./urandom &
```

### 访问方式
使用配置的manager.username和manager.password进行登录。