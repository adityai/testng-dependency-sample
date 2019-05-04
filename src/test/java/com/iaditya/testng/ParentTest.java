package com.iaditya.testng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ParentTest {
	
	private int passValueToMethodOne = 0;
	
  @Test
  public void testMethodOne() {
	  System.out.println("testMethodOne: Value passed = " + passValueToMethodOne);
	  Assert.assertEquals(true, false);
  }
  
  @Test
  public void testMethodTwo() {
	  passValueToMethodOne = 1;
	  System.out.println("testMethodTwo");
	  Assert.assertEquals(true, false);	  
  }
}
