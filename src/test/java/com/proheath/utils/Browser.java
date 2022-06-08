package com.proheath.utils;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;

public class Browser {
	
	public static WebDriver driver;
	
	public static WebDriver launchBrowser(String browsername)
	{
		if(browsername.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "E:\\eclipseworkspace\\ProHealth\\Drivers\\chromedriver.exe");
			driver=new ChromeDriver();
		}
		else if(browsername.equals("firefox"))
		{
			System.setProperty("webdriver.edge.driver", "E:\\chromedriver.exe");
		    driver=new EdgeDriver();
		}
		return driver;
	}
	public static void openApp(String url)
	{
		driver.get(url);
	}
	public static void closeBrowser()
	{
		driver.close();
	}
	public static void verifyOutput(String expectedURL)
	{
		String actualURL=driver.getCurrentUrl();
		boolean status=actualURL.contains(expectedURL);
		Assert.assertEquals(status, true , "\n\nExpected URL "+expectedURL+"\nBut Found Actual URL : "+actualURL+"\n\n");
	}

}
