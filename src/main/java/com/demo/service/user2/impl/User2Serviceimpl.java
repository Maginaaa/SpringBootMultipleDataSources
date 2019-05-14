package com.demo.service.user2.impl;

import com.demo.bean.User2;
import com.demo.mapper.test2mapper.User2Mapper;
import com.demo.service.user2.User2Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service(value = "user2Service")
public class User2Serviceimpl implements User2Service {


    @Autowired
    private User2Mapper user2Mapper;


    @Override
    public List<User2> findAllUser() {
        return user2Mapper.selectAllUser();
    }
}
