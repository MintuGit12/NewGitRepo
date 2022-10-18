package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WEBElementGetTextEx {
	static
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
		public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/login/device-based/regular/login/?login_attempt=1&lwv=100");
		String text=driver.findElement(By.xpath("//a[text()='Forgotten account?']")).getText();
		String text1=driver.findElement(By.xpath("//a[@class='_97w4']")).getText();
			System.out.println(text);
			System.out.println(text1);
		driver.close();
		}

	}