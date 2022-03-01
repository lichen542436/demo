package com.yixuan.mapper;

import com.yixuan.pojo.Users;
import com.yixuan.pojo.query.UsersQuery;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface UserMapper {
    public List<Users> userList();

    public List<Users> getUserListByName(UsersQuery usersQuery);
}
