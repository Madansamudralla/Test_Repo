package com.Pizzahut.testCases;

import org.testng.annotations.Test;

import com.Pizzahut.pageObject.HomePage;
import com.Pizzahut.pageObject.SigninPage;

public class TC_LoginTest_001_Test extends BaseClass{
	
	@Test
    public void loginTest() throws InterruptedException {
		
		//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);		
			
		driver.get(baseURL);
		logger.info("URL is launched");
		HomePage homepage = new HomePage(driver);
		homepage.signinlink();
		SigninPage signin = new SigninPage(driver);
		signin.setUserName(username);
		signin.setPassword(password);
		signin.clicklogin();
		logger.info("User loged in successfully");
		
		 				
	}

}
