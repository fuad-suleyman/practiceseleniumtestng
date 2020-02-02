package com.automation.tests;

import com.automation.utilities.VerificationsUtils;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SendKeysExample {

    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        driver.get("http://practice.cybertekschool.com/forgot_password");

        Thread.sleep(1000);
        WebElement emailInput=driver.findElement(By.name("email"));
        emailInput.sendKeys("fedya092@gmail.com");

        WebElement retriveBtn=  driver.findElement(By.id("form_submit"));
        retriveBtn.click();

        String expected="http://practice.cybertekschool.com/forgot_password";
        String actual = driver.getCurrentUrl();

        VerificationsUtils.verifyEquals(expected, actual);
    }
}
