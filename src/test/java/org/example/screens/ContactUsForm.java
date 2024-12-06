package org.example.screens;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class ContactUsForm {

    private WebDriver driver;

    private By firstNameField = By.name("firstname");
    private By lastNameField = By.name("lastname");
    private By submitButton = By.cssSelector("input.hs-button.primary.large");
    private WebDriverWait wait;
    private By firsNameBox = By.className("hs_firstname");
    private By lastNameBox = By.className("hs_lastname");
    private By emailBox = By.className("hs_email");
    private By companyNameBox = By.className("hs_company");
    private By contactTypeBox = By.className("hs_contact_type");
    private By messageBox = By.className("hs_message");

    private By mandatoryMessageField = By.cssSelector("ul.hs-error-msgs");





    public ContactUsForm(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }


    public ContactUsForm verify() throws InterruptedException {
        Thread.sleep(1000);
        Assert.assertTrue(driver.findElement(firsNameBox).isDisplayed());
        System.out.println("First name field is displayed");
        Assert.assertTrue(driver.findElement(emailBox).isDisplayed());
        System.out.println("Email field is displayed");
        Assert.assertTrue(driver.findElement(submitButton).isDisplayed());
        System.out.println("Submit button is displayed");
        return this;
    }

    public ContactUsForm clickSubmitButton(){
        driver.findElement(submitButton).click();
        System.out.println("Submit button is clicked");
        return this;
    }

    public ContactUsForm verifyMandatoryFields(){
        Assert.assertTrue(driver.findElement(firsNameBox).findElement(mandatoryMessageField).isDisplayed());
        System.out.println("First name mandatory field is displayed");
        Assert.assertTrue(driver.findElement(lastNameBox).findElement(mandatoryMessageField).isDisplayed());
        System.out.println("Email mandatory field is displayed");
        Assert.assertTrue(driver.findElement(emailBox).findElement(mandatoryMessageField).isDisplayed());
        System.out.println("Company name mandatory field is displayed");
        Assert.assertTrue(driver.findElement(companyNameBox).findElement(mandatoryMessageField).isDisplayed());
        System.out.println("Contact type mandatory field is displayed");
        Assert.assertTrue(driver.findElement(contactTypeBox).findElement(mandatoryMessageField).isDisplayed());
        System.out.println("Message mandatory field is displayed");
        Assert.assertTrue(driver.findElement(messageBox).isDisplayed());
        System.out.println("Mandatory field is displayed");
        return this;
    }

    public ContactUsForm fillFirstName(String firstName){
        driver.findElement(firstNameField).sendKeys(firstName);
        System.out.println("First name field filled");
        return this;
    }

}
