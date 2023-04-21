package com.dsalgo.qa.pages;

import com.dsalgo.qa.base.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GetStartedPage extends TestBase {
    //PageFactory or object repository
    @FindBy(xpath="//button[@class='btn']")//  //tagname[@attribute='value']
    WebElement GetStartedBtn;

    //Initializing the Page Objects or page factory
    public GetStartedPage()
    {
        PageFactory.initElements(driver,this);// this is current class object
    }
// actions handled
    public String validateTitleGetStartedPage()
    {
        return driver.getTitle();
    }

}
