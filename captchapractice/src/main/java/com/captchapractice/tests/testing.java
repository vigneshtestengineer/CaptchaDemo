package com.captchapractice.tests;

import org.testng.annotations.Test;

import com.captchapractice.BrowserSetup.SetupBrowser;
import com.captchapractice.pages.LoginPage;

public class testing extends SetupBrowser{

  @Test
    public void verifyValidLogin() throws InterruptedException {

        // Create Page Object
        LoginPage loginPage = new LoginPage(driver);

        // Perform login
        loginPage.login("admin");
    }

}
