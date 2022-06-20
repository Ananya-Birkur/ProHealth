package com.proheath.pages.functions;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.proheath.pages.locators.UsersPageLocators;

public class UsersPage extends UsersPageLocators {
	
	private WebDriver driver;
	public UsersPage(WebDriver driver)
	{
		this.driver=driver;
	}
    public void a_usersadd() throws Exception
    {
    	boolean display=driver.findElement(users_AddButton_Locator).isDisplayed();
    	System.out.println("Add Button is Displayed at Top Right Corner of Users View page " + display);
    	Thread.sleep(3000);
    }
    public void b_Clickadd()
    {
    	WebElement clickadd=driver.findElement(users_AddButton_Locator);
    	Actions action=new Actions(driver);
    	action.moveToElement(clickadd).click().perform();
    	//driver.findElement(users_AddButton_Locator).click()
    	boolean display=driver.findElement(users_AddButton_Locator).isDisplayed();
    	System.out.println("Add Button is Displayed.."+display);
    }
    public void c_AddPopup()
    {
    	boolean displaydetails=driver.findElement(createUser_PopupDetails_Locator).isDisplayed();
    	System.out.println("Details is Displayed.."+displaydetails);
    	boolean displayworkhours=driver.findElement(createUser_PopupWorkHours_Locator).isDisplayed();
    	System.out.println("WorkHours is Disabled"+displayworkhours);
    	boolean uploadPic=driver.findElement(createUser_UploadPicture_Locator).isDisplayed();
    	System.out.println("Upload Picture is Displayed.."+uploadPic);
    	boolean takeSelfie=driver.findElement(createUser_TakeSelfie_Locator).isDisplayed();
    	System.out.println("Take Selfie is Displayed.."+takeSelfie);
    	boolean firstname=driver.findElement(createUser_FirstName_Locator).isDisplayed();
    	System.out.println("First Name is Displayed.."+firstname);
    	boolean middlename=driver.findElement(createUser_MiddleName_Locator).isDisplayed();
    	System.out.println("Middle Name is Displayed.."+middlename);
    	boolean lastname=driver.findElement(createUser_LastName_Locator).isDisplayed();
    	System.out.println("Last Name is Displayed.. "+lastname);
    	boolean selectuserrole=driver.findElement(createUser_SelectUserRole_Locator).isDisplayed();
    	System.out.println("Select User Role is Displayed.."+selectuserrole);
     }
     public void d_PersonalInfo()
     {
    	boolean firstname=driver.findElement(createUser_FirstName_Locator).isDisplayed();
     	System.out.println("First Name is Displayed.."+firstname);
     	boolean middlename=driver.findElement(createUser_MiddleName_Locator).isDisplayed();
     	System.out.println("Middle Name is Displayed.."+middlename);
     	boolean lastname=driver.findElement(createUser_LastName_Locator).isDisplayed();
     	System.out.println("Last Name is Displayed.. "+lastname);
     	boolean selectuserrole=driver.findElement(createUser_SelectUserRole_Locator).isDisplayed();
     	System.out.println("Select User Role is Displayed.."+selectuserrole);
     
      }
    public void e_ContactInfo() throws Exception
    {
    	boolean homePhone=driver.findElement(createuser_HomePhone_Locator).isDisplayed();
    	System.out.println("HomePhone is Displayed.."+homePhone);
    	boolean workPhone=driver.findElement(createUser_WorkPhone_Locator).isDisplayed();
    	System.out.println("WorkPhone is Displayed.."+workPhone);
    	boolean fax=driver.findElement(createUser_Fax_Locator).isDisplayed();
    	System.out.println("Fax is Displayed.."+fax);
    	boolean email=driver.findElement(createUser_Email_Locator).isDisplayed();
    	System.out.println("Email is Displayed.."+email);
    	boolean mobile=driver.findElement(createUser_Mobile_Locator).isDisplayed();
    	System.out.println("Mobile is Displayed.."+mobile);
    	boolean save=driver.findElement(createUser_Save_Locator).isDisplayed();
    	System.out.println("Save is Displayed.."+save);
    	boolean saveAndClose=driver.findElement(createUser_SaveandClose).isDisplayed();
    	System.out.println("Save and Close is Displayed.."+saveAndClose);
    	boolean close=driver.findElement(createUser_Close).isDisplayed();
    	System.out.println("Close is Displayed.."+close);
    
    }
    
