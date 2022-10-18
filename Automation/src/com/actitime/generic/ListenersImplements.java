package com.actitime.generic;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.xml.security.binding.xmldsig.ObjectType;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class ListenersImplements implements ITestListener 
{
static
{
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
}
	@Override
	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestSuccess(result);
	}

	@Override
	public void onTestFailure(ITestResult result) {
	String res=result.getName();
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
	try {
		Thread.sleep(3000);
	} catch (InterruptedException e1) {
	
	}
	TakesScreenshot t=(TakesScreenshot)driver;
	 File src = t.getScreenshotAs(OutputType.FILE);
	 File dest=new File("./Screenshot/"+res+".png");
	 try
	 {
	 FileUtils.copyFile(src, dest);
	 }
	 catch(IOException e)
	 {
		 
	 }
	 driver.close();
	}
	

	@Override
	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestSkipped(result);
	}


}
