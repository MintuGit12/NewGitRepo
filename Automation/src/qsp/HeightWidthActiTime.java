package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HeightWidthActiTime {
	static
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		int h1=driver.findElement(By.id("username")).getSize().getHeight();
		int w1=driver.findElement(By.id("username")).getSize().getWidth();
		int h2=driver.findElement(By.xpath("//input[@type='password']")).getSize().getWidth();
		int w2=driver.findElement(By.xpath("//input[@type='password']")).getSize().getHeight();
		if(h1==h2&&w1==w2)
			System.out.println("testing passed both are aligned");
		else
			System.out.println("testing failed");
	}

}
