package com.proheath.pages.locators;

import org.openqa.selenium.By;

public class AdjustmentCodeLocators {

	protected By adjustmentcodeloc=By.xpath("//button[contains(.,'Adjustment Code')]");
	protected By adjustmentcodetableloc=By.xpath("//div[contains(@class,'table-display')]//thead//th");
	protected By adjustmentcodenameloc=By.xpath("//div[contains(@class,'table-display')]//tr//td[1]");
	protected By adjustmentcodecodeloc=By.xpath("//div[contains(@class,'table-display')]//tbody//tr//th");
	
	protected By adjustmentcodetoggle=By.xpath("//*[@id=\"main\"]/div[2]/div[3]/div[2]/table/tbody/tr[1]/td[2]/div");
    protected By togglestatuschange=By.xpath("(//span[contains(@class,'close-icon')])[2]");
    protected By superbillstatuslocator=By.xpath("(//span[contains(@class,'close-icon')])[2]");
    protected By editbuttonlocator=By.xpath("//path[contains(@fill,'currentColor')]");
    protected By editbuttoncloselocator=By.xpath("(//span[@class='close-icon'][contains(.,'×')])[2]");
}
