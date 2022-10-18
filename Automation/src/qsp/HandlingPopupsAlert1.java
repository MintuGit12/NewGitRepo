package qsp;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HandlingPopupsAlert1 {
static
{
	System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
}
	public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.google.com/");
	driver.findElement(By.name("q")).sendKeys("https://demo.automationtesting.in/Register.html",Keys.ENTER);
	//driver.findElement(By.xpath("//h3[text()='Register']")).click();
	//driver.findElement(By.xpath("//a[text()='SwitchTo']")).click();
	driver.findElement(By.xpath("//a[text()='Alerts']")).click();
	driver.findElement(By.xpath("//button[@class='btn btn-danger']")).click();
	WebDriverWait wait=new WebDriverWait(driver, 10);//wait condition is given to wait until alert is present
	wait.until(ExpectedConditions.alertIsPresent());
	Alert ale = driver.switchTo().alert();
	System.out.println(ale.getText());
	//ale.accept();
	ale.dismiss();//alert can accept as well as dismiss
	}
}
