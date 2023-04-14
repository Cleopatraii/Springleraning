package com.learn.testDemo;

import com.learn.User;
import com.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @auther Cleopatra
 * @create 2023/4/14
 **/
public class TestBean {

    @Test
    public void testAdd(){
        //1.加载Spring的配置文件
        ApplicationContext context=new ClassPathXmlApplicationContext("bean2.xml");
        //2.获取配置创建的对象
        UserService userService= context.getBean("userService", UserService.class);
        // 此处是对象地址
       userService.add();
    }

}
