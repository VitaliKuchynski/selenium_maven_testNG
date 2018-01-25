package com.technosoft.training.page.object.pattern;


import org.testng.annotations.Test;

public class TestRegistrationWithoutGender extends DriverWrapper{


    @Test
    //Fill in create new account form with empty gender radio-buttons and submit it
    public void createAccountWithEmptyGender() {
        CreateNewAccountPage createNewAccountPage = new CreateNewAccountPage();
        LogInPage logInPage = new LogInPage();
        logInPage.clickOnSignUpLink();
        createNewAccountPage.createNewUserAccount("Semen","Semenov","9685948903","qwe321Q");
        createNewAccountPage.selectBirthday("Jun","1","1984");
        createNewAccountPage.clickOnCreateButton();

    }
}