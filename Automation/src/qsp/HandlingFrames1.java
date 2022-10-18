package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingFrames1 {
	static
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.get("file:///C:/Users/Adarsh/Desktop/frame.html");
	driver.findElement(By.id("t1")).sendKeys("JSP");
	driver.switchTo().frame("t2");
	driver.findElement(By.id("t2")).sendKeys("QSP");
	driver.switchTo().parentFrame();
	Thread.sleep(2000);
	driver.findElement(By.id("t1")).sendKeys("JJJJJJSP");
	}

}
