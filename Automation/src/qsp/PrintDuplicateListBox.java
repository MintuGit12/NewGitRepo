package qsp;

import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PrintDuplicateListBox {

	static
	{
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");	
	}
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		driver.get("file:///C:/Users/Adarsh/Desktop/list1.html");
		WebElement ele = driver.findElement(By.id("mtr"));
		Select se=new Select(ele);
		List<WebElement> all = se.getOptions();
		for(int i=0;i<all.size();i++)
		{
			String s=all.get(i).getText();
			//System.out.println(s);
			for(int j=i+1;j<all.size();j++)
			{
				String s1=all.get(j).getText();
				//System.out.println(s1);
				if(s1.equals(s))
				{
					System.out.println(s);
					break;
				}
			}
		}
		System.out.println("only duplicate ...............");
		HashSet<String> hs=new HashSet<>();
		for(int i=0;i<all.size();i++)
		{
			String s1=all.get(i).getText();
			if(hs.add(s1)==false)
				System.out.println(all.get(i).getText());
		}
		System.out.println("specific options...............");
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the food you want to find :");
		String s=sc.nextLine();
		for(int i=0;i<all.size();i++)
		{
			String s1=all.get(i).getText();
			if(s.equals(s1)==false)
			{
				System.out.println(s);
				break;
			}
		driver.close();
	}

	}
}
