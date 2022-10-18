package com.actitime.testscript;

	import org.testng.Reporter;
	import org.testng.annotations.Test;

import com.actitime.generic.BaseClass;

public class ProjectModule extends BaseClass {
	@Test(priority = 0)
	public void createProject()
	{
		Reporter.log("create----Project",true);
	}
	@Test(priority = 1)
	public void modifyProject()
	{
		Reporter.log("modify----Project",true);
	}
	@Test(priority = -1,dependsOnMethods = "createProject")
	public void deleteProject()
	{
		Reporter.log("delete----Project",true);
	}
	}