    public void f_VerifySaveButton() throws Exception
    {
    	
    	driver.findElement(createUser_MiddleName_Locator).sendKeys("hdbcimsmcm");
    	driver.findElement(createUser_WorkPhone_Locator).sendKeys("8562452233");
    	driver.findElement(createUser_Fax_Locator).sendKeys("8955234152");
    	driver.findElement(createUser_Save_Locator).click();
    	boolean firstnamedd=driver.findElement(createUser_FirstNameDropDown_Locator).isDisplayed();
     	System.out.println("First Name DropDown is Displayed.."+firstnamedd);
    	boolean firstname=driver.findElement(createUser_FirstNameRequired_Locator).isDisplayed();
     	System.out.println("First Name is Displayed along with Red Color Border.."+firstname);
     	boolean lastname=driver.findElement(createUser_LastNameRequired_Locator).isDisplayed();
     	System.out.println("Last Name is Displayed along with Red Color Border.."+lastname);
     	boolean selectuserrole=driver.findElement(createUser_SelectUserRoleRequired_Locator).isDisplayed();
     	System.out.println("Select User Role is Displayed along with Red Color Border.."+selectuserrole);
     	boolean homephone=driver.findElement(createUser_HomePhoneRequired_Locator).isDisplayed();
     	System.out.println("Home Phone is Displayed along with Red Color Border.."+homephone);
     	boolean email=driver.findElement(createUser_EmailRequired_Locator).isDisplayed();
     	System.out.println("Email is Displayed along with Red Color Border.."+email);
     	boolean mobile=driver.findElement(createUser_MobileRequired_Locator).isDisplayed();
     	System.out.println("Mobile is Displayed along with Red Color Border.."+mobile);
     	Thread.sleep(5000);
     	JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,50)", "");
     	WebElement save_element=driver.findElement(createUser_Save_Locator);
    	save_element.sendKeys(Keys.ENTER);
    	Thread.sleep(3000);
        driver.findElement(createUser_Close).click();
        Thread.sleep(3000);
      }
      public void g_VerifyMistressDropDown() throws Exception
      {
    	WebElement clickadd=driver.findElement(users_AddButton_Locator);
    	Actions action=new Actions(driver);
    	action.moveToElement(clickadd).click().perform();
    	Thread.sleep(3000);
    	Select mrsdd=new Select(driver.findElement(createUser_FirstNameDropDown_Locator));
    	mrsdd.selectByVisibleText("Mrs");
    	Thread.sleep(3000);
    	mrsdd.selectByVisibleText("Mr");
    	Thread.sleep(3000);
    	mrsdd.selectByVisibleText("Miss");
    	Thread.sleep(3000);
   
       }
       public void h_VerifyInputsFieldsFirstName() throws Exception
       {
    	  driver.findElement(createUser_FirstName_Locator).sendKeys("aefthnuhjn");
    	  boolean firstnameAsterisk=driver.findElement(createUser_FirstNameAsterisk_Locator).isDisplayed();
    	  System.out.println("First Name Asterisk is Present and Not Marked with red Asterisk.."+firstnameAsterisk);
    	  Thread.sleep(3000);
      	  driver.findElement(createUser_FirstName_Locator).sendKeys("jhnbhujjgf");
      	  System.out.println("First Name accepts Alphabets..");
      	  Thread.sleep(3000);
      	  driver.findElement(createUser_FirstName_Locator).clear();
      	  
      	  driver.findElement(createUser_FirstName_Locator).sendKeys("5896442632");
      	  boolean firstnamenumbers=driver.findElement(createUser_FirstNameNumbersError_Locator).isDisplayed();
      	  System.out.println("Only Alphabets are Allowed.."+firstnamenumbers);
      	  Thread.sleep(3000);
      	  driver.findElement(createUser_FirstName_Locator).clear();
      	  
      	  driver.findElement(createUser_FirstName_Locator).sendKeys("!@#$%^&*((");
       	  boolean firstnameSpclCh=driver.findElement(createUser_FirstNameNumbersError_Locator).isDisplayed();
     	  System.out.println("Only Alphabets are Allowed.."+firstnameSpclCh);
      	  Thread.sleep(3000);
     	  driver.findElement(createUser_FirstName_Locator).clear();
     	  
     	  driver.findElement(createUser_FirstName_Locator).sendKeys("     ");
     	  boolean firstnameSpace=driver.findElement(createUser_FirstNameNumbersError_Locator).isDisplayed();
    	  System.out.println("Only Alphabets are Allowed.."+firstnameSpace);
     	  Thread.sleep(3000);
    	  driver.findElement(createUser_FirstName_Locator).clear();
    	  
    	  driver.findElement(createUser_FirstName_Locator).sendKeys("yhjgfc56442");
     	  boolean firstnameAlphaNum=driver.findElement(createUser_FirstNameNumbersError_Locator).isDisplayed();
    	  System.out.println("Only Alphabets are Allowed.."+firstnameAlphaNum);
     	  Thread.sleep(3000);
    	  driver.findElement(createUser_FirstName_Locator).clear(); 
   
    }
       public void i_VerifyInputFieldsLastNameUserRole() throws Exception
       {
    	  driver.findElement(createUser_LastName_Locator).sendKeys("gyhukmnvds");
    	  System.out.println("User is able to Enter Text");
    	  driver.findElement(createUser_LastName_Locator).clear();
    	  
    	  boolean lastnameAsterisk=driver.findElement(createUser_LastNameAsterisk_Locator).isDisplayed();
    	  System.out.println("Asterisk for last Name is Display and Its without Red mark.."+lastnameAsterisk);
    	  Thread.sleep(3000);
    	  driver.findElement(createUser_LastName_Locator).sendKeys("yhjgfchdnd");
      	/*  boolean lastnameAlpha=driver.findElement(createUser_LastNameNumbersError_Locator).isDisplayed();
     	  System.out.println("Only Alphabets are Allowed.."+lastnameAlpha);
      	  Thread.sleep(3000);
     	  driver.findElement(createUser_LastName_Locator).clear();
     	  Thread.sleep(3000);*/
     	  
    /* 	  driver.findElement(createUser_LastName_Locator).sendKeys("8596456442");
     	  boolean lastnameNum=driver.findElement(createUser_LastNameNumbersError_Locator).isDisplayed();
    	  System.out.println("Only Alphabets are Allowed.."+lastnameNum);
     	  Thread.sleep(3000);
    	  driver.findElement(createUser_LastName_Locator).clear(); 
    	  
    	  driver.findElement(createUser_LastName_Locator).sendKeys("!@#$%^&*()_+");
      	  boolean lastnameSpclCh=driver.findElement(createUser_LastNameNumbersError_Locator).isDisplayed();
     	  System.out.println("Only Alphabets are Allowed.."+lastnameSpclCh);
      	  Thread.sleep(3000);
     	  driver.findElement(createUser_LastName_Locator).clear();
     	 
       	  driver.findElement(createUser_LastName_Locator).sendKeys("       ");
     	  boolean lastnameSpace=driver.findElement(createUser_LastNameNumbersError_Locator).isDisplayed();
    	  System.out.println("Only Alphabets are Allowed.."+lastnameSpace);
     	  Thread.sleep(3000);
    	  driver.findElement(createUser_LastName_Locator).clear();
    	 
    	  driver.findElement(createUser_LastName_Locator).sendKeys("yhjgfc56442");
      	  boolean lastnameAlphaNum=driver.findElement(createUser_LastNameNumbersError_Locator).isDisplayed();
     	  System.out.println("Only Alphabets are Allowed.."+lastnameAlphaNum);
     	  driver.findElement(createUser_LastName_Locator).clear();
     	  Thread.sleep(3000); */
     	  
     	  WebElement selectuser=driver.findElement(createUser_SelectUserRoleRequired_Locator);
     	  Actions action=new Actions((WebDriver) selectuser);
    	  action.moveToElement(selectuser).click().perform();
         
          boolean selectuserrole=driver.findElement(createUser_SelectUserRole_Locator).isDisplayed();
          System.out.println("Select User Role is Displayed and Enabled.."+selectuserrole);
           
          driver.findElement(createUser_SelectUserRoleRequired_Locator).click();
          Thread.sleep(3000);
          boolean selectroleAdmin=driver.findElement(selectRole_Admin_Locator).isDisplayed();
          System.out.println("Admin is Displayed in Select Role.."+selectroleAdmin);
          
          boolean selectroleCEO=driver.findElement(selectRole_CEO_Locator).isDisplayed();
          System.out.println("CEO is Displayed in Select Role.."+selectroleCEO);
          
          boolean selectroleGuardian=driver.findElement(selectRole_Guardian_Locator).isDisplayed();
          System.out.println("Guardian is Displayed in Select Role.."+selectroleGuardian);
          
          boolean selectroleProvider=driver.findElement(selectRole_Provider_Locator).isDisplayed();
          System.out.println("Provider is Displayed in Select Role.."+selectroleProvider);
          
          boolean selectroleSuperAdmin=driver.findElement(selectRole_SuperAdmin_Locator).isDisplayed();
          System.out.println("SuperAdmin is Displayed in Select Role.."+selectroleSuperAdmin);
          
          boolean selectroleOk=driver.findElement(selectRole_Ok_Locator).isDisplayed();
          System.out.println("Ok is Displayed in Select Role.."+selectroleOk);
         
          boolean selectroleClose=driver.findElement(selectRole_Close_Locator).isDisplayed();
          System.out.println("Close is Displayed right side top right corner in Select Role.."+selectroleClose);
          
          driver.findElement(selectRole_Close_Locator).click();
          Thread.sleep(3000);
          
          driver.findElement(createUser_SelectUserRoleRequired_Locator).click();
          Thread.sleep(3000);
          
          driver.findElement(selectRole_Ok_Locator).click();
          Thread.sleep(3000);
          
          boolean selectUserRoleError=driver.findElement(createUser_SelectUserRoleError_Locator).isDisplayed();
          System.out.println("Select Atleast One role"+selectUserRoleError);
          
          driver.findElement(createUser_SelectUserRole_Locator).click();
          driver.findElement(selectRole_AdminCheckbox).click();
          driver.findElement(selectRole_Ok_Locator).click();
          
       }   
          
      public void j_verifyFieldsInputHomePhone()
      {
    	  driver.findElement(createuser_HomePhone_Locator).click();
    	  System.out.println("User is able to Enter Data in HomePhone Field");
    	  
          boolean homephoneAsterisks=driver.findElement(createuser_HomephoneAsterisk_Locator).isDisplayed();
          System.out.println("Mandatory fiels with Black Asterisk"+homephoneAsterisks);
          
          driver.findElement(createuser_HomePhone_Locator).sendKeys("8596231478");
          System.out.println("Numbers are Allowed");
          
          driver.findElement(createuser_HomePhone_Locator).sendKeys("asedf njjhh");
          System.out.println("Alphabets Characters are not Allowed..");
          
          driver.findElement(createuser_HomePhone_Locator).sendKeys("@#$%^&*()");
          System.out.println("Special Characters are not Allowed..");
          
          driver.findElement(createuser_HomePhone_Locator).click();
          System.out.println("User can Enter text in HomePhone");
          
          driver.findElement(createuser_HomePhone_Locator).sendKeys("1452368755");
          System.out.println("Allows");
          
         
         
          
      }
     	 
     	  
     
      
    
    
    
    public void proHealthuserpage() throws Exception
    {
    	this.a_usersadd();
    	this.b_Clickadd();
    	this.c_AddPopup();
    	this.d_PersonalInfo();
    	this.e_ContactInfo();
    	this.f_VerifySaveButton();
    	this.g_VerifyMistressDropDown();
    	this.h_VerifyInputsFieldsFirstName();
    	this.i_VerifyInputFieldsLastNameUserRole();
    	this.j_verifyFieldsInputHomePhone();
    	
    }
    
    		
    
}
