package com.proheath.pages.functions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.proheath.pages.locators.DashBoardPageLocators;

public class DashBoardPage extends DashBoardPageLocators {
	
	private WebDriver driver;
	public DashBoardPage(WebDriver driver)
	{
		this.driver=driver;
	}
	private void hoversetting()
	{
		WebElement clicksettings=driver.findElement(dashBoard_SettingsLocator);
		Actions action=new Actions(driver);
		action.moveToElement(clicksettings).click().perform();
	}
	private void hoverdomainvalues()
	{
		//Actions clickdomainvalues=new Actions((WebDriver) driver.findElement(dashBoard_DomainLocator)).click();
	    WebElement clickdomain=driver.findElement(dashBoard_DomainLocator);
	    Actions action=new Actions(driver);
	    action.moveToElement(clickdomain).click().perform();
	}
	public void prohealthdashboardpage()
	{
		this.hoversetting();
		this.hoverdomainvalues();
	}

}
