package com.yixuan.service;

import com.github.pagehelper.PageInfo;
import com.yixuan.pojo.Users;
import com.yixuan.pojo.query.UsersQuery;

import java.util.List;

public interface UsersService {
    //查询users表中所有数据
    public List<Users> userList();

    //根据username分页查询Users表数据
    public PageInfo<Users> getUserListByName(UsersQuery usersQuery);
}
