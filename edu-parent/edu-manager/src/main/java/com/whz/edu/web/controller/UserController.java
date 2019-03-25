package com.whz.edu.web.controller;

import com.whz.edu.IUserService;
import com.whz.edu.model.User;
import com.whz.edu.web.controller.base.BaseController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("user")
public class UserController extends BaseController<User> {
//    自动注入，使用接编程口
    @Autowired
    private IUserService userService;
    @RequestMapping("login")
    public ModelAndView login(Integer uid){
        User user = userService.findById(uid);
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("user",user);
        //返回到login界面
        modelAndView.setViewName("Default");
        return modelAndView;
    }

    @RequestMapping("index")
    public  String index(){
        return "Default";
    }

    @RequestMapping(MANAGE)
    public String manage(){
        return MANAGE_PAGE;
    }

    @RequestMapping(INFO)
    public String info(){
        return INFO_PAGE;
    }

    @RequestMapping(EDIT)
    public String edit(){
        return EDIT_PAGE;
    }

    /*@RequestMapping("info")
    public String info(){
        return "user/info";
    }

    @RequestMapping("edit")
    public String edit(){
        return "user/edit";
    }*/
}
