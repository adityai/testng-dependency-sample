package com.iaditya.testng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependentMethodTest {
	
	private int passValueToMethodOne = 0;
	
  @Test(dependsOnMethods = "testMethodTwo", alwaysRun=true)
  public void testMethodOne() {
	  System.out.println("testMethodOne: Value passed = " + passValueToMethodOne);
	  Assert.assertEquals(true, true);
  }
  
  @Test
  public void testMethodTwo() {
	  passValueToMethodOne = 1;
	  System.out.println("testMethodTwo");
	  Assert.assertEquals(true, false);	  
  }
}
