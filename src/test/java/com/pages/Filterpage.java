package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.baseclass.Library;
import com.resuabilityFunctions.SeleniumResuable;

public class Filterpage extends Library{
public SeleniumResuable se;
	public Filterpage (WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver, this);
	}
	
@FindBy(xpath="(//select[@class='hbnjE2'])[1]")	WebElement MiniumAmount;
@FindBy(xpath="(//select[@class='hbnjE2'])[2]")	WebElement MaxiumAmount;
@FindBy(xpath="//div[text()='vivo']")	WebElement Brand;
@FindBy(xpath="//div[text()='4 GB']")	WebElement Ram;
@FindBy(xpath="//div[text()='Battery Capacity']")	WebElement BatteryRow;
@FindBy(xpath="//div[text()='5000 - 5999 mAh']")	WebElement BatteryCapacity;
	
	
public void min() {
se=new SeleniumResuable(driver);
se.dropdown(MiniumAmount, "10000");
}
public void max() {
	se=new SeleniumResuable(driver);
	se.dropdown(MaxiumAmount, "20000");
}
public void brand() {
	se=new SeleniumResuable(driver);
	se.click(Brand);
}
public void ram() {
	se=new SeleniumResuable(driver);
	se.scrolldown(Ram);
}
public void clickbattery() {
	se=new SeleniumResuable(driver);
	se.scrolldown(BatteryRow);
	se.click(BatteryCapacity);
}
	
}
