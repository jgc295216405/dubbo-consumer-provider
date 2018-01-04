package com.netease.dubbo.test.consumer;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ConsumerMain {
    public static void main(String[] args) {
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("classpath:spring-consumer.xml");
        CommonApiClient commonApiClient=(CommonApiClient)applicationContext.getBean(CommonApiClient.class);
        System.out.println(commonApiClient.getSquare(10));
    }


}
