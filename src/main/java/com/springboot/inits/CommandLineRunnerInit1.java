package com.springboot.inits;

import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * 项目启动时初始化一些操作，以下三种方法：
 * <p>
 * 1.使用SpringBoot的ApplicationRunner与CommandLineRunner接口
 * 2.Spring Bean初始化的InitializingBean,init-method和PostConstruct
 * 3.Spring的事件机制
 * <p>
 * 1.ApplicationRunner或CommandLineRunner接口，这两个接口工作方式相同，都只提供单一的run方法，
 * 而且该方法仅在SpringApplication.run(…)完成之前调用，更准确的说是在构造SpringApplication实例完成之后调用run()的时候。
 * 2.也可以同时使用ApplicationRunner和CommandLineRunner，默认情况下前者比后者先执行，但是这没有必要，使用一个就好了
 * 3.二者区别：两个接口都有run()方法，只不过它们的参数不一样，CommandLineRunner的参数是最原始的参数，没有进行任何处理，ApplicationRunner的参数是ApplicationArguments,是对原始参数的进一步封装
 * <p>
 * Created by madali on 2019/6/4 15:14
 */
@Component
@Order(1)// 指定调用顺序，@Order()中的值越小，优先级越高
public class CommandLineRunnerInit1 implements CommandLineRunner {

    @Override
    public void run(String... args) throws Exception {
        System.out.println("CommandLineRunner");
    }

}
