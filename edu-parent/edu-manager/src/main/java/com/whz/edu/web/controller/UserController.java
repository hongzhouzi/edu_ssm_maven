package com.whz.edu.web.controller;

import com.whz.edu.IUserService;
import com.whz.edu.base.BaseServiceImpl;
import com.whz.edu.impl.UserServiceImpl;
import com.whz.edu.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("user")
public class UserController{
//    自动注入，使用接编程口
    @Autowired
    private IUserService userService;
    @RequestMapping("login")
    public ModelAndView login(Integer uid){
        User user = userService.findById(uid);
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("user",user);
        //返回到login界面
        modelAndView.setViewName("login");
        return modelAndView;
    }
}
