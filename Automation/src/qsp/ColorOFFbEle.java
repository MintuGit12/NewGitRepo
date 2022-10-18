package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ColorOFFbEle {
	static
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		String color = driver.findElement(By.linkText("Forgotten password?")).getCssValue("color");
		String s1 = driver.findElement(By.linkText("Forgotten password?")).getCssValue("font-size");
		String w1 = driver.findElement(By.linkText("Forgotten password?")).getCssValue("font-weight");
		System.out.println(color);
		System.out.println(s1);
		System.out.println(w1);

	}

}
