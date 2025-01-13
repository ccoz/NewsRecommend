package csu.nr.user.service;

import csu.yang.api.enums.UserStatus;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import csu.yang.api.domain.po.User;

import java.time.LocalDateTime;

@SpringBootTest
public class IUserServiceimplTest {
    @Autowired
    protected IUserService userService;

    @Test
    void testGetById() {
        userService.getById(1);
    }

    @Test
    void testInsertUser() {
        User user = new User();
        user.setUsername("admin");
        user.setPassword("123456");
        user.setPhone("12345678901");
        user.setCreateTime(LocalDateTime.now());
        user.setStatus(UserStatus.NORMAL);
        user.setUpdateTime(LocalDateTime.now());
        userService.save(user);
    }
}

