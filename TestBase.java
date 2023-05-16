package com.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestBase {
	   public static WebDriver driver;
	   public static Properties configProp;
	   
	   public TestBase() throws IOException {
		   //reading config File.
		   try { 
			   configProp = new Properties();
			   FileInputStream readconfigLoc = new FileInputStream("C:\\Users\\DELL\\Desktop\\TestingProject\\FrameworkV11\\src\\main\\java\\com\\base\\TestBase.java");
			   configProp.load(readconfigLoc);
			   
		   }catch(FileNotFoundException e) {
			   e.printStackTrace();
		   }catch (IOException e) {
			   e.printStackTrace();
		   }
		   
	   }
     //Initializing web Browser
	   @SuppressWarnings("deprecation")
	   public void initializing() {
		   String browserName = configProp.getProperty("browser");
		   
		   if (browserName.equalsIgnoreCase("Chrome")) {
			   driver = new ChromeDriver();
		 }
		   else if (browserName.equalsIgnoreCase("firefox")) {
			   driver = new FirefoxDriver();
		   }
		   driver.manage().window().maximize();
		   driver.get(configProp.getProperty("URL"));
		   driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		   
	   }
}
