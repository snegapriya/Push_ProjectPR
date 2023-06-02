package com.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\java\\com\\feature" , glue = "com.stepdefinition" ,
                 monochrome = true, dryRun = false, strict = true, tags = ("@Tag1"),
                 plugin = {"html:Reports/Sauce.html" , "json:Reports/Demo.json" , 
                		 "com.cucumber.listener.ExtentCucumberFormatter:Reports/SauceDemoExtent.html"})
public class Runner {

	
}
