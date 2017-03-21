package com.ranford.master;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Role extends BaseNg
{
	@Test(dataProvider="Rdat")
public void Rcreation(String Rn,String RT) throws IOException
{
	LB.Role(Rn,RT);
}
	@DataProvider
	
	public Object[][] Rdat()
	{
		Object[][] Obj=new Object[3][2];
		
		Obj[0][0]="Amanagerhdfc";
		Obj[0][1]="E";
	
		Obj[1][0]="Amanagerhdfc25";
		Obj[1][1]="E";
		
		Obj[2][0]="Amanagerhdfc09";
		Obj[2][1]="E";
		
		return Obj;
		
	}
	
}
