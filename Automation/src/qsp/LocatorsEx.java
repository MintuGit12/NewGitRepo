package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsEx {
static
{
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
}
	public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.youtube.com/");
	//driver.findElement(By.name("jscontroller")).click();
	driver.findElement(By.className("gstl_50 sbdd_a")).click();
	driver.close();
	//Thread.sleep(20);
	//WebElement e=driver.findElement(By.tagName("input"));
	//e.click();
	//Thread.sleep(2000);
	//driver.navigate().forward();
	//driver.close();
	}

}
