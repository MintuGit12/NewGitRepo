package qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartLastSugg {
	static
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
		public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("www.flipkart.com",Keys.ENTER);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//h3[contains(text(),'Online Shopping Site')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//button[text()])[1]")).click();
       driver.findElement(By.xpath("//input[@type='text']")).sendKeys("iphone ");
       Thread.sleep(4000);
        List<WebElement> allEle = driver.findElements(By.xpath("//span[contains(text(),'iphone')]"));
       int count=allEle.size();
       System.out.println(count);
       int i=1;
       for(WebElement w1:allEle)
       {
    	   System.out.println(i+"--->>"+w1.getText());
    	   i++;
       }
       allEle.get(allEle.size()-1).click();
       Thread.sleep(2000);
      // driver.close();
}
}
