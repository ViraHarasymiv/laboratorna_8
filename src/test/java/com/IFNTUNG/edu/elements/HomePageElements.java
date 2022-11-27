package com.IFNTUNG.edu.elements;

import org.openqa.selenium.By;

public class HomePageElements {
    private static By myAccountMenu = By.xpath("//span[contains(text(), 'My Account')]");

    public static By getMyAccountMenu(){ return myAccountMenu;}
}
