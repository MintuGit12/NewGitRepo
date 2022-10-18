package com.actitime.testscript;

import org.testng.Reporter;
import org.testng.annotations.Test;

import com.actitime.generic.BaseClass;

public class DelModParellel extends BaseClass {
	@Test
	public void deleteCust() throws InterruptedException
	{
		Reporter.log("Delete cust",true);
		Thread.sleep(3000);
	}
}
