package com.springboot;

import com.springboot.bean.Person;
import com.springboot.bean.User;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @SpringBootApplication整个Spring Boot的核心注解，它的目的就是开启Spring Boot的自动配置
 */
@RestController
@SpringBootApplication
@EnableJpaRepositories("com.springboot")
public class Application {

    @Autowired
    private User user;

    @Autowired
    private Person person;

    //解决JPA因为懒加载导致JSON转换错误的问题
    @Bean
    public ObjectMapper objectMapper() {
        return new ObjectMapper().disable(SerializationFeature.FAIL_ON_EMPTY_BEANS);
    }

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @RequestMapping(value = "/", produces = "text/plain;charset=UTF-8")
    String index() {
        // user.name为madali，猜测是从idea中获取到的user的name，而非properties中的name。person中的name是从properties中获取到的。
        return "Hello Spring Boot! The person is:" + person + ", the user is:" + user;
    }

}
