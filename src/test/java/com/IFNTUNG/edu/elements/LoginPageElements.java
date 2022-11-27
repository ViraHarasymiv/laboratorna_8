package com.IFNTUNG.edu.elements;

import org.openqa.selenium.By;

public class LoginPageElements {
    private static By continueButton = By.xpath("//span[contains(text(), 'Continue')]");

    public static By getContinueButton(){return continueButton;}
}
