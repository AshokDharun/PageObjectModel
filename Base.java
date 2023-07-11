package com.tricenties.base;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.tricenties.utills.ReadConfig;

public class Base 
{
public static WebDriver driver;

@BeforeClass
public void setUp() throws IOException
{
	System.setProperty(ReadConfig.readBaseConfig("dri"),ReadConfig.readBaseConfig("pat"));
	driver=new ChromeDriver();
	System.out.println("broswer launched");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	driver.get(ReadConfig.readBaseConfig("url"));
}
@AfterTest
public void stop()
{
	//driver.quit();
}
public void captureScreenshot(WebDriver driver,String tname) throws IOException
{
	TakesScreenshot ts=(TakesScreenshot) driver;
	File src=ts.getScreenshotAs(OutputType.FILE);
	File target=new File(System.getProperty("user.dir")+"/Screenshots/"+tname+".png");
	FileUtils.copyFile(src, target);
	System.out.println("Screenshot taken");
}
public void waitsec(int sec)
{
driver.manage().timeouts().implicitlyWait(sec, TimeUnit.SECONDS);
}
}
