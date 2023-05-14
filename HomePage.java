package com.pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.TestBase;
import com.wrapper.wrapper;

public class HomePage extends TestBase {
	 wrapper wrrobj= new wrapper();
	 @FindBy (xpath="/html/body/div/div/div[2]/div/div[1]/div[1]/button")
		WebElement pCustomerlogin;
	 
	 @FindBy (xpath="//select")
	 WebElement pNameSelect;
	 
	 @FindBy(xpath="(//button)[3]")
	 WebElement pNameLogin;
	 
	 @FindBy(xpath="//select")
	 WebElement pID;
	 
	 @FindBy(xpath="(//button)[3]")
	 WebElement pTransaction;
	 @FindBy(xpath="(//button)[3]")
	 WebElement pTransactionafter;
	 
	 @FindBy(xpath="/html/body/div/div/div[2]/div/div[1]/button[1]")
	 WebElement pBackButton;
	 @FindBy(xpath="/html/body/div/div/div[2]/div/div[1]/button[1]")
	 WebElement pBackButtonafter;
	 
	 @FindBy(xpath="/html/body/div/div/div[2]/div/div[3]/button[2]")
	 WebElement pDeposit;
	 
	 @FindBy(xpath="//input")
	 WebElement pDepositAmount;
	 
	 @FindBy(xpath="(//button)[6]")
	 WebElement pDepositButton;
	 
	 @FindBy(xpath="(//button)[5]")
	 WebElement pWithdrawl;
	 
	 @FindBy(xpath="//input")
	 WebElement pWithdrawlAmount;
	 
	 @FindBy(xpath="(//button)[6]")
	 WebElement pWithdrawlButton;
	 
	 @FindBy(xpath="//input")
	 WebElement pcalender1;
	 
	 @FindBy(xpath="(//input)[2]")
	 WebElement pcalender2;
	 
	 @FindBy(xpath="(//button)[4]")
	 WebElement preset;
	 
	 @FindBy(xpath="(//button)[2]")
	 WebElement plogout;
	 
	 @FindBy(xpath="(//button)[1]")
	 WebElement phome;
	 
	 @FindBy(xpath="/html/body/div/div/div[2]/div/div[1]/div[2]/button")
	 WebElement pManagerlogin;
	 
	 @FindBy(xpath="/html/body/div/div/div[2]/div/div[1]/button[1]")
	 WebElement paddcustomer;
	 
	 @FindBy(xpath="(//input)[1]")
	 WebElement pfirstname;
	 
	 @FindBy(xpath="(//input)[2]")
	 WebElement plastname;
	 
	 @FindBy(xpath="(//input)[3]")
	 WebElement ppostcode;
	 
	 @FindBy(xpath="(//button)[6]")
	 WebElement psubmitbutton;
	 
	 @FindBy(xpath="(//button)[4]")
	 WebElement popenaccount;
	 
	 @FindBy(xpath="(//select)[1]")
	 WebElement pnameselect;
	 
	 @FindBy(xpath="(//select)[2]")
	 WebElement pcurrency;
	 
	 @FindBy(xpath="(//button)[6]")
	 WebElement pprosess;
	 
	 @FindBy(xpath="(//button)[5]")
	 WebElement pcustomers;
	 
	 @FindBy(xpath="//input")
	 WebElement psearchcustomer;
	 
	 
	 @FindBy(xpath="(//button)[6]")
	 WebElement pdelete;
	 

	 
	 
	 
	 public HomePage() {
	PageFactory.initElements(driver, this);
	
			}
	 public  void clickCustomerlogin() {
		 wrrobj.waitForElement(pCustomerlogin);
         pCustomerlogin.click();    
      }
	 
	public void SelectName() {
		 wrrobj.waitForElement(pNameSelect);
		pNameSelect.click();
		List<WebElement> dropDownList= new ArrayList<WebElement>();
		dropDownList = driver.findElements(By.xpath("//select//option"));
		dropDownList.get(3).click();
	}
	
	public void clickNameLogin() {
		pNameLogin.click();
	    }
	
	public void ID() {
		pID.click();
		List<WebElement> dropDownList= new ArrayList<WebElement>();
		dropDownList = driver.findElements(By.xpath("//select//option"));
		dropDownList.get(2).click();
		}
	
	public void transaction() {
		 wrrobj.waitForElement(pTransaction);
		pTransaction.click();
		
		}
		
	public void back() {
		 wrrobj.waitForElement(pBackButton);
	
		pBackButton.click();
	
}
	public void transactionafter() {
		 wrrobj.waitForElement(pTransactionafter);
		pTransactionafter.click();
		
		}
		
	public void backafter() {
		pcalender1.click();
		pcalender2.click();
		
		preset.click();
		 wrrobj.waitForElement(pBackButton);
	
		pBackButtonafter.click();
	
}
	
	public String deposit() {
		 wrrobj.waitForElement(pDeposit);
		pDeposit.click();
		wrrobj.waitForElement(pDepositAmount);
		pDepositAmount.click();
		pDepositAmount.sendKeys("700");
		pDepositButton.click();
		String pText=wrrobj.getAlertText();
		return pText;
	}
	public String withdrawl() {
		wrrobj.waitForElement(pWithdrawl);
		pWithdrawl.click();
		wrrobj.waitForElement(pWithdrawlAmount);
		pWithdrawlAmount.click();
		pWithdrawlAmount.sendKeys("300");
		pWithdrawlButton.click();
		String pText=wrrobj.getAlertText();
		return pText;
		
	}
	public void home() {
		wrrobj.waitForElement(plogout);
		plogout.click();
		wrrobj.waitForElement(phome);
		phome.click();
			
	}
	public void managerlogin() {
		wrrobj.waitForElement(pManagerlogin);
	  pManagerlogin.click();
	
	}
	public void addcustomer() {
		wrrobj.waitForElement(paddcustomer);
		paddcustomer.click();
		wrrobj.waitForElement(pfirstname);
		pfirstname.sendKeys("sa");
		plastname.sendKeys("th");
		ppostcode.sendKeys("123");
		psubmitbutton.click();
		wrrobj.alertAccept();
	}	
	public void openaccountname() {
		wrrobj.waitForElement(popenaccount);
		popenaccount.click();
		wrrobj.waitForElement(pnameselect);
		pnameselect.click();
		List<WebElement> dropDownList= new ArrayList<WebElement>();
		dropDownList = driver.findElements(By.xpath("//select//option"));
		dropDownList.get(3).click();
		}
	public void openaccountcurrency() {
		
		wrrobj.waitForElement(pcurrency);
		pcurrency.click();
		List<WebElement> dropDownList= new ArrayList<WebElement>();
		dropDownList = driver.findElements(By.xpath("(//select)[2]//option"));
		dropDownList.get(1).click();
		pprosess.click();
		wrrobj.alertAccept();
		
		
	}
	public void customer() {
		pcustomers.click();
		wrrobj.waitForElement(psearchcustomer);
		 psearchcustomer.click();
		 wrrobj.waitForElement(psearchcustomer);
		 psearchcustomer.sendKeys("sa");
		 wrrobj.waitForElement(pdelete);
		 pdelete.click();
		
	}
	
	
	}


