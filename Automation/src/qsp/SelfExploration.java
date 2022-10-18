package qsp;

import java.util.*;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SelfExploration {
	static
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.navigate().to("https://www.google.com/");;
		driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys("fl");
		List<WebElement> all = driver.findElements(By.xpath("//span[contains(text(),'fl')]"));
		ListIterator<WebElement> li=all.listIterator();
		WebDriverWait wait=new WebDriverWait(driver,10);
	/*	while(li.hasNext())
		{
			wait.until(ExpectedConditions.titleContains("flipkart"));
			String str = li.next().getText();
			if(str=="flipkart")
			{
				li.next().click();
			}
		}*/
		all.get(0).click();
		driver.findElement(By.xpath("(//h3[contains(text(),'Flipkart')])[1]")).click();
		driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("7001750978");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("mintu123");
		driver.findElement(By.xpath("(//span[contains(text(),'Login')])[2]")).submit();
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("panty");
		driver.findElement(By.xpath("//button[@type='submit']")).submit();
		List<WebElement> pan = driver.findElements(By.xpath("//a[contains(text(),'Women Hipster Multicolor Panty')]"));
		for(WebElement w:pan)
		{
			w.click();
			//System.out.println(s);
			Thread.sleep(2000);
			driver.navigate().back();
		}
		driver.close();
	}

}
