package com.ranford.master;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Notepad {

	
public static void main(String[] args) throws IOException 
{
	
	
	Lib Lb=new Lib();
	String Res=Lb.OpenApp("http://192.168.1.200/ranford2/home.aspx");
	System.out.println(Res);
	Lb.Adminlogin("Admin","Admin");
	
	String Fpath="E:\\Swagatika\\Ranford\\src\\com\\ranford\\testdata\\Role.txt";
	
	String Rpath="E:\\Swagatika\\Ranford\\src\\com\\ranford\\results\\roleres.txt";
	String Sd;
	//to get File
	
	FileReader Fr=new FileReader(Fpath);
	//to get data
	BufferedReader Br=new BufferedReader(Fr);
	String Sread=Br.readLine();
	System.out.println(Sread);
	
	//write
	
	FileWriter Fw=new FileWriter(Rpath);
	BufferedWriter Bw=new BufferedWriter(Fw);
	Bw.write(Sread);
	Bw.newLine();
	
	//loop -------while
	
	while((Sd=Br.readLine())!=null) 
	{
		System.out.println(Sd);
		String SR[]=Sd.split("###");
		String Rname=SR[0];
		String Rtyp=SR[1];
		
		Res=Lb.Role(Rname,Rtyp);
		System.out.println(Res);
		
		Bw.write(Rname+"@@@"+Rtyp+"((("+Res);
		Bw.newLine();
		
	}
	Bw.close();
	Br.close();
	}	
}