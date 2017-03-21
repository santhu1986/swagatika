package com.ranford.master;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class Employeecreation {
	
	@FindBy(xpath=".//*[@id='BtnNew']")
	WebElement nemp;
	
	@FindBy(id = "txtUname")
	WebElement Ename;
	
	@FindBy(id = "txtLpwd")
	WebElement Epass;
	
	@FindBy(id = "lst_Roles")
	WebElement Erole;
	
	@FindBy(id = "lst_Branch")
	WebElement Ebranch;
	
	@FindBy(id ="BtnSubmit")
	WebElement Esub;

	public void newemployee()
	{
		nemp.click();
		Ename.sendKeys("SaanviM1234");
		Epass.sendKeys("Eeeeeee");
		new Select(Erole).selectByVisibleText("Cashier");
		new Select(Ebranch).selectByVisibleText("ABCD003");
		Esub.click();
	}

}
