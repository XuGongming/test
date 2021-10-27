package com.example.demo.hello;

import com.example.demo.hello.dto.User;
import com.example.demo.hello.service.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class HelloController {

    @Resource
    private UserService userService;

    @GetMapping("/hello")
    public String hello() {
        return "hello";
    }

    @GetMapping("/list/user")
    public List<User> listUser() {
        return userService.findAll();
    }
}