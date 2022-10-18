package qsp;

import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClickAllCheckboxes {
static
{
	System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
}
	public static void main(String[] args) throws InterruptedException {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter an URL :");
		String st=sc.nextLine();
		WebDriver driver=new ChromeDriver();
	    driver.get(st);
		List<WebElement> all = driver.findElements(By.xpath("//input[@type='checkbox']"));
		Thread.sleep(5000);
		for(int i=0;i<all.size();i++)
		{
			all.get(i).click();
		}
		for(WebElement w1:all)
		{
			if(w1==driver.findElement(By.xpath("//input[@checked]")))
			{
				System.out.println("test passed");
			}
		}
		Thread.sleep(5000);
		//driver.close();
	}

}
