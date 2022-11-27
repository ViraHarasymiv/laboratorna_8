package com.IFNTUNG.edu.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage{

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public LoginPage clickOnMyAccountButton(By myAccountMenu){
        driver.findElement(myAccountMenu).click();
        return new LoginPage(driver);
    }
}
