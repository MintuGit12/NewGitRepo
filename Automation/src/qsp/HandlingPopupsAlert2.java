package qsp;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingPopupsAlert2 {
static
{
	System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
}
	public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	driver.get("https://demo.automationtesting.in/Alerts.html");
	//driver.findElement(By.xpath("//a[text()='SwitchTo']")).click();
	//driver.findElement(By.xpath("//a[text()='Alerts']")).click();
	driver.findElement(By.xpath("(//a[contains(text(),'Alert')])[3]")).click();
	driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
	driver.switchTo().alert().dismiss();
	String text = driver.findElement(By.id("demo")).getText();
	System.out.println(text);
	}

}
