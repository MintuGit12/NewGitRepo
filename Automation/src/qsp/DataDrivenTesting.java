package qsp;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DataDrivenTesting {
	static
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws IOException {
	FileInputStream fs=new FileInputStream("./data/commondata.property");
	Properties p=new Properties();
	p.load(fs);
	String un = p.getProperty("username");
	String pwd = p.getProperty("password");
	String url = p.getProperty("url");
	WebDriver driver=new ChromeDriver();
	driver.get(url);
	driver.findElement(By.id("username")).sendKeys(un);
	driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys(pwd);
	driver.findElement(By.xpath("//div[text()='Login ']")).click();
	}

}
