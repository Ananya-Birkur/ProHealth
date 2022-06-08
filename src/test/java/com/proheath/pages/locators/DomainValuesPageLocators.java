package com.proheath.pages.locators;

import org.openqa.selenium.By;

public class DomainValuesPageLocators {
	
	protected By securitydomainvalueslocator=By.xpath("/html/body/div/div[4]/div[2]/div[2]/div[2]/div[2]/ul");
    protected By securitydomainclickonebyonelocator=By.xpath("//*[@id=\"main\"]/div[2]/div[2]/ul");
    protected By securityscollbarlocator=By.xpath("//div[@class='left'][contains(.,'Address TypeAdjustment CodeAdjustment Remark CodeAdjustment TypeAppointment SourceAppointment StatusAppointment TypeBusiness Unit TypeClaim StatusCountryDocument TypeDurationEnthnicityGenderHospitalHospital ServicesICD TypeIdentifier TypeInsurance TypeMarital StatusPatient TypePayer PreferencePayer TypePayment MethodPayment SourcePayment TypePOSQualifierRaceRelationshipReminder FrequencyReminder PreferenceRoleRoomSalutationSmoking StatusSmoking FrequencySmoking UnitsStateSuperbill StatusTransaction TypeUser TypeWeek')]");
    protected By weeklocator=By.xpath("//button[contains(.,'Week')]");
    protected By superbillstatuslocator=By.xpath("(//span[contains(@class,'close-icon')])[2]");
    protected By addresstypelocator=By.xpath("//button[contains(.,'Address Type')]");
}
