package com.MTour.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.MTour.qa.base.TestBase;
import com.MTour.qa.pages.MainPage;
import com.MTour.qa.pages.ResevePage;

public class ResevePageTest extends TestBase{
	
	ResevePage ResevePage;
	MainPage MainPage;
	public ResevePageTest()
	{
		super();
	}
	
	@BeforeMethod
	public void setup()
	{
		initialization();
		MainPage= new MainPage();
		ResevePage =MainPage.ClickonSubmitButton(prop.getProperty("Dept_City"),prop.getProperty("Dest_City"));
		
				
	}
	
	@Test(priority=1)
	public void ResevePageTitleTest() throws InterruptedException
	{
		String title= ResevePage.ResevePageTitle();
		Assert.assertEquals("BlazeDemo - reserve", title);
	}
	
	@Test(priority=2)
	public void VerifyDepartsColNameText()// verify dept colm has value as departure city wch is selected by user
	{
		String deptname=ResevePage.DepartsColNameText();
		Assert.assertEquals(deptname, prop.getProperty("Dept_City"));
	}
	@Test(priority=3)
	public void VerifyArrivesColNameText()  // verify Arrives colm has value as destination city wch is selected by user
	{
		String deptname=ResevePage.ArrivesColNameText();
		Assert.assertEquals(deptname, prop.getProperty("Dest_City"));
	}
	@Test(priority=4)
	public void  ChooseFlightBtnTest()
	{
		ResevePage.ChooseFlight();
	}
	
	@AfterMethod
	public void teardown()
	{
		driver.close();
	}
}


