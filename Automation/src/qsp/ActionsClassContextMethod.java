package qsp;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsClassContextMethod {
static
{
	System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
}
	public static void main(String[] args) throws AWTException, InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.get("https://demo.actitime.com/");
	WebElement link = driver.findElement(By.partialLinkText("actiTIME Inc."));
	Actions a=new Actions(driver);
	a.contextClick(link).perform();
	Thread.sleep(3000);
	Robot r=new Robot();
	r.keyPress(KeyEvent.VK_T);
	String d = driver.getWindowHandle();
	Set<String> all = driver.getWindowHandles();
	ArrayList<String> al=new ArrayList<>(all);
	for(String s:al)
	{if(d.equals(s))
	{
		
	}
	else {
		driver.switchTo().window(s);
		System.out.println(driver.getTitle());
		driver.close();
	}
	}
	driver.switchTo().window(d);
	System.out.println(driver.getTitle());
	driver.close();
	}

}
