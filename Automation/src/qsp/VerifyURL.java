package qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyURL {
static
{
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
}
	public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.get("https://mail.google.com/mail/u/0/#inbox");
	String curl=driver.getCurrentUrl();
	if(curl.contains("https://www.google.com/"))
		System.out.println("yes it contains google url");
	else
		System.out.println("test failed");
	driver.close();
	}

}
