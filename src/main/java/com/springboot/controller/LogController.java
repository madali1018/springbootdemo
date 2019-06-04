package com.springboot.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @RestController：默认类中的方法都会以json的格式返回，且不用添加json的jar包，也不用配置spring controller扫描，对接的方法也不用添加@ResponseBody注解。
 * @Auther: madali
 * @Date: 2018/8/29 18:08
 */
@RestController
public class LogController {

    private static final Logger LOGGER = LoggerFactory.getLogger(LogController.class);

    @RequestMapping(value = "/log")
    String printLog() {
        for (int i = 0; i < 10; i++) {
            LOGGER.info("Log...{}", i);
        }
        return "Hello Spring Boot!";
    }

}
