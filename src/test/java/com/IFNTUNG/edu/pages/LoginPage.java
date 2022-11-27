package com.IFNTUNG.edu.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage{

    public LoginPage(WebDriver driver) {
        super(driver);
    }
    public CreateAccountPage clickOnContinueButton(By continueButton){
        driver.findElement(continueButton).click();
        return new CreateAccountPage(driver);
    }
}
