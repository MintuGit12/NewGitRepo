package qsp;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DownloadCV {
	static
	{
	System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");	
	}

	public static void main(String[] args) throws InterruptedException, IOException, AWTException {
		Runtime.getRuntime().exec("notepad");
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_CAPS_LOCK);
		r.keyPress(KeyEvent.VK_Q);
		r.keyPress(KeyEvent.VK_S);
		r.keyPress(KeyEvent.VK_CAPS_LOCK);
		Thread.sleep(500);
		r.keyPress(KeyEvent.VK_P);
}
}