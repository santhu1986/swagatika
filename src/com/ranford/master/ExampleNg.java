package com.ranford.master;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ExampleNg 
{
  @Test(priority=1)
	public void xyz()
  {
	  Assert.assertEquals("Selenium","Selenium");
  }
 @Test(priority=2)
  public void abc()
  {
	  Assert.assertEquals("Testing","Testing");
  }
 @Test(priority=3)
  public void pqr()
  {
	  Assert.assertEquals("Gmail","Gmail");
  }

}
