package com.automation.tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NameDemo {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://practice.cybertekschool.com/sign_up");

        WebElement name = driver.findElement(By.name("full_name"));
        name.sendKeys("Fred Solomon");

        WebElement email = driver.findElement(By.name("email"));
        email.sendKeys("fred@gmail.com");

        driver.findElement(By.name("wooden_spoon")).click();


        System.out.println(driver.findElement(By.name("signup_message")).getText());


    }
}
