package com.IFNTUNG.edu.elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class HomePageElements {
    private static By myAccountMenu = By.xpath("//span[contains(text(), 'My Account')]");

    public static By getMyAccountMenu(){ return myAccountMenu;}
}
