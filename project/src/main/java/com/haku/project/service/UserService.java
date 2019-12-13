package com.haku.project.service;

import com.haku.project.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

public interface UserService {

    public User queryUserById(Long id);

    public List<User> queryAllUsers();

}