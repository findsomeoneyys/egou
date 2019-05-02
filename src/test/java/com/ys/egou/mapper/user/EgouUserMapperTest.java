package com.ys.egou.mapper.user;

import com.ys.egou.model.user.EgouUser;
import com.ys.egou.model.user.SexEnum;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

@ExtendWith(SpringExtension.class)
@SpringBootTest
class EgouUserMapperTest {

    @Autowired
    EgouUserMapper egouUserMapper;

    @Test
    public void testSelectByPrimaryKey() {
        int uid = 1;
        EgouUser u = egouUserMapper.selectByPrimaryKey(uid);
        assertNotNull(u);
    }

    @Test
    public void testInsertUser() {
        EgouUser user = new EgouUser();
        user.setUsername("testU");
        user.setPassword("123");
        user.setSex(SexEnum.FEMALE);
        user.setBirthday(new Date());
        user.setNickname("nickname");
        user.setMobile("123123");
        user.setAvatar("");
        user.setAddTime(new Date());
        user.setUpdateTime(new Date());
        user.setDeleted(false);

        egouUserMapper.insert(user);
        assertTrue(user.getId() > 0);
    }
}