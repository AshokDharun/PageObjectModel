package com.tricenties.testcases;

import org.testng.Assert;
import org.testng.annotations.Test;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.tricenties.base.Base;
import com.tricenties.pages.AutomobileDetailsPage;
import com.tricenties.pages.HomePage;
import com.tricenties.pages.InsurenceDetails;
import com.tricenties.pages.PriceOptionPage;
import com.tricenties.pages.ProductDataPage;
import com.tricenties.pages.SendQuote;
import com.tricenties.utills.ReadConfig;

public class TC_Automobile001  extends Base
{
	//WebDriver driver;
	@Test(priority = 1)
	public void automobileTest() throws IOException, InterruptedException
	{
		HomePage hm=new HomePage(driver);
		try {
			hm.automobileClick();
		}catch (Exception e) {
			captureScreenshot(driver, "homepage");
			Assert.assertTrue(false);
		}	
		Thread.sleep(3000);

		AutomobileDetailsPage auto=new AutomobileDetailsPage(driver);
		try {
			auto.selectMake("Ford");
			auto.selectEnginePer("1000");
			auto.selectDateOFManu("10/11/2016");
			auto.selectNumSeat("4");
			auto.selectFuealType("gas");
			auto.selectListPrice("1000");
			auto.enterLicenceNumber("TN9434f");
			auto.selectAnnualMillage("1000");
			auto.clickNext();
			
		}
		catch (Exception e) {
			// TODO: handle exception
			captureScreenshot(driver, "automobiledetails");
			Assert.assertTrue(false);
		}
			waitsec(5);
		
		try {
			InsurenceDetails ins= new InsurenceDetails(driver);
			ins.enterFirstName(ReadConfig.readAutoData("enterFirstName"));
			ins.enterLastName(ReadConfig.readAutoData("enterLastName"));
			ins.enterDateOfBirth("10/10/1997");
			ins.selectGender();
			ins.enterAddress("Address 1");
			ins.enterCountry("india");
			ins.enterZipcode("156032");
			ins.enterCity("bangalore");
			ins.selectOccupition();
			ins.selectHobbies();
			ins.enterWebsites("WWW.google.com");
			ins.clickNext();
		}catch (Exception e) {
			captureScreenshot(driver, "insurence details");
			Assert.assertTrue(false);
			// TODO: handle exception
		}
		waitsec(5);

		ProductDataPage prod=new ProductDataPage(driver);
		try {
			prod.startDate("11/01/2023");
			prod.selectInsurSum("5000000");
			prod.selectMerit("Bonus 3");
			prod.selectDamgInsur("No Coverage");
			prod.selectOprionalProd();
			prod.selectCurstryCar();
			prod.clickNext();
		}catch (Exception e) {
			captureScreenshot(driver, "prode_details");
			Assert.assertTrue(false);
			// TODO: handle exception
		}
		waitsec(5);
		
		PriceOptionPage pg=new PriceOptionPage(driver);
		try
		{
			pg.selectPriceOption();
			pg.clickNext();
		}catch (Exception e) {
			captureScreenshot(driver, "price option");
			Assert.assertTrue(false);
			// TODO: handle exception
		}
		
		waitsec(5);
		try {
		SendQuote se=new SendQuote(driver);
		se.enterEmail();
		se.enterPhone();
		se.enterUsername();
		se.enterPassword();
		se.enterConfirmPassword();
		se.enterComments();
		se.clickSend();
		}catch (Exception e) 
		{
			captureScreenshot(driver, "price option");
			Assert.assertTrue(false);
			// TODO: handle exception
		}
	}

}
