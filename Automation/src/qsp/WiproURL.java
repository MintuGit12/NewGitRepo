package qsp;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WiproURL {
	static
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
		driver.navigate().to("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("wipro",Keys.ENTER);
		driver.findElement(By.xpath("(//h3[contains(text(),'Wipro')])[1]")).click();
	List<WebElement> ele = driver.findElements(By.xpath("//a"));
	System.out.println(ele.size());
	for(WebElement w:ele)
	{
		String s=w.getAttribute("href");
		System.out.println(s);
	}
		
	}

}
