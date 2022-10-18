package qsp;


	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;

	public class WEBElementDisplayedEx {
	static
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
		public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/login.php");
		boolean b=driver.findElement(By.xpath("//img[@alt='Facebook']")).isDisplayed();
		if(b==true)
			System.out.println("logo is being displayed");
		else
			System.out.println("logo is not there");
		driver.close();
		}

	}