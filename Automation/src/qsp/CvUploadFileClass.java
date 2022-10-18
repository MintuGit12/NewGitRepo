package qsp;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CvUploadFileClass {
	static
	{
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");	
	}

	public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.get("https://www.naukri.com/mnjuser/profile");
	driver.findElement(By.id("usernameField")).sendKeys("singhmintu4013@gmail.com");
	driver.findElement(By.id("passwordField")).sendKeys("mintu123");
	driver.findElement(By.xpath("(//button)[1]")).click();
	Thread.sleep(3000);
	File f=new File("./data/PKSingh1.docx");
	String absol = f.getAbsolutePath();
	driver.findElement(By.xpath("(//input[@type='file'])[1]")).sendKeys(absol);
	}
}
