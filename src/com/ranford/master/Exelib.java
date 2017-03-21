package com.ranford.master;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Exelib {

	
	public static void main(String[] args) throws IOException 
	{
	Lib Lb=new Lib();
	String Res=Lb.OpenApp("http://192.168.1.200/ranford2/home.aspx");
	System.out.println(Res);
	Lb.Adminlogin("Admin","Admin");
	//Lb.Role("Manager754","E");
	//Lb.Employee("swagatika","swagatika","TManager","ABCD001");
 // Lb.Applogout();
	//Lb.CloseApplication();
	
	
FileInputStream Fis=new FileInputStream("E:\\Swagatika\\Ranford\\src\\com\\ranford\\testdata\\Role.xlsx");
	
	//create workbook
	
	XSSFWorkbook Wb=new XSSFWorkbook(Fis);
	
	//sheet
	
	XSSFSheet Ws=Wb.getSheet("Rdata");
	//Row count
	int Rc=Ws.getLastRowNum();
	System.out.println(Rc);
	
	for(int i=1;i<=Rc;i++){
		XSSFRow Wr=Ws.getRow(i);
        //cell
        XSSFCell Wc=Wr.getCell(0);
        XSSFCell Wc1=Wr.getCell(1);
        //create cell for results
        XSSFCell Wc2=Wr.createCell(2);
        
        //getting role name value from excel
        
        String Rname=Wc.getStringCellValue();
        //getting roletypr value from excel
        
        String Rtype=Wc1.getStringCellValue();
        
        //calling lib
         String Result=Lb.Role(Rname,Rtype);
        System.out.println(Result);
        
        //passing the value to results colums 
        
        Wc2.setCellValue(Result);
		
	}
	
	FileOutputStream Fos=new FileOutputStream("E:\\Swagatika\\Ranford\\src\\com\\ranford\\results\\Role.xlsx");
	Wb.write(Fos);
    Wb.close();
    
	}
}
	//Row
	
	//XSSFRow Wr=Ws.getRow(2);
	
	//cell
	//XSSFCell Wc=Wr.getCell(0);
	
	//Res=Wc.getStringCellValue();
	//System.out.println(Res);
	
	
	/*FileInputStream Fin=new FileInputStream("E:\\Swagatika\\Ranford\\src\\com\\ranford\\testdata\\Employee.xlsx");
	XSSFWorkbook EWB=new XSSFWorkbook(Fin);
	XSSFSheet EWS=EWB.getSheet("Edata");
	
	int ERC=EWS.getLastRowNum();
	
	for(int j = 1;j<=ERC;j++)
	{
		XSSFRow EWR=EWS.getRow(j);
        //cell
        XSSFCell EWC=EWR.getCell(0);
        XSSFCell EWC1=EWR.getCell(1);
        XSSFCell EWC2=EWR.getCell(2);
        XSSFCell EWC3=EWR.getCell(3);
        //create cell for results
        XSSFCell EWC4=EWR.createCell(4);
        
  
        
        String EName=EWC.getStringCellValue();
        String EPassword=EWC1.getStringCellValue();
        String ERole=EWC2.getStringCellValue();
        String EBranch=EWC3.getStringCellValue();
        
        //calling lib
        String EResult = Lb.Employee(EName,EPassword,ERole,EBranch);
        System.out.println(EResult);
        
        //passing the value to results colums 
        
        EWC4.setCellValue(EResult);
	}
	

	FileOutputStream Fop=new FileOutputStream("E:\\Swagatika\\Ranford\\src\\com\\ranford\\results\\Employee.xlsx");
	EWB.write(Fop);
	EWB.close();
    
     Lb.Applogout();
 	 Lb.CloseApplication();
	
	}
	}
*/