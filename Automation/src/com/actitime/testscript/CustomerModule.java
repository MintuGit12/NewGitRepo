package com.actitime.testscript;

import org.testng.Reporter;
import org.testng.annotations.Test;

import com.actitime.generic.BaseClass;

public class CustomerModule extends BaseClass {
@Test(groups={"regressionTest","smokeTest"})
public void createCustomer()
{
	Reporter.log("create----Customer",true);
}
@Test(groups ="smokeTest")
public void modifyCustomer()
{
	Reporter.log("modify----Customer",true);
}
@Test
public void deleteCustomer()
{
	Reporter.log("delete----Customer",true);
}
}
