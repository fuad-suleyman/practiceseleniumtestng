package com.automation.tests;

import com.automation.utilities.VerificationsUtils;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButtonsDemo {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://practice.cybertekschool.com/radio_buttons");

        WebElement red=driver.findElement(By.id("red"));
        WebElement blue=driver.findElement(By.id("blue"));

        System.out.println("Blue: "+blue.isSelected());
        System.out.println("Red: "+red.isSelected());

        System.out.println("Selecting red");
        red.click();

        VerificationsUtils.verifySelected(blue, false);
        VerificationsUtils.verifySelected(red, true);

        WebElement green=driver.findElement(By.id("green"));
        System.out.println("Is green enabled: "+green.isEnabled());
        System.out.println("Is red enabled: "+red.isEnabled());




    }
}
