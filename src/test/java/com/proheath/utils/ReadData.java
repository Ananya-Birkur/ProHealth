package com.proheath.utils;

import java.io.FileInputStream;
import java.util.Properties;

public class ReadData {
	
	public static String getdata(String filename,String key) throws Exception
	{
		String filepath=".//src//test//resources//"+filename+".properties";
		 
		FileInputStream instream=new FileInputStream(filepath);
		Properties pro=new Properties();
		pro.load(instream);
		String value=pro.getProperty(key);
		return value;
	}

}
