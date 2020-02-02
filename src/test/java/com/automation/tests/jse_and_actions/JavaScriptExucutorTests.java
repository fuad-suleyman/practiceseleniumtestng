package com.automation.tests.jse_and_actions;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class JavaScriptExucutorTests {

    WebDriver driver;
    @BeforeMethod
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    }

    @AfterMethod
    public void tearDown() throws InterruptedException {
        Thread.sleep(5000);
        driver.quit();
    }

    @Test
    public void jse1(){
        driver.get("http://practice.cybertekschool.com");

        JavascriptExecutor jse = (JavascriptExecutor)driver;

        jse.executeScript("alert('Welcome to testing')");
    }

    @Test
    public void type(){
        driver.get("http://practice.cybertekschool.com/dynamic_controls");

        JavascriptExecutor jse = (JavascriptExecutor)driver;

        jse.executeScript("alert('Welcome to testing')");
    }
}
