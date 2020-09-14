package com.example.demo.service.Impl;

import com.example.demo.domain.User;
import com.example.demo.mapper.MyUserMapper;
import com.example.demo.service.IUserService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Component
@Service
public class UserService4MybatisImpl implements IUserService {
    @Autowired
    private MyUserMapper userMapper;
    @Override
    public void createUser(User user) {
        userMapper.insertUser(user);
    }

    @Override
    public User getUser(User user) {
        User userRes = userMapper.findByName(user.getName());
        return userRes;
    }

    /**
     * page 当前页数
     * size 每页大小
     *
     * @param pageNum
     * @param pageSize
     * @return
     */
    public PageInfo<User> findUserList(int pageNum, int pageSize) {
        // 开启分页插件,放在查询语句上面,作用于后面第一条sql语句
        PageHelper.startPage(pageNum, pageSize);
        List<User> listUser = userMapper.findAllUsers();
        // 封装分页之后的数据
        PageInfo<User> pageInfoUser = new PageInfo<>(listUser);
        return pageInfoUser;
    }

    @Override
    public void deleteUser(User user) {
        userMapper.deleteUserByName(user.getName());
    }
}
