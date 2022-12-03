package com.IFNTUNG.edu.tests;

import com.IFNTUNG.edu.elements.AccountSuccessPageElements;
import com.IFNTUNG.edu.elements.CreateAccountPageElements;
import com.IFNTUNG.edu.elements.HomePageElements;
import com.IFNTUNG.edu.elements.LoginPageElements;
import com.IFNTUNG.edu.pages.HomePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CreateAccountTest extends BaseTest{
    private static final String MESSAGE = "Your Account Has Been Created";

    @Test
    public void createAccountTest() {
        String actualMessage = new HomePage(driver)
                .clickOnMyAccountButton()
                .clickOnContinueButton()
                .selectGender()
                .enterFirstName()
                .enterLastName()
                .enterDateOfBirth()
                .enterUserEmail()
                .enterCompanyName()
                .enterStreetAddress()
                .enterPostCode()
                .enterUserCity()
                .enterUserState()
                .selectCountry()
                .enterTelephoneNumber()
                .checkNewsLetterCheckBox()
                .createPassword()
                .submitEnteredInformation()
                .getActualMessage();
        Assert.assertTrue(actualMessage.contains(MESSAGE));
    }
}


