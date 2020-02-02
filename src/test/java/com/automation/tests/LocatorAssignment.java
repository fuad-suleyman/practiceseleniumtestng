package com.automation.tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorAssignment {
    public static void main(String[] args) throws InterruptedException {
        ebay();
    }
    public static void vikipedia() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://wikipedia.org");
        Thread.sleep(1000);
        driver.findElement(By.id("searchInput")).sendKeys("selenium webdriver");
       driver.findElement(By.xpath("//button[@type='submit']")).click();
        Thread.sleep(1000);
        System.out.println(driver.findElement(By.className("results-info")).getText());


    }

    public static void ebay() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://ebay.com");
        Thread.sleep(1000);
        driver.findElement(By.id("gh-ac")).sendKeys("android charger");
        driver.findElement(By.id("gh-btn")).click();
        Thread.sleep(1000);
        System.out.println(driver.findElement(By.tagName("h1")).getText());


    }
}
