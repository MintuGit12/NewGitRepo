package com.actitime.testscript;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.actitime.generic.BaseClass;
import com.actitime.generic.FileLib;
import com.actitime.pom.EnterTimeTrackPage;
import com.actitime.pom.TaskListPage;

public class CreateCustomer extends BaseClass 
{
@Test
public void testCreateCustomer() throws InterruptedException, EncryptedDocumentException, IOException
{
	FileLib f=new FileLib();
	String name = f.getExcelData("Sheet1", 1, 2);
	Reporter.log(name,true);
	String desc = f.getExcelData("Sheet1", 1, 3);
	Reporter.log(desc,true);
	EnterTimeTrackPage e=new EnterTimeTrackPage(driver);
	e.setTaskTab();
TaskListPage t=new TaskListPage(driver);
Thread.sleep(2000);
t.getAddNewBtn().click();
Thread.sleep(2000);
t.getNewCustMenu().click();
Thread.sleep(2000);
Thread.sleep(2000);
t.getCustNameTxb().sendKeys(name);
Thread.sleep(2000);
t.getDescripnTxb().sendKeys(desc);
Thread.sleep(2000);
t.getSelectCustDD().click();
Thread.sleep(2000);
/*WebElement ele = driver.findElement(By.xpath("//div[text()='- Select Customer -'  and @class=\\\"emptySelection\\\"]"));
Select s=new Select(ele);
s.selectByVisibleText("Our company");
JavascriptExecutor j=(JavascriptExecutor)driver;
j.executeScript("");*/
t.getOurCompOptn().click();
Thread.sleep(2000);
t.getCreateCustBtn().click();
Thread.sleep(2000);
String actName=t.getActualCustBtn().getText();
Assert.assertEquals(actName, name);

}

}
