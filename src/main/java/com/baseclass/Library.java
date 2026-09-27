package com.baseclass;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Library {
public static WebDriver driver;
public Properties prop;
protected static Logger logger;
public void launchapplication() throws IOException {
	FileInputStream fis=new FileInputStream("C:\\Users\\pavan\\OneDrive\\Documents\\End_To_End_TestingProject\\src\\test\\resources\\Property\\config.properties");
     prop=new Properties();
	prop.load(fis);
	logger=Logger.getLogger(Library.class);
	PropertyConfigurator.configure("C:\\Users\\pavan\\OneDrive\\Documents\\End_To_End_TestingProject\\src\\test\\resources\\Property\\log4j.properties");
	try {
	if(prop.getProperty("browser").equalsIgnoreCase("chrome")) {
		driver=new ChromeDriver();
		logger.info("******************chrome browser launched");
	}
	else if(prop.getProperty("browser").equalsIgnoreCase("firefox")) {
		driver=new FirefoxDriver();
		logger.info("******************firefox browser launched");
	}
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.get(prop.getProperty("url"));
	logger.info("******************Application launched");
	
}
catch(Exception e) {
	e.printStackTrace();
	System.out.println("browser didnt launch");
}
}
public void teardown() {
	driver.quit();
}
}
