# 目录分层设计
-------------------------------------------------------


### 项目打包命令
```$xslt
mvn clean package -Dmaven.test.skip=true
```

### 项目启动脚本
```$xslt
cd target
nohup java -jar basic-0.0.1-SNAPSHOT.jar --spring.profiles.active=online > log/app.log &
tail -100f log/app.log
```


### 在dos窗口中的相关命令
#### 查询被占用的端口好
```angular2
netstat  -aon|findstr “端口号”
```
####强杀占用端口的进程：
```angular2
taskkill /pid 进程编号 /F
```



