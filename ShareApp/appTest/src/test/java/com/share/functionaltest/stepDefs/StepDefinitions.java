package com.share.functionaltest.stepDefs;


import com.share.driver.AppiumDriverForAndroid;
import com.share.pages.PageFactory;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import org.apache.log4j.Logger;

import static org.junit.Assert.assertTrue;

public class StepDefinitions {
    PageFactory pageFactory;
    AppiumDriverForAndroid appiumDriver;
    private static Logger logger = Logger.getLogger(StepDefinitions.class);

    @Before
    public void setUpBefore() {

        this.appiumDriver = new AppiumDriverForAndroid();
        pageFactory = new PageFactory(appiumDriver);
    }

    @After
    public void tearDown() {
        appiumDriver.quit();
    }
//IsInternetConnectionWorking: This method launches app and check internet connectivity.
    @Given("I have a portfolio page")
     public void i_have_a_portfolio_page() {
    assertTrue("", pageFactory.getPortfolioConnectionPage().isPortfolioTitleDisplayed());
    assertTrue("", pageFactory.getPortfolioConnectionPage().isPortfolioPromptDisplayed());
    assertTrue("", pageFactory.getPortfolioConnectionPage().isPortfolioPromptDetailDisplayed());
     }
//fetchWeatherAndTempData : This method can clicks the Fetch Button and View Result buttons.
    @When("I downloaded weather and Temp data")
    public void fetchWeatherAndTempData(){
       // pageFactory.getInternetConnectionPage().clickOnFetchDataButton();
       // pageFactory.getDataCollectionPage().isDataCollectedStatusDisplayed();
       // pageFactory.getDataCollectionPage().isDataCollectedStatusDescDisplayed();
       // pageFactory.getDataCollectionPage().clickOnViewResultsButton();
    }
// checkIfWeatherAndTemperatureValueAreDisplayed  : This method can check weather and temperature value presence
    @Then("I can see the weather and temp values")
    public void checkIfWeatherAndTemperatureValueAreDisplayed(){
      //  assertTrue(pageFactory.getWeatherDataPage().isWeatherDataPageDisplayed());
       // assertTrue(pageFactory.getWeatherDataPage().isWeatherDataDisplayed());
       // assertTrue(pageFactory.getWeatherDataPage().isTemperatureDataDisplayed());
    }



    @When("I click on DIA stock")
    public void i_click_on_DIA_stock() {
        // Write code here that turns the phrase above into concrete actions
        pageFactory.getPortfolioConnectionPage().isPortfolioPromptDIADisplayed();
        pageFactory.getPortfolioConnectionPage().clickOnPortfolioDIA();
    }

    @Then("I can see the open and Today's high,Market Cap")
    public void i_can_see_the_open_and_Today_s_high_Market_Cap() {
        // Write code here that turns the phrase above into concrete actions
        pageFactory.getDataCollectionPage().isPortfolioNameDisplayed();
        pageFactory.getDataCollectionPage().isPortfolioNameValueDisplayed();
    }

}
