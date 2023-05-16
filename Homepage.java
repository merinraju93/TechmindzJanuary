package com.page;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.TestBase;
import com.wrapper.Wrapper;


public class Homepage extends TestBase {
	 public Homepage() throws IOException {
		super();
	}
	Wrapper wrrObj = new Wrapper();
	
	  @FindBy (xpath ="//*[@class =\"btn btn-primary btn-lg\"]")
	  WebElement pManagerLogin;
	
	  @FindBy(xpath ="//*[@class =\"btn btn-lg tab\"]")
	  WebElement pAddCustomer;
	
	  @FindBy(xpath ="//*[@placeholder =\"First Name\"]")
	  WebElement pFirstName;
	
	  @FindBy(xpath="//*[@placeholder=\"Last Name\"]")
	  WebElement pLastName;
	
	  @FindBy(xpath="//*[@placeholder=\"Post Code\"]")
	  WebElement pPostCode;
	
	  @FindBy(xpath="//*[@class=\"btn btn-default\"]")
	  WebElement pAddCustomerButton;
	   
	  @FindBy(xpath="//*[@class=\"btn btn-lg tab btn-primary\"]")
	  WebElement pOpenAccount;
	  
	  @FindBy(xpath="//*[@id=\"userSelect\"]")
	  WebElement pCustomer;
	   
	  @FindBy(xpath="//*[@value=\"6\"]")
	  WebElement pDropDown;
	  
	  @FindBy(xpath="//*[@id=\"currency\"]")
	  WebElement pdropdown;
	  
	  @FindBy(xpath="//*[@type=\"submit\"]")
	  WebElement pProcess;
	  
	   @FindBy(xpath="//*[@class=\"btn btn-lg tab btn-primary\"]")
	   WebElement pCustomers;
	   
	    @FindBy(xpath="//*[@ng-click=\"customer()\"]")
	    WebElement pCustomerLogin;
	    
	    @FindBy(xpath="//*[@type=\"submit\"]")
	    WebElement pLoginButton;
	     
	     
	public void Homepage() {
		PageFactory.initElements(driver,this);
		
	}
	public void ClickOnManagerLogin() {
		pManagerLogin.click();
		
    }
	 public void ClickOnAddCustomer() {
		pAddCustomer.click();
	}
	 public void enterFirstName() {
		pFirstName.sendKeys("Bhadra");
	}
	 public void enterLastName() {
		pLastName.sendKeys("rathan");
	}
	 public void enterPostCode() {
		 pPostCode.sendKeys("Pin 686662");
		 
	 }
	 public void ClickOnAddCustomerButton() {
		 pAddCustomerButton.click();
		 wrrObj.waitForAlert();
		 wrrObj.alertAccept();
	 }
	  public void ClickOnOpenAccount() {
		  pOpenAccount.click();
	  }
      public void ClickOnCustomer() {
    	  pCustomer.click();
    	  
      }
      public void ClickOndropDown() {
    	  pDropDown.click();
    	  pdropdown.click();
      }
      public void ClickOnProcess() {
    	  pProcess.click();
    	  wrrObj.waitForAlert();
    	  wrrObj.alertAccept(); 
      }
      public void ClickOnCustomers() {
    	  pCustomers.click();
      }
       public void ClickOnCustomerLogin() {
    	   pCustomerLogin.click();
    	   
       }
       public void ClickOnLoginButton() {
    	   pLoginButton.click();
       }
}
