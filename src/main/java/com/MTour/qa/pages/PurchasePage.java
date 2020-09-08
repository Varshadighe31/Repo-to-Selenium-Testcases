package com.MTour.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.MTour.qa.base.TestBase;

public class PurchasePage extends TestBase{

	// page factory
	
	@FindBy(name="inputName")
	WebElement Name;
		
	@FindBy(name="address")
	WebElement Address;
	
	@FindBy(name="city")
	WebElement City;
	
	@FindBy(name="state")
	WebElement State;
	
	@FindBy(name="zipCode")
	WebElement ZipCode;
	
	@FindBy(name="creditCardNumber")
	WebElement CreditCardNumber;
	
	@FindBy(name="creditCardMonth")
	WebElement CreditCardMonth;
	
	@FindBy(name="creditCardYear")
	WebElement CreditCardYear;
	
	@FindBy(name="nameOnCard")
	WebElement NameOnCard;
	
	
	@FindBy(xpath="//input[@type='submit']")
	WebElement PurchaseFlight;
	
	
	public PurchasePage()
	{
		// initialize page factory  elements

		PageFactory.initElements(driver, this);
	}
	
	//functions
	
	public String PurchasePageTitle()
	{ 
		return driver.getTitle();
	}
	
	
	public void PurchaseFlight(String Name1,String Address1,String City1,String State1,String ZipCode1,String CreditCardNumber1,String CreditCardMonth1,String CreditCardYear1,String NameOnCard1)
	{
		Name.sendKeys(Name1);
		Address.sendKeys(Address1);
		City.sendKeys(City1);
		State.sendKeys(State1);
		ZipCode.sendKeys(ZipCode1);
		CreditCardNumber.sendKeys(CreditCardNumber1);
		CreditCardMonth.sendKeys(CreditCardMonth1);
		CreditCardYear.sendKeys(CreditCardYear1);
		NameOnCard.sendKeys(NameOnCard1);
		PurchaseFlight.click();
		
	}
}
