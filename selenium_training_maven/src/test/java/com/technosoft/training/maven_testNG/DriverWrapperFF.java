package com.technosoft.training.maven_testNG;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
//Initialises driver and fields for testing and quite browser after testing
public class DriverWrapperFF {
    //Initialises variable
    private static WebDriver driver = null;
    //Initialises variable
    private String url = "https://www.facebook.com/";
    //Initialises variable
    private String expectedTitle = "Facebook - Log In or Sign Up";
    //Start of getters block
    public String getExpectedTitle() {
        return expectedTitle;
    }

    public String getUrl() {
        return url;
    }

    public static WebDriver getDriver() {
        return driver;
    }//end getters block

    @BeforeClass
    //Initialise driver, gets url, sets properties
    public  void initializeWebDriver(){
        System.setProperty("gecko.driver","/usr/local/Cellar/geckodriver/0.19.1");
        //assigns FirefoxDriver driver to variable
        driver = new FirefoxDriver();
        driver.navigate().to(url);
    }

    @AfterClass
    //Quites browser
    public  void quiteWebDriver(){
        driver.quit();

    }
}
