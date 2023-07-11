package com.tricenties.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductDataPage
{
WebDriver ldriver;
public ProductDataPage(WebDriver driver) {
	// TODO Auto-generated constructor stub
	this.ldriver=driver;
	PageFactory.initElements(ldriver, this);
}

@FindBy(xpath = "//input[@id='startdate']") WebElement statdate;
@FindBy(xpath = "//select[@id='insurancesum']") WebElement insursum;
@FindBy(xpath = "//select[@id='meritrating']") WebElement merit;
@FindBy(xpath = "//select[@id='damageinsurance']") WebElement dmginsur;
@FindBy(xpath = "//input[@id='EuroProtection']") WebElement optiprod;
@FindBy(xpath = "//select[@id='courtesycar']") WebElement curstycar;
@FindBy(xpath = "//button[@id='nextselectpriceoption']") WebElement cnext;

public  void startDate(String date)
{
	statdate.sendKeys(date);
	//driver.findElement(By.xpath("//input[@id='startdate']")).sendKeys("11/01/2023");
}
public  void selectInsurSum(String ins)
{
	insursum.sendKeys(ins);
	//driver.findElement(By.xpath("//select[@id='insurancesum']")).sendKeys("5000000");
}
public void selectMerit(String mrit)
{
	merit.sendKeys(mrit);
	//driver.findElement(By.xpath("//select[@id='meritrating']")).sendKeys("Bonus 3");
}
public  void selectDamgInsur(String dmg)
{
	dmginsur.sendKeys(dmg);
	
//	driver.findElement(By.xpath("//select[@id='damageinsurance']")).sendKeys("No Coverage");
	
}
public  void selectOprionalProd()
{
	optiprod.sendKeys("Euro Protection");
}
public  void selectCurstryCar()
{
	curstycar.sendKeys("No");
}
public void clickNext()
{
	cnext.click();
	//driver.findElement(By.xpath("//button[@id='nextselectpriceoption']")).click();
}
}
