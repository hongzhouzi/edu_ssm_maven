package com.whz.edu.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("salary")
public class Salary {
    @RequestMapping("manage")
    public String manage(){
        return "salary/manage";
    }

    @RequestMapping("info")
    public String info(){
        return "salary/info";
    }

    @RequestMapping("edit")
    public String edit(){
        return "salary/edit";
    }
}
