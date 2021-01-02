package com.share.functionaltest;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(
        features={"D:\\ShareApp\\appTest\\src\\test\\resources\\com.dyson.functionaltest\\shareTest.feature"}
        ,glue={"com/share/functionaltest/stepDefs"},
        plugin = { "pretty", "html:target/cucumber-reports/" },
        monochrome = true
)
public class ShareTest { }
