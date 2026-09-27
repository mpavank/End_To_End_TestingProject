package com.stepdefination;

import java.io.IOException;

import org.openqa.selenium.By;

import com.baseclass.Library;
import com.pages.searchpage;

import io.cucumber.java.en.*;

public class searchmobiles extends Library {
	public 	 searchpage sp;
	@Given("Launch the Flipkart application")
	public void launch_the_flipkart_application() throws IOException {
		launchapplication();
	}
	@When("close the popup")
	public void close_the_popup() {
	 driver.findElement(By.xpath("//span[@role='button']")).click();	 
	}
	@Then("It should navigates to the Flipkart")
	public void it_should_navigates_to_the_flipkart() {
	   sp=new searchpage(driver);
	   sp.homescreen();	   
	}
	@Given("user enter the text in the search field")
	public void user_enter_the_text_in_the_search_field() {
	sp.search("Mobiles");
	}

	@When("cliks the search button")
	public void cliks_the_search_button() {
	   sp.clicksearch();
	}
	@Then("It should navigate to the search result page and display the relevent detailes")
	public void it_should_navigate_to_the_search_result_page_and_display_the_relevent_detailes() {
	 sp.result();
	}
	@Then("Extract the results and print in console")
	public void extract_the_results_and_print_in_console() {
	  sp.printentaireresult();
	}

	@Then("print the third result and keep it in the console")
	public void print_the_third_result_and_keep_it_in_the_console() {
	  sp.printthridresult(); 
	}

}
