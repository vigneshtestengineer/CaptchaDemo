package com.captchapractice.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    WebDriver driver;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(id="txtusername")
    WebElement Username;

    @FindBy(id="txtpassword")
    WebElement Password;

    @FindBy(id="txtcaptcha")
    WebElement captchbox;

    public void enterusername(String username) throws InterruptedException
    {
    Username.sendKeys(username);
    Thread.sleep(8000);
    }

    public void login(String user) throws InterruptedException{
        enterusername(user);
    }

}
