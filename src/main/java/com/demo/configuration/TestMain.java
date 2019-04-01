package com.demo.configuration;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestMain {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(TestConfiguration.class);
        //如果是加载spring-context.xml文件：
        //ApplicationContext context = new ClassPathXmlApplicationContext("spring-context.xml");
        TestBean tb = (TestBean)context.getBean("testBean");
        tb.sayHello();

    }
}
