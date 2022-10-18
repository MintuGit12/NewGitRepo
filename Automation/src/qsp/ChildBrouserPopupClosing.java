package qsp;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildBrouserPopupClosing {
	static
	{
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	driver.get("https://demo.actitime.com/login.do");
	driver.findElement(By.name("username")).sendKeys("admin");
	driver.findElement(By.name("pwd")).sendKeys("manager");
	driver.findElement(By.id("loginButton")).click();
	driver.findElement(By.xpath("(//div[@class='popup_menu_icon'])[4]")).click();
	driver.findElement(By.linkText("About your actiTIME")).click();
	while(true)
	{
		try
		{
	driver.findElement(By.linkText("Read Service Agreement")).click();
	break;
		}
		catch(Exception e)
		{
			
		}
	}
	Set<String> all = driver.getWindowHandles();
	String s=driver.getWindowHandle();
	ArrayList<String> al=new ArrayList<>(all);
	System.out.println(al.size());
	driver.switchTo().window(al.get(1));
	System.out.println(all.size());
	List<WebElement> tags = driver.findElements(By.tagName("h2"));
	for(WebElement w:tags)
	{
		System.out.println(w.getText());
	}
	Iterator<String> it=al.iterator();
	while(it.hasNext())
	{
		String s1=it.next();
		if(!(s1.equals(s)))
		{
			driver.switchTo().window(s1);
			System.out.println(driver.getTitle());
			driver.close();
		}
	}
	driver.switchTo().window(al.get(0));
	System.out.println(driver.getTitle());
	driver.close();
	/*int i=1;
	List<WebElement> tags = driver.findElements(By.tagName("h2"));
	for(WebElement w:tags)
	{
		System.out.println(i+"----->>"+w.getText());
		i++;
	}*/
	
	}

}
