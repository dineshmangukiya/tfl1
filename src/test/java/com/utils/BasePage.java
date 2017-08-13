package com.utils;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static com.utils.opendriver.driver;

public class BasePage {

    public WebDriverWait wait = new WebDriverWait(driver,60);

    public void openurl() {
        opendriver od = new opendriver();

        driver.get(od.url);
    }




    public void waitForElement(WebElement element) {
        wait.until(ExpectedConditions.visibilityOf(element));
    }
}
