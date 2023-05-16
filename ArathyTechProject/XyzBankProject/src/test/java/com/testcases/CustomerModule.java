package com.testcases;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.base.TestBase;
import com.pages.CustomersPage;
//import com.pages.HomePage;
public class CustomerModule extends TestBase
{

	  CustomersPage customersPage;
			public CustomerModule() 
			{
			super();
			}
			@BeforeClass
			public void setUp()
			{
			initialization();
			customersPage=new CustomersPage();
			}
			
			@Test (priority=1)
			public void customerModule() 
			{
			System.out.println("Page Loaded");
			}
		  
			
			@Test (priority=2)
			public void clickOnCustomer()
			{
				customersPage.clickCustomer();
			}
			
			

			@Test (priority=3)
			public void clickOnCustomerNameLogin()
			{
				customersPage.customerNameLogin();
			}
			
			@Test (priority=4)
			public void clickOnTransctions()
			{
				customersPage.clickTransctions();
			}
			
			
			@Test (priority=5)
			public void clickOnDeposittab()
			{
				customersPage.clickDepositTab();
			}
			
			@Test (priority=6)
			public void clickOnDepositSubmit()
			{
				
				String pText=customersPage.clickSubmitDeposit();
				Assert.assertEquals(pText, "Deposit Successful");

			}
			
			@Test (priority=7)
			public void clickOnWithdrawaltab()
			{
				customersPage.clickWithdrawalTab();
			}
			
			@Test (priority=8)
			public void clickOnWithdrawalSubmit()
			{
				
				String pText=customersPage.clickSubmitWithdrawal();
				Assert.assertEquals(pText,"Transaction successful");
			}
			
			@Test (priority=9)
			public void clickOnLogOut()
			{
				customersPage.customerLogOut();
			}
	
	
}
