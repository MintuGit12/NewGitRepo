package qsp;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HiddenDivOrCalenderPopup {
static
{
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
}
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://farescraper.com/");
		driver.findElement(By.xpath("//button[contains(text(),'×')]")).click();
		//WebDriverWait wait=new WebDriverWait(driver, 30);
		//wait.until(ExpectedConditions.alertIsPresent());
		//driver.switchTo().alert().accept();
		driver.findElement(By.xpath("(//div[@class='app-input-date h-14 border border-alto rounded-md px-4 py-3'])[1]")).click();
		driver.findElement(By.xpath("//span[text()='18']")).click();
	}

}
