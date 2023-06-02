package com.testng;

import org.testng.annotations.Test;

public class Grouping_Concept {

	@Test(groups = "Fruits")
	public void apple() {

		System.out.println("Apple");
	}
	
	@Test(groups = "Fruits")
	public void orange() {

		System.out.println("Orange");
	}
	
	@Test(groups = "Fruits")
	public void grapes() {

		System.out.println("Grapes");
	}
	
	@Test(groups = "Vegetables")
	public void carrot() {

		System.out.println("Carrot");
	}
	
	@Test(groups = "Vegetables")
	public void potato() {

		System.out.println("Potato");
	}
	
	@Test(groups = "Vehicles")
	public void car() {

		System.out.println("Car");
	}
	
	@Test(groups = "Vehicles")
	public void bike() {

		System.out.println("Bike");
	}
	
	
}
