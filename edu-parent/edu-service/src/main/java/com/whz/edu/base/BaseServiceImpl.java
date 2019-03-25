package com.whz.edu.base;

import com.whz.edu.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;

public abstract class BaseServiceImpl<T> implements IBaseService<T>{
    //统一管理bean，自动注入
    @Autowired
    protected UserMapper userMapper;
}
