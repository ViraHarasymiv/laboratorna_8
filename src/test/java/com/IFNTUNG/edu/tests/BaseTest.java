package com.IFNTUNG.edu.tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class BaseTest {
    protected WebDriver driver;
    private static final String OSCOMMERCE_URL = "http://practice.bpbonline.com/index.php";

    @BeforeTest
    public void beforeSuite(){
        WebDriverManager.chromedriver().setup();
    }

    @BeforeMethod
    public void setDriver(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(OSCOMMERCE_URL);
    }

    @AfterMethod
    public void afterSuite(){
        if(driver != null){
            driver.quit();
        }
    }
}
