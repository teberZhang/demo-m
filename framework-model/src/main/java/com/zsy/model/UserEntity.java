package com.zsy.model;

import lombok.Data;

@Data
public class UserEntity {
    private int id;
    private int age;
    private String username;
    private String password;
    private String address;
}
