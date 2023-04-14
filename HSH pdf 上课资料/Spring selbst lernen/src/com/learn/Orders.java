package com.learn;

/**
 * @auther Cleopatra
 * @create 2023/4/2
 **/
public class Orders {
    private String oname;
    private String address;

    public Orders(String oname, String address) {
        this.oname = oname;
        this.address = address;
    }
    public void orderTest(){
        System.out.println(oname+"::"+address);
    }
}
