package com.automation.utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigurationReader {

   private static Properties properties = new Properties();

   static  {
        String path = "configurations.properties";
        try {
            FileInputStream input = new FileInputStream(path);
            properties.load(input);
            input.close();

        } catch (Exception e) {
            e.printStackTrace();

        }
    }
    public static String get(String keyName) {
        return properties.getProperty(keyName);
    }

}
