package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBoxPresentEx {
	static
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
		public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		boolean b=driver.findElement(By.id("keepLoggedInCheckBox")).isDisplayed();
		if(b==true)
			System.out.println("chechbox is being displayed");
		else
			System.out.println("checkbox is not there");
		driver.close();
		}
}
