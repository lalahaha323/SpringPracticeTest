package com.imooc.first;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringTest {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("bean.xml");
        System.out.println(ctx.getBean("bean1")==ctx.getBean("bean1"));
        System.out.println(ctx.getBean("bean2")==ctx.getBean("bean2"));
    }
}
