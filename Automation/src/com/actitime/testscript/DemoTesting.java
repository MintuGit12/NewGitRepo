package com.actitime.testscript;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class DemoTesting {
@Test
public void demoTest()
{
	System.out.println("it will not display");
	Reporter.log("welcome to testing",false);
	Reporter.log("welcome to testing part 2",true);
	//Assert.fail();
}
}
