package com.testng;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class Ignore_Concept {

	@Test
	public void apple() {

		System.out.println("Apple");
	}
	
	@Test
	public void orange() {

		System.out.println("Orange");
	}
	
	@Ignore
	@Test
	public void grapes() {

		System.out.println("Grapes");
	}
	
	@Test
	public void carrot() {

		System.out.println("Carrot");
	}
	
	@Test(enabled = false)
	public void potato() {

		System.out.println("Potato");
	}
}
