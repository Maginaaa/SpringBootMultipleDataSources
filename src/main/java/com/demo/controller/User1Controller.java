package com.demo.controller;


import com.demo.bean.User1;
import com.demo.service.user1.User1Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping(value = "/user1")
public class User1Controller {

    @Autowired
    private User1Service user1Service;


    @ResponseBody
    @RequestMapping(value = "/all")
    public List<User1> findAllUser(){
        return user1Service.findAllUser();
    }


}
