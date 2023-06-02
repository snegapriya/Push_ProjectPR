package com.Maven_Project_7pm;

import java.io.IOException;

import com.pom.Login_Page;
import com.properties.Property_Reader;

public class Runner extends BaseClass {
	
	public static void main(String[] args) throws IOException {
		
		Property_Reader pr = new Property_Reader();
		
		launchBrowser("chrome");

		launchUrl(pr.getUrl());

		Login_Page lp = new Login_Page(driver);
		
		passInput(lp.getUsername(), pr.getUsername());

		passInput(lp.getPassword(), pr.getPassword());

		clickOnElement(lp.getLogin());
		
	}
}
