package qsp;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BBCNews {
	static
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
		driver.navigate().to("https://www.google.com/");
		//Thread.sleep(3000);
		/*while(true)
		{
			try
			{
				driver.findElement(By.xpath("//button[text()='No thanks']")).click();
				break;
			}
			catch(Exception e)
			{
				
			}
		}*/
		driver.findElement(By.name("q")).sendKeys("BBC news",Keys.ENTER);
		driver.findElement(By.xpath("//h3[text()='BBC - Homepage']")).click();
		List<WebElement> news = driver.findElements(By.xpath("//span[@class='top-list-item__bullet']/../h3"));
		for(int i=0;i<news.size();i++)
		{
			String neew = news.get(i).getText();
			System.out.println(i+"--->>"+neew);
		}
		driver.close();
	}
	
	}

