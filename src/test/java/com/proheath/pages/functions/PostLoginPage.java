package com.proheath.pages.functions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;

import com.proheath.pages.locators.PostLoginPageLocators;

public class PostLoginPage extends PostLoginPageLocators  {

	private WebDriver driver;
	public PostLoginPage(WebDriver driver)
	{
		this.driver=driver;
	}
	private void facilityDropDown()
	{
		driver.manage().window().maximize();
	    Select selectfacility=new Select(driver.findElement(postlogin_Facilitylocator));
		selectfacility.selectByVisibleText("Apollo");
	}
	private void rolesDropDown()
	{
		Select selectfacility=new Select(driver.findElement(postlogin_Roleslocator));
		selectfacility.selectByVisibleText("ADMIN");
	}
	private void clickLogin()
	{
		WebElement postlogin_ClickLogin=driver.findElement(postlogin_Loginlocator);
		postlogin_ClickLogin.click();
	}
	public void prohealthPostLoginPage()
	{
		Reporter.log("Selecting from DropDown");
		this.facilityDropDown();
		this.rolesDropDown();
		this.clickLogin();
		Reporter.log("Selected");
	}
	
	
}
