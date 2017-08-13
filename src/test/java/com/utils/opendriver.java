package com.utils;

import io.github.bonigarcia.wdm.ChromeDriverManager;
import io.github.bonigarcia.wdm.FirefoxDriverManager;
import jdk.nashorn.internal.objects.annotations.Property;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class opendriver {
    public static WebDriver driver;
    public static String url;

    public void browser() throws IOException {
        String browser = System.getProperty("browser");

        if (browser.equals("chrome")) {
            ChromeDriverManager.getInstance().setup();
            driver = new ChromeDriver();

        } else if (browser.equals("firefox")) {
            FirefoxDriverManager.getInstance().setup();
            driver = new FirefoxDriver();
        }

        String environment = System.getProperty("environment");

        String srcFolder = "src\\test\\java\\com\\propertyfiles\\";
        String envFile = null;
        if (environment.toUpperCase().equals("QA")) {
            envFile = srcFolder + "qa.properties";
        } else if (environment.toUpperCase().equals("uat")) {
            envFile = srcFolder + "ust.properties";
        } else if (environment.toUpperCase().equals("live")) {
            envFile = srcFolder + "live.properties";
        }


    FileInputStream fls = new FileInputStream(envFile);
    Properties pro = new Properties();
    pro.load(fls);
    url = pro.getProperty("url");
    System.out.println(url);
}


    public void closeBrowser() {
        driver.quit();
        }

}
