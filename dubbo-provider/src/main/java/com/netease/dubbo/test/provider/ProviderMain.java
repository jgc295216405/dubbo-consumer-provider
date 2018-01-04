package com.netease.dubbo.test.provider;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ProviderMain {

    public static void main(String[] args) throws InterruptedException {
        AbstractApplicationContext applicationContext=new ClassPathXmlApplicationContext("classpath:spring-provider.xml");
applicationContext.start();
Thread.sleep(Integer.MAX_VALUE);
    }
}
