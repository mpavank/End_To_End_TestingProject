package com.stepdefination;

import org.openqa.selenium.By;

import com.baseclass.Library;
import com.pages.Filterpage;
import com.resuabilityFunctions.SeleniumResuable;

import io.cucumber.java.en.Then;

public class Filter_stepdefination extends Library{
	public Filterpage fp;
	public SeleniumResuable se;
	@Then("Select Minium and Maximum Amount")
	public void select_minium_and_maximum_amount() throws Throwable {
	    fp=new Filterpage(driver);
	    String beforefilter = driver.findElement(By.xpath("//html[@lang='en']")).getText();
	   System.out.println("BeforeFilter :"+beforefilter );
	   fp.min();
	   se=new SeleniumResuable(driver);
	   se.waits();
	   fp.max();
	   se.waits();
	}

	@Then("Select the Brand")
	public void select_the_brand() throws InterruptedException {
	  fp.brand();
	  se.waits();
	}

	@Then("Select the Ram")
	public void select_the_ram() throws InterruptedException {
	   fp.ram();
	   se.waits();
	}

	@Then("Select the Battery Capacity")
	public void select_the_battery_capacity() throws InterruptedException {
	   fp.clickbattery();
	   se.waits();
	}

	@Then("it should display the Relevent result")
	public void it_should_display_the_relevent_result() {
	  System.out.println("**************************************************");
	  String Afterfilter = driver.findElement(By.xpath("//div[text()='vivo T5e (Aero Blue, 64 GB)']")).getText();
	   System.out.println("AfterFilter :"+Afterfilter );
	}

}
