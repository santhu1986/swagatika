package com.ranford.master;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Notepademp {

	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		
		Lib Lb=new Lib();
		String Res=Lb.OpenApp("http://192.168.1.200/ranford2/home.aspx");
		System.out.println(Res);
		Lb.Adminlogin("Admin","Admin");
		
		String EFpath="E:\\Swagatika\\Ranford\\src\\com\\ranford\\testdata\\Employee.txt";
		
		String ERpath="E:\\Swagatika\\Ranford\\src\\com\\ranford\\results\\EmployeeRes.txt";
		String ESd;
		//to get File
		
		FileReader EFr=new FileReader(EFpath);
		//to get data
		BufferedReader EBr=new BufferedReader(EFr);
		String Eread=EBr.readLine();
		System.out.println(Eread);
		
		//write
		
		FileWriter EFw=new FileWriter(ERpath);
		BufferedWriter EBw=new BufferedWriter(EFw);
		EBw.write(Eread);
		EBw.newLine();
		
		//loop -------while
		
		while((ESd=EBr.readLine())!=null) 
		{
			System.out.println(ESd);
			String ESR[]=ESd.split("@@@");
			String Ename=ESR[0];
			String Etype=ESR[1];
			String Erole=ESR[2];
			String Ebranch=ESR[3];
			
			Res=Lb.Employee(Ename,Etype,Erole,Ebranch);
			System.out.println(Res);
			
			EBw.write(Ename+"###"+Etype+"###"+Erole+"###"+Ebranch+"@@@"+Res);
			EBw.newLine();
			
		}
		EBw.close();
		EBr.close();
		}	
	
		
		
	}


