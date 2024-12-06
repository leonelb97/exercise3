package org.example.screens;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class HomePageScreen {
    private WebDriver driver;

    private By mainLogo = By.cssSelector("a[class='logo']");
    private String url = "https://qubika.com/";
    private By contactUsButton = By.cssSelector("li.menu-item-contact-us");
    private By rejectCookiesButton = By.className("cky-btn-reject");
    private WebDriverWait wait;

    public HomePageScreen(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    public HomePageScreen verify(){
        Assert.assertTrue(driver.findElement(mainLogo).isDisplayed());
        System.out.println("Main logo is displayed");
        Assert.assertEquals(url, driver.getCurrentUrl());
        driver.findElement(rejectCookiesButton).click();
        return this;
    }


    public HomePageScreen clickContactUsButton(){
        driver.findElement(contactUsButton).click();
        System.out.println("Contact us button clicked");
        return this;
    }
}
