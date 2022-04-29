package com.zsy.service.impl;

import com.zsy.mapper.UserMapper;
import com.zsy.model.UserEntity;
import com.zsy.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserMapper userMapper;

    @Override
    public List<UserEntity> selectUser() {
        return userMapper.selectUser();
    }
}
