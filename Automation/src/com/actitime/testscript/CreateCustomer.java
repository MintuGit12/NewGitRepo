package com.actitime.testscript;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.actitime.generic.BaseClass;

public class CreateCustomer extends BaseClass {
	
WebDriver driver;
	@Test
	public void createCustomer() throws InterruptedException
	{
		//WebDriver driver=new ChromeDriver();
		WebDriver driver=super.driver;
		driver.manage().window().maximize();;
		Thread.sleep(3000);
		if(driver.equals(super.driver))
			System.out.println("true");
		else
			System.out.println("false");
		driver.findElement(By.xpath("//div[@id='container_tasks']")).click();
		driver.findElement(By.xpath("//div[text()='Add New']")).click();
		driver.findElement(By.xpath("//div[@class='item createNewCustomer']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@class='inputFieldWithPlaceholder newNameField inputNameField']")).sendKeys("Manish Singh");
WebElement w=	driver.findElement(By.xpath("(//div[text()='- Select Customer -'])[1]"));
//w.click();
//driver.findElement(By.xpath("(//div[text()='Galaxy Corporation'])[7]")).click();
//JavascriptExecutor j=(JavascriptExecutor)w;
//j.executeScript("window.scrollBy(0,document.body.scrollHeight)");
driver.findElement(By.xpath("//div[text()='Create Customer']")).click();
	}
@Test
public void deleteCustomer()
{
	WebDriver driver=super.driver;
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	driver.findElement(By.xpath("//div[@id='container_tasks']")).click();
	driver.findElement(By.xpath("(//div[@class='editButton'])[9]")).click();
	driver.findElement(By.xpath("(//div[text()='ACTIONS'])[1]")).click();
	driver.findElement(By.xpath("(//div[text()='Delete'])[2]")).click();
	driver.findElement(By.xpath("//span[text()='Delete permanently']")).click();
}
}
