package com.baizhi.controller;

import com.baizhi.entity.User;
import com.baizhi.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("test")
public class UserController {

    @Autowired
    UserMapper userMapper;

    @RequestMapping("test")
    public List<User> queryALl(){
        System.out.println("123123");
        List<User> users = userMapper.selectAll();
        return users;
    }
}
