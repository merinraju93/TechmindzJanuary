package com.wrapper;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.base.TestBase;

public class wrapper extends TestBase {

		
	     public void waitForElement(WebElement pElement) {
              WebDriverWait wait =new WebDriverWait(driver, Duration.ofSeconds(10));
              wait.until(ExpectedConditions.elementToBeClickable(pElement));
}
   public void waitForAlert() {
   	
   	WebDriverWait wait =new WebDriverWait(driver, Duration.ofSeconds(10));
       wait.until(ExpectedConditions.alertIsPresent());
   }
  public void alertAccept() {
   	Alert alert = driver.switchTo().alert();
        alert.accept();
   }
  public void getAlert() {
  	Alert alert = driver.switchTo().alert();
        System.out.print(alert.getText());
  }
  
  public String getAlertText() {

Alert alert =driver.switchTo().alert();
        return alert.getText();

}}


