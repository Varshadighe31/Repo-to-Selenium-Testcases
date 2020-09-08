package com.MTour.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.MTour.qa.base.TestBase;
import com.MTour.qa.pages.ResevePage;
import com.MTour.qa.pages.MainPage;



public class MainPageTest extends TestBase {
	
	MainPage MainPage;
	ResevePage ResevePage;
	public MainPageTest()
	{
		super();
	}
	
	@BeforeMethod
	public void setup()
	{
		initialization();
		 MainPage = new MainPage();
				
	}
	
	@Test(priority=1)
	public void LoginPageTitleTest() 
	{
		String title= MainPage.BlazeDemoPageTitle();
		Assert.assertEquals("BlazeDemo", title);
	}
	@Test(priority=2)
	
	public void SubmitTest()
	{
		ResevePage =MainPage.ClickonSubmitButton(prop.getProperty("Dept_City"),prop.getProperty("Dest_City"));
	}
	
	@AfterMethod
	public void teardown()
	{
		driver.close();
	}
}
