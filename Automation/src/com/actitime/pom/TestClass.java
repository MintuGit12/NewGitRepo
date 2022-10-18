package com.actitime.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestClass {
	 static
		{
			System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		}
	 @Test
	 public void demoTestClass() throws InterruptedException
	 {
		 WebDriver driver=new ChromeDriver();
			driver.get("https://demo.actitime.com/");
			LoginPage l=new LoginPage(driver);
			l.setLogin("admin", "manger123");
			Thread.sleep(3000);
			l.setLogin("admin","manager");
			Thread.sleep(3000);
			HomePage h=new HomePage(driver);
			h.setlogout();
			Thread.sleep(3000);
			driver.close();
	 }
}
