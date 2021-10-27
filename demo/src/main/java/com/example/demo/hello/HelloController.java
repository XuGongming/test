package com.example.demo.hello;

import com.example.demo.hello.dto.User;
import com.example.demo.hello.dto.UserVO;
import com.example.demo.hello.service.UserService;
import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;
@Api
@RestController
public class HelloController {

    @Resource
    private UserService userService;

    @GetMapping("/hello")
    public String hello() {
        return "hello";
    }

    @GetMapping("/list/user")
    public List<UserVO> listUser() {
        return userService.findAll();
    }
    @PostMapping("/update/user")
    public String updateUserName(User user) {
        return userService.updateUserName(user);
    }

    @PostMapping("/insert/user")
    public String insertUser(@RequestBody User user) {
        return userService.insert(user);
    }
}