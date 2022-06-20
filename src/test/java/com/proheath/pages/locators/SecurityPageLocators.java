package com.proheath.pages.locators;

import org.openqa.selenium.By;

public class SecurityPageLocators {
	
	protected By dashboard_Settingslocator=By.xpath("//li[@class='menu-item'][contains(.,'SettingsDomain ValuesTemplate ManagementPayersConfigurationsClearing HouseSecurityRolesPractice SetupFacilitiesUsersClinical SettingsCare Team RolesExport ConfigurationGoal Instruction MappingLOINC ConfigurationImmunization ConfigurationCDS ConfigurationCustom Evaluation SettingsLaboratories ConfigurationEncounter TemplateROS ConfigurationService Manager')]");
	protected By dashboard_Securitylocator=By.xpath("//div[@class='only-text'][contains(.,'Security')]");
	protected By dashboard_Userslocator=By.xpath("//a[@href='/Users'][contains(.,'Users')]");
	protected By dashboard_UsersAdd_Locator=By.xpath("//button[contains(@class,'common-used-button')]");
}
