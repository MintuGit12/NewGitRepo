package qsp;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExcelMultipleDataRead {
	static{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
		WebDriver driver=new ChromeDriver();
		FileInputStream fis=new FileInputStream("./data/testscriptmultiple.xlsx");
		FileInputStream fisp=new FileInputStream("./data/commondata.property");
		Properties p=new Properties();
		p.load(fisp);
		driver.get(p.getProperty("url"));
		Workbook wb = WorkbookFactory.create(fis);
		int count=wb.getSheet("Sheet1").getLastRowNum();
		for(int i=1;i<count;i++)
		{
			 String un = wb.getSheet("Sheet1").getRow(i).getCell(0).toString();
			 driver.findElement(By.id("username")).sendKeys(un);
			 String pass=wb.getSheet("Sheet1").getRow(i).getCell(1).toString();
			 driver.findElement(By.name("pwd")).sendKeys(pass);
			 driver.findElement(By.xpath("//div[text()='Login ']")).click();
			 System.out.println("username and password entered :"+un+"\t"+pass);
			 String text=driver.findElement(By.xpath("(//span[@class='errormsg'])[1]")).getText();
			 System.out.println(text);
			 Thread.sleep(3000);
		}
		driver.findElement(By.id("username")).sendKeys(p.getProperty("username"));
		 driver.findElement(By.name("pwd")).sendKeys("password");
		 driver.findElement(By.xpath("//div[text()='Login ']")).click();
	}

}
