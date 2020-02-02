package com.automation.tests;

import com.automation.utilities.VerificationsUtils;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TextVerification {
    public static void main(String[] args) throws InterruptedException {
       // test003();
        test004();
    }
    public static void test003() throws InterruptedException {
        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        driver.get("http://practice.cybertekschool.com/forgot_password");

        Thread.sleep(1000);
        WebElement emailInput=driver.findElement(By.name("email"));
        emailInput.sendKeys("fedya092@gmail.com");

        WebElement retriveBtn=  driver.findElement(By.id("form_submit"));
        retriveBtn.click();

        WebElement message = driver.findElement(By.name("confirmation_message"));

        System.out.println(message.getText());
        String expected ="Your e-mail's been sent!";
        String actual=message.getText();

        VerificationsUtils.verifyEquals(expected, actual);
    }

    public static void test004() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://practice.cybertekschool.com/forgot_password");

        Thread.sleep(1000);
        WebElement emailInput=driver.findElement(By.name("email"));
        String exp = "fedya092@gmail.com";
        emailInput.sendKeys(exp);
        Thread.sleep(1000);
        String act=emailInput.getAttribute("value");

        VerificationsUtils.verifyEquals(exp, act);
        System.out.println("Actual: "+act);
    }
}
