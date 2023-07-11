package com.tricenties.pages;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.tricenties.base.Base;

public class AutomobileDetailsPage extends Base
{
	/**
	 * decalre local webdriver
	 * constructor with pagefactory method
	 * find webelement @Findby
	 * Action methods
	 */
	WebDriver ldriver;
	public AutomobileDetailsPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.ldriver=driver;
		PageFactory.initElements(ldriver, this);
	}
	
	@FindBy(xpath ="//select[@id='make']") WebElement Make;
	@FindBy(xpath = "//input[@id='engineperformance']") WebElement EngineePer;
	@FindBy(xpath = "//input[@id='dateofmanufacture']") WebElement DateOfManufature;
	@FindBy(xpath = "//select[@id='numberofseats']") WebElement NumSeat;
	@FindBy(xpath = "//select[@id='fuel']") WebElement FuealType;
	@FindBy(xpath = "//input[@id='listprice']") WebElement ListPrice;
	@FindBy(xpath = "//input[@id='licenseplatenumber']") WebElement LicenceNum;
	@FindBy(xpath = "//input[@id='annualmileage']") WebElement AnnualMill;
	@FindBy(xpath = "//button[@id='nextenterinsurantdata']") WebElement Next;
	
	public void selectMake(String mk) 
	{
		Make.sendKeys(mk);
	}
	public void selectEnginePer(String km) 
	{
		EngineePer.sendKeys(km);
	}
	public void selectDateOFManu(String da) 
	{
		DateOfManufature.sendKeys("10/11/2017");	
	}
	public void selectNumSeat(String seat)
	{
		NumSeat.sendKeys(seat);
	}
	public void selectFuealType(String type)
	{
		FuealType.sendKeys(type);
	}
	public void selectListPrice(String prc)
	{
	ListPrice.sendKeys(prc);	
	}
	public void enterLicenceNumber(String licence)
	{
		LicenceNum.sendKeys(licence);
	}
	public void selectAnnualMillage(String millage)
	{
		AnnualMill.sendKeys(millage);
	}
	public void clickNext()
	{
		Next.click();
	}
}
