package com.ys.egou.mapper.user;

import com.ys.egou.model.user.User;import org.apache.ibatis.annotations.Param;import java.util.List;

public interface UserMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);

    List<User> findAll();

    User findByEmail(@Param("email") String email);
}