package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @Author: song
 * @Date: 2020/11/17 19:43
 */
@SpringBootApplication
@EnableEurekaClient
public class PayMain8002 {
    public static void main(String[] args) {
        SpringApplication.run(PayMain8002.class, args);
    }
}
