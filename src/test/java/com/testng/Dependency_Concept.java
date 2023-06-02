package com.testng;

import org.testng.annotations.Test;

public class Dependency_Concept {

	@Test
	public void valid_Credentials() {

		System.out.println("Valid Credentials");
	}
	
	@Test(dependsOnMethods = "valid_Credentials")
	public void login() {

		System.out.println("Login");
	}
}
