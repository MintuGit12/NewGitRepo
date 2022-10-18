package qsp;

import java.util.List;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AllLinkAmazon {
	static
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the website address");
		String s=sc.nextLine();
	WebDriver driver=new ChromeDriver();
	driver.manage().timeouts().pageLoadTimeout(4000,TimeUnit.SECONDS);
	driver.manage().timeouts().implicitlyWait(5000,TimeUnit.SECONDS);
	driver.get(s);
	System.out.println("enter the shopping website name :");
	String ss=sc.nextLine();
	driver.findElement(By.name("q")).sendKeys(ss,Keys.ENTER);
	driver.findElement(By.xpath("(//span[contains(text(),'Shop')])[1]")).click();
    List<WebElement> links = driver.findElements(By.tagName("a"));
    for(int i=0;i<links.size();i++)
    {
    	String w=links.get(i).getText();
    	System.out.println(w);
    }
    driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone 13 pro max");
    List<WebElement> allLink = driver.findElements(By.xpath("//div[contains(text(),'iphone 13 pro max')]"));
    System.out.println("i phone 13 op :");
    for(WebElement w:allLink)
    {
    	String s1 = w.getText();
    	//if(s1=="iphone 13 pro max 1tb")
    		System.out.println(s1);
    		//w.click();
    		
    }
    //driver.navigate().back();
    System.out.println("click to link :");
    allLink.get(10).click();
	}

}
