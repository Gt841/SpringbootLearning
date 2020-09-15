package com.example.demo.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;

public interface UserMapper4Transaction {
    // 添加
    @Insert("INSERT INTO t_user(name, age) VALUES(#{name}, #{age})")
    public int insert(@Param("name") String name, @Param("age") Integer age);
}
