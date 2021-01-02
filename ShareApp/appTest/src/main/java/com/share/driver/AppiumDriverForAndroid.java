package com.share.driver;

import com.share.data.Config;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.apache.log4j.Logger;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.FileReader;
import java.net.URL;

import static io.appium.java_client.remote.MobilePlatform.ANDROID;


public class AppiumDriverForAndroid {

    private String hostName = "http://127.0.0.1";
    private Integer portNum = 4723;
    private AndroidDriver<WebElement> androidDriver;
    private WebDriverWait wait;
    private static Logger logger = Logger.getLogger(AppiumDriverForAndroid.class);

    //AppiumDriverForAndroid : Initiate appium driver
    public AppiumDriverForAndroid() {

        Config configData = getConfigData("  D:\\DysonTest\\appTest\\src\\main\\resources\\config.json");

        try {
            this.androidDriver = createAppiumDriver(hostName, portNum, configData);
        } catch (Exception e) {
            logger.error("Exception raised while initialising Android Driver" + e.getStackTrace());
        }
        this.wait = new WebDriverWait(androidDriver, 20);
    }

    //getConfigData : Read JSON input and convert to string
    private static Config getConfigData(String fileName) {
        JSONParser parser = new JSONParser();
        Config config = new Config();

        try {
            Object obj = parser.parse(new FileReader(
                    fileName));

            JSONObject data = (JSONObject) obj;
            config.setPlatformVersion(data.get("platformVersion").toString());
            config.setDeviceName(data.get("deviceName").toString());
            config.setAutomationName(data.get("automationName").toString());
            config.setAppPath(data.get("appPath").toString());
            config.setAppActivity(data.get("appActivity").toString());
            config.setAppPackage(data.get("appPackage").toString());
        } catch (Exception e) {
            logger.error("Android Appium config is not defined" + e.getStackTrace());
        }
        return config;
    }

    //createAndroidCapabilities : Setting up android device capabilities
    private static DesiredCapabilities createAndroidCapabilities(Config config) {
        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();

        desiredCapabilities.setCapability(MobileCapabilityType.PLATFORM_NAME,ANDROID);
        desiredCapabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, config.getPlatformVersion());
        desiredCapabilities.setCapability(MobileCapabilityType.DEVICE_NAME, config.getDeviceName());
        desiredCapabilities.setCapability(MobileCapabilityType.APP, config.getAppPath());
        desiredCapabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, config.getAutomationName());
        desiredCapabilities.setCapability("appPackage","com.savved.uptick");
        desiredCapabilities.setCapability("appActivity","com.savved.uplift.MainActivity");

        return desiredCapabilities;
    }

    //createAppiumDriver : creating appium friver instance
    public static AndroidDriver<WebElement> createAppiumDriver(String hostAddress, Integer port, Config config) throws Exception {
        AndroidDriver<WebElement> androidDriver;

        DesiredCapabilities desiredCapabilities;
        desiredCapabilities = createAndroidCapabilities(config);
        URL appiumServerAddress = new URL(hostAddress + ":" + port + "/wd/hub");
        androidDriver = new AndroidDriver<>(appiumServerAddress, desiredCapabilities);
        return androidDriver;
    }

    //clickOnElementById : Click on specified locator(id)
    public void clickOnElementById(String id){
        //click on element using resource-id
                wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(id))).click();
    }
    public void clickOnElementByXPath(String xpath){
        //click on element using resource-id
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath))).click();
    }


    //isElementDisplayedById : click on specified locator
    public boolean isElementDisplayedById(String id){
            try {
                return wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(id))).isDisplayed();
            } catch (Exception e){
            return false;
        }
    }

    public boolean isElementDisplayedByXpath(String xpath){
        try {
            return wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath))).isDisplayed();
        } catch (Exception e){
            return false;
        }
    }

    //quit : exit appium driver
    public void quit() {
        androidDriver.quit();
    }
}