package com.springboot.bean;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

/**
 * @Auther: madali
 * @Date: 2018/8/29 14:26
 */
@PropertySource(value = {"classpath:user.properties"}, ignoreResourceNotFound = true, encoding = "UTF-8", name = "user.properties")
@ConfigurationProperties(prefix = "user")
@Component
public class User {

    private String name;
    private String pwd;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("User{");
        sb.append("name='").append(name).append('\'');
        sb.append(", pwd='").append(pwd).append('\'');
        sb.append(", age=").append(age);
        sb.append('}');
        return sb.toString().replace("'null'", "null");
    }
}
