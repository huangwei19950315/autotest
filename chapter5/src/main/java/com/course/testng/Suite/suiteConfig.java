package com.course.testng.Suite;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class suiteConfig {

    @BeforeSuite
    public void beforeSuit(){
        System.out.println("before suite运行啦");
    }

    @AfterSuite
    public void afterConfig(){
        System.out.println("after suite运行啦");
    }

    @BeforeTest
    public void beforeTest(){
        System.out.println("测试前");
    }

    @AfterTest
    public void afterTest(){
        System.out.println("测试后");
    }
}

