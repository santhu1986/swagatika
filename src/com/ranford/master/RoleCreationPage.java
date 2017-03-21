package com.ranford.master;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RoleCreationPage {
	
	@FindBy(xpath=".//*[@id='btnRoles']")
	WebElement nrole;
	
	@FindBy(xpath=".//*[@id='txtRname']")
	WebElement Rname;
	
	@FindBy(xpath=".//*[@id='lstRtypeN']")
	WebElement Rtype;
	
	@FindBy(xpath=".//*[@id='btninsert']")
	WebElement Rsub;

	public void newrole()
	{
		nrole.click();
		Rname.sendKeys("SaanviMishra1234");
		Rtype.sendKeys("E");
		Rsub.click();
	}
	
	
	
}
