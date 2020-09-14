package com.example.demo.controller;

import com.example.demo.domain.User;
import com.example.demo.service.Impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;

@RestController
@RequestMapping("/usertest")
public class UserServiceTestController {
    @Autowired
    private UserServiceImpl userService;

    @RequestMapping("/create")
    public String createUser(){
        User user = new User();
        user.setName("陈太太");
        user.setUserName("哈先森");
        user.setAge(22);
        user.setSex("女");
        user.setPass("12334");
        user.setBirthday(LocalDate.now().toString());
        userService.createUser(user);
        return "create user";
    }
    @RequestMapping("/get")
    public User getUser() {
        User user = new User();
        user.setName("陈太太");

        System.out.println(userService.getUser(user));
        return userService.getUser(user);
    }
    @RequestMapping("/delete")
    String deleteUser() {
        User user = new User();
        user.setName("陈太太");
        userService.deleteUser(user);
        return "delete";
    }


}
