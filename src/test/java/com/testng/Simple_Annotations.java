package com.testng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Simple_Annotations {

	@BeforeSuite
	public void propertySet() {

		System.out.println("Property Setting");
	}

	@BeforeTest
	public void browserLaunch() {

		System.out.println("Browser launch");
	}

	@BeforeClass
	public void urlLaunch() {

		System.out.println("Url Launch");
	}

	@BeforeMethod
	public void login() {

		System.out.println("Login");
	}

	@Test(priority = -1)
	public void tshirt() {

		System.out.println("Tshirt");
	}

	@Test(priority = 0)
	public void jean() {

		System.out.println("Jean");
	}

	@Test(invocationCount = 3)
	public void shoe() {

		System.out.println("Shoe");
	}

	@AfterMethod
	public void logout() {

		System.out.println("Logout");
	}

	@AfterClass
	public void screenshot() {

		System.out.println("Screenshot");
	}

	@AfterTest
	public void close() {

		System.out.println("Close");
	}

	@AfterSuite
	public void quit() {

		System.out.println("Quit");
	}

}
