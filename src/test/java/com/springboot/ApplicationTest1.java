package com.springboot;

import com.springboot.controller.LogController;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultHandlers;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ApplicationTest1 {

    private MockMvc mockMvc;

    @Before
    public void setUp() {
        System.out.println("..............");
    }

    // 简单的http请求测试
    @Test
    public void t0() throws Exception {
        mockMvc = MockMvcBuilders.standaloneSetup(new LogController()).build();
        mockMvc.perform(MockMvcRequestBuilders.get("/log").accept(MediaType.APPLICATION_JSON))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andDo(MockMvcResultHandlers.print()) // 打印执行结果
                .andReturn();
    }

}
