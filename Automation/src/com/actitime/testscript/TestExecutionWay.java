package com.actitime.testscript;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestExecutionWay {
@Test(priority = 0,invocationCount = 3,dependsOnMethods = "modifyCustomer")
public void createCustomer()
{
Reporter.log("create customer",true);	
}
@Test(priority = 1,enabled = true)
public void modifyCustomer()
{
	Reporter.log("modify customer",true);	
}
@Test(priority = 2,enabled = true,dependsOnMethods = {"createCustomer","modifyCustomer"})
public void deleteCustomer()
{
	Reporter.log("delete customer",true);
	Assert.fail();
}
}
