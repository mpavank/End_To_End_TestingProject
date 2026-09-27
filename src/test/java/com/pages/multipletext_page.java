package com.pages;

import java.io.IOException;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.baseclass.Library;
import com.hooks.hooks;
import com.resuabilityFunctions.SeleniumResuable;
import com.utilities.excelutility;

import io.cucumber.java.Scenario;

public class multipletext_page  extends Library{
	public excelutility excel;
public SeleniumResuable se;
	
	public multipletext_page(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="(//input[@name='q'])[1]")WebElement searchfiled;
	@FindBy(xpath="//div[@id='container']")WebElement homepage;


	public void Searchwithexcel() throws Exception {
		excel=new excelutility();
		
		for(int i=1;i<=6;i++) {
			se=new SeleniumResuable(driver);
			se.entervalue(searchfiled, excel.excelread("sheet1", i, 0));
			searchfiled.sendKeys(Keys.ENTER);
			se.waits();
			se.attachscreenshot(hooks.scenario);
			if(homepage.isDisplayed()) {
				excel.excelwrite("sheet1", i, 1, "PASS");
			}else {
				excel.excelwrite("sheet1", i, 1, "FAIL");
			}
			se.navigateback();
			
		}
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
