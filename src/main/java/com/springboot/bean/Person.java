package com.springboot.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

/**
 * @Auther: madali
 * @Date: 2018/8/30 10:24
 */
@PropertySource(value = {"classpath:person.properties"}, ignoreResourceNotFound = true, encoding = "UTF-8", name = "person.properties")
@ConfigurationProperties(prefix = "person")
@Component
@NoArgsConstructor
@AllArgsConstructor
@Data
@ToString
public class Person {

    private String name;

    private String pwd;

    private int age;

}
