package com.springboot.springboot1;

import com.springboot.controller.LogController;
import com.springboot.controller.UserController;
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
public class Springboot1ApplicationTests {

    private MockMvc mockMvc;

    @Before
    public void setUp() {
        System.out.println("..............");
    }

    /**
     * 打开的src/test/下的测试入口，编写简单的http请求来测试；使用mockmvc进行，利用MockMvcResultHandlers.print()打印出执行结果。
     *
     * @throws Exception
     */
    @Test
    public void printLog() throws Exception {
        mockMvc = MockMvcBuilders.standaloneSetup(new LogController()).build();
        mockMvc.perform(MockMvcRequestBuilders.get("/log").accept(MediaType.APPLICATION_JSON))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andDo(MockMvcResultHandlers.print())
                .andReturn();
    }

    @Test
    public void user() throws Exception {
        mockMvc = MockMvcBuilders.standaloneSetup(new UserController()).build();
        mockMvc.perform(MockMvcRequestBuilders.get("/user").accept(MediaType.APPLICATION_JSON))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andDo(MockMvcResultHandlers.print())
                .andReturn();
    }

}
