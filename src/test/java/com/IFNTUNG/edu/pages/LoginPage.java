package com.IFNTUNG.edu.pages;

import com.IFNTUNG.edu.elements.LoginPageElements;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage{
   private By continueButton = LoginPageElements.getContinueButton();

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public CreateAccountPage clickOnContinueButton(){
        driver.findElement(continueButton).click();
        return new CreateAccountPage(driver);
    }
}
