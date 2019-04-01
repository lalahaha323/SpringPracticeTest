package com.demo.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
@ComponentScan(basePackages="com.demo.configuration")
public class TestConfiguration {
    public TestConfiguration() {
        System.out.println("testConfiguration容器启动初始化");
    }
}
