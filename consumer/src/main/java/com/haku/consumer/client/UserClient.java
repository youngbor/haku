package com.haku.consumer.client;

import com.haku.consumer.entity.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(value = "haku-provider",fallback = UserClientFallback.class)
public interface UserClient {

    @GetMapping("user/{id}")
    public User queryUserById(@PathVariable("id") Long id);

}
