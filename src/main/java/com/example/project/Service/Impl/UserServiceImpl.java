package com.example.project.Service.Impl;

import com.example.project.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private RedisTemplate<String, String> redisTemplate;

    @Override
    public String queryById(Long id) {
        String name = redisTemplate.opsForValue().get("1");
        return name;
    }

}
