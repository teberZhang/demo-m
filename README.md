SpringBoot多模块开发demo
======   
 
项目整体结构
-----
![image](./demo-m.png)

模块依赖关系   
-----
![image](./demo-relation.png)

快速开始
-----

##### 表结构
````
CREATE TABLE `user` (
  `id` int(10) NOT NULL AUTO_INCREMENT,
  `age` int(10) NOT NULL DEFAULT '0',
  `username` varchar(32) NOT NULL,
  `password` varchar(50) NOT NULL,
  `address` varchar(32) NOT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8mb4 ROW_FORMAT=COMPACT;
````

##### 启动程序
* framework-web模块 FrameworkWebApplication
````
21:25:24.624 [main] DEBUG cn.hutool.log.LogFactory - Use [Slf4j] Logger As Default.
21:25:24.626 [main] INFO com.zsy.FrameworkWebApplication - com.zsy.FrameworkWebApplication开始启动...

  .   ____          _            __ _ _
 /\\ / ___'_ __ _ _(_)_ __  __ _ \ \ \ \
( ( )\___ | '_ | '_| | '_ \/ _` | \ \ \ \
 \\/  ___)| |_)| | | | | || (_| |  ) ) ) )
  '  |____| .__|_| |_|_| |_\__, | / / / /
 =========|_|==============|___/=/_/_/_/
 :: Spring Boot ::                (v2.6.7)

2022-04-29 21:25:25.051  INFO 88982 --- [           main] com.zsy.FrameworkWebApplication          : Starting FrameworkWebApplication using Java 1.8.0_311 on zhangsandeMacBook-Pro.local with PID 88982 (/Users/zhangsan/demo-m/framework-web/target/classes started by zhangsan in /Users/zhangsan/demo-m)
2022-04-29 21:25:25.052  INFO 88982 --- [           main] com.zsy.FrameworkWebApplication          : No active profile set, falling back to 1 default profile: "default"
2022-04-29 21:25:25.792  INFO 88982 --- [           main] o.s.b.w.embedded.tomcat.TomcatWebServer  : Tomcat initialized with port(s): 8082 (http)
2022-04-29 21:25:25.799  INFO 88982 --- [           main] o.apache.catalina.core.StandardService   : Starting service [Tomcat]
2022-04-29 21:25:25.800  INFO 88982 --- [           main] org.apache.catalina.core.StandardEngine  : Starting Servlet engine: [Apache Tomcat/9.0.62]
2022-04-29 21:25:25.889  INFO 88982 --- [           main] o.a.c.c.C.[Tomcat].[localhost].[/]       : Initializing Spring embedded WebApplicationContext
2022-04-29 21:25:25.889  INFO 88982 --- [           main] w.s.c.ServletWebServerApplicationContext : Root WebApplicationContext: initialization completed in 802 ms
2022-04-29 21:25:25.945  INFO 88982 --- [           main] c.a.d.s.b.a.DruidDataSourceAutoConfigure : Init DruidDataSource
 Consume Time：8 ms 2022-04-29 21:25:26
 Execute SQL：SELECT 1

 Consume Time：0 ms 2022-04-29 21:25:26
 Execute SQL：SELECT 1

2022-04-29 21:25:26.178  INFO 88982 --- [           main] com.alibaba.druid.pool.DruidDataSource   : {dataSource-1} inited
 _ _   |_  _ _|_. ___ _ |    _ 
| | |\/|_)(_| | |_\  |_)||_|_\ 
     /               |         
                        3.2.0 
2022-04-29 21:25:26.538  INFO 88982 --- [           main] o.s.b.w.embedded.tomcat.TomcatWebServer  : Tomcat started on port(s): 8082 (http) with context path ''
2022-04-29 21:25:26.545  INFO 88982 --- [           main] com.zsy.FrameworkWebApplication          : Started FrameworkWebApplication in 1.821 seconds (JVM running for 2.308)
2022-04-29 21:25:26.547  INFO 88982 --- [           main] com.zsy.FrameworkWebApplication          : com.zsy.FrameworkWebApplication启动成功！
````

##### 访问
**http://localhost:8082/user/list**
````
[{"id":1,"age":20,"username":"jack","password":"b2389dcdeabc536609841937c5409f90","address":"张三"}]
````
