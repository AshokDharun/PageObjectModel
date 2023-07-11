package com.tricenties.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.tricenties.base.Base;

public class HomePage extends Base
{
	/**
	 * decalre local webdriver
	 * constructor with pagefactory method
	 * find webelement @Findby
	 * Action methods
	 */
	WebDriver localdriver;

	public HomePage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.localdriver=driver;
		PageFactory.initElements(localdriver, this);
	}
	
	@FindBy(xpath = "//a[@id='nav_automobile']") 
	WebElement clickAutomobile;
	
	public void automobileClick()
	{
		clickAutomobile.click();
	}
}
