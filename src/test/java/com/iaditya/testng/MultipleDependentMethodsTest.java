package com.iaditya.testng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class MultipleDependentMethodsTest {
	
	private int passValueToMethodOne = 0;
	
  @Test(dependsOnMethods = { "testMethodTwo", "testMethodThree"}, alwaysRun=false)
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

  @Test
  public void testMethodThree() {
	  passValueToMethodOne = 2;
	  System.out.println("testMethodThree");
	  Assert.assertEquals(true, true);	  
  }
}
