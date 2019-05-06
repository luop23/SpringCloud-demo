package com.luop.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class CommonConfig {

    @Bean
    @LoadBalanced      //ribbon的负载均衡注解
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }
}
