package qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingMultipleElements {
		static
		{
			System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		}
		public static void main(String[] args) throws InterruptedException {
			WebDriver driver=new ChromeDriver();
			driver.get("https://www.amazon.in/");
			List<WebElement> ele = driver.findElements(By.xpath("//div"));
			int siz=ele.size();
			System.out.println(siz);
			/*for(int i=0;i<siz;i++)
			{
				String text = ele.get(i).getText();
				System.out.println(text);
			}*/
			for(WebElement we:ele)
			{
				String text = we.getText();
				System.out.println(text);
			}
			driver.close();
		}
	}
