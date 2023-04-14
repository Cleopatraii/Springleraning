package com.learn;

/**
 * @auther Cleopatra
 * @create 2023/3/31
 **/
//4.创建普通类在这个类创建普通方法
public class User {

    private String userName;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void add(){

        System.out.println("add....");
    }
}
//创建Spring配置文件，在配置文件配置创建对象
//(1)Spring 配置文件使用xml格式
