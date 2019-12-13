package com.haku.project.service.impl;

import com.haku.project.entity.User;
import com.haku.project.mapper.UserMapper;
import com.haku.project.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class UserServiceImpl implements UserService {


    @Autowired
    private UserMapper userMapper;

    @Override
    public User queryUserById(Long id) {
        return userMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<User> queryAllUsers() {
        return userMapper.queryAllUsers();
    }
}
