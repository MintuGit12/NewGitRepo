package com.actitime.testscript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class DemoAssertion {
	 static
		{
			System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		}
		
@Test
public void verifyTitle()
{
	WebDriver driver=new ChromeDriver();
	driver.get("http://www.google.com/");
	String title = driver.getTitle();
/*	if(title.equals("Soogle"))//does not have capacity to pass or fail the test case
	{
		Reporter.log("testing passed",true);
	}
	else
	{
		Reporter.log("testing failed",true);
	}*/
	//Assert.assertEquals(title, "Soogle");
	//Reporter.log("welcome",true);
	SoftAssert s=new SoftAssert();
	s.assertEquals(title, "Google");
	Reporter.log("welcome",true);
	driver.close();
	s.assertAll();
	Reporter.log("welcome11111",true);
	
}
}
