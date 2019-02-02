package com.percy.service;

import com.percy.dao.UserDao;
import com.percy.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import javax.annotation.Resource;

/**
 * @author percy
 * @create 2019-02-02  下午9:04
 * @descreption:
 **/
public class UserService {
//    通过注解得到属性
    @Autowired
    private UserDao userDao;
    @Resource(name = "user")
    private User user;
        public void addUser(){
            System.out.println("UserService层添加用户...");
            userDao.addUser(user);
        }
}
