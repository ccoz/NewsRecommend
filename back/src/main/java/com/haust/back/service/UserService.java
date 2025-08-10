package com.haust.back.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.haust.back.entity.User;

public interface UserService {
    User login(User user);
    IPage<User> getUserPage(int id, int size);
    User getUserDetailById(Integer id);
    User insertUser(User user);
    User updateUser(User user);
    int deleteById(Integer id);
}

