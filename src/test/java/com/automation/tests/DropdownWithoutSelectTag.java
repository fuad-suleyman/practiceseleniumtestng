package com.automation.tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class DropdownWithoutSelectTag {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://practice.cybertekschool.com/dropdown");


        WebElement dropdownLink = driver.findElement(By.partialLinkText("Dropdown link"));
        System.out.println(dropdownLink.getText());

        dropdownLink.click();

        Thread.sleep(500);

        List<WebElement> allOptions = driver.findElements(By.className("dropdown-item"));
        System.out.println(allOptions.size());

        for (WebElement allOption : allOptions) {
            System.out.println(allOption.getText());
        }




    }
}
