package com.testng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Sample {

	@Test
	public void demo1() {

		String exp = "xyz";
		String act = "xyz";
		Assert.assertEquals(act, exp);
	}
	
	@Test(retryAnalyzer = Rerun.class)
	public void demo2() {

		String exp = "xyz";
		String act = "xyzgyu";
		Assert.assertEquals(act, exp);
		
	}
}
