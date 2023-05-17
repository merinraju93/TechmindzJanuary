package com.testcase;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.base.TestBase;
import com.pages.HomePage;

public class LanuchURL extends TestBase
{
HomePage homePage;
public  LanuchURL()
{
super();
}
@BeforeClass
public void setUp()
{
initialization();
homePage=new HomePage();
}
@Test (priority=1)
public void launchURL()
{
System.out.println("URL Launched");
}
@Test (priority=2)
public void clickOnCustomer()
{

homePage.clickCustomer();
}
/*
@Test (priority=3)
public void clickOnCustomerNameLogin()
{
homePage.customerNameLogin();
}
@Test (priority=4)
public void clickOnTransctions()
{
homePage.clickTransctions();
}
/*
@Test (priority=4)
public void clickOnAccountNumber()
{
homePage.selectAccount();
}
/*@Test
public void clickOnBM()
{
homePage.clickBm();
}*/
}
