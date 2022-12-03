package com.IFNTUNG.edu.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AccountSuccessPage extends BasePage{

    public AccountSuccessPage(WebDriver driver) {
        super(driver);
    }

    public String getActualMessage(By actualMessage){
        waitForElementToAppear(actualMessage);
        return driver.findElement(actualMessage).getText();
    }
}
