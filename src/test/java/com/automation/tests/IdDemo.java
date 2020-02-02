package com.automation.tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IdDemo {
    public static void main(String[] args) throws InterruptedException {
        id1();
    }
    public static void id2() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://practice.cybertekschool.com/login");


        WebElement login = driver.findElement(By.id("Wooden_spoon"));
        Thread.sleep(1000);
        login.click();
    }

    public static void id1() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://practice.cybertekschool.com/login");


        WebElement login = driver.findElement(By.id("wooden_spoon"));
        Thread.sleep(1000);
        login.click();
    }
}
