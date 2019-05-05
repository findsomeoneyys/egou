package com.ys.egou.service.user;
import java.util.List;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.ys.egou.mapper.user.UserMapper;
import com.ys.egou.model.user.User;

@Service
public class UserService {

    @Resource
    private UserMapper userMapper;

    public int deleteByPrimaryKey(Integer id) {
        return userMapper.deleteByPrimaryKey(id);
    }

    public int insert(User record) {
        return userMapper.insert(record);
    }

    public User selectByPrimaryKey(Integer id) {
        return userMapper.selectByPrimaryKey(id);
    }

    public int updateByPrimaryKey(User record) {
        return userMapper.updateByPrimaryKey(record);
    }

    public boolean register(User user) {
        return userMapper.insertSelective(user) > 0;
    }

    public List<User> findAll() {
        return userMapper.findAll();
    }


    public int insertSelective(User record) {
        return userMapper.insertSelective(record);
    }

    public int updateByPrimaryKeySelective(User record) {
        return userMapper.updateByPrimaryKeySelective(record);
    }
}




