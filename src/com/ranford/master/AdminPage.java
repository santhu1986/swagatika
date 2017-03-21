package com.ranford.master;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AdminPage
{
	
 @FindBy (xpath=".//*[@id='Table_01']/tbody/tr[2]/td/table/tbody/tr[2]/td/a/img")
 WebElement Branch;
 
 @FindBy (xpath=".//*[@id='Table_01']/tbody/tr[2]/td/table/tbody/tr[4]/td/a/img")
 WebElement Role;
 
 @FindBy (xpath=".//*[@id='Table_01']/tbody/tr[2]/td/table/tbody/tr[8]/td/a/img")
 WebElement Emp;
 
 @FindBy (xpath=".//*[@id='Table_02']/tbody/tr/td[3]/a/img")
 WebElement Logut;

public void br()
{
	Branch.click();
}

public void rl()
{
	Role.click();
}

public void Employee()
{
	Emp.click();
}

public void Lout()
{
	Logut.click();
}
}
