package com.automation.tests.jse_and_actions;

import com.automation.utilities.VerificationsUtils;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ActionsTests  {
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
    public void hover () throws InterruptedException {
        Actions actions = new Actions(driver);
        driver.get("http://practice.cybertekschool.com/hovers");
        Thread.sleep(2000);
        WebElement element = driver.findElement(By.tagName("img"));
        actions.moveToElement(element).perform();


    }

}
