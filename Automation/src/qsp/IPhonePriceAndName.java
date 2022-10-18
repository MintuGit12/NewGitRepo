package qsp;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class IPhonePriceAndName {
	static
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
		public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().pageLoadTimeout(4, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(4,TimeUnit.SECONDS);
		WebDriverWait wait=new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("logoutLink")));
		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("www.flipkart.com",Keys.ENTER);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//h3[contains(text(),'Online Shopping Site')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//button[text()])[1]")).click();
       driver.findElement(By.xpath("//input[@type='text']")).sendKeys("iphone 13 promax",Keys.ENTER);
       //Thread.sleep(4000);
       List<WebElement> name = driver.findElements(By.xpath("//div[contains(text(),'APPLE iPhone 13 Pro Max')]"));
	List<WebElement> price = driver.findElements(By.xpath("//div[contains(text(),'APPLE iPhone 13 Pro Max')]/../../div[2]/div[1]/div[1]/div"));
	int n=name.size();
	int p=price.size();
	System.out.println(n+"................"+p);
	for(int i=0;i<price.size();i++)
		{
			String n1= name.get(i).getText();
			String p1=price.get(i).getText();
				/*char[] p1=p.toCharArray();
				if(p1.length>0&&p1.length<=5)
				
			System.out.println(n+"----->>>"+p);
				}*/
			System.out.println(n1+"----->>>"+p1);
			}
		}
		}


