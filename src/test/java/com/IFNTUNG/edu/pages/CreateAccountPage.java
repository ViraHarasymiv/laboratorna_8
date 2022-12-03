package com.IFNTUNG.edu.pages;

import com.IFNTUNG.edu.elements.CreateAccountPageElements;
import com.IFNTUNG.edu.utils.ConfigurationReader;
import com.IFNTUNG.edu.utils.StringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class CreateAccountPage extends BasePage{
    private By genderRadioButton = CreateAccountPageElements.getGenderRadioButton();
    private By firstNameField = CreateAccountPageElements.getFirstNameField();
    private By lastNameField = CreateAccountPageElements.getLastNameField();
    private By dateOfBirth = CreateAccountPageElements.getDateOfBirth();
    private By emailField = CreateAccountPageElements.getEmailField();
    private By companyNameField = CreateAccountPageElements.getCompanyNameField();
    private By streetAddressField = CreateAccountPageElements.getStreetAddressField();
    private By postCodeField = CreateAccountPageElements.getPostCodeField();
    private By cityField = CreateAccountPageElements.getCityField();
    private By stateField = CreateAccountPageElements.getStateField();
    private By selectCountryMenu = CreateAccountPageElements.getSelectCountryMenu();
    private By ukraineOption = CreateAccountPageElements.getUkraineOption();
    private By telephoneNumber = CreateAccountPageElements.getTelephoneNumber();
    private By newsletterCheckbox = CreateAccountPageElements.getNewsletterCheckbox();
    private By passwordField = CreateAccountPageElements.getPasswordField();
    private By passwordFieldConfirmation = CreateAccountPageElements.getPasswordFieldConfirmation();
    private By submitButton = CreateAccountPageElements.getSubmitButton();

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

    public CreateAccountPage selectGender() {
        driver.findElement(genderRadioButton).click();
        return this;
    }

    public CreateAccountPage enterFirstName() {
        driver.findElement(firstNameField).sendKeys(USER_NAME);
        return this;
    }

    public CreateAccountPage enterLastName() {
        driver.findElement(lastNameField).sendKeys(USER_LAST_NAME);
        return this;
    }

    public CreateAccountPage enterDateOfBirth() {
        driver.findElement(dateOfBirth).sendKeys(USER_BIRTHDAY);
        driver.findElement(dateOfBirth).sendKeys(Keys.RETURN);
        return this;
    }

    public CreateAccountPage enterUserEmail() {
        driver.findElement(emailField).sendKeys(USER_EMAIL);
        return this;
    }

    public CreateAccountPage enterCompanyName() {
        driver.findElement(companyNameField).sendKeys(USER_COMPANY);
        return this;
    }

    public CreateAccountPage enterStreetAddress() {
        driver.findElement(streetAddressField).sendKeys(USER_STREET);
        return this;
    }

    public CreateAccountPage enterPostCode() {
        driver.findElement(postCodeField).sendKeys(USER_POSTCODE);
        return this;
    }

    public CreateAccountPage enterUserCity() {
        driver.findElement(cityField).sendKeys(USER_CITY);
        return this;
    }

    public CreateAccountPage enterUserState() {
        driver.findElement(stateField).sendKeys(USER_STATE);
        return this;
    }

    public CreateAccountPage selectCountry() {
        driver.findElement(selectCountryMenu).click();
        driver.findElement(ukraineOption).click();
        return this;
    }

    public CreateAccountPage enterTelephoneNumber() {
        driver.findElement(telephoneNumber).sendKeys(TELEPHONE_NUMBER);
        return this;
    }

    public CreateAccountPage checkNewsLetterCheckBox() {
        driver.findElement(newsletterCheckbox).click();
        return this;
    }

    public CreateAccountPage createPassword() {
        driver.findElement(passwordField).sendKeys(PASSWORD);
        driver.findElement(passwordFieldConfirmation).sendKeys(PASSWORD);
        return this;
    }

    public AccountSuccessPage submitEnteredInformation() {
        driver.findElement(submitButton).click();
        return new AccountSuccessPage(driver);
    }
}


