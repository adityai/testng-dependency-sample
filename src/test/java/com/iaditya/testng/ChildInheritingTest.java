package com.iaditya.testng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ChildInheritingTest extends ParentTest {
		
  @Test(dependsOnMethods = "testMethodTwo", alwaysRun=true)
  public void testMethodthree() {
	  System.out.println("testMethodThree depends on testMethodTwo");
	  Assert.assertEquals(true, true);
  }
  
  @Test(dependsOnMethods = "testMethodOne", alwaysRun=false)
  public void testMethodFour() {
	  System.out.println("testMethodFour depends on testMethodOne");
	  Assert.assertEquals(true, true);	  
  }
}
