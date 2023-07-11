package com.tricenties.pages;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class InsurenceDetails 
{
	WebDriver ldriver;
	public InsurenceDetails(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.ldriver=driver;
		PageFactory.initElements(ldriver, this);
	}
	@FindBy(xpath = "//input[@id='firstname']") WebElement firstName;
	@FindBy(xpath = "//input[@id='lastname']") WebElement lastName;
	@FindBy(xpath = "//input[@id='birthdate']") WebElement dob;
	@FindBy(xpath = "//*[text()='Male']") WebElement gender;
	@FindBy(xpath = "//input[@id='streetaddress']") WebElement address;
	@FindBy(xpath = "//select[@id='country']") WebElement country;
	@FindBy(xpath = "//input[@id='zipcode']") WebElement zip;
	@FindBy(xpath = "//input[@id='city']") WebElement cty;
	@FindBy(xpath = "//option[@value='Employee']") WebElement occu;
	@FindBy(xpath = "//*[text()=' Speeding']") WebElement hobbie;
	@FindBy(xpath = "//input[@id='website']") WebElement wesit;
	@FindBy(xpath = "//button[@id='nextenterproductdata']") WebElement nxt;
	public  void enterFirstName(String fname) 
	{ 
		firstName.sendKeys(fname);
	}
	public  void enterLastName(String lname) 
	{
		lastName.sendKeys(lname);
	}
	public  void enterDateOfBirth(String date)
	{
		dob.sendKeys(date);
	}
	public  void selectGender() throws FileNotFoundException, IOException
	{
		gender.click();
	}
	public  void enterAddress(String adrs) throws FileNotFoundException, IOException
	{
		address.sendKeys(adrs);
	}
	public  void enterCountry(String cntry) throws FileNotFoundException, IOException
	{
		country.sendKeys(cntry);
	}
	public  void enterZipcode(String zipcode) throws FileNotFoundException, IOException
	{
		zip.sendKeys(zipcode);
	}
	public  void enterCity(String city) throws FileNotFoundException, IOException
	{
		cty.sendKeys(city);
	}
	public  void selectOccupition() throws FileNotFoundException, IOException
	{
		occu.click();
	}
	public  void selectHobbies() throws FileNotFoundException, IOException
	{
		hobbie.click();
	}
	public  void enterWebsites(String website) throws FileNotFoundException, IOException
	{
		wesit.sendKeys(website);
	}
	//public  void uploadpicture()
	//{
	//	
	//}
	public  void clickNext() throws FileNotFoundException, IOException 
	{
		nxt.click();
	}
}
