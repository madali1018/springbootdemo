package com.springboot.controller;

import com.springboot.bean.User;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @RestController注解： 默认类中的方法都会以json的格式返回，且不用添加json的jar包，也不用配置spring controller扫描，对接的方法也不用添加@ResponseBody注解。
 * @Auther: madali
 * @Date: 2018/8/29 18:18
 */
@RestController
@SpringBootApplication
@RequestMapping(value = "/user")
public class UserController {

    @RequestMapping(value = "/getUser")
    User getUser() {
        User user = new User();
        user.setAge(16);
        user.setName("zhangsan");
        return user;
    }

}
