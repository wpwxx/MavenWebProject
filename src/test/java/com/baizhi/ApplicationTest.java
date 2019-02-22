package com.baizhi;

import com.baizhi.dao.AdminDao;
import com.baizhi.entity.Admin;
import com.baizhi.entity.User;
import com.baizhi.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ApplicationTest {

    @Autowired
    private AdminDao adminDao;
    @Autowired
    private UserService userService;

    @Test
    public void contextLoads() {
        List<Admin> list = adminDao.getAll();
        System.out.println(list);
    }

    @Test
    public void test1() {
        User byPrimaryKey = userService.getByPrimaryKey(2);
        System.out.println(byPrimaryKey);
    }

}
