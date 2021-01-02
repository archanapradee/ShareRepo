package com.share.data;

import static io.appium.java_client.remote.MobilePlatform.ANDROID;

public class Config {
    private String platformName = ANDROID;
    private String platformVersion;
    private String deviceName;
    private String automationName;
    private String appPath;
     private String appPackage;
    private String appActivity;

    public String getPlatformName() {
        return platformName;
    }

    public String getPlatformVersion() {
        return platformVersion;
    }

    public String getDeviceName() {
        return deviceName;
    }

    public String getAutomationName() {
        return automationName;
    }

    public String getAppPath() {
        return appPath;
    }

    public void setPlatformVersion(String platformVersion) {
        this.platformVersion = platformVersion;
    }
    public String getAppPackage() {
        return appPackage;
    }

    public void setAppPackage(String appPackage) {
        this.appPackage = appPackage;
    }
    public String getAppActivity() {
        return appActivity;
    }

    public void setAppActivity(String appActivity) {
        this.appActivity = appActivity;
    }

    public void setAutomationName(String automationName) {
        this.automationName = automationName;
    }

    public void setDeviceName(String deviceName) {
        this.deviceName = deviceName;
    }

    public void setAppPath(String appPath) {
        this.appPath = appPath;
    }

    public String toString(){
        return String.format("{\"platformName\": \"%s\", \"platformVersion\': \"%s\", \"automationName\": \"%s\", \"deviceName\": \"%s\", \"appPath\": \"%s\"}",
                getPlatformName(), getPlatformVersion(), getAutomationName(), getDeviceName(), getAppPath());
    }
}

