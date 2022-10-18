package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoCssSelector {
static
{
	System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
}
	public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.get("file:///C:/Users/Adarsh/Desktop/google.html");
	driver.findElement(By.cssSelector("a[id='d1']")).click();
	Thread.sleep(2000);
	driver.navigate().back();
	driver.findElement(By.cssSelector("a[name='n1']")).click();
	Thread.sleep(2000);
	driver.navigate().back();
	driver.findElement(By.cssSelector("a[class='c1']")).click();
	Thread.sleep(2000);
	driver.navigate().back();
	driver.findElement(By.cssSelector("a[href='https://www.jspider.com/']")).click();
	Thread.sleep(2000);
	driver.navigate().back();
	driver.close();
	}

}
