package com.dsalgo.qa.pages;

import com.dsalgo.qa.base.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignInPage extends TestBase {
    @FindBy(id ="id_username")
    WebElement username;
    @FindBy(id ="id_password")
    WebElement password;

    @FindBy(xpath="//input[@value='Login']")
    WebElement loginBtn;

    //Initializing page objects
    public SignInPage() {
        PageFactory.initElements(driver, this);
    }
    public String validateSignInPageTitle() {
        return driver.getTitle();
    }



}
