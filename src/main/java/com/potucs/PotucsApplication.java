package com.potucs;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Service;

/**
 * @Auther wangzekun
 * @Date 2021/7/27 10:50
 * @Description
 */

@SpringBootApplication(scanBasePackages = {"com.potucs.controller","com.potucs.handler","com.potucs.config"})
@MapperScan("com.potucs.mapper")//扫描的mapper
@Service
public class PotucsApplication {
    public static void main(String[] args) {
        //启动spring应用程序
        SpringApplication.run(PotucsApplication.class,args);
    }
}
