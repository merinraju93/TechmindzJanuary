package com.wrapper;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.base.TestBase;

public class Wrapper extends TestBase {

	public Wrapper() throws IOException {
		super();
	}

	public void waitForElement(WebElement pElement) {
		WebDriverWait wait = new WebDriverWait(driver ,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(pElement));
		}
	
		public void waitForAlert() {
		WebDriverWait wait = new WebDriverWait(driver ,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.alertIsPresent());
		}
		
		public void alertAccept() {
		Alert alert = driver.switchTo().alert();
		alert.accept(); 
    }
}
