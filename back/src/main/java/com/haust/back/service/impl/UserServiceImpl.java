package com.haust.back.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.haust.back.entity.User;
import com.haust.back.mapper.UserMapper;
import com.haust.back.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    @Override
    public User login(User user) {
        return userMapper
            .selectOne(new QueryWrapper<User>()
                    .eq("user_name", user.getUserName())
                    .eq("user_pwd", user.getUserPwd()));
    }

    @Override
    public IPage<User> getUserPage(int id, int size) {
        Page<User> page = new Page<>(id, size);
        return userMapper.selectPage(page, null);
    }

    @Override
    public User getUserDetailById(Integer id) {
        return userMapper.selectById(id);
    }

    @Override
    public User insertUser(User user) {
        User nuser = userMapper.selectOne(new QueryWrapper<User>().eq("user_name", user.getUserName()));
        if (nuser != null)
            return null;
        else {
            userMapper.insert(user);
            return user;
        }
    }

    @Override
    public User updateUser(User user) {
        int num = userMapper.update(user, new QueryWrapper<User>().eq("user_id", user.getUserId()));
        return num == 1 ? user : null;
    }

    @Override
    public int deleteById(Integer id) {
        return userMapper.deleteById(id);
    }
}

