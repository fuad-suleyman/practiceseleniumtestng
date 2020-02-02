package com.automation.utilities;

import org.openqa.selenium.WebElement;

public class VerificationsUtils {

    public static void verifyEquals(String expected, String actual){

        if (expected.equals(actual)){
            System.out.println("PASS");
        }else
        {
            System.out.println("FAIL");
            System.out.println("Expected: "+expected);
            System.out.println("Actual: "+actual);
        }

    }

    public static void verifySelected(WebElement element, boolean checked){
        if(checked){
            if(element.isSelected()){
                System.out.println("PASS");
            } else{
                System.out.println("FAIL");
                System.out.println("Element must be selected");
            }

        }
        if(!checked){
            if(element.isSelected()) {
                System.out.println("FAIL");
                System.out.println("Element must be selected");
            }
        }else {
            System.out.println("PASS");
        }
    }
}
