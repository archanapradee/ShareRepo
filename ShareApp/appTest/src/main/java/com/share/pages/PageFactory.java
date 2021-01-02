package com.share.pages;

import com.share.driver.AppiumDriverForAndroid;

public class PageFactory {

    private CollectPortfolioDataFromPage dataCollectionPage;
    private CheckPortfolioFromPage portfolioPage;

    public PageFactory(AppiumDriverForAndroid appiumDriverForAndroid){
        this.dataCollectionPage = new CollectPortfolioDataFromPage(appiumDriverForAndroid);
        this.portfolioPage = new CheckPortfolioFromPage(appiumDriverForAndroid);
    }

    public CollectPortfolioDataFromPage getDataCollectionPage() {
        return dataCollectionPage;
    }

    public CheckPortfolioFromPage getPortfolioConnectionPage() {
        return portfolioPage;
    }
}
