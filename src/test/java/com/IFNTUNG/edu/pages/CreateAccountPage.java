package com.IFNTUNG.edu.pages;

import com.IFNTUNG.edu.utils.ConfigurationReader;
import com.IFNTUNG.edu.utils.StringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class CreateAccountPage extends BasePage{
    private final String USER_NAME = ConfigurationReader.get().getUserName();
    private final String USER_LAST_NAME = ConfigurationReader.get().getUserLastName();
    private final String USER_BIRTHDAY = ConfigurationReader.get().getUserBirthDay();
    private final int FIX_LENGTH = 8;
    private final String USER_EMAIL = StringUtils.generateRandomEmail(FIX_LENGTH);
    private final String USER_COMPANY = ConfigurationReader.get().getUserCompany();
    private final String USER_STREET = ConfigurationReader.get().getUserStreet();
    private final String USER_POSTCODE = ConfigurationReader.get().getUserPostCode();
    private final String USER_CITY = ConfigurationReader.get().getUserCity();
    private final String USER_STATE = ConfigurationReader.get().getUserState();
    private final String TELEPHONE_NUMBER = ConfigurationReader.get().getTelephoneNumber();
    private final String PASSWORD = ConfigurationReader.get().getPassword();

    public CreateAccountPage(WebDriver driver) {
        super(driver);
    }
    public CreateAccountPage selectGender(By genderRadioButton) {
        driver.findElement(genderRadioButton).click();
        return this;
    }

    public CreateAccountPage enterFirstName(By firstNameField) {
        driver.findElement(firstNameField).sendKeys(USER_NAME);
        return this;
    }

    public CreateAccountPage enterLastName(By lastNameField) {
        driver.findElement(lastNameField).sendKeys(USER_LAST_NAME);
        return this;
    }

    public CreateAccountPage enterDateOfBirth(By dateOfBirth) {
        driver.findElement(dateOfBirth).sendKeys(USER_BIRTHDAY);
        driver.findElement(dateOfBirth).sendKeys(Keys.RETURN);
        return this;
    }

    public CreateAccountPage enterUserEmail(By emailField) {
        driver.findElement(emailField).sendKeys(USER_EMAIL);
        return this;
    }

    public CreateAccountPage enterCompanyName(By companyNameField) {
        driver.findElement(companyNameField).sendKeys(USER_COMPANY);
        return this;
    }

    public CreateAccountPage enterStreetAddress(By streetAddressField) {
        driver.findElement(streetAddressField).sendKeys(USER_STREET);
        return this;
    }

    public CreateAccountPage enterPostCode(By postCodeField) {
        driver.findElement(postCodeField).sendKeys(USER_POSTCODE);
        return this;
    }

    public CreateAccountPage enterUserCity(By cityField) {
        driver.findElement(cityField).sendKeys(USER_CITY);
        return this;
    }

    public CreateAccountPage enterUserState(By stateField) {
        driver.findElement(stateField).sendKeys(USER_STATE);
        return this;
    }

    public CreateAccountPage selectCountry(By selectCountryMenu, By ukraineOption) {
        driver.findElement(selectCountryMenu).click();
        driver.findElement(ukraineOption).click();
        return this;
    }

    public CreateAccountPage enterTelephoneNumber(By telephoneNumber) {
        driver.findElement(telephoneNumber).sendKeys(TELEPHONE_NUMBER);
        return this;
    }

    public CreateAccountPage checkNewsLetterCheckBox(By newsletterCheckbox) {
        driver.findElement(newsletterCheckbox).click();
        return this;
    }

    public CreateAccountPage createPassword(By passwordField, By passwordFieldConfirmation) {
        driver.findElement(passwordField).sendKeys(PASSWORD);
        driver.findElement(passwordFieldConfirmation).sendKeys(PASSWORD);
        return this;
    }

    public AccountSuccessPage submitEnteredInformation(By submitButton) {
        driver.findElement(submitButton).click();
        return new AccountSuccessPage(driver);
    }
}


