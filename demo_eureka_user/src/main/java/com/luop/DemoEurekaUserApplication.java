package com.luop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class DemoEurekaUserApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoEurekaUserApplication.class, args);
    }

}
