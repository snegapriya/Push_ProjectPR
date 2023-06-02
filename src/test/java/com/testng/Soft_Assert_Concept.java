package com.testng;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Soft_Assert_Concept {

	@Test
	public void demo() {

		String exp = "abcd";
		String act = "abcd467";
		SoftAssert s = new SoftAssert();
		s.assertEquals(act, exp);
		System.out.println("Verification Successful");
	}
}
