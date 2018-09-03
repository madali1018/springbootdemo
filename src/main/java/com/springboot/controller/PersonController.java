package com.springboot.controller;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

/**
 * @Auther: madali
 * @Date: 2018/8/29 18:18
 */
@RestController
@SpringBootApplication
@RequestMapping(value = "/person")
public class PersonController {

    @RequestMapping(value = "/p1")
    String p1() {
        System.out.println("p1...");
        return "Hello person!";
    }

    @RequestMapping(value = "/p2", method = RequestMethod.GET)
    String p2(@RequestParam(value = "username") String username) {
        System.out.println("p2...");
        return "Hello person:" + username;
    }

    //普通的post请求，不支持json
    @RequestMapping(value = "/p3", method = RequestMethod.POST)
    String p3(@RequestParam(value = "username") String username) {
        System.out.println("p3...");
        return "Hello person:" + username;
    }

    //在入参设置@RequestBody注解表示接收整个报文体，这里主要用在接收整个POST请求中的json报文体。
    @RequestMapping(value = "/p4",method = RequestMethod.POST)
    String p4(@RequestBody String data){
        System.out.println("p4...");
        return "Json is " + data;
    }

}
