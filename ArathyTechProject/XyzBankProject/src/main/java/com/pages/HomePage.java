
package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
//import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.FindBy;
import com.base.TestBase;
import com.wrapper.Wrapper;

public class HomePage extends TestBase
{
  
	Wrapper wrpobj=new Wrapper();
	
    @FindBy(xpath="//*[text()=\"Customer Login\"]")
	WebElement pCustomerLogin;
    
    @FindBy(xpath="//*[@id=\"userSelect\"]")
   	WebElement pCustomerNameList;
   
	@FindBy(xpath="//*[@type=\"submit\"]")
	WebElement pCustomerNameLogin;
	
	 @FindBy(xpath=" //*[text()=\"Logout\"]")
		WebElement pLogOut;
	 
	 @FindBy(xpath=" //*[text()=\"Home\"]")
		WebElement pHome;
	 
	 @FindBy(xpath="//*[text()=\"Bank Manager Login\"]")
		WebElement pBankManagerLogin;
	 
	
	
	public HomePage()
	{
	  PageFactory.initElements(driver, this);
	}
		
	public void clickCustomer()
	{
		wrpobj.waitForElement(pCustomerLogin);
		pCustomerLogin.click();
		wrpobj.waitForElement(pCustomerNameList);
	    wrpobj.selectByIndex(pCustomerNameList,1);
	    wrpobj.waitForElement(pCustomerNameLogin);  
	}
	
	public void clickHome()
	{
		
		pHome.click();
		wrpobj.waitForElement( pBankManagerLogin);
		
		
	}
	

	
	
	
	
}
