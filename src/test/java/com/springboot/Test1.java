package com.springboot;

import com.springboot.bean.Dept;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

/**
 * @Auther: madali
 * @Date: 2018/8/31 11:04
 */
public class Test1 {

    @Test
    public void test1() {
        String url = "http://localhost:8080/index/dept/save";

        Map<String, Object> paramMap = new HashMap<>();
        Dept dept = new Dept(null, "行政部", "行政部...");
        paramMap.put("dept", dept);

    }

    @Test
    public void test2() {
        // {"name": "财务部","description": "财务部..."}
    }

}