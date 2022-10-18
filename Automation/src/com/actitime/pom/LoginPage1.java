package com.actitime.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage1{
WebElement untbx;
WebElement pwtbx;
WebElement lgBtn;
public LoginPage1(WebDriver driver) {
	untbx=driver.findElement(By.id("username"));
	pwtbx=driver.findElement(By.xpath("//input[@name='pwd']"));
	lgBtn=driver.findElement(By.xpath("//div[text()='Login ']"));
}
public void setLogin(String un,String pwd)
{
	untbx.sendKeys(un);
	pwtbx.sendKeys(pwd);
	lgBtn.click();
}
}