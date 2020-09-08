package com.MTour.qa.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;





public class TestBase {
   public static WebDriver driver;
    public static Properties prop;
    
	 public TestBase()
	{
	try{
		// read properties
		prop = new Properties();
	
		 FileInputStream ip = new FileInputStream("D:\\1_Varsha Dighe\\DMR-Automation\\MTour\\src\\main\\java\\com\\MTour\\qa\\config\\config.properties");
		prop.load(ip);
	}
	catch(FileNotFoundException e){
		e.printStackTrace();
	}
	catch(IOException e)
	{
		e.printStackTrace();
	}
	}
	 // initialization
	 	 public static void initialization()
	 {
		 String browserName= prop.getProperty("Browser");
		 
		 if(browserName.equals("Chrome"))
		 {
			 System.setProperty("webdriver.chrome.driver", "C://Users//Varsha.dighe//Downloads//chromedriver_win32 (1)//chromedriver.exe");
				driver = new ChromeDriver();
		 }
		 // write for FF , IE 
		 
		 		
		// driver.manage().window().maximize();
		 driver.manage().deleteAllCookies();
		// driver.manage().timeouts().pageLoadTimeout(TestUtil.page_load_timeout, TimeUnit.SECONDS);
	//	 driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		 driver.get(prop.getProperty("Url"));
	 }
}


