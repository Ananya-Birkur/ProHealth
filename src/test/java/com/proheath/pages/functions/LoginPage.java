package com.proheath.pages.functions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Reporter;

import com.proheath.pages.locators.LoginPageLocators;
import com.proheath.utils.Browser;

public class LoginPage extends LoginPageLocators {

	private WebDriver driver;
	public LoginPage(WebDriver driver)
	{
		this.driver=driver;
	}
	public void setusername(String uname)
	{
		WebElement ph_username=driver.findElement(signinpage_username);
		ph_username.sendKeys(uname);
	}
	public void setpassword(String pass)
	{
		WebElement ph_password=driver.findElement(signinpage_password);
		ph_password.sendKeys(pass);	
	}
	public void clicksubmit()
	{
		WebElement ph_submitbtn=driver.findElement(signinpage_loginbtn);
		ph_submitbtn.click();
	}
	public void prohealthLogin(String uname,String pass)
	{
		Reporter.log("Pro Heath Login Execution Method Started");
		this.setusername(uname);
		this.setpassword(pass);
		this.clicksubmit();
		Reporter.log("Pro Health Submit Button Clicked and Now Verifying Output");
		
		Browser.verifyOutput("http://183.82.123.57:3000/login"); 
		Reporter.log("ProHealth Login Successful");
	}
}
