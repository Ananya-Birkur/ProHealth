package com.proheath.pages.functions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Reporter;

import com.proheath.pages.locators.DashBoardPageLocators;

public class DashBoardPage extends DashBoardPageLocators {
	
	private WebDriver driver;
	public DashBoardPage(WebDriver driver)
	{
		this.driver=driver;
	}
	private void ahoversetting()
	{
		WebElement clicksettings=driver.findElement(dashBoard_SettingsLocator);
		Actions action=new Actions(driver);
		action.moveToElement(clicksettings).click().perform();
	}
	private void bhoverdomainvalues()
	{
		//Actions clickdomainvalues=new Actions((WebDriver) driver.findElement(dashBoard_DomainLocator)).click();
	    WebElement clickdomain=driver.findElement(dashBoard_DomainLocator);
	    Actions action=new Actions(driver);
	    action.moveToElement(clickdomain).click().perform();
	}
	public void chovertoSetting()
	{
		WebElement clicksetting=driver.findElement(dashboard_Settingslocator);
		Actions action=new Actions(driver);
		action.moveToElement(clicksetting).click().perform();
	}
	public void dhovertoSecurity()
	{
		WebElement clicksecurity=driver.findElement(dashboard_Securitylocator);
		Actions action=new Actions(driver);
		action.moveToElement(clicksecurity).click().perform();
	}
	public void ehovertoUsers()
	{
		WebElement clickusers=driver.findElement(dashboard_Userslocator);
		Actions action=new Actions(driver);
		action.moveToElement(clickusers).click().perform();
    }
	public void prohealthdashboardpage()
	{
		this.ahoversetting();
		this.bhoverdomainvalues();
	}
	public void prohealthsecuritypage()
	{
		Reporter.log("Test Case Execution Started..");
		this.chovertoSetting();
		this.dhovertoSecurity();
		this.ehovertoUsers();
		Reporter.log("User Page is Displayed..");
	}


}
