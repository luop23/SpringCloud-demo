package com.luop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class DemoEurekaOrderApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoEurekaOrderApplication.class, args);
    }

}
