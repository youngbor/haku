package com.haku.consumer.client;

import com.haku.consumer.entity.User;
import org.springframework.stereotype.Component;

@Component
public class UserClientFallback implements UserClient{

    @Override
    public User queryUserById(Long id) {
        User user = new User();
        user.setUsername("服务器正忙，请稍后再试");
        return user;
    }
}
