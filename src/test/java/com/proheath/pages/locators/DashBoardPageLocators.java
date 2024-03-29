package com.proheath.pages.locators;

import org.openqa.selenium.By;

public class DashBoardPageLocators {
	
	protected By dashBoard_SettingsLocator=By.xpath("(//img[contains(@width,'25px')])[5]");
	protected By dashBoard_DomainLocator=By.xpath("//a[@href='/DomainValues'][contains(.,'Domain Values')]");
	
	protected By dashboard_Settingslocator=By.xpath("//li[@class='menu-item'][contains(.,'SettingsDomain ValuesTemplate ManagementPayersConfigurationsClearing HouseSecurityRolesPractice SetupFacilitiesUsersClinical SettingsCare Team RolesExport ConfigurationGoal Instruction MappingLOINC ConfigurationImmunization ConfigurationCDS ConfigurationCustom Evaluation SettingsLaboratories ConfigurationEncounter TemplateROS ConfigurationService Manager')]");
	protected By dashboard_Securitylocator=By.xpath("//div[@class='only-text'][contains(.,'Security')]");
	protected By dashboard_Userslocator=By.xpath("//a[@href='/Users'][contains(.,'Users')]");
	

}
