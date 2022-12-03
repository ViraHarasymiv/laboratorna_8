package com.IFNTUNG.edu.pages;

import com.IFNTUNG.edu.elements.AccountSuccessPageElements;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AccountSuccessPage extends BasePage{
    private By actualMessage = AccountSuccessPageElements.getActualMessage();

    public AccountSuccessPage(WebDriver driver) {
        super(driver);
    }

    public String getActualMessage(){
        waitForElementToAppear(actualMessage);
        return driver.findElement(actualMessage).getText();
    }
}
