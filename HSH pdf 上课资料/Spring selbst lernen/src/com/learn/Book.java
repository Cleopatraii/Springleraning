package com.learn;

/**
 * @auther Cleopatra
 * @create 2023/3/31
 **/
public class Book {

    private String bname;

    private String bauthor;

    private String address;
    //无参数构造注入

    public Book() {
    }

    public void setAddress(String address) {
        this.address = address;
    }

    //有参数构造注入
    public Book(String bname) {
        this.bname = bname;
    }

    public void setBname(String bname) {
        this.bname = bname;
    }

    public void setBauthor(String bauthor) {
        this.bauthor = bauthor;
    }

    public static void main(String[] args) {
        //Book book =new Book();
        //book.setBname("abc");
        Book book = new Book("abc");
    }

    public void testDemo(){

        System.out.println(bname+"::"+bauthor+"::"+address);
    }
}
