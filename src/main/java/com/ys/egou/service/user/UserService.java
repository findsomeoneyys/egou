package com.ys.egou.service.user;
import java.util.List;

import com.ys.egou.dto.UserRegisterForm;
import com.ys.egou.utils.PasswordUtils;
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

    public boolean register(UserRegisterForm userRegisterForm) {
        String userPassword = userRegisterForm.getPassword();
        String salt = PasswordUtils.getSalt(30);
        String securePassword = PasswordUtils.generateSecurePassword(userPassword, salt);

        User user = new User();
        user.setName(userRegisterForm.getName());
        user.setPassword(securePassword);
        user.setSalt(salt);
        user.setGender(userRegisterForm.getGender());
        user.setBirthday(userRegisterForm.getBirthday());
        user.setNickname(userRegisterForm.getNickname());
        user.setMobile(userRegisterForm.getMobile());
        user.setEmail(userRegisterForm.getEmail());
        user.setAvatar(userRegisterForm.getAvatar());

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

    public User findByEmail(String email) {
        return userMapper.findByEmail(email);
    }

    public User login(String account, String password) {
        User user = findByEmail(account);
        if (user == null) {
            return null;
        }
        String salt = user.getSalt();
        String userPassword = user.getPassword();

        boolean passwordMatch = PasswordUtils.verifyPassword(password, userPassword, salt);
        if (passwordMatch) {
            return user;
        } else {
            return null;
        }
    }

}





