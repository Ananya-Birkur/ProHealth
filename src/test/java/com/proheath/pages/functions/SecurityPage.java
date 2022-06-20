package com.proheath.pages.functions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Reporter;

import com.proheath.pages.locators.SecurityPageLocators;

public class SecurityPage extends SecurityPageLocators {

	private WebDriver driver;
	public SecurityPage(WebDriver driver)
	{
		this.driver=driver;
	}
	public void ahovertoSetting()
	{
		WebElement clicksetting=driver.findElement(dashboard_Settingslocator);
		Actions action=new Actions(driver);
		action.moveToElement(clicksetting).click().perform();
	}
	public void bhovertoSecurity()
	{
		WebElement clicksecurity=driver.findElement(dashboard_Securitylocator);
		Actions action=new Actions(driver);
		action.moveToElement(clicksecurity).click().perform();
	}
	public void chovertoUsers()
	{
		WebElement clickusers=driver.findElement(dashboard_Userslocator);
		Actions action=new Actions(driver);
		action.moveToElement(clickusers).click().perform();
    }
	
	public void prohealthsecuritypage()
	{
		Reporter.log("Test Case Execution Started..");
		this.ahovertoSetting();
		this.bhovertoSecurity();
		this.chovertoUsers();
		Reporter.log("User Page is Displayed..");
	}
	
}
