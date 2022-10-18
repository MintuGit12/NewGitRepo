package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropActionClass {
	static
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.get("http://www.dhtmlgoodies.com/submitted-scripts/i-google-like-drag-drop/index.html");
	WebElement source = driver.findElement(By.xpath("//h1[text()='Block 1']"));
	WebElement dest = driver.findElement(By.xpath("//h1[text()='Block 4']"));
	Actions a=new Actions(driver);
	Thread.sleep(2000);
	a.dragAndDrop(source, dest).perform();
	}

}
