package com.proheath.testscripts;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.proheath.pages.functions.AdjustmentCodePage;
import com.proheath.pages.functions.DashBoardPage;
import com.proheath.pages.functions.LoginPage;
import com.proheath.pages.functions.PostLoginPage;
import com.proheath.utils.Browser;
import com.proheath.utils.ReadData;

public class TC_002_AdjustmentCodeTable extends Browser {

	WebDriver driver;
	@BeforeClass
	public void setUp() throws Exception
	{
		String browsername=ReadData.getdata("browserdata", "browser1");
		String url=ReadData.getdata("browserdata", "url");
		driver=Browser.launchBrowser(browsername);
		Browser.openApp(url);
	}
	@AfterClass
	public void teardown()
	{
		//driver.close();
	}
	@Test(priority=1)
	public void logintest() throws Exception
	{
		  String browsername=ReadData.getdata("logindata", "username");
		  String url=ReadData.getdata("logindata", "password");
		  LoginPage log=new LoginPage(driver);
		  log.prohealthLogin(browsername, url);
		  Thread.sleep(5000);
    }
	@Test(priority=2)
	public void postlogin() throws Exception
	{
		PostLoginPage plp=new PostLoginPage(driver);
		plp.prohealthPostLoginPage();
		Thread.sleep(3000);
	}
	@Test(priority=3)
	public void dashBoard() throws Exception
	{
		DashBoardPage dbp=new DashBoardPage(driver);
		dbp.prohealthdashboardpage();
		Thread.sleep(3000);
	}
    @Test(priority=4)
	public void ajustmentcode() throws Exception
	{
    	
    	 AdjustmentCodePage acp=new  AdjustmentCodePage(driver);
    	 acp.proheathAdjustmentCode();
	}
   
	
}
