package com.iaditya.testng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependentWithoutInheritingTest {
		
  @Test(dependsOnMethods = {"com.iaditya.testng.ParentTest.testMethodOne"}, alwaysRun=true)
  public void testMethodThree() {
	  System.out.println("testMethodThree");
	  Assert.assertEquals(true, true);
  }
  
  @Test(dependsOnMethods = {"com.iaditya.testng.ParentTest.testMethodTwo"}, alwaysRun=false)
  public void testMethodFour() {
	  System.out.println("testMethodFour");
	  Assert.assertEquals(true, true);	  
  }
}
