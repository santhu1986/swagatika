package com.ranford.master;

import java.io.IOException;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class BaseNg {
 Lib LB=new Lib();
	
  @BeforeTest
  public void beforeTest() throws IOException 
  {
  LB.Adminlogin("Admin","Admin");
  }

  @AfterTest
  public void afterTest() throws IOException 
  {
  LB.Applogout();
  }

  @BeforeSuite
  public void beforeSuite()
  {
  LB.OpenApp("http://192.168.1.200/ranford2/home.aspx");
  }

  @AfterSuite
  public void afterSuite() 
  {
  LB.CloseApplication();
  }

}
