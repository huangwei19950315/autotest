package com.course.testng.groups;

import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

public class GroupsOnMethod {

    @Test(groups ="server")
    public void test1(){
        System.out.println("这是服务组的测试方法");
    }

    @Test(groups = "clinet")
    public void test2(){
        System.out.println("这是客户端1的测试方法");
    }

    @Test(groups = "clinet")
    public void test3(){
        System.out.println("这是客户端2的测试方法");
    }

    @BeforeGroups("server")
    public void beforeGroupOnServer(){
        System.out.println("这是服务器组运行前的方法");
    }
    @AfterGroups("clinet")
    public void afterGroupOnServer(){
        System.out.println("这是客户端组运行后的方法");
    }
}
