package com.demo.controller;

import com.demo.bean.User2;
import com.demo.service.user2.User2Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;


@Controller
@RequestMapping(value = "/user2")
public class User2Controller {
    @Autowired
    private User2Service user2Service;


    @ResponseBody
    @RequestMapping(value = "/all")
    public List<User2> findAllUser(){
        return user2Service.findAllUser();
    }
}
