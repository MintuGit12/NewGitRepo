package qsp;

import java.util.Scanner;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CloseSpecificBrouserChildBrouserPopup2 {
static
{
	System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
}
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the brouser name which you want to close :");
	String st=sc.nextLine();
	WebDriver driver=new ChromeDriver();
	driver.get("https://secure.indeed.com/auth");
	//first find the title of the window you are looking for
	driver.findElement(By.id("apple-signin-button")).click();
	driver.findElement(By.id("login-facebook-button")).click();
	//driver.findElement(By.id("login-google-button")).click();
	Set<String> all = driver.getWindowHandles();
	for(String s1:all)
	{
		driver.switchTo().window(s1);
		System.out.println(driver.getTitle());
		if(driver.getTitle().contains(st))
		{
			String s2=driver.getTitle();
			System.out.println("full title of the page is :"+s2);
			driver.close();
		}
	}
	}

}
