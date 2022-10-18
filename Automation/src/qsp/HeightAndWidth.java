package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HeightAndWidth {
	static
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
		public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		int height = driver.findElement(By.xpath("//div[@class='_6lux']")).getSize().getHeight();
		int width = driver.findElement(By.xpath("//div[@class='_6lux']")).getSize().getWidth();
		System.out.println("height is "+height);
		System.out.println("width is "+width);
}
}
