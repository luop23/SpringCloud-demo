package com.luop.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/order")
public class OrderController {

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/user/getUserByEureka")
    public Object getUserByEureka(int id) {
        String url = "http://micro-service-user/user/getById?id=" + id;
        Object user =  restTemplate.getForEntity(url, Object.class);
        return user;
    }
}
