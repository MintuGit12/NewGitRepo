package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoLocator {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
driver.get("file:///C:/Users/Adarsh/Desktop/google.html");
WebElement e=driver.findElement(By.tagName("a"));
e.click();
Thread.sleep(2000);
driver.navigate().back();
driver.findElement(By.id("d1")).click();
Thread.sleep(2000);
driver.navigate().back();
driver.findElement(By.name("n1")).click();
Thread.sleep(2000);
driver.navigate().back();
driver.findElement(By.className("c1")).click();
driver.navigate().back();
Thread.sleep(2000);
driver.findElement(By.linkText("google")).click();
Thread.sleep(2000);
driver.navigate().back();
driver.findElement(By.partialLinkText("le1")).click();
Thread.sleep(2000);
driver.navigate().forward();
driver.navigate().back();
//driver.findElement(By.linkText("Body No Scripts")).click();
//driver.navigate().forward();
//Thread.sleep(4000);
driver.close();
	}

}
