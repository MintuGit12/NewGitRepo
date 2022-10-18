package qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;

class DemoA
{
	public static void testA(WebDriver driver) throws InterruptedException
	{
		driver.navigate().to("https://www.google.com");
		driver.navigate().forward();
		Thread.sleep(2000);
		String s=driver.getTitle();
		System.out.println(s);
		driver.close();
	}
}
public class UpcastingToWebDriver {
static
{
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	System.setProperty("webdriver.gecko.driver","./driver/geckodriver.exe");
	System.setProperty("webdriver.opera.driver","./driver/operadriver.exe");
	
}
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver c=new ChromeDriver();
		DemoA.testA(c);
		Thread.sleep(2000);
		FirefoxDriver f=new FirefoxDriver();
		DemoA.testA(f);
		OperaDriver o=new OperaDriver();
		DemoA.testA(o);
	}

}
