package com.share.pages;

import com.share.driver.AppiumDriverForAndroid;


public class CheckPortfolioFromPage extends BaseAppPage {

    private String portfolioTitle = "com.savved.uptick:id/portfolio_title";
    private String portfolioPrompt  = "com.savved.uptick:id/intro_prompt";
    private String portfolioPromptDetail  = "com.savved.uptick:id/intro_prompt_detail";
    private String portfolioDIA = "//android.widget.TextView[@text='DIA']";
    public CheckPortfolioFromPage(AppiumDriverForAndroid driver) {
        super(driver);
    }

    public boolean isPortfolioTitleDisplayed(){

        return appiumDriver.isElementDisplayedById(portfolioTitle);
    }

    public boolean isPortfolioPromptDisplayed(){

        return appiumDriver.isElementDisplayedById(portfolioPrompt);
    }

    public boolean isPortfolioPromptDetailDisplayed(){

        return appiumDriver.isElementDisplayedById(portfolioPromptDetail);
    }

    public boolean isPortfolioPromptDIADisplayed(){

        return appiumDriver.isElementDisplayedByXpath(portfolioDIA);
    }



    public void clickOnPortfolioDIA() {

        appiumDriver.clickOnElementByXPath(portfolioDIA);

        // appiumDriver.clickOnElementById(viewResultsButtonResourceId);
    }

}
