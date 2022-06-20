package com.proheath.pages.functions;

import java.util.List;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Reporter;
import com.proheath.pages.locators.AdjustmentCodeLocators;

public class AdjustmentCodePage extends AdjustmentCodeLocators {

	private WebDriver driver;
	public AdjustmentCodePage(WebDriver driver)
	{
		this.driver=driver;
	}
	private void clickAjustmentCode() throws Exception
	{
	  driver.findElement(adjustmentcodeloc).click();	
	}
	public void verifycolumnAdjustmentCode() throws InterruptedException
	{
		List<WebElement> allheaders=driver.findElements(adjustmentcodetableloc);
		
		System.out.println(allheaders.size());
		for (WebElement ele : allheaders) {
			String value=ele.getText();
			System.out.println(value);
			}
		
	}
	public void wverifyAdjustmentCodeName() throws Exception
	{
		List<WebElement> allheaders=driver.findElements(adjustmentcodenameloc);
		
		System.out.println(allheaders.size());
		for (WebElement ele : allheaders) {
			String value=ele.getText();
			System.out.println(value);
			}
		 //Thread.sleep(3000);
	}
	public void xverifyAdjustmentCodeCode() throws Exception
	{
		List<WebElement> allheaders=driver.findElements(adjustmentcodecodeloc);
		
		System.out.println(allheaders.size());
		for (WebElement ele : allheaders) {
			String value=ele.getText();
			System.out.println(value);
			}
		 //Thread.sleep(3000);
	}
	public void ytoggle() throws Exception
	{
		List<WebElement> allElements = driver.findElements(adjustmentcodetoggle);
	    int s = allElements.size();
        System.out.println("Toggle Button is Displayed");
        driver.findElement(adjustmentcodetoggle).click();
        Thread.sleep(3000);
        driver.findElement(togglestatuschange).click();
        System.out.println("Toggle Button is working");
        Thread.sleep(5000);
    }
	public void zeditbutton() throws Exception
	{
		driver.findElement(editbuttonlocator).click();
		Thread.sleep(3000);
		driver.findElement(editbuttoncloselocator).click();
		System.out.println("Edit button is Displayed");
	}
	

	public void proheathAdjustmentCode() throws Exception
	{
		Reporter.log("Table execution started");
		this.clickAjustmentCode();
		this.verifycolumnAdjustmentCode();
		this.wverifyAdjustmentCodeName();
		this.xverifyAdjustmentCodeCode();
		this.ytoggle();
		this.zeditbutton();
		Reporter.log("Table execution ends");
	}
	
}
