package qsp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.TreeSet;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AllOptionsWithotDuplicate {
	static
	{
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");	
	}
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		driver.get("file:///C:/Users/Adarsh/Desktop/list1.html");
		WebElement ele = driver.findElement(By.id("mtr"));
		
		Select s=new Select(ele);
		ArrayList<String> al=new ArrayList<String>();
		List<WebElement> all = s.getOptions();
		System.out.println("duplicacy not allowed...............");
		HashSet<String> hs=new HashSet<String>();
		for (int i = 0; i <all.size(); i++) {
			
			hs.add(all.get(i).getText());
			
		}
		System.out.println(hs);
		System.out.println("sorted order.....................");
		Collections.sort( al);
		System.out.println("Arraylist sorted order");
		System.out.println(al);
		Collections.reverse(al);
		System.out.println(al);
		System.out.println("treeset sorted order");
		TreeSet<String> ts=new TreeSet<String>(hs);
		System.out.println(ts);
		System.out.println("Treeset decresing order");
		TreeSet<String> ts1=(TreeSet<String>)ts.descendingSet();
		System.out.println(ts1);
		
		
	}

}
