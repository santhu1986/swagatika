package com.ranford.master;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Emp extends BaseNg
{
 @Test(dataProvider = "Edat")
	public void EmpC(String Ename,String Epw,String Erole,String Ebranch) throws IOException
{
   LB.Employee(Ename,Epw,Erole,Ebranch);
   
}
   @DataProvider
   public Object[][] Edat()
   {
	   Object[][] obj = new Object[3][4];
	   
	   obj[0][0]="Saanvi12";
	   obj[0][1]="aaaaa";
	   obj[0][2]="TManager";
	   obj[0][3]="1112";
	   
	   obj[1][0]="Reeya12";
	   obj[1][1]="fffffff";
	   obj[1][2]="TManager";
	   obj[1][3]="1112";
	   
	   obj[2][0]="Anvi12";
	   obj[2][1]="hhhhhh";
	   obj[2][2]="TManager";
	   obj[2][3]="1112";
	   
	   return obj;
	   
	   
   }



}

