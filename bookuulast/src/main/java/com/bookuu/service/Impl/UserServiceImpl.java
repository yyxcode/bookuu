package com.bookuu.service.Impl;

import com.bookuu.entity.User;
import com.bookuu.mapper.UserMapper;
import com.bookuu.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * User服务实现类
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserMapper userMapper;

    @Override
    public Integer count(String username) {
        return userMapper.count(username);
    }

    @Override
    public User user(String userName,String userPass) {
        return userMapper.user(userName,userPass);
    }

    @Override
    public void insertUser(String username, String password, Integer phone, String useremail, String usercompany, String useraddress) {
        userMapper.insertUser(username, password, phone, useremail, usercompany, useraddress);
    }
}
