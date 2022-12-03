package com.IFNTUNG.edu.pages;

import com.IFNTUNG.edu.elements.HomePageElements;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage{
    private By myAccountMenu = HomePageElements.getMyAccountMenu();

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public LoginPage clickOnMyAccountButton(){
        driver.findElement(myAccountMenu).click();
        return new LoginPage(driver);
    }
}
