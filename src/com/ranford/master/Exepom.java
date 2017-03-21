package com.ranford.master;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class Exepom 
{
	@Test
 public void Exelogin()
 {
	 WebDriver driver=new FirefoxDriver();
	 driver.manage().window().maximize();
	 driver.get("http://192.168.1.200/ranford2/home.aspx");
	 
	 HomePage HP=PageFactory.initElements(driver,HomePage.class);
	 HP.login();
	 
	 AdminPage AP=PageFactory.initElements(driver,AdminPage.class);
	// AP.br();
	//AP.Lout(); 
	// AP.rl();
	 AP.Employee();
	
	//RoleCreationPage RCP=PageFactory.initElements(driver,RoleCreationPage.class);
	//RCP.newrole();
	//driver.switchTo().alert().accept();
	
	
	Employeecreation ECP=PageFactory.initElements(driver,Employeecreation.class);
	ECP.newemployee();
	driver.switchTo().alert().accept();
	
 }
}
