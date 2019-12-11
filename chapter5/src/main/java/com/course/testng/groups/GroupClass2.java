package com.course.testng.groups;

import org.testng.annotations.Test;

@Test(groups = "stu")
public class GroupClass2 {
    public void stu1(){
        System.out.println("这是group2的stu1");
    }

    public void stu2(){
        System.out.println("这是group2的stu2");
    }
}
