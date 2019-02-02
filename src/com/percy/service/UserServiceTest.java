package com.percy.service;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author percy
 * @create 2019-02-02  下午10:07
 * @descreption:
 **/
public class UserServiceTest {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("bean1.xml");
        UserService userService = (UserService) applicationContext.getBean("userService");
        userService.addUser();
//        System.out.println(user);
    }

}
