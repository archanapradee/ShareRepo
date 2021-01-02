Feature: Stock
    To buy stock check portfolio page loading

    Scenario: Get the portfolio loading
        Given I have a portfolio page
        When I click on DIA stock
        Then I can see the open and Today's high,Market Cap