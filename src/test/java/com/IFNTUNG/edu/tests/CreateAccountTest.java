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
                .clickOnMyAccountButton(HomePageElements.getMyAccountMenu())
                .clickOnContinueButton(LoginPageElements.getContinueButton())
                .selectGender(CreateAccountPageElements.getGenderRadioButton())
                .enterFirstName(CreateAccountPageElements.getFirstNameField())
                .enterLastName(CreateAccountPageElements.getLastNameField())
                .enterDateOfBirth(CreateAccountPageElements.getDateOfBirth())
                .enterUserEmail(CreateAccountPageElements.getEmailField())
                .enterCompanyName(CreateAccountPageElements.getCompanyNameField())
                .enterStreetAddress(CreateAccountPageElements.getStreetAddressField())
                .enterPostCode(CreateAccountPageElements.getPostCodeField())
                .enterUserCity(CreateAccountPageElements.getCityField())
                .enterUserState(CreateAccountPageElements.getStateField())
                .selectCountry(CreateAccountPageElements.getSelectCountryMenu(),CreateAccountPageElements.getUkraineOption())
                .enterTelephoneNumber(CreateAccountPageElements.getTelephoneNumber())
                .checkNewsLetterCheckBox(CreateAccountPageElements.getNewsletterCheckbox())
                .createPassword(CreateAccountPageElements.getPasswordField(),CreateAccountPageElements.getPasswordFieldConfirmation())
                .submitEnteredInformation(CreateAccountPageElements.getSubmitButton())
                .getActualMessage(AccountSuccessPageElements.getActualMessage());
        Assert.assertTrue(actualMessage.contains(MESSAGE));
    }
}


