package com.wenyb;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//API配置dubbo的方式
@EnableDubbo(scanBasePackages = "com.wenyb")
//xml配置dubbo的方式
//@ImportResource(locations = "classpath:consumer.xml")
@SpringBootApplication
public class SpringbootOrderServiceConsumerApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootOrderServiceConsumerApplication.class, args);
    }

}

