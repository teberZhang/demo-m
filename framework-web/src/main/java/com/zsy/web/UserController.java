package com.zsy.web;

import com.zsy.model.UserEntity;
import com.zsy.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    UserService userService;

    @RequestMapping("/user/list")
    public List<UserEntity> selectUser()
    {
        return userService.selectUser();
    }
}
