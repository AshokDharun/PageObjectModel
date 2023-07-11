package com.tricenties.utills;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.Test;

public class ReadConfig 
{
	public static Properties property;
//	public static void main(String[] args) throws IOException 
//	{
//		ReadConfig n=new ReadConfig();
//		//n.readBaseConfig("url");
//		//n.readBaseConfig("dri");
//	}
	
public static String  readBaseConfig(String getproperty) throws IOException
{
	File file=new File("./src/properties/base_config.properties");
	FileInputStream in=new FileInputStream(file);
	property=new Properties();
	property.load(in);
	String value=property.getProperty(getproperty);
	
	System.out.println("url value"+value);
	return value;
}
public static String readAutoData(String data) throws IOException
{
	File file=new File("./src/properties/autoData.properties");
	///E1-Tricent/src/properties/autoData.properties
	FileInputStream in=new FileInputStream(file);
	property=new Properties();
	property.load(in);
	String value=property.getProperty(data);
	return value;	
}
}
