package com.course.testng;

import org.testng.annotations.*;

public class BasicAnnotation {
    //最基本的注解，用来把方法标记为测试的一部分
    @Test
    public void testcase1(){
         System.out.println("这是测试用例1");
    }

    @Test
    public void testcase2(){
        System.out.println("这是测试用例2");
    }

    @BeforeMethod
    public void beforeMethod(){
       System.out.println("这是在测试用例1前运行的方法");
    }

    @AfterMethod
    public void AfterMethod(){
        System.out.println("这是在测试用例1后运行的方法");
    }

    @BeforeClass
    public void beforeClass(){
        System.out.println("类运行前的方法");
    }

    @AfterClass
    public void afterClass(){
        System.out.println("类运行后的方法");
    }

    @BeforeSuite
    public void beforeSuite(){
        System.out.println("这是before suite套件");
    }

    @AfterSuite
    public void afterSuite(){
        System.out.println("这是after suite套件");
    }
}
