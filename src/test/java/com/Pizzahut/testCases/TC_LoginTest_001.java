package com.Pizzahut.testCases;



import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.Pizzahut.pageObject.HomePage;
import com.Pizzahut.pageObject.MenuPage;
import com.Pizzahut.pageObject.PlaceOrderPage;
import com.Pizzahut.pageObject.SigninPage;
import com.Pizzahut.pageObject.ThankyouPage;



public class TC_LoginTest_001 extends BaseClass{
	
	@Test
    public void loginTest() throws InterruptedException {
		
		//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);		
			
		driver.get(baseURL);
		logger.info("URL is launched successfully");
		HomePage homepage = new HomePage(driver);
		homepage.signinlink();
		SigninPage signin = new SigninPage(driver);
		signin.setUserName(username);
		signin.setPassword(password);
		signin.clicklogin();
		logger.info("User logged in successfully");
		
		 				
	}
}
