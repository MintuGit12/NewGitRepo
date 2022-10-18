package com.actitime.generic;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class ListnersImplementation extends BaseClass implements ITestListener {

	@Override
	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestSuccess(result);
	}

	@Override
	public void onTestFailure(ITestResult result) {
		Reporter.log("listner-taking screenshot",true);
	String res=result.getName();
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
