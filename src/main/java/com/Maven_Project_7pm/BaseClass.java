package com.Maven_Project_7pm;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {
	              
	public static WebDriver driver;
	
	// browser launch
	public static WebDriver launchBrowser(String browserName) {

		if (browserName.equalsIgnoreCase("chrome")) {
			
			System.setProperty("webdriver.chrome.driver",
					System.getProperty("user.dir")+"\\Driver\\chromedriver.exe");
			
			driver = new ChromeDriver();
			
			driver.manage().window().maximize();
		}
		else if (browserName.equalsIgnoreCase("firefox")) {
			
			System.setProperty("webdriver.gecko.driver",
					System.getProperty("user.dir")+"\\Driver\\chromedriver.exe");
			
			driver = new ChromeDriver();
			
			driver.manage().window().maximize();
		}
		
		return driver;
	}
	
	
	//get
	public static void launchUrl(String url) {

		driver.get(url);
	}
	
	//getTitle
	public static void getTitleMethod() {

		String title = driver.getTitle();
		System.out.println(title);
	}
	
	//close
	public static void closeWindow() {

		driver.close();
	}
	
	//sendkeys
	public static void passInput(WebElement element,String input) {

		element.sendKeys(input);
	}
	
	//click
	public static void clickOnElement(WebElement element) {

		element.click();
	}
	
	//getText
	public static void getTextMethod(WebElement element) {

		String text = element.getText();
		System.out.println(text);
	}
	
	//screenshot
	public static void screenshotMethod(String location) throws IOException {

		TakesScreenshot ts = (TakesScreenshot) driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File(location);
		FileUtils.copyFile(src, dest);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
