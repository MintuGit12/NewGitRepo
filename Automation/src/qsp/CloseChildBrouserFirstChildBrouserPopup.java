package qsp;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CloseChildBrouserFirstChildBrouserPopup {
	static
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
		
	public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.get("https://demo.actitime.com/login.do");
	driver.findElement(By.linkText("actiTIME Inc.")).click();
	String p=driver.getWindowHandle();
	Set<String> all = driver.getWindowHandles();
	System.out.println(all.size());
	Iterator<String> it=all.iterator();
	while(it.hasNext())
	{
		String s1 = it.next();
		if(!(p.equals(s1)))
		{
			driver.switchTo().window(s1);
			System.out.println(driver.getTitle());
			driver.close();
		}
	}
	driver.close();
	/*ArrayList<String> al=new ArrayList<>(all);
	ListIterator<String> i=al.listIterator();
	while(i.hasNext())
	{
		System.out.println(i.next());
	}
	while(i.hasPrevious())
	{
		Thread.sleep(3000);
		WebDriver a = driver.switchTo().window(i.previous());
		System.out.println(a.getTitle());
		driver.close();
	}*/
	}

}
