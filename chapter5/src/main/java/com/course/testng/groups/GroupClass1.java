package com.course.testng.groups;

import org.testng.annotations.Test;

@Test(groups = "stu")
public class GroupClass1 {
    public void stu1(){
        System.out.println("这是group1的stu1");
    }

    public void syu2(){
        System.out.println("这是group2的stu2");
    }
}
