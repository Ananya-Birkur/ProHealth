package com.proheath.pages.locators;

import org.openqa.selenium.By;

public class UsersPageLocators {

	protected By users_AddButton_Locator=By.xpath("//button[contains(@class,'common-used-button')]");
	protected By createUsersPopup_Locator=By.xpath("//div[@class='Modal-header'][contains(.,'Create User')]");
	protected By users_PopupClose_Locator=By.xpath("(//span[contains(@class,'close-icon')])[2]");
	
	protected By createUser_PopupDetails_Locator=By.xpath("(//button[contains(@type,'button')])[1]");
	protected By createUser_PopupWorkHours_Locator=By.xpath("//button[contains(@id,'Tab-header-button0')]");
	
	protected By createUser_UploadPicture_Locator=By.xpath("//button[@type='button'][contains(.,'Upload Picture')]");
	protected By createUser_TakeSelfie_Locator=By.xpath("//button[@type='button'][contains(.,'Take Selfie')]");
	
	protected By createUser_FirstNameDropDown_Locator=By.xpath("//select[contains(@name,'salutation')]");
	protected By createUser_FirstName_Locator=By.xpath("//input[contains(@name,'firstName')]");
	protected By createUser_MiddleName_Locator=By.xpath("//input[contains(@name,'middleName')]");
	protected By createUser_LastName_Locator=By.xpath("//input[contains(@name,'lastName')]");
	protected By createUser_SelectUserRole_Locator=By.xpath("//button[@class='common-used-button'][contains(.,'Select User Role')]");
	
	protected By createuser_HomePhone_Locator=By.xpath("//input[contains(@name,'homePhone')]");
	protected By createUser_WorkPhone_Locator=By.xpath("//input[contains(@name,'workPhone')]");
	protected By createUser_Fax_Locator=By.xpath("//input[contains(@name,'fax')]");
	protected By createUser_Email_Locator=By.xpath("//input[contains(@name,'email')]");
	protected By createUser_Mobile_Locator=By.xpath("//input[contains(@name,'mobilePhone')]");
	
	protected By createUser_Save_Locator=By.xpath("(//button[contains(@type,'submit')])[1]");
	protected By createUser_SaveandClose=By.xpath("//button[contains(.,'Save & Close')]");
	protected By createUser_Close=By.xpath("(//button[contains(.,'Close')])[2]");
	
	protected By createUser_FirstNameRequiredDropDown_Locator=By.xpath("(//span[@class='showError'][contains(.,'Required')])[1]");
	protected By createUser_FirstNameRequired_Locator=By.xpath("(//span[@class='showError'][contains(.,'Required')])[2]");
	protected By createUser_LastNameRequired_Locator=By.xpath("(//span[@class='showError'][contains(.,'Required')])[3]");
	protected By createUser_SelectUserRoleRequired_Locator=By.xpath("(//div[contains(.,'Select atleast one role')])[16]");
	protected By createUser_HomePhoneRequired_Locator=By.xpath("(//span[@class='showError'][contains(.,'Required')])[4]");
	protected By createUser_EmailRequired_Locator=By.xpath("(//span[@class='showError'][contains(.,'Required')])[5]");
	protected By createUser_MobileRequired_Locator=By.xpath("(//span[@class='showError'][contains(.,'Required')])[6]");
	
	protected By createUser_FirstNameAsterisk_Locator=By.xpath("(//label[contains(.,'First Name*')])[1]");
	protected By createUser_FirstNameNumbersError_Locator=By.xpath("//span[contains(.,'Only alphabets are allowed')]");
	protected By createUser_LastNameAsterisk_Locator=By.xpath("//label[contains(@for,'lastName')]");
	protected By createUser_LastNameNumbersError_Locator=By.xpath("(//span[contains(.,'Only alphabets are allowed')])[2]");
	
	protected By selectRole_Admin_Locator=By.xpath("(//span[contains(.,'Admin')])[1]");
	protected By selectRole_CEO_Locator=By.xpath("//span[contains(.,'CEO')]");
    protected By selectRole_Guardian_Locator=By.xpath("//span[contains(.,'Guardian')]");
	protected By selectRole_Provider_Locator=By.xpath("//span[contains(.,'Provider')]");
	protected By selectRole_SuperAdmin_Locator=By.xpath("//span[contains(.,'SuperAdmin')]");
	protected By selectRole_Ok_Locator=By.xpath("//button[@class='common-used-button'][contains(.,'Ok')]");
	protected By selectRole_Close_Locator=By.xpath("(//span[contains(@class,'close-icon')])[3]");
	
	protected By createUser_SelectUserRoleError_Locator=By.xpath("(//div[contains(.,'Select atleast one role')])[16]");
	protected By selectRole_AdminCheckbox=By.xpath("(//input[contains(@type,'checkbox')])[1]");
	
	protected By createuser_HomephoneAsterisk_Locator=By.xpath("//label[contains(@for,'homePhone')]");
	
	
}
