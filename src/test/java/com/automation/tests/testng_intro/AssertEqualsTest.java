package com.automation.tests.testng_intro;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AssertEqualsTest {

    @BeforeMethod
    public  void setUp(){
        System.out.println("Before Method");
    }

    @AfterMethod
    public void tearDown(){
        System.out.println("reporting");
    }
    @Test
    public void test(){
        String exp = "Google";
        String actual="Google";
        Assert.assertEquals(exp, "sdf");

    }
}
