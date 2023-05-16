package com.testcases;

//import org.testng.Assert;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.base.TestBase;
import com.pages.HomePage;

public class LaunchURL extends TestBase  
{

	    HomePage homePage;
		public LaunchURL() 
		{
		super();
		}
		@BeforeClass
		public void setUp()
		{
		initialization();
		homePage=new HomePage();
		}
		
		@Test (priority=1)
		public void launchURL() 
		{
		System.out.println("URL Launched");
		}
	  
		
		@Test (priority=2)
		public void clickOnCustomer()
		{
			homePage.clickCustomer();
		}
		
		@Test (priority=3)
		public void clickOnHome()
		{
			homePage.clickHome();
		}
		
	/*	
		@Test (priority=3)
		public void clickOnCustomerNameLogin()
		{
			homePage.customerNameLogin();
		}
		
		
	
		
		/*@Test 
		public void clickOnBM() 
		{
		homePage.clickBm();
		}*/
	
}
