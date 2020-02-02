package com.automation.tests.testng_intro;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertTrueTest {

    @Test
    public void test(){
        System.out.println(1==2);

        String url = "https://google.com";
        String expStr = ".com";


        Assert.assertTrue(1==1);
        Assert.assertTrue(url.endsWith(expStr));
        Assert.assertTrue(false);
    }

    @Test
    public void test2(){
        String url = "https://google.com";
        String expStr = ".com";
        Assert.assertFalse(url.endsWith(expStr));

    }
}
