package com.actitime.generic;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;

public class BaseClass 
{
 private static final String browser = null;
public WebDriver driver;
 static
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	@Parameters("browser")
@BeforeTest
public void openBrowser(String browser)
{
	Reporter.log("open-Browser",true);
	if(browser.equals("chrome"))
	{
	driver=new ChromeDriver();
	}
	else if(browser.equals("firefox"))
	{
		driver=new FirefoxDriver();
	}
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.manage().window().maximize();
}
@AfterTest
public void closeBrowser()
{
	Reporter.log("close-Browser",true);
	driver.close();
}
@BeforeMethod
public void login() throws IOException
{
	Reporter.log("login",true);
	FileLib f=new FileLib();
	String url=f.getPropertyData("url");
	String un = f.getPropertyData("username");
	String pwd = f.getPropertyData("password");
	driver.get(url);
	driver.findElement(By.id("username")).sendKeys(un);
	driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys(pwd);
	driver.findElement(By.xpath("//div[text()='Login ']")).click();
}
@AfterMethod
public void logout() throws InterruptedException
{
	Reporter.log("logout",true);
	driver.findElement(By.id("logoutLink")).click();
}
}
