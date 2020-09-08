package com.MTour.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.MTour.qa.base.TestBase;

public class ResevePage extends TestBase{
	
	// page factory


	@FindBy(xpath="//th[contains(text(),'Departs')]")
	WebElement Deptcolmtext;
	
	@FindBy(xpath="//th[contains(text(),'Arrives')]")
	WebElement Arrivescolmtext;
	
	@FindBy(xpath="//tbody/tr[2]/td[1]/input")
	WebElement chooseflightbtn;
	
		
	
	public ResevePage()
	{
		// initialize page factory  elements

		PageFactory.initElements(driver, this);
	}

	//functions
	
	
	public String ResevePageTitle()
	{ 
		return driver.getTitle();
	}
	
	public String DepartsColNameText()
	{ 
		String value1=Deptcolmtext.getText();
		System.out.println(value1);
		String text[]=value1.split(":");
		return text[1].replace(" ", "");
		
	}
	
	public String ArrivesColNameText()
	{ 
		String value1=Arrivescolmtext.getText();
		System.out.println(value1);
		String text[]=value1.split(":");
		return text[1].replace(" ", "");
		
	}
	
	public PurchasePage ChooseFlight()
	{
		chooseflightbtn.click();
		return new PurchasePage();
	}


}
