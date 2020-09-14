package com.example.demo.mapper;

import com.example.demo.domain.User;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.type.JdbcType;

import java.util.List;

public interface MyUserMapper {
    // 查询
    @Select("SELECT * FROM t_user WHERE NAME = #{name}")
    @Results({
            @Result(column = "user_name", property = "userName", jdbcType = JdbcType.VARCHAR)
    })
    User findByName(@Param("name") String name);

    @Select("SELECT * FROM t_user")
    @Results({@Result(column = "user_name", property = "userName", jdbcType = JdbcType.VARCHAR)})
    List<User> findAllUsers();

    // 删除
    @Delete("DELETE FROM t_user WHERE id = #{id}")
    int deleteUserById(@Param("id") int id);

    @Delete("DELETE FROM t_user WHERE name = #{name}")
    void deleteUserByName(@Param("name")String name);

    // 添加
    @Insert("INSERT INTO t_user (NAME,USER_NAME,PASS,AGE,SEX,BIRTHDAY) VALUES (#{name},#{userName}, #{pass}, #{age}, #{sex}, #{birthday})")
    int insertUser(User user);




}
