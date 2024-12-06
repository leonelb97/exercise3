package org.example.tests;

import org.example.BaseTest;
import org.example.screens.ContactUsForm;
import org.example.screens.HomePageScreen;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Exercise3 extends BaseTest {

    @Test
    public void exercise3() throws InterruptedException {
        HomePageScreen homePageScreen = new HomePageScreen(driver);
        homePageScreen.verify();
        homePageScreen.clickContactUsButton();
        ContactUsForm contactUsForm = new ContactUsForm(driver);
        contactUsForm
                .verify()
                .clickSubmitButton()
                .verifyMandatoryFields()
                .fillFirstName("Test name")
                .clickSubmitButton()
                .verifyMandatoryFields();
    }
}
