package com.haku.consumer.controller;

import com.haku.consumer.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Controller
@RequestMapping("consumer/user")
public class UserController {

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private DiscoveryClient discoveryClient;    // 包含了拉取的所有服务信息


    @GetMapping
    @ResponseBody
    public User queryUserById(@RequestParam("id") Long id){
        List<ServiceInstance> instances = discoveryClient.getInstances("haku-provider");
        ServiceInstance serviceInstance = instances.get(0);
        return this.restTemplate.getForObject("http://"+ serviceInstance.getHost() + ":"
                + serviceInstance.getPort() + "/user/" + id, User.class);
    }

}
