package com.Pizzahut.testCases;


import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import com.Pizzahut.utilities.ReadConfig;


public class BaseClass {
	
	ReadConfig readconfig = new ReadConfig();
	
	/*
	 * public String baseURL= "https://ph-oman-qa.suntechsolutions.us/";
	 * 
	 * public String username = "smadan8292@gmail.com";
	 * 
	 * public String password = "Stic@123";
	 * 
	 * public String remarks = "Test Order by Suntech -  Do not process the order";
	 */
	 
	  public String baseURL= readconfig.getApplicationURL();
	  
	  public String username = readconfig.getUserName();
	  
	  public String password = readconfig.getPassword();
	  
	  public String remarks = readconfig.getRemarks();
	
	
	public static WebDriver driver;
	
	public static Logger logger;
	
	  @Parameters("browser")
	  @BeforeClass
	  public void setup(String br) {
		  
	//System.setProperty("WebDriver.chrome.driver", "C:\\Users\\Madan Samudralla\\eclipse-workspace\\PizzaHut_web\\Drivers\\chromedriver.exe");
		  logger = Logger.getLogger("PizzaHut");
		  PropertyConfigurator.configure("Log4j.properties");
		  
				  	 			
			  if (br.equals("chrome")) { 
				  
				System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"//Drivers//chromedriver.exe"); 
			  driver = new ChromeDriver(); }
			  
			  else if(br.equals("firefox")) { 
				System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+"//Drivers//chromedriver.exe"); driver = new
			  FirefoxDriver(); } else if(br.equals("ie")) {
				  
			  System.setProperty("webdriver.ie.driver", System.getProperty("user.dir")+"//Drivers//chromedriver.exe"); driver = new
			  InternetExplorerDriver(); }
			 
		  
		 // System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"//Drivers//chromedriver.exe");
			 // driver = new  ChromeDriver();  
			  driver.manage().window().maximize();
			  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	  	  	  
	  }
	    		
		  @AfterClass
		  public void terminate() { 
			  driver.quit(); 
			  }
		 
	 
	
	
}
