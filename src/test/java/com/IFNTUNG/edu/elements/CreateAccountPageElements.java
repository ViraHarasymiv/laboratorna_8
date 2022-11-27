package com.IFNTUNG.edu.elements;

import org.openqa.selenium.By;

public class CreateAccountPageElements {
    private static By genderRadioButton = By.xpath("//input[@value='m']");
    private static By firstNameField = By.xpath("//input[@name='firstname']");
    private static By lastNameField = By.xpath("//input[@name='lastname']");
    private static By dateOfBirth = By.xpath("//input[@class='hasDatepicker']");
    private static By emailField = By.xpath("//input[@name='email_address']");
    private static By companyNameField = By.xpath("//input[@name='company']");
    private static By streetAddressField = By.xpath("//input[@name='street_address']");
    private static By postCodeField = By.xpath("//input[@name='postcode']");
    private static By cityField = By.xpath("//input[@name='city']");
    private static By stateField = By.xpath("//input[@name='state']");
    private static By selectCountryMenu = By.xpath("//select[@name='country']");
    private static By ukraineOption = By.xpath("//option[contains(text(), 'Ukraine')]");
    private static By telephoneNumber = By.xpath("//input[@name='telephone']");
    private static By newsletterCheckbox = By.xpath("//input[@name='newsletter']");
    private static By passwordField = By.xpath("//input[@name='password']");
    private static By passwordFieldConfirmation = By.xpath("//input[@name='confirmation']");
    private static By submitButton = By.xpath("//span[contains(text(), 'Continue')]");

    public static By getGenderRadioButton(){return genderRadioButton;}
    public static By getFirstNameField(){return firstNameField;}
    public static By getLastNameField(){return lastNameField;}
    public static By getDateOfBirth(){return dateOfBirth;}
    public static By getEmailField(){return emailField;}
    public static By getCompanyNameField() {return companyNameField;}
    public static By getStreetAddressField() {return streetAddressField;}
    public static By getPostCodeField() {return postCodeField;}
    public static By getCityField() {return cityField;}
    public static By getStateField() {return stateField;}
    public static By getSelectCountryMenu() {return selectCountryMenu;}
    public static By getUkraineOption() {return ukraineOption;}
    public static By getTelephoneNumber() {return telephoneNumber;}
    public static By getNewsletterCheckbox() {return newsletterCheckbox;}
    public static By getPasswordField() {return passwordField;}
    public static By getPasswordFieldConfirmation() {return passwordFieldConfirmation;}
    public static By getSubmitButton() {return submitButton;}
}
