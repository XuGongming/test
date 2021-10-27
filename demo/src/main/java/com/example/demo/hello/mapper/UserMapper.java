package com.example.demo.hello.mapper;

import com.example.demo.hello.dto.User;

import java.util.List;

public interface UserMapper {
    List<User> findAll();
}
