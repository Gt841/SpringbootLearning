package com.example.demo.service;

import com.example.demo.domain.User;

public interface IUserService {
    void createUser(User user);
    void deleteUser(User user);
    User getUser(User user);
}
