package com.proheath.pages.locators;

import org.openqa.selenium.By;

public class PostLoginPageLocators {

	protected By postlogin_Facilitylocator=By.xpath("//select[contains(@name,'facility')]");
	protected By postlogin_Roleslocator=By.xpath("//select[contains(@id,'roles')]");
	protected By postlogin_Loginlocator=By.xpath("//button[@type='submit'][contains(.,'LOGIN')]");
}
