package com.stepdefinition;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.Maven_Project_7pm.BaseClass;
import com.properties.Property_Reader;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinition extends BaseClass {

	public static WebDriver driver;

	@Before
	public void beforeHooks(Scenario s) {

		String name = s.getName();
		System.out.println("Scenario name :" + name);
	}

	@After
	public void afterHooks(Scenario s) throws IOException {

		String status = s.getStatus();
		System.out.println("Scenario status :" + status);

		if (s.isFailed()) {

			screenshotMethod("");
		}
	}
	
	@Given("^user open the browser$")
	public void user_open_the_browser() throws Throwable {
	   
		System.out.println("Browser opened");
	}


	@Given("^user Must Launch The Url$")
	public void user_Must_Launch_The_Url() throws Throwable {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\asus\\eclipse-workspace\\LA\\Maven_Project_7pm\\Driver\\chromedriver.exe");

		driver = new ChromeDriver();

		driver.get("https://www.saucedemo.com/");

		driver.manage().window().maximize();
	}

	@When("^user Enter The \"([^\"]*)\" In The Username Field$")
	public void user_Enter_The_In_The_Username_Field(String username) throws Throwable {

		WebElement email = driver.findElement(By.id("user-name"));
		email.sendKeys(username);
	}

	@When("^user Enter The \"([^\"]*)\" In The Password Field$")
	public void user_Enter_The_In_The_Password_Field(String pass) throws Throwable {

		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys(pass);
	}

	@Then("^user Click On Login Button and It Navigates To The Products Page$")
	public void user_Click_On_Login_Button_and_It_Navigates_To_The_Products_Page() throws Throwable {

		WebElement login = driver.findElement(By.id("login-button"));
		login.click();
	}

}
