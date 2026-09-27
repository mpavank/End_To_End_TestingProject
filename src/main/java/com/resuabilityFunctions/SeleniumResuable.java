package com.resuabilityFunctions;

import java.io.File;
import java.time.Duration;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.idealized.Javascript;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.baseclass.Library;

import io.cucumber.java.Scenario;

public class SeleniumResuable extends Library{
 public 	Actions act;
	public SeleniumResuable(WebDriver driver) {
	this.driver=driver;	
	}
	
public void entervalue(WebElement element, String text) {
	try {
	element.sendKeys(text);
	}catch(Exception e) {
	System.out.println("No Such Element exception");	
	}
}
public void click(WebElement element) {
	try {
	element.click();
	}catch(Exception e) {
	System.out.println("No Such Element exception");	
	}
}
public void gettitle() {
	try {
	System.out.println(driver.getTitle());	
	}catch(Exception e) {
		System.out.println("couldnt get the title");
	}
}
public void screenshot(String path) {
	TakesScreenshot ts=(TakesScreenshot) driver;
	File src=ts.getScreenshotAs(OutputType.FILE);
	try {
	FileUtils.copyFile(src, new File(path));	
	}catch(Exception e) {
		System.out.println("screenshot not found");
	}
}
public void getvalue(WebElement element) {
	String text = element.getText();
	System.out.println(text);
}
public void MultipleGettext(List<WebElement>  element) {
	List<WebElement> text = element;
	System.out.println(text.size());
	for(WebElement textcount:text) {
	String totallist = textcount.getText();
	System.out.println("***********************************");
	System.out.println(totallist);
	}
}
public void dropdown(WebElement element,String text) {
	Select s=new Select(element);
	s.selectByValue(text);
}
public void scrolldown(WebElement element) {
	JavascriptExecutor js=(JavascriptExecutor) driver;
	js.executeScript("arguments[0].click();",element);
}
public void waits() throws InterruptedException {
	Thread.sleep(3000);
}
public void mouseover(WebElement element) {
act=new Actions(driver);
	act.moveToElement(element).perform();
}
public void moveelemet(WebElement element) {
act=new Actions(driver);
act.moveToElement(element).click().perform();
}
public void windowhandling(WebElement element) {
 String parentwindow = driver.getWindowHandle();
 System.out.println(parentwindow);
 
 Set<String> allwindows = driver.getWindowHandles();
 System.out.println(allwindows.size());
 
 for(String childwindow:allwindows) {
	driver.switchTo().window(childwindow);
	System.out.println(childwindow);
 }
 
}

public void attachscreenshot(Scenario cucumberscenario) {
	byte[] screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
	cucumberscenario.attach(screenshot, "image/png", "FlipkartAutomation");
}
public void closeapp() {
	driver.quit();
	System.out.println("browser closed");
}
public void waitForVisibility(WebElement element) {
	WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
	wait.until(ExpectedConditions.visibilityOf(element));
}

public void highlightelement(WebElement element) {
	JavascriptExecutor js=(JavascriptExecutor) driver;
	js.executeScript("arguments[0].style.background='yellow'",element);
}
public void navigateback() {
	driver.navigate().back();
}
}
