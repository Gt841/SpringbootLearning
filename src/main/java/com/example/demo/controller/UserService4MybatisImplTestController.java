package com.example.demo.controller;

import com.example.demo.domain.User;
import com.example.demo.mapper.MyUserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;

@RestController
@RequestMapping("/usertest1")
public class UserService4MybatisImplTestController {
    @Autowired
    private MyUserMapper userMapper;

    @RequestMapping("/create")
    String createUser() {
        User user = new User();
        user.setName("周老板");
        user.setUserName("周先森");
        user.setAge(22);
        user.setSex("男");
        user.setPass("212334");
        user.setBirthday(LocalDate.now().toString());
        userMapper.insertUser(user);
        return "create";
    }
    @RequestMapping("/get")
    User getUser() {
        User user = userMapper.findByName("周老板");
        System.out.println(user);
        return user;
    }
    @RequestMapping("/del")
    String deleteUser(){
        userMapper.deleteUserByName("周老板");
        return "delete";
    }
}
