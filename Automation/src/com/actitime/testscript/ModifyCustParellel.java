package com.actitime.testscript;

import org.testng.Reporter;
import org.testng.annotations.Test;

import com.actitime.generic.BaseClass;

public class ModifyCustParellel extends BaseClass {
	@Test
	public void modifyCust() throws InterruptedException
	{
		Reporter.log("Modify cust",true);
		Thread.sleep(3000);
	}
}
