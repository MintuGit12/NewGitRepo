package qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintGooogleAutoSugg {
	static
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
		public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("java");
		Thread.sleep(5000);
		List<WebElement> ele = driver.findElements(By.xpath("//span[contains(text(),'java')]"));
		int count=ele.size();
		System.out.println(count);
		for(int i=0;i<count;i++)
		{
			String str=ele.get(i).getText();
			System.out.println((i+1)+" link is -->>"+str);
		}
		for(WebElement e:ele)
		{
			String s=e.getText();
			System.out.println(s);
		}
		ele.get(0).click();
		driver.close();
		}
}
