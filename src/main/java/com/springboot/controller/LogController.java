package com.springboot.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Auther: madali
 * @Date: 2018/8/29 18:08
 */
@RestController//@RestController的意思就是controller里面的方法都以json格式输出，不用再写什么jackjson配置的了！
public class LogController {

    private static final Logger LOGGER = LoggerFactory.getLogger(LogController.class);

    @RequestMapping(value = "/log")
    String printLog() {
        LOGGER.info("Log......................");
        return "Hello Spring Boot!";
    }

}
