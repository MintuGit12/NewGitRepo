package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollBar1 {
	static
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.bbc.com/");
	JavascriptExecutor j=(JavascriptExecutor)driver;
	int y=driver.findElement(By.xpath("//h3[text()='How a controversial study split twins apart at birth']")).getLocation().getY();
	j.executeScript("window.scrollBy(0,"+y+")");
	j.executeScript("window.scrollBy(0,"+(-y)+")");
	//j.executeScript("window.scrollBy(0,document.body.scrollHeight)");
	//j.executeScript("window.scrollTo(document.body.scrollWidth,0)");
	//driver.close();
	}

}
