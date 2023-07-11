package com.tricenties.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class SendQuote 
{
WebDriver driverl;
public SendQuote(WebDriver driver) {
	// TODO Auto-generated constructor stub
	this.driverl=driver;
	PageFactory.initElements(driverl, this);
}
//@FindBy(how = How.NAME,className = "") WebElement ele;
@FindBy(xpath = "//input[@id='email']")
WebElement email;
@FindBy(xpath = "//input[@id='phone']")
WebElement phonenumber;
@FindBy(xpath = "//input[@id='username']")
WebElement username;
@FindBy(xpath = "//input[@id='password']")
WebElement password;
@FindBy(xpath = "//input[@id='confirmpassword']")
WebElement cnfrmpass;
@FindBy(xpath = "//textarea[@id='Comments']")
WebElement comments;
@FindBy(xpath = "//button[@id='sendemail']")
WebElement send;

public  void enterEmail()
{
	email.sendKeys("ashok@gmail.com");
}
public   void enterPhone()
{
	phonenumber.sendKeys("1234565680");
}
public   void  enterUsername()
{
	username.sendKeys("USerAshok");
}
public   void enterPassword()
{
	password.sendKeys("Asd@88");
}
public   void enterConfirmPassword()
{
	cnfrmpass.sendKeys("Asd@88");
}
public void enterComments()
{
	comments.sendKeys("this is comment area");
}
public void clickSend()
{
	send.click();
}

}
