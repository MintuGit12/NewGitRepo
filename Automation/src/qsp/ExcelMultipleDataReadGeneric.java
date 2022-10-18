package qsp;


import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.actitime.generic.FileLib;

public class ExcelMultipleDataReadGeneric {
	static{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws IOException, InterruptedException {
		FileLib fl=new FileLib();
		String url = fl.getPropertyData("url");
		WebDriver driver=new ChromeDriver();
		driver.get(url);
		int count=fl.getCount("Sheet1");
		for(int i=1;i<=count;i++)
		{
			String un = fl.getExcelData("sheet1", i, 0);
			String pass = fl.getExcelData("Sheet1", i, 1);
			driver.findElement(By.id("username")).sendKeys(un);
			 driver.findElement(By.name("pwd")).sendKeys(pass);
			 driver.findElement(By.xpath("//div[text()='Login ']")).click();
			 String text=driver.findElement(By.xpath("(//span[@class='errormsg'])[1]")).getText();
			 System.out.println(text);
			 Thread.sleep(3000);
		}
		driver.findElement(By.id("username")).sendKeys(fl.getPropertyData("username"));
		 driver.findElement(By.name("pwd")).sendKeys(fl.getPropertyData("password"));
		 driver.findElement(By.xpath("//div[text()='Login ']")).click();
	}

}
