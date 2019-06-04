package com.springboot;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.springboot.bean.Person;
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
    private Person person;

    //解决JPA因为懒加载导致JSON转换错误的问题
    @Bean
    public ObjectMapper objectMapper() {
        return new ObjectMapper().disable(SerializationFeature.FAIL_ON_EMPTY_BEANS);
    }

    @RequestMapping(value = "/", produces = "text/plain;charset=UTF-8")
    String index() {
        return "Hello Spring Boot! The person is:" + person;
    }

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}
