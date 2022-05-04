package com.xcartmobile.demo.testbase;


import com.xcartmobile.demo.propertyreader.PropertyReader;
import com.xcartmobile.demo.propertyreader.Utility;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class TestBase extends Utility {

    String browser = PropertyReader.getInstance().getProperty("browser");

    @BeforeMethod
    public void setUp(){
        selectBrowser(browser);
    }

    @AfterMethod
    public void tearDown(){
        closeBrowser();
    }

}
