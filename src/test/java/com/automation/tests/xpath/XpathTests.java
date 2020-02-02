package com.automation.tests.xpath;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class XpathTests {

    @Test
    public void absoluteXpath(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://practice.cybertekschool.com/signup_confirmation");

        System.out.println("Printing on the first link");

        System.out.println(driver.findElement(By.xpath("/html/body/div/div/div/div/a/i")).getText());

    }

    @Test
    public void relativeXpathUsingParentChild(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://practice.cybertekschool.com/signup_confirmation");

        System.out.println("Printing on the first link");


    }

    @Test
    public void relativeXpathUsingAttributeValue(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://practice.cybertekschool.com/multiple_buttons");

       //driver.findElement(By.xpath("//button[@id='disappearing_button']")).click();

        System.out.println(driver.findElement(By.xpath("//*[@id='disappearing_button']")).getText());
        System.out.println(driver.findElement(By.xpath("//button[@*='disappearing_button']")).getText());
        System.out.println(driver.findElement(By.xpath("//button[contains(@id,'disappearing')]")).getText());
        System.out.println(driver.findElement(By.xpath("//button[.='Button 3']")).getText());


        System.out.println(driver.findElement(By.xpath("//button[contains(text(),'click')]")).getText());

    }

    @Test
    public void relativeXpathByindex(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://practice.cybertekschool.com/multiple_buttons");
    }
}
