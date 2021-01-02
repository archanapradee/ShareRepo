package com.share.pages;

import com.share.driver.AppiumDriverForAndroid;


public class BaseAppPage {
    protected String FetchButton = "com.dyson.recruitment.test:id/connection_display_primary_button";

    protected AppiumDriverForAndroid appiumDriver;

    public BaseAppPage(AppiumDriverForAndroid driver) {
        this.appiumDriver = driver;
    }

    public AppiumDriverForAndroid getAppiumDriver() {
        return appiumDriver;
    }
}
