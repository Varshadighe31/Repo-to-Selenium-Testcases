package com.MTour.qa.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.MTour.qa.base.TestBase;


public class MainPage extends TestBase{

	// page factory


	@FindBy(name="fromPort")
	WebElement DeptDrp;

	@FindBy(name="toPort")
	WebElement DestDrp;

	@FindBy(xpath="//input[@type='submit']")
	WebElement submit;


	public MainPage()
	{
		// initialize page factory  elements

		PageFactory.initElements(driver, this);
	}

	//functions
	
	public String BlazeDemoPageTitle()
	{ 
		return driver.getTitle();
	}
	

	public void  SelectDeptCity(String dept)
	{

		Select drpCountry1 = new Select(DeptDrp);

		drpCountry1.selectByVisibleText(dept);

	}

	public void  SelectDestCity(String dest)
	{

		Select drpCountry2 = new Select(DestDrp);

		drpCountry2.selectByVisibleText(dest);

	}

	public ResevePage ClickonSubmitButton(String dept ,String dest) 
	{		

		Select drpCountry1 = new Select(DeptDrp);

		drpCountry1.selectByVisibleText(dept);

		Select drpCountry2 = new Select(DestDrp);

		drpCountry2.selectByValue(dest);

		submit.click();
		return new ResevePage() ;
	}
}
