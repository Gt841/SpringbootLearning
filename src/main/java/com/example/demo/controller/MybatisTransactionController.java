package com.example.demo.controller;

import com.example.demo.service.UserService4Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MybatisTransactionController {
    @Autowired
    private UserService4Transaction userService4Transaction;

    @RequestMapping("/insertUserWithoutTransaction")
    public Integer insertUserWithoutTransaction(String name, Integer age) {
        return userService4Transaction.insertUser(name, age);
    }

    @RequestMapping("/insertUserWithTransaction")
    public Integer insertUserWithTransaction(String name, Integer age) {
        return userService4Transaction.insertUserWithTransaction(name, age);
    }
}
