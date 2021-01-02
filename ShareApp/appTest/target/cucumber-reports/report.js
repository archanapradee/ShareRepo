$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("D:\\ShareApp\\appTest\\src\\test\\resources\\com.dyson.functionaltest\\weatherTest.feature");
formatter.feature({
  "name": "Stock",
  "description": "    To buy stock check portfolio page loading",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Get the portfolio loading",
  "description": "",
  "keyword": "Scenario"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I have a portfolio page",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinitions.i_have_a_portfolio_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click on DIA stock",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinitions.i_click_on_DIA_stock()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I can see the open and Today\u0027s high,Market Cap",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinitions.i_can_see_the_open_and_Today_s_high_Market_Cap()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});