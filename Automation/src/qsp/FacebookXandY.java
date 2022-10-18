package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookXandY {

	static
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		int x=driver.findElement(By.id("passContainer")).getLocation().getX();
		int y=driver.findElement(By.id("passContainer")).getLocation().getY();
	System.out.println("x axis is :"+x);
	System.out.println("y axis is :"+y);
	driver.close();
	}

}
