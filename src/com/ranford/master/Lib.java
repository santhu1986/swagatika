package com.ranford.master;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;
import org.openqa.selenium.support.ui.Select;

public class Lib
{
	public static WebDriver driver;
	public static String Expectedval,Actualval;
	public static Properties Pr;
	public static FileInputStream Fis;
   
	public String OpenApp(String Url)
{
		 Expectedval="Ranford Bank";
		driver=new FirefoxDriver();
		//To maximize
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
		//To lauch application
		driver.get(Url);
		 Actualval=driver.findElement(By.xpath(".//*[@id='Form1']/table/tbody/tr/td/table/tbody/tr[4]/td/table/tbody/tr[1]/td[4]/p/span")).getText();
		if(Expectedval.equalsIgnoreCase(Actualval))
		{
		System.out.println("Ranford home page is displayed");	
		return "Pass";
		}
		else
		{
			System.out.println("Ranford home page is not displayed");
			return "Fail";
		}
		
		
}
	public void Adminlogin(String Un,String Pwd) throws IOException
	{
		Pr=new Properties();
		Fis=new FileInputStream("E:\\Swagatika\\Ranford\\src\\com\\ranford\\properties\\Rep.properties");
		Pr.load(Fis);
		
		Expectedval="Welcome to Admin";
		driver.findElement(By.id(Pr.getProperty("Uname"))).sendKeys(Un);
		driver.findElement(By.id(Pr.getProperty("pswd"))).sendKeys(Pwd);
		driver.findElement(By.id(Pr.getProperty("Lgn"))).click();
		 String Actualval=driver.findElement(By.xpath("html/body/table/tbody/tr/td/table/tbody/tr[4]/td/table/tbody/tr[1]/td[4]/strong/font/font")).getText();
			if(Expectedval.equalsIgnoreCase(Actualval))
			{
			System.out.println("Admin module home is displayed");	
			}
			else
			{
				System.out.println("Admin module home page is not displayed");
				
			}
	}
	//role creation
	
	public String Role( String role,String type) throws IOException{
		

		Pr=new Properties();
		Fis=new FileInputStream("E:\\Swagatika\\Ranford\\src\\com\\ranford\\properties\\Rep.properties");
		Pr.load(Fis);
		
		 Expectedval="Sucessfully";
		 
			driver.findElement(By.xpath(Pr.getProperty("Role"))).click();
		    driver.findElement(By.id(Pr.getProperty("Nrole"))).click();
		    driver.findElement(By.id(Pr.getProperty("Nname"))).sendKeys(role);
		    
		    driver.findElement(By.id(Pr.getProperty("Rtype"))).click();
		    driver.findElement(By.id(Pr.getProperty("Rtype"))).sendKeys(type);
		    //new Select(driver.findElement(By.id("lstRtypeN"))).selectByVisibleText("E");
		    
		    driver.findElement(By.id(Pr.getProperty("Insert"))).click();
		    Sleeper.sleepTightInSeconds(4);
		   Actualval=driver.switchTo().alert().getText();
		    driver.switchTo().alert().accept();
		    Sleeper.sleepTightInSeconds(3);
		   driver.findElement(By.xpath(".//*[@id='Table_01']/tbody/tr/td[1]/a/img")).click();
		    Sleeper.sleepTightInSeconds(4);
		    if(Actualval.contains(Expectedval))
			{
			System.out.println("Role created");	
			return Actualval;
			}
			else
			{
				System.out.println("Role Already exist");
				return Actualval;
				
			}
		   // Sleeper.sleepTightInSeconds(4);
	}
	
	public String Employee(String Ename,String pword,String Erole,String branch) throws IOException
	
	{
		
		//Pr=new Properties();
		//Fis=new FileInputStream("E:\\Swagatika\\Ranford\\src\\com\\ranford\\properties\\Rep.properties");
		//Pr.load(Fis);
		 Sleeper.sleepTightInSeconds(4);	
		driver.findElement(By.xpath(Pr.getProperty("Employee"))).click();
		 Sleeper.sleepTightInSeconds(4);
		 driver.findElement(By.id(Pr.getProperty("NewEmp"))).click();
		 Sleeper.sleepTightInSeconds(4);
		 driver.findElement(By.id(Pr.getProperty("EName"))).sendKeys(Ename);
		driver.findElement(By.id(Pr.getProperty("EPword"))).sendKeys(pword);
		 new Select(driver.findElement(By.id(Pr.getProperty("ERole")))).selectByVisibleText(Erole);
		 Sleeper.sleepTightInSeconds(4);
		 new Select(driver.findElement(By.id(Pr.getProperty("EEBranch")))).selectByVisibleText(branch);
		 driver.findElement(By.id(Pr.getProperty("ESubmit"))).click();
		 Sleeper.sleepTightInSeconds(4);
	     String Actualvalemp=driver.switchTo().alert().getText();
	     String Expectedvalemp = "New";
	        driver.switchTo().alert().accept();
	        driver.findElement(By.xpath(".//*[@id='Table_01']/tbody/tr/td[1]/a/img")).click();
	        if(Actualvalemp.contains(Expectedvalemp))
			{
			System.out.println("Employer created");	
			return Actualvalemp;
			}
			else
			{
				System.out.println("Employer Already exist");
				return Actualvalemp;
				
			}
	}
	
	//log out
	
	public void Applogout() throws IOException{
		
		//Pr=new Properties();
		//Fis=new FileInputStream("E:\\Swagatika\\Ranford\\src\\com\\ranford\\properties\\Rep.properties");
		//Pr.load(Fis);
		 Sleeper.sleepTightInSeconds(4);
		 driver.findElement(By.xpath(Pr.getProperty("Logout"))).click();
	}
	
	//close
	
	public void CloseApplication()
	{
	driver.close();
	}
	
	
}
