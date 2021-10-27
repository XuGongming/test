package com.example.demo.hello.service.impl;

import com.example.demo.hello.dto.User;
import com.example.demo.hello.mapper.UserMapper;
import com.example.demo.hello.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Resource
    private UserMapper userMapper;

    @Override
    public List<User> findAll() {
        List<User> list = userMapper.findAll();
        return list;
    }
}
