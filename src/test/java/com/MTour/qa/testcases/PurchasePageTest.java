package com.MTour.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.MTour.qa.base.TestBase;
import com.MTour.qa.pages.ConfirmationPage;
import com.MTour.qa.pages.MainPage;
import com.MTour.qa.pages.PurchasePage;
import com.MTour.qa.pages.ResevePage;
import com.MTour.qa.util.TestUtil;

public class PurchasePageTest extends TestBase{

	
	MainPage MainPage;
	ResevePage ResevePage;
	PurchasePage PurchasePage;
	
	public PurchasePageTest()
	{
		super();
	}
	
	@BeforeMethod
	public void setup()
	{
		initialization();
		MainPage= new MainPage();
		ResevePage =MainPage.ClickonSubmitButton(prop.getProperty("Dept_City"),prop.getProperty("Dest_City"));
		PurchasePage=ResevePage.ChooseFlight();
	}
	
	@DataProvider(name = "getMTourTestData")
	public Object[][] getTestData(){
		Object MtourData[][] = TestUtil.getTestData("MTourTestData");
		return MtourData;
	}
	
	@Test(priority=1)
	public void PurchasePageTitleTest() 
	{
		String title= PurchasePage.PurchasePageTitle();
		Assert.assertEquals("BlazeDemo Purchase", title);
	}
	
	@Test(priority=2,dataProvider="getMTourTestData")
	public ConfirmationPage PurchaseFlightTest(String Name,String Address,String City,String State,String ZipCode,String CreditCardNumber,String CreditCardMonth,String CreditCardYear,String NameOnCard)
	{
		PurchasePage.PurchaseFlight(Name,Address,City,State,ZipCode,CreditCardNumber,CreditCardMonth,CreditCardYear,NameOnCard);
		return new ConfirmationPage();
	}
	
	@AfterMethod
	public void teardown()
	{
		driver.close();
	}
}
