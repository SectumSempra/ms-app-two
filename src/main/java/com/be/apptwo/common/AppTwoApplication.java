package com.be.apptwo.common;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableEurekaClient
@EnableFeignClients("com.be.apptwo.common.feignapi")
@SpringBootApplication
public class AppTwoApplication {

    public static void main(String[] args) {
        SpringApplication.run(AppTwoApplication.class, args);
    }
}
