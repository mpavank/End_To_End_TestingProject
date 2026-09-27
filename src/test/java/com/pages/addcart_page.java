package com.pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.baseclass.Library;
import com.resuabilityFunctions.SeleniumResuable;

public class addcart_page extends Library{
 public SeleniumResuable se;
public addcart_page(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver, this);
}
@FindBy(xpath="(//input[@name='q'])[1]")WebElement searchtext;
@FindBy (xpath="//div[text()='TOSHIBA V37SP 126 cm (50 inch) QLED Full HD Smart VIDAA TV']")
WebElement   productselect;
public void search(String text) {
	 se=new SeleniumResuable(driver);
	se.entervalue(searchtext, text);
}
public void clicksearch() {
	searchtext.sendKeys(Keys.ENTER);
}
public void searchproduct(String text1) {
se.entervalue(searchtext, text1);	
}
public void product() {
	 productselect.click();
}
	
}
