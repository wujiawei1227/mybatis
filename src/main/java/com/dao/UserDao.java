package com.dao;

import com.domain.User;
import com.mybatis.Annotation.Select;

import java.util.List;

public interface UserDao {
@Select("select * from user")
    public List<User> findAll();
}
