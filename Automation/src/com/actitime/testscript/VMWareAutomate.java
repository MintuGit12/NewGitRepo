package com.actitime.testscript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class VMWareAutomate {
static
{
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
}
@Test
public void openVM()
{
	WebDriver driver=new ChromeDriver();
	driver.get("192.168.3.128:8080");
}
}
