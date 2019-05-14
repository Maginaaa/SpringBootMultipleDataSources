package com.demo.mapper.test2mapper;

import com.demo.bean.User2;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;


@Mapper
public interface User2Mapper {
    
    List<User2> selectAllUser();
}
