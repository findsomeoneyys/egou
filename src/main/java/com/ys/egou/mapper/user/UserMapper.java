package com.ys.egou.mapper.user;

import com.ys.egou.model.user.User;import java.util.List;

public interface UserMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(User record);

    User selectByPrimaryKey(Integer id);

    int updateByPrimaryKey(User record);

    List<User> findAll();
}