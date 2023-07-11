package com.tricenties.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PriceOptionPage 
{
WebDriver ldriver;
public PriceOptionPage(WebDriver driver) {
	// TODO Auto-generated constructor stub
	this.ldriver=driver;
	PageFactory.initElements(ldriver, this);
}

@FindBy(xpath = "//label[@class='choosePrice ideal-radiocheck-label'][1]") 
WebElement priceoption;

@FindBy(xpath = "//button[@id='nextsendquote']") 
WebElement clicknext;

public void selectPriceOption()
{
	priceoption.click();
}
public void clickNext()
{
	clicknext.click();
}

}
