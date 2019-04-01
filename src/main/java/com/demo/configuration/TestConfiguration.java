package com.demo.configuration;

import org.springframework.context.annotation.Configuration;

@Configuration
public class TestConfiguration {
    public TestConfiguration() {
        System.out.println("testConfiguration容器启动初始化");
    }
}
