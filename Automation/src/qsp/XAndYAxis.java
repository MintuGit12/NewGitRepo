package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XAndYAxis {
	static
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		int user=driver.findElement(By.id("username")).getLocation().getX();
		int pass=driver.findElement(By.xpath("//input[@type='password']")).getLocation().getX();
		if(user==pass)
			System.out.println("testing passed both are aligned");
		else
			System.out.println("testing failed");
	}

}
