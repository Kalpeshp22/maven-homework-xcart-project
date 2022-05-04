package com.xcartmobile.demo.pages;

import com.xcartmobile.demo.propertyreader.Utility;
import org.openqa.selenium.By;

public class ThankYouPage extends Utility {   By verifyThankYou = By.xpath("//h1[contains(.,'Thank you for your order')]");

    public void verifyThankYouMsg(){
        mouseHoverToElement(verifyThankYou);

    }
}
