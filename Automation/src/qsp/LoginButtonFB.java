package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginButtonFB {
	static
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
		public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/login.php");
		boolean b=driver.findElement(By.id("loginbutton")).isEnabled();
		if(b==true)
			System.out.println("buttomn is enabled");
		else
			System.out.println("not enabled");
		driver.close();
		}
}
