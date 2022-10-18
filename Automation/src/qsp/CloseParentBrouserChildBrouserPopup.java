package qsp;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CloseParentBrouserChildBrouserPopup {
static
{
	System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
}
	public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	driver.get("https://secure.indeed.com/auth");
driver.findElement(By.id("apple-signin-button")).click();
driver.findElement(By.id("login-facebook-button")).click();
Set<String> all = driver.getWindowHandles();
int i=0;
for(String s:all)
{
	driver.switchTo().window(s);
	if(i!=0)
	{
		driver.close();
		System.out.println("closed");
	}
	i++;
}
	}

}
