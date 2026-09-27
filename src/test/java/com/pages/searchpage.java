package com.pages;

import java.util.List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.baseclass.Library;
import com.resuabilityFunctions.SeleniumResuable;

public class searchpage  extends Library{
public SeleniumResuable se;
public searchpage(WebDriver driver) {
this.driver=driver;
PageFactory.initElements(driver, this);
}
@FindBy(xpath="//html[@lang='en-IN']")WebElement Homepage;
@FindBy(xpath="(//input[@name='q'])[1]")WebElement searchtext;
@FindBy(xpath="//html[@lang='en']")WebElement searchresult;

@FindBy(xpath="//div[@class='col col-7-12']")List<WebElement> EntaireResult;
@FindBy(xpath="(//div[@class='col col-7-12'])[3]")WebElement thriedresult;



public void search(String text) {
	 se=new SeleniumResuable(driver);
	se.entervalue(searchtext, text);
}
public void clicksearch() {
	searchtext.sendKeys(Keys.ENTER);
}
public void homescreen() {
	System.out.println(Homepage.isDisplayed());
}
public void result() {
	System.out.println(searchresult.isDisplayed());
}
public void printentaireresult() {
	se.MultipleGettext(EntaireResult);
}
public void printthridresult() {
	se.getvalue(thriedresult);
}
}
