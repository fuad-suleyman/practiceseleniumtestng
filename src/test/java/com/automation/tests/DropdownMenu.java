package com.automation.tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class DropdownMenu {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://practice.cybertekschool.com/dropdown");

        WebElement selectElement = driver.findElement(By.id("dropdown"));
        Select dropdownList = new Select(selectElement);

        WebElement selectOption = dropdownList.getFirstSelectedOption();
        System.out.println(selectOption.getText());

        List<WebElement> allOptions = dropdownList.getOptions();
        System.out.println("Number of all options: "+allOptions.size());

        for (WebElement allOption : allOptions) {
            System.out.println(allOption.getText());
        }



    }
}
