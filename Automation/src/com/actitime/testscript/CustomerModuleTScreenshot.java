package com.actitime.testscript;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.actitime.generic.BaseClass;
@Listeners(com.actitime.generic.ListnersImplementation.class)
public class CustomerModuleTScreenshot extends BaseClass {
@Test
public void createCustomer11()
{
	Reporter.log("create-customer",true);
	Assert.fail();
}
}
