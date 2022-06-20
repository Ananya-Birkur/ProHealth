package com.proheath.pages.functions;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.proheath.pages.locators.DomainValuesPageLocators;

public class DomainValuesPage extends DomainValuesPageLocators {
	
	private WebDriver driver;
	public DomainValuesPage(WebDriver driver)
	{
		this.driver=driver;
	}
	private void securitylist() throws Exception
	{
		 JavascriptExecutor js;
        List<WebElement> list=driver.findElements(securityscollbarlocator);
        int size=list.size();
        for(int i=1;i<=size;i++)
        { driver.findElement(By.xpath("//*[@id=\"main\"]/div[2]/div[2]/ul["+i+"]")).click();
        Thread.sleep(3000);		
       js=(JavascriptExecutor) driver;
       js.executeScript("window.scrollBy(0,50)", "");
       
       driver.findElement(superbillstatuslocator).click();
       Thread.sleep(3000);	
        }
       driver.findElement(addresstypelocator).click();
       js=(JavascriptExecutor) driver;
       js.executeScript("window.scrollBy(0,50)", "");
       
	}
	
	private void tclickonebyone() throws Exception
	{	
		driver.findElement(securitydomainclickonebyonelocator).click();
			List<WebElement> element=driver.findElements(securitydomainclickonebyonelocator);
			for (int i = 0; i <=element.size(); i++) {
				   JavascriptExecutor js=(JavascriptExecutor)driver;
				   js.executeScript("window.scrollBy(0,50)", "");
				 
			}
	}
	private void usecurityscrollbar() throws Exception
	{
		   WebElement examples_element=driver.findElement(securityscollbarlocator);
		   JavascriptExecutor js=(JavascriptExecutor)driver;
		   js.executeScript("window.scrollTo(0, 10000)", examples_element);
		   Thread.sleep(3000);
		   js.executeScript("window.scrollBy(0,-10000)", examples_element);
		   Thread.sleep(3000);
		   
	}
	
	    public void prohealthsecuritylist() throws Exception 
	    {
	    	this.securitylist();
	    	this.tclickonebyone();
	    	this.usecurityscrollbar();
	    }
	       
	       

	
}
