package com.percy.dao;

import com.percy.entity.User;
import org.springframework.stereotype.Component;

/**
 * @author percy
 * @create 2019-02-02  下午9:08
 * @descreption:
 **/
//注解对象
@Component("useDaoImpl")
public class UserDaoImpl implements UserDao {
    @Override
    public void addUser(User user) {
        System.out.println("UserDao层添加用户....");
        System.out.println("UserDao层添加用户成功");
    }
}
