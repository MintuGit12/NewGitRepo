package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementGetTextEtc {
	static
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
		public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/login.php");
		String text=driver.findElement(By.id("loginbutton")).getText();
		String text1=driver.findElement(By.name("login")).getAttribute(text);
		String text2=driver.findElement(By.name("login")).getTagName();
		System.out.println(text);
		System.out.println(text1);
		System.out.println(text2);
		driver.findElement(By.name("login")).submit();
			Thread.sleep(2000);
		driver.close();
		}

	}
