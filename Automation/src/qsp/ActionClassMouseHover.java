package qsp;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionClassMouseHover {
	static{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.vtiger.com/");
		//driver.findElement(By.xpath(""))
		WebElement res = driver.findElement(By.xpath("(//span[@class='font-size-md mr-4 font-weight-bold text-dark'])[4]"));
		Actions a=new Actions(driver);
		a.moveToElement(res).perform();
		//driver.findElement(By.xpath("//a[@class='list-link']")).click();
	}

}
