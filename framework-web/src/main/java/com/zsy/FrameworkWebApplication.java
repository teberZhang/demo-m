package com.zsy;

import cn.hutool.log.Log;
import cn.hutool.log.LogFactory;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.zsy.mapper")
@SpringBootApplication
public class FrameworkWebApplication {

    private static final Log log = LogFactory.get(FrameworkWebApplication.class);

    public static void main(String[] args) {
        log.info("{}开始启动...", log.getName());
        SpringApplication.run(FrameworkWebApplication.class, args);
        log.info("{}启动成功！", log.getName());
    }

}
