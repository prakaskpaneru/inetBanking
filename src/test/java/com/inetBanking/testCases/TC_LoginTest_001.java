package com.inetBanking.testCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.inetBanking.pageObjects.LoginPage;

public class TC_LoginTest_001 extends BaseClass {
	
	@Test
	public void LoginTest() throws IOException, InterruptedException 
	{
			
		LoginPage lp = new LoginPage(driver);
		
		lp.setUserName(username);
		logger.info("Entered username");
		
		lp.setPassword(password);
		logger.info("Entered Password");
		
		lp.ClickSubmit();
		logger.info("Clicked on submit button");
		
		Thread.sleep(7000);
		
		if(driver.getTitle().contains("Guru99 Bank Manager HomePage")) 
		{
			Assert.assertTrue(true);
			logger.info("Test Passed");
		}
		else 
		{
			captureScreen(driver, "LoginTest");
			Assert.assertTrue(false);
			logger.info("Test Failed");
		}

	}

}
