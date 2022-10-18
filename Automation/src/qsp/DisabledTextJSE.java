package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DisabledTextJSE {
	static
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.get("file:///C:/Users/Adarsh/Desktop/disabletext.html");
	driver.findElement(By.id("d1")).sendKeys("admin");
	JavascriptExecutor j=(JavascriptExecutor)driver;
	j.executeScript("document.getElementById('d2').value='manager'");
	driver.findElement(By.id("d3")).click();
	Thread.sleep(3000);
	j.executeScript("document.getElementById('d2').value=''");
	//driver.close();
	}

}
