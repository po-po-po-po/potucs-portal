package com.potucs.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Auther wangzekun
 * @Date 2021/7/28 11:22
 * @Description 航班列表
 */
@RestController
@RequestMapping("/flight")
@Slf4j
public class FlightController {

    /**
     * 航班测试页面
     * @return
     */
    @GetMapping("/index")
    public String index(){
        log.info("--------航班测试页面----------------");
        return "航班测试页面";
    }


}
