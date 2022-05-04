package com.xcartmobile.demo.pages;

import com.xcartmobile.demo.propertyreader.Utility;
import org.openqa.selenium.By;

public class LoginToYourAccountPage extends Utility { By verifyLogInMsg = By.xpath("//h3[contains(text(),'Log in to your account')]");
    By inputEmail = By.id("email");
    By continueBtn = By.xpath("//button[contains(@class,'regular-button anonymous-continue-button submit')]");


    public void verifyLogInMsg() {
        mouseHoverToElement(verifyLogInMsg);
    }
    public void enterEmail() {
        mouseHoverToElement(inputEmail);
    }
    public void clickOnContinue(){
        clickOnElement(continueBtn);
    }
}
