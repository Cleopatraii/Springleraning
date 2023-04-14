package com.service;

import com.dao.UserDao;
import com.dao.UserDaoImpl;
import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

/**
 * @auther Cleopatra
 * @create 2023/4/2
 **/
public class UserService {

    //创建UserDao类型属性，生成set方法
    UserDao userDao;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public void add(){
        System.out.println("service add");
        userDao.update();
        //原始方式：创建UserDao对象
//        UserDao userDao = new UserDaoImpl();//接口等于new他的实现类的对象 多态
//        userDao.update();
    }
    
        
}
