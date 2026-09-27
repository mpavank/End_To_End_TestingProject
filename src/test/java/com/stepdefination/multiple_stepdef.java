package com.stepdefination;

import java.io.IOException;

import com.baseclass.Library;
import com.pages.multipletext_page;
import com.resuabilityFunctions.SeleniumResuable;

import io.cucumber.java.en.*;

public class multiple_stepdef  extends Library{
	public multipletext_page mp;
	public SeleniumResuable sp;
	@Given("Enter serach Text In the Search Field")
	public void enter_serach_text_in_the_search_field() throws IOException, Exception {
	   mp=new multipletext_page(driver);
	   mp.Searchwithexcel();
	}

	@When("click search Icon")
	public void click_search_icon() {
	  sp=new SeleniumResuable(driver);
  sp.screenshot("src/test/resources/screenshots/searchexcel_"+System.currentTimeMillis()+".png");
	}

	@Then("It should Display the Relevent result")
	public void it_should_display_the_relevent_result() {
	   sp.gettitle();
	}


}
