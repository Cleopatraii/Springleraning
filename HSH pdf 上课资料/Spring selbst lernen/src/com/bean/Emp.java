package com.bean;

/**
 * @auther Cleopatra
 * @create 2023/4/14
 **/
//员工类
public class Emp {
    private String ename;
    private String gender;
  //员工属于某一个部门
    private Dept dept;

    public void setDept(Dept dept) {
        this.dept = dept;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

}
