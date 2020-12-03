package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @Author: song
 * @Date: 2020/11/17 19:43
 */
@SpringBootApplication
@EnableEurekaClient
@EnableDiscoveryClient
public class PayMain8001 {
    public static void main(String[] args) {
        SpringApplication.run(PayMain8001.class, args);
    }
}
