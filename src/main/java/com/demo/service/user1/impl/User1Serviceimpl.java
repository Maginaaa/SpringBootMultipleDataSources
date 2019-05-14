package com.demo.service.user1.impl;

import com.demo.bean.User1;
import com.demo.mapper.test1mapper.User1Mapper;
import com.demo.service.user1.User1Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service(value = "user1Service")
public class User1Serviceimpl implements User1Service {


    @Autowired
    private User1Mapper user1Mapper;


    @Override
    public List<User1> findAllUser() {
        return user1Mapper.selectAllUser();
    }
}
