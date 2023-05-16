package com.testcases;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.base.TestBase;
import com.pages.BankManagerPage;


public class BankManagerModule extends TestBase 
{


	BankManagerPage bankManagerPage;
			public BankManagerModule() 
			{
			super();
		 	}
			@BeforeClass
			public void setUp()
			{
			initialization();
			bankManagerPage=new BankManagerPage();
			}
			
			@Test (priority=1)
			public void customerModule() 
			{
			System.out.println("Page Loaded");
			}
		  
			
			@Test (priority=2)
			public void clickOnBMLogin() 
			{
			bankManagerPage.clickBankManagerLogin();
			}
			

			@Test (priority=3)
			public void clickOnAddCustomer() 
			{
			bankManagerPage.clickAddCustomer();			
			}
			
			@Test (priority=5)
			public void enterTheDetails() 
			{
			bankManagerPage.enterCustomerDetails();
			}
			
			
			@Test (priority=6)
			public void clickOnSubmitDetails() 
			{
			//bankManagerPage.clickSubmitDetails();		
			String pText=bankManagerPage.clickSubmitDetails();
			Assert.assertEquals(pText, "Customer added successfully with customer id :6");			
			}

			@Test (priority=6)
			public void clickonOpenAccountab() 
			{
			bankManagerPage.clickOpenAccountTab();	
			}
				
				@Test (priority=7)
				public void clickOnOpenAccount() 
				{
						
				String pText=bankManagerPage.clickOpenAccount();
				Assert.assertEquals(pText, "Account created successfully with account Number :1016");
				
				}
				
			
			@Test (priority=8)
			public void clickOnCustomersList() 
			{
			bankManagerPage.clickOnCustomersTab();
			}
			
			
			
			
	
		
			
			
	
	
}
