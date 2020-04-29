package com.inetBanking.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class AddCustomerPage {
	WebDriver ldriver;
	public AddCustomerPage(WebDriver rdriver) //Instantiating the Constructor
	{
		ldriver = rdriver; // Remote Driver
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(how = How.LINK_TEXT, using="New Customer")
	@CacheLookup
	WebElement lnkAddCustomer;
	
	@FindBy(how = How.NAME, using="name")
	@CacheLookup
	WebElement txtCustomerName;
	
	@FindBy(how = How.NAME, using="rad1")
	@CacheLookup
	WebElement rdGender;
	
	@FindBy(how = How.ID_OR_NAME, using = "dob")
	@CacheLookup
	WebElement txtDOB;
	
	@FindBy(how = How.NAME, using = "addr")
	@CacheLookup
	WebElement txtAddress;
	
	@FindBy(how = How.NAME, using="city")
	@CacheLookup
	WebElement txtCity;
	
	@FindBy(how = How.NAME, using="state")
	@CacheLookup
	WebElement txtState;
	
	@FindBy(how = How.NAME, using = "pinno")
	@CacheLookup
	WebElement txtPin;
	
	@FindBy(how = How.NAME, using = "telephoneno")
	@CacheLookup
	WebElement txtMobileNumber;
	
	@FindBy(how = How.NAME, using = "emailid")
	@CacheLookup
	WebElement txtEmail;
	
	@FindBy(how = How.NAME, using = "password")
	@CacheLookup
	WebElement txtPassword;
	
	@FindBy(how = How.NAME, using = "sub")
	@CacheLookup
	WebElement btnSubmit;
	
	public void clickAddNewCustomer()
	{
		lnkAddCustomer.click();
	}
	
	public void custName(String cname)
	{
		txtCustomerName.sendKeys(cname);
	}
	
	public void custGender(String cgender)
	{
		rdGender.click();
	}
	
	public void custDOB(String mm, String dd, String yy)
	{
		txtDOB.sendKeys(mm);
		txtDOB.sendKeys(dd);
		txtDOB.sendKeys(yy);
	}
	
	public void custAddress(String caddress) 
	{
		txtAddress.sendKeys(caddress);
	}
	
	public void custCity(String ccity)
	{
		txtCity.sendKeys(ccity);
	}
	
	public void custState(String cstate)
	{
		txtState.sendKeys(cstate);
	}
	
	public void custPin(String cpinno)
	{
		txtPin.sendKeys(String.valueOf(cpinno));
	}
	
	public void custMobile(String cmobile)
	{
		txtMobileNumber.sendKeys(cmobile);
	}
	
	public void custEmail(String cemail)
	{
		txtEmail.sendKeys(cemail);
	}
	
	public void custPassword(String cpassword)
	{
		txtPassword.sendKeys(cpassword);
	}
	
	public void clickSubmit()
	{
		btnSubmit.click();
	}
	
	
	
	
}
