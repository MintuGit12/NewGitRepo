package qsp;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlingListbox {
	static
	{
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");	
	}
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		driver.get("https://www.Facebook.com/");
		driver.findElement(By.linkText("Create New Account")).click();
		WebElement w=driver.findElement(By.id("month"));
		Select se=new Select(w);
		se.selectByValue("3");
		se.selectByIndex(0);
		//se.selectByVisibleText("Aug");
	}

}
