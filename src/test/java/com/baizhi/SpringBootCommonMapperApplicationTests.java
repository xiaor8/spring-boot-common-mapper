package com.baizhi;

import com.baizhi.entity.User;
import com.baizhi.mapper.UserMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import tk.mybatis.spring.annotation.MapperScan;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
@MapperScan("com.baizhi.mapper")
public class SpringBootCommonMapperApplicationTests {

    @Autowired
    UserMapper userMapper;

    @Test
    public void contextLoads() {
        List<User> users = userMapper.selectAll();
        for (User user : users) {
            System.out.println(user);
        }
    }
}

