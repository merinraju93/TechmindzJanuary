package com.testbase;


import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.base.TestBase;
import com.pages.HomePage;

public class BankLogin extends TestBase {
	
	 HomePage  homePage;
     
		public BankLogin() {
		    super();
		    }
		
		@BeforeClass
		public void setUp() {
			initialization();
			homePage = new HomePage();
			
		}
		@Test(priority=1)
		public void launchURL() {
		        System.out.println("URL Launched");
		}	
		@Test(priority=2)
		public void clickOnCustomerlogin() {
	        homePage.clickCustomerlogin();
	        
		}
		@Test(priority=3)
		public void clickOnCustomerName() {
			homePage.SelectName();
		    homePage.clickNameLogin();
		    }
		@Test(priority=4)
		public void customerTransactionBefore() {
			homePage.ID();
            homePage.transaction();
           homePage.back();
            }

        @Test(priority=5)
    	public void customerDeposit() {
            	homePage.deposit();
            	String pText= homePage.deposit();
            	Assert.assertEquals(pText, "Deposit Successful");
        }
        @Test(priority=6)
    	public void customerWithdrawl() {  
        	homePage.withdrawl();
        	String pText= homePage.deposit();
        	Assert.assertEquals(pText, "Transaction successful");
                     
}
        @Test(priority=7)
		public void customerTransactionafter() {
            homePage.transactionafter();
            homePage.backafter();
            }
        @Test(priority=8)
		public void HomePage() {
        	homePage.home();
        }
        @Test(priority=9)
		public void ManagerLogin() {
        	homePage.managerlogin();
        	}
        @Test(priority=10)
		public void AddCustomer() {
        	homePage.addcustomer();
        }
        @Test(priority=11)
		public void selectcustomer() {
        
           homePage.openaccountname();
           homePage.openaccountcurrency();
        
        }
        @Test(priority=12)
		public void customer() {
        	homePage.customer();
        
        
        
}}
