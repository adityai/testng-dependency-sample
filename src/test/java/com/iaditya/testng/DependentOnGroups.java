package com.iaditya.testng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependentOnGroups {
	
	
  @Test(dependsOnGroups= {"group-one"}, alwaysRun=true)
  public void testMethodOne() {
	  System.out.println("testMethodOne");
	  Assert.assertEquals(true, true);
  }
  
  @Test(dependsOnGroups= {"group-two"}, alwaysRun=false)
  public void testMethodTwo() {
	  System.out.println("testMethodTwo");
	  Assert.assertEquals(true, false);	  
  }

  @Test(groups = "group-one")
  public void testMethodThree() {
	  System.out.println("testMethodThree");
	  Assert.assertEquals(true, false);	  
  }

  @Test(groups = "group-two")
  public void testMethodFour() {
	  System.out.println("testMethodThree");
	  Assert.assertEquals(true, false);	  
  }

  @Test(groups = "group-two")
  public void testMethodFive() {
	  System.out.println("testMethodThree");
	  Assert.assertEquals(true, false);	  
  }
}
