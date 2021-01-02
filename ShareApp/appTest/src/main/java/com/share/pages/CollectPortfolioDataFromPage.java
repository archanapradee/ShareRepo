package com.share.pages;

import com.share.driver.AppiumDriverForAndroid;


public class CollectPortfolioDataFromPage extends BaseAppPage {
    private String portFolioName = "com.savved.uptick:id/ticker";
    private String portFolioNameValue  = "com.savved.uptick:id/last_price";
    public CollectPortfolioDataFromPage(AppiumDriverForAndroid driver) {
        super(driver);
    }


    public boolean isPortfolioNameDisplayed(){
        return appiumDriver.isElementDisplayedById(portFolioName);
    }

    public boolean isPortfolioNameValueDisplayed(){
        return appiumDriver.isElementDisplayedById(portFolioNameValue);
    }

   }
