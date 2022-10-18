package com.actitime.testscript;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CustomerModuleTest 
{//op is open-browser,login,delete,logout,login,modify,logout,login,create,logout,login,create,logout,close-browser
@BeforeClass
public void openBrowser()
{
	Reporter.log("open-Browser",true);
}
@AfterClass
public void closeBrowser()
{
	Reporter.log("close-Browser",true);	
}
@BeforeMethod
public void login()
{
	Reporter.log("login",true);	
}
@AfterMethod
public void logout()
{
	Reporter.log("logout",true);	
}
@Test(priority = 1,invocationCount = 2)
public void createCustomer()
{
	Reporter.log("create-Customer",true);
}
@Test
public void modifyCustomer()
{
	Reporter.log("modify-Customer",true);
}
@Test
public void deleteCustomer()
{
	Reporter.log("delete-Customer",true);
}
}
