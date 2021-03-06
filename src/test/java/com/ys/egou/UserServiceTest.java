package com.ys.egou;

import com.ys.egou.model.user.User;
import com.ys.egou.model.user.GenderEnum;
import com.ys.egou.service.user.UserService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(SpringExtension.class)
@SpringBootTest
class UserServiceTest {

    @Autowired
    UserService userService;

    @Test
    public void testSelectByPrimaryKey() {
        int uid = 1;
        User u = userService.selectByPrimaryKey(uid);
        assertNotNull(u);
    }

    @Test
    public void testInsertUser() {
        User user = new User();
        user.setName("testU");
        user.setSalt("123zxc");
        user.setPassword("123");
        user.setGender(GenderEnum.FEMALE);
        user.setBirthday(new Date());
        user.setNickname("nickname");
        user.setEmail("zxc@163.com");
        user.setMobile("123123");
        user.setAvatar("");
        user.setUpdateTime(new Date());
        user.setDeleted(false);

        userService.insert(user);
        assertTrue(user.getId() > 0);
    }

    @Test
    @Transactional
    public void testDeleteByPrimaryKey() {
        int uid = 1;
        userService.deleteByPrimaryKey(uid);
        assertNull(userService.selectByPrimaryKey(uid));
    }
}