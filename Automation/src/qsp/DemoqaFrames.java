package qsp;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoqaFrames {
	static
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.get("https://demoqa.com/frames");
	List<WebElement> ele = driver.findElements(By.tagName("iframe"));
	System.out.println(ele.size());
	driver.switchTo().frame(3);
	WebElement ele1=driver.findElement(By.id("sampleHeading"));
	System.out.println(ele1.getText()+"...........");
     for(int i=1;i<3;i++)
	{
		driver.switchTo().frame(i);
		WebElement fr = driver.findElement(By.id("sampleHeading"));
		System.out.println("......"+fr.getText());
		
		//driver.switchTo().parentFrame();
		driver.close();
	}
	
	
	}

}
