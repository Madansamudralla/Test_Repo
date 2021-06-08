package com.Pizzahut.testCases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.Pizzahut.pageObject.HomePage;

public class TC_LogoutTest_005 extends BaseClass {
	
	@Test
	public void logOut() throws Exception {
		HomePage homepage = new HomePage(driver);
		logger.info("Page redirected to Home page");
		      homepage.profileLink();
		      logger.info("User cliked on Profile link");
		      Thread.sleep(5000);
		     // homepage.logOutbtn();
		     // logger.info("USer clicked on logout button");
		     // Thread.sleep(5000);
	}

}
