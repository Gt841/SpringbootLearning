package com.example.demo.service.Impl;

import com.example.demo.domain.User;

import com.example.demo.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Service;

import java.sql.ResultSet;
import java.sql.SQLException;

@Service
public class UserServiceImpl implements IUserService {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public void createUser(User user) {
        jdbcTemplate.update("insert into t_user(name,user_name,pass,age,sex,birthday) values(?,?,?,?,?,?);",
                user.getName(), user.getUserName(), user.getPass(), user.getAge(), user.getSex(), user.getBirthday());
    }

    @Override
    public void deleteUser(User user) {
        jdbcTemplate.update("delete from t_user where name=?", user.getName());
    }

    @Override
    public User getUser(User user) {
        return jdbcTemplate.queryForObject("select * from t_user where name=?", new RowMapper<User>() {
            @Override
            public User mapRow(ResultSet res, int i) throws SQLException {
                User userRes = new User();
                userRes.setId(res.getInt("id"));
                userRes.setName(res.getString("name"));
                userRes.setUserName(res.getString("user_name"));
                userRes.setAge(res.getInt("age"));
                userRes.setSex(res.getString("sex"));
                userRes.setPass(res.getString("pass"));
                userRes.setBirthday(res.getDate("birthday").toString());
                return userRes;
            }
        }, user.getName());
    }

}
