package qsp;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ListBoxSelf {
static
{
	System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
		driver.findElement(By.linkText("Create New Account")).click();
		WebElement day = driver.findElement(By.id("day"));
		WebElement month = driver.findElement(By.id("month"));
		WebElement year = driver.findElement(By.id("year"));
		Select s=new Select(day);
		Select s1=new Select(month);
		Select s2=new Select(year);
		s.selectByIndex(29);
	Thread.sleep(2000);
	s.selectByValue("25");
	Thread.sleep(2000);
	s.selectByVisibleText("30");
	s1.selectByIndex(0);
	s2.selectByVisibleText("2019");
		System.out.println(s.isMultiple());
		List<WebElement> all = s.getOptions();
		List<WebElement> all1 = s1.getOptions();
		List<WebElement> all2 = s2.getOptions();
		
		for(WebElement w:all)
		{
			System.out.println(w.getText());
			//if((w.getText()).equals(30))
				//s.deselectByVisibleText(30);
		}
		driver.get("file:///C:/Users/Adarsh/Desktop/list1.html");
		WebElement mtr = driver.findElement(By.id("mtr"));
		Select se=new Select(mtr);
		List<WebElement> op = se.getOptions();
		int count=op.size();
		for(int i=0;i<count;i++)
		{
			se.selectByIndex(i);
			Thread.sleep(200);
		}
		List<WebElement> op1 = se.getAllSelectedOptions();
		for(int i=0;i<op1.size();i++)
		{
			System.out.println(op1.get(i).getText());
		}
		System.out.println("..................................");
		WebElement op2=se.getWrappedElement();//without using looping statement
		System.out.println("Wrapped element is :"+op2.getText());
		if(se.isMultiple())
		{
		for(int i=count-1;i>=0;i--)
		{
			se.deselectByIndex(i);
			Thread.sleep(200);
		}		
		}
		System.out.println("...................only duplicates.................");
		HashSet<String> se0=new HashSet<>();
		for(WebElement w:op)
		{
			if(se0.add(w.getText())==false)
{
	System.out.println(w.getText());
}
		}
		System.out.println("...........without duplicates...........");
		HashSet<String> se1=new HashSet<>();
		for(WebElement w:op)
		{
			se1.add(w.getText());
		}
		System.out.println(">>>>>>>>>>>>>>>>>>>>>");
		System.out.println(se1);
		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
		System.out.println("print in alphabetical order");
		TreeSet<String> ts=new TreeSet<>();
		for(WebElement w:op)
		{
			ts.add(w.getText());
		}
		System.out.println(ts);
		System.out.println("......choose alternate..........");
		int i=0;
		while(i<=op.size())
		{
			se.selectByIndex(i);
			i=i+2;
		}
	}

}
