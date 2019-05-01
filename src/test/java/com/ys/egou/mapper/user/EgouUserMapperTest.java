package com.ys.egou.mapper.user;

import static org.junit.jupiter.api.Assertions.*;

import com.ys.egou.model.user.EgouUser;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ExtendWith(SpringExtension.class)
@SpringBootTest
class EgouUserMapperTest {

    @Autowired
    EgouUserMapper egouUserMapper;

    @Test
    public void testSelectByPrimaryKey() {
//        assertEquals(false, false);
        int uid = 2;
        EgouUser u = egouUserMapper.selectByPrimaryKey(uid);
        assertNotNull(u);
    }


}