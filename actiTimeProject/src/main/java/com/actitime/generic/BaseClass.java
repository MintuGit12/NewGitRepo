package com.actitime.generic;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import javax.xml.stream.XMLReporter;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.actitime.pom.EnterTimeTrackPage;
import com.actitime.pom.LoginPage;

public class BaseClass 
{
 public static WebDriver driver;
 static
	{
		System.setProperty("webdriver.chrome.driver","./src/main/resources/driver/chromedriver.exe");
	}
	
@BeforeClass(groups={"smokeTest","regressionTest"})
public void openBrowser()
{
  Reporter.log("open-Brouser",true);
	driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.manage().window().maximize();
}
@AfterClass(groups={"smokeTest","regressionTest"})
public void closeBrowser()
{
	Reporter.log("close-Browser",true);
	driver.close();
}
@BeforeMethod(groups={"smokeTest","regressionTest"})
public void login() throws IOException
{
	Reporter.log("login",true);
	FileLib f=new FileLib();
	String url=f.getPropertyData("url");
	String un = f.getPropertyData("username");
	String pwd = f.getPropertyData("password");
	driver.get(url);
	LoginPage l=new LoginPage(driver);
	l.setLogin(un, pwd);
}
@AfterMethod(groups={"smokeTest","regressionTest"})
public void logout() throws InterruptedException
{
	Reporter.log("logout",true);
	EnterTimeTrackPage e=new EnterTimeTrackPage(driver);
	e.setLgOutLink();
}
}
