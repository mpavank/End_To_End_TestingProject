package com.hooks;

import java.io.IOException;

import org.openqa.selenium.By;
import com.baseclass.Library;
import com.resuabilityFunctions.SeleniumResuable;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class hooks extends Library {
	 SeleniumResuable se;
	public static Scenario scenario;
		@Before
		public void test(Scenario cucumberscenario) throws IOException {
			scenario=cucumberscenario;
			launchapplication();
		  
		}
		@After
		public void cleanup(Scenario scenario) {
			 se=new SeleniumResuable(driver);
			// se.attachscreenshot(scenario);
			se.closeapp();
		}
}
