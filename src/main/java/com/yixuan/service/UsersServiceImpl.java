package com.yixuan.service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.yixuan.mapper.UserMapper;
import com.yixuan.pojo.Users;
import com.yixuan.pojo.query.UsersQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsersServiceImpl implements UsersService{
    @Autowired
    private UserMapper userMapper;

    @Override
    public List<Users> userList() {
        return userMapper.userList();
    }

    @Override
    public PageInfo<Users> getUserListByName(UsersQuery usersQuery) {
        PageHelper.startPage(usersQuery.getPageNum(),usersQuery.getPageSize());
        return new PageInfo<Users>(userMapper.getUserListByName(usersQuery));
    }
}
