package com.learn.testDemo;

import com.learn.Book;
import com.learn.Orders;
import com.learn.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @auther Cleopatra
 * @create 2023/3/31
 **/
public class TestSpring {

    @Test
    public void testAdd(){
   //1.加载Spring的配置文件
        ApplicationContext context=new ClassPathXmlApplicationContext("bean1.xml");
   //2.获取配置创建的对象
        User user = context.getBean("user", User.class);
        // 此处是对象地址
        System.out.println(user);
        user.add();
    }

    @Test
    public void testBook1()
    {
    ApplicationContext context=new ClassPathXmlApplicationContext("bean1.xml");
        Book book = context.getBean("book", Book.class);
        System.out.println(book);
        book.testDemo();
        //震惊住了 居然是：com.learn.Book@52f759d7
        //简爱::tom 输出结果，每次生成book对象的时候内部已经都设置完了
    }


    @Test
    public void testOrders()
    {
        ApplicationContext context=new ClassPathXmlApplicationContext("bean1.xml");
       Orders orders = context.getBean("order", Orders.class);
        System.out.println(orders);
        orders.orderTest();
        //震惊住了 居然是：com.learn.Book@52f759d7
        //简爱::tom 输出结果，每次生成book对象的时候内部已经都设置完了
    }
}
