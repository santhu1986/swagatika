package com.ranford.tests;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;
import org.openqa.selenium.support.ui.Select;

public class Basicscript 
{
	
	public static void main(String[] args)
	{
		String Expval="Ranford Bank";
		String Expectedval= "Welcome to Admin";
		
		//to launch firefox browser
		WebDriver driver=new FirefoxDriver();
		//To maximize
		
		driver.manage().window().maximize();
		//To lauch application
		driver.get("http://192.168.1.200/ranford2/home.aspx");
		String Actval=driver.findElement(By.xpath(".//*[@id='Form1']/table/tbody/tr/td/table/tbody/tr[4]/td/table/tbody/tr[1]/td[4]/p/span")).getText();
		if(Expval.equalsIgnoreCase(Actval))
		{
		System.out.println("Ranford home page is displayed");	
		}
		else
		{
			System.out.println("Ranford home page is not displayed");
		}
		
		//Admin login
		driver.findElement(By.id("txtuId")).sendKeys("Admin");
		driver.findElement(By.id("txtPword")).sendKeys("Admin");
		driver.findElement(By.id("login")).click();
		 String Actualval=driver.findElement(By.xpath("html/body/table/tbody/tr/td/table/tbody/tr[4]/td/table/tbody/tr[1]/td[4]/strong/font/font")).getText();
			if(Expectedval.equalsIgnoreCase(Actualval))
			{
			System.out.println("Admin module home is displayed");	
			}
			else
			{
				System.out.println("Admin module home page is not displayed");
				
			}
                     Expectedval="Sucessfully";
		driver.findElement(By.xpath(".//*[@id='Table_01']/tbody/tr[2]/td/table/tbody/tr[4]/td/a/img")).click();
        driver.findElement(By.id("btnRoles")).click();
        driver.findElement(By.id("txtRname")).sendKeys("SeniorTalentManager1254");
        driver.findElement(By.id("lstRtypeN")).click();
        driver.findElement(By.id("lstRtypeN")).sendKeys("E");
        //new Select(driver.findElement(By.id("lstRtypeN"))).selectByVisibleText("E");
        driver.findElement(By.id("btninsert")).click();
        Sleeper.sleepTightInSeconds(4);
       Actualval=driver.switchTo().alert().getText();
        driver.switchTo().alert().accept();
       driver.findElement(By.xpath("html/body/div[1]/form/table/tbody/tr/td/table/tbody/tr[2]/td/table/tbody/tr/td[3]/table/tbody/tr/td[1]/a/img")).click();
        Sleeper.sleepTightInSeconds(4);
        if(Actualval.contains(Expectedval))
		{
		System.out.println("Role created");	
		}
		else
		{
			System.out.println("Role Already exist");
			
		}
		 //driver.findElement(By.xpath("html/body/table/tbody/tr/td/table/tbody/tr[4]/td/table/tbody/tr[1]/td[2]")).click();

		 driver.findElement(By.xpath("html/body/table/tbody/tr/td/table/tbody/tr[4]/td/table/tbody/tr[1]/td[2]/table/tbody/tr[2]/td/table/tbody/tr[8]/td/a/img")).click();
		 driver.findElement(By.id("BtnNew")).click();
		 driver.findElement(By.id("txtUname")).sendKeys("Saanvi07");
		 driver.findElement(By.id("txtLpwd")).sendKeys("Saanvi15");
		 new Select(driver.findElement(By.id("lst_Roles"))).selectByVisibleText("TManager");
		 new Select(driver.findElement(By.id("lst_Branch"))).selectByVisibleText("ABCD001");
		 driver.findElement(By.id("BtnSubmit")).click();
		 Sleeper.sleepTightInSeconds(4);
	     String Actualvalemp=driver.switchTo().alert().getText();
	     String Expectedvalemp = "New";
	        driver.switchTo().alert().accept();
	        
	        if(Actualvalemp.contains(Expectedvalemp))
			{
			System.out.println("Employer created");	
			}
			else
			{
				System.out.println("Employer Already exist");
				
			}
	      
		
	}
	
}
//roles
//employes
