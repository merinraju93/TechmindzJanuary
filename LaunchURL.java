package com.testcase;



import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.base.TestBase;
import com.page.Homepage;

public class LaunchURL extends TestBase {
	  Homepage homepage;
		public LaunchURL() throws IOException {
		super();
	}
		@BeforeClass
		public void setUp() throws IOException{
		initialization();
		homepage = new Homepage();
	}
		public  void initialization() {
			
			
		}
		@Test
		public void launchURL() {
		System.out.println("URL Launched");
	}
		@Test(priority =1)
		public void clickonManagerLogin() {
			homepage.ClickOnManagerLogin();
	}
		@Test (priority =2)
		public void clickonAddCustomer() {
			homepage.ClickOnAddCustomer();
			
	}
	   @Test(priority =3)
	   public void ClickOnFirstName() {
		homepage.enterFirstName(); 
	}
      @Test(priority =4)
      public void ClickOnLastName() {
    	  homepage.enterLastName();
     }
      @Test(priority =5)
      public void ClickOnPostCode() {
    	  homepage.enterPostCode();
      }
      @Test(priority=6) 
      public void ClickOnAddCustomerButton() {
    	  homepage.ClickOnAddCustomerButton();
      }
      @Test(priority =7)
      public void ClickOnOpenAccount() {
    	  homepage.ClickOnOpenAccount();
      }
      @Test(priority =8)
      public void ClickOnCustomer() {
    	  homepage.ClickOnCustomer();
      }
      @Test(priority =9)
      public void ClickOnDropDown() {
    	  homepage.ClickOndropDown();
      }
      @Test(priority =10)
      public void ClickOnProcess() {
    	  homepage.ClickOnProcess();
    	  
      }
      @Test(priority =11)
      public void clickOnCustomers() {
    	  homepage.ClickOnCustomers();
      }
      @Test(priority =12)
      public void ClickOnCustomerLogin() {
    	  homepage.ClickOnCustomerLogin();
      }
      @Test
      public void ClickonLoginButton() {
    	  homepage.ClickOnLoginButton();
      }
      
  }
 
