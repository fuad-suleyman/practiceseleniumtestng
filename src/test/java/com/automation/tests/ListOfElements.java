package com.automation.tests;

import com.automation.utilities.VerificationsUtils;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class ListOfElements {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://practice.cybertekschool.com/radio_buttons");

        List<WebElement> buttons = driver.findElements(By.name("sport"));
        System.out.println(buttons.size());


        VerificationsUtils.verifySelected(buttons.get(1), false);
    }
}
