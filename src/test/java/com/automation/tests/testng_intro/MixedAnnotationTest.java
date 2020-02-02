package com.automation.tests.testng_intro;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class MixedAnnotationTest {

//    @BeforeMethod
//    public void setUp(){
//     //   System.out.println("setting path");
//        System.out.println("opening browser");
//    }
//
//    @AfterMethod
//    public void tearDown(){
//        System.out.println("closing browser");
//
//    }

    @Test()
    public void test(){

        System.out.println("\ttesting test case 1");
    }

    @Test()
    public void test2(){
        System.out.println("\ttesting test case 2");
    }

    @Test()
    public void test3(){
        System.out.println("\ttesting test case 3");
    }
}
