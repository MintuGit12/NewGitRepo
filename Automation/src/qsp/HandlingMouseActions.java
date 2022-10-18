package qsp;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HandlingMouseActions {
static
{
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
}
public static void vtiger()
{
	WebDriver driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	driver.get("https://www.vtiger.com/");
	WebElement res= driver.findElement(By.partialLinkText("Resources"));
Actions a=new Actions(driver);
a.moveToElement(res).perform();
driver.findElement(By.partialLinkText("Contact Us")).click();
String text = driver.findElement(By.xpath("//p[contains(text(),'Bengaluru, India')]/../p[2]")).getText();
System.out.println(text);
	driver.close();
}
public static void contextClick() throws AWTException
{
	WebDriver driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	driver.get("https://demo.actitime.com/login.do");
	WebElement link = driver.findElement(By.partialLinkText("actiTIME Inc."));
	Actions a1=new Actions(driver);
	a1.contextClick(link).perform();
	Robot r=new Robot();
	r.keyPress(KeyEvent.VK_W);
	Set<String> all = driver.getWindowHandles();
	ArrayList<String> al=new ArrayList<>(all);
	for(int i=0;i<al.size();i++)
	{
		
		String s=al.get(i);
		driver.switchTo().window(s);
		System.out.println(driver.getTitle());
		if(i==1)
		{
			driver.close();
		}
		}
	driver.switchTo().window(al.get(0));
	driver.close();
}
	public static void main(String[] args) throws AWTException {
	//vtiger();
	//contextClick();
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.vtiger.com/");
		WebElement res = driver.findElement(By.partialLinkText("Resources"));
		Actions a=new Actions(driver);
		a.moveToElement(res).perform();
		driver.findElement(By.partialLinkText("Customers")).click();
		driver.findElement(By.xpath("//a[@class='btn btn-outline-primary cc-btn cc-dismiss']")).click();
WebElement st = driver.findElement(By.partialLinkText("READ FULL STORY"));
driver.manage().window().maximize();
		a.doubleClick(st).perform();
	}
	}

