package com.potucs;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @Auther wangzekun
 * @Date 2021/7/27 10:50
 * @Description
 */

@SpringBootApplication
@MapperScan("com.potucs.mapper")//扫描的mapper
public class PotucsApplication {
    public static void main(String[] args) {
        //启动spring应用程序
        SpringApplication.run(PotucsApplication.class,args);
    }
}
