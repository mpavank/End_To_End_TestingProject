package com.Testrunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

//@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\pavan\\OneDrive\\Documents\\End_To_End_TestingProject\\src\\test\\resources\\features\\Flipkart.feature",
glue= {"com.stepdefination","com.hooks"},
tags="@tc004",
plugin={"pretty","com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
		"io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm"},
monochrome = true
)

public class Runner  extends AbstractTestNGCucumberTests{

}
