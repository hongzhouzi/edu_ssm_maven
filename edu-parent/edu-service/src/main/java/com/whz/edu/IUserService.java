package com.whz.edu;

import com.whz.edu.base.IBaseService;
import com.whz.edu.model.User;

public interface IUserService extends IBaseService<User> {
    //可以在这儿定义特有的方法
    public User login(String username, String password);
}
