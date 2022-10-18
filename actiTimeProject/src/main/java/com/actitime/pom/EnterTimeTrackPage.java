package com.actitime.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EnterTimeTrackPage {
@FindBy(xpath="//div[@id='container_tasks']")
private WebElement taskTab;

@FindBy(id="logoutLink")
private WebElement lgOutLink;

public EnterTimeTrackPage(WebDriver driver)
{
	PageFactory.initElements(driver, this);
}

public void setTaskTab() {
	taskTab.click();
}

public void setLgOutLink() {
lgOutLink.click();
}

}
