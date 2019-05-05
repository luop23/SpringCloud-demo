package com.luop.controller;

import com.luop.entity.User;
import com.luop.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/getById")
    public User getUser(int id){
        User user = userService.getUserById(id);
        return user;
    }

}
