package com.whz.edu.impl;

import com.whz.edu.IUserService;
import com.whz.edu.base.BaseServiceImpl;
import com.whz.edu.model.User;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class UserServiceImpl extends BaseServiceImpl<User> implements IUserService{
    @Override
    public User findById(Integer id) {
        return userMapper.findById(id);
    }

    @Override
    public User findByUUID(String uuid) {
        return null;
    }

    @Override
    public void deleteById(Integer id) {

    }

    @Override
    public void deleteByUUID(String uuid) {

    }

    @Override
    public void update(User user) {

    }

    @Override
    public void insert(User user) {

    }

    @Override
    public User login(String username, String password) {
        return null;
    }
}
