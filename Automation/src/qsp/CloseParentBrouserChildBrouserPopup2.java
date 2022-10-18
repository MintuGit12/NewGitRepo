package qsp;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CloseParentBrouserChildBrouserPopup2 {

	static
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
		public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://secure.indeed.com/auth");
	driver.findElement(By.id("apple-signin-button")).click();
	driver.findElement(By.id("login-facebook-button")).click();
	String title=driver.getTitle();
	String s=driver.getWindowHandle();
	Set<String> all = driver.getWindowHandles();
	Iterator<String> it=all.iterator();
	while(it.hasNext())
	{
		String st=it.next();
		driver.switchTo().window(st);
		if(!(driver.getTitle().equals(title)))
		{
		
			//driver.switchTo().window(st);
			System.out.println(driver.getTitle()+" closed");
			Thread.sleep(2000);
			driver.close();
		}
	}
	driver.switchTo().window(s);
	System.out.println(driver.getTitle()+" closed");
	driver.close();
	/*for(String s1:all)
	{
		driver.switchTo().window(s1);
		if(!(title.contains(driver.getTitle())))
		{
			System.out.println("title of the closing window is :"+driver.getTitle());
			driver.close();
		}
	}*/
	/*for(String s1:all)
	{
		driver.switchTo().window(s1);
		if(!(s.equals(s1))) {
			System.out.println("closed window is :"+driver.getTitle());
			driver.close();
		}
	}*/
	}

}
