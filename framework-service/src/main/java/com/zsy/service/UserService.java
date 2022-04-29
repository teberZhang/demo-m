package com.zsy.service;

import com.zsy.model.UserEntity;

import java.util.List;

public interface UserService {
    List<UserEntity> selectUser();
}
