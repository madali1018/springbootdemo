## Spring Boot demo工程  ## 

1.Spring Boot可以以jar的形式独立运行，运行一个Spring Boot项目只需要通过 java -jar xxx.jar命令来运行。
2.Spring Boot可以选择内嵌Tomcat，Jetty或者Udertow，这样我们不需要以war的形式部署项目。  
3.Spring Boot提供了基于http，ssh，telnet对运行时的项目进行监控。  
4.**Spring Boot默认使用LogBack**，但是没有看到显示依赖的jar包，其实是因为所在的jar包spring-boot-starter-logging都是作为spring-boot-starter-web或者spring-boot-starter依赖的一部分。如果要使用log4j2,可参考 [Log4j2使用详解](https://mp.weixin.qq.com/s?__biz=MzUzODg2NDg1Mw==&mid=2247483716&idx=1&sn=2b28f82896d4b49903a7f49792aeeb85&chksm=fad07cfecda7f5e8a18e4cf3e1e9536b4f765810a541249e820d0bb582c99652490e027c9260&mpshare=1&scene=23&srcid=#rd)

访问路径：  
http://localhost:8080/index  
http://localhost:8080/index/log  
http://localhost:8080/index/user/getUser  
http://localhost:8080/index/person/p1  
http://localhost:8080/index/person/p2?username=name1  


http://localhost:8080/index/dept/queryAll  
http://localhost:8080/index/dept/findById/1  
http://localhost:8080/index/dept/getOne/1  
http://localhost:8080/index/dept/count


