package com.inetBanking.testCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.inetBanking.pageObjects.AddCustomerPage;
import com.inetBanking.pageObjects.LoginPage;

public class TC_AddCustomerTest_003 extends BaseClass 
{
	
	@Test
	public void addNewCustomer() throws InterruptedException, IOException
	{
		LoginPage lp = new LoginPage(driver);
		lp.setUserName(username);
		logger.info("User Name provided");
		lp.setPassword(password);
		logger.info("Password provided");
		lp.ClickSubmit();
		
		Thread.sleep(7000);
		
		
		AddCustomerPage addcust = new AddCustomerPage(driver);
		
		driver.manage().window().maximize();
		
		addcust.clickAddNewCustomer();
				
		logger.info("providing customer details .........");
		
		addcust.custName("Nimesh RAj Bhattarai");
		addcust.custGender("Male");
		addcust.custDOB("12", "12", "1980");
		addcust.custAddress("123 North Euless Blvd");
		addcust.custCity("Euless");
		addcust.custState("TX");
		addcust.custPin("760500");
		addcust.custMobile("4632589874");
		
		String email = randomString()+"@gmail.com";
		addcust.custEmail(email);
		addcust.custPassword("123456789");
		addcust.clickSubmit();
		
		Thread.sleep(7000);
		
		logger.info("Validation started ........");
		
		boolean res = driver.getPageSource().contains("Customer Registered Successfully!!!");
		
		if (res == true)
		{
			Assert.assertTrue(true);
			logger.info("Test case is passed .......");
		}
		else
		{
			logger.info("Test case is failed .........");
			captureScreen(driver, "addNewCustomerScreen");
			Assert.assertTrue(false);
		}
	}
	
	
}
