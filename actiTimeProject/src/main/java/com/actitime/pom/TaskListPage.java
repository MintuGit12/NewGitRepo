package com.actitime.pom;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TaskListPage {
@FindBy(xpath="//div[@class='addNewButton']")
private WebElement addNewBtn;

@FindBy(xpath="//div[@class='item createNewCustomer']")
private WebElement newCustMenu;

@FindBy(xpath="//input[@placeholder='Enter Customer Name' and @class]")
private WebElement custNameTxb;

@FindBy(xpath="//textarea[@placeholder='Enter Customer Description']")
private WebElement descripnTxb;

@FindBy(xpath="//div[text()='- Select Customer -'  and @class=\"emptySelection\"]")
private WebElement selectCustDD;

@FindBy(xpath="//div[text()='Our company' and @class='itemRow cpItemRow ']")
private WebElement ourCompOptn;

@FindBy(xpath="//div[text()='Create Customer']")
private WebElement createCustBtn;

@FindBy(xpath="//div[@class='titleEditButtonContainer']/div[1]")
private WebElement actualCustBtn;

public TaskListPage(WebDriver driver)
{
	PageFactory.initElements(driver, this);
}
public WebElement getAddNewBtn() {
	return addNewBtn;
}


public WebElement getNewCustMenu() {
	return newCustMenu;
}


public WebElement getCustNameTxb() {
	return custNameTxb;
}


public WebElement getDescripnTxb() {
	return descripnTxb;
}


public WebElement getSelectCustDD() {
	return selectCustDD;
}


public WebElement getOurCompOptn() {
	return ourCompOptn;
}


public WebElement getCreateCustBtn() {
	return createCustBtn;
}


public WebElement getActualCustBtn() {
	return actualCustBtn;
}

}
