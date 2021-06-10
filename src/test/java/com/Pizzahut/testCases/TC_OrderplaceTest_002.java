package com.Pizzahut.testCases;

import org.apache.logging.log4j.core.appender.rewrite.LoggerNameLevelRewritePolicy;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.Pizzahut.pageObject.HomePage;
import com.Pizzahut.pageObject.MenuPage;
import com.Pizzahut.pageObject.PlaceOrderPage;
import com.Pizzahut.pageObject.ThankyouPage;

public class TC_OrderplaceTest_002 extends BaseClass{
 
	@Test
	public void orderPlace() throws InterruptedException {
	HomePage homepage = new HomePage(driver);
	
	homepage.searchCitynArea();	
	homepage.citySelection();
	logger.info("User selected the City");
	homepage.areaSelection();
	homepage.findStore();
	logger.info("User selected the STORE");
	Thread.sleep(3000);
	MenuPage menupage = new MenuPage(driver);
	menupage.Cat_Pizza();
	Thread.sleep(3000);
	logger.info("User selected Pizza Category");
	menupage.addtoCart();
	logger.info("User added Pizza item in cart");
	menupage.btnCheckout();
	PlaceOrderPage placeorder = new PlaceOrderPage(driver);
	placeorder.remarks_order(remarks);
	placeorder.termsnConditions();		
	placeorder.placeOrderBtn();
	logger.info("Order placed successfully");
	ThankyouPage thankyoupage = new ThankyouPage(driver);
	thankyoupage.thanksorderext(); 
	logger.info("Thank you page verified");
	thankyoupage.orderid();	
	Thread.sleep(3000);
	logger.info("Order id is received");
	thankyoupage.logoPizzaBtn();
	Thread.sleep(5000);
	logger.info("Clicked on PizzaHit logo in thankyou page");
}
}
