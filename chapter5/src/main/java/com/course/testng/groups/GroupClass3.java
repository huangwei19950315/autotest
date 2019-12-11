package com.course.testng.groups;

import org.testng.annotations.Test;

@Test(groups = "tea")
public class GroupClass3 {

    public void tea1(){
        System.out.println("这是group3的tea1");
    }

    public void tea2(){
        System.out.println("这是group3的tea2");
    }
}
