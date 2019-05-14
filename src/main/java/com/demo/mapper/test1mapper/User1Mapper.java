package com.demo.mapper.test1mapper;

import com.demo.bean.User1;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;


@Mapper
public interface User1Mapper {

    List<User1> selectAllUser();
}
