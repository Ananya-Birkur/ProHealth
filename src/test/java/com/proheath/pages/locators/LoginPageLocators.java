package com.proheath.pages.locators;

import org.openqa.selenium.By;

public class LoginPageLocators {
	
	protected By signinpage_username=By.xpath("//input[contains(@name,'email')]");
	protected By signinpage_password=By.xpath("//input[contains(@type,'password')]");
	protected By signinpage_loginbtn=By.xpath("//button[@type='submit'][contains(.,'LOGIN')]");

}
