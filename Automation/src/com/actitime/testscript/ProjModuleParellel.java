package com.actitime.testscript;

import org.testng.Reporter;
import org.testng.annotations.Test;

import com.actitime.generic.BaseClass;

public class ProjModuleParellel extends BaseClass {
	@Test
	public void createProject() throws InterruptedException
	{
		Reporter.log("create project",true);
		Thread.sleep(3000);
	}
}
