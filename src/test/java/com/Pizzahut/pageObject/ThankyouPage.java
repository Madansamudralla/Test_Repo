package com.Pizzahut.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;




public class ThankyouPage {

	WebDriver ldriver;
	public ThankyouPage(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
		
	}
	
	@FindBy(xpath = "/html/body/app-root/div[2]/app-thankyou/div[2]/div/div/div/p")
	WebElement TxtThanks;
	
	@FindBy(xpath = "/html/body/app-root/div[2]/app-thankyou/div[2]/div/div/div/div/div[1]/div[1]/div/div[1]/span")
	WebElement Orderid;
	
	@FindBy(xpath = "/html/body/app-root/div[2]/app-thankyou/div[2]/div/div/div/div/ul/li[1]")
	WebElement BtnHome;
	
	@FindBy(xpath = "/html/body/app-root/div[2]/app-thankyou/div[1]/div/div/a[2]/img")
	WebElement BtnPizzalogo;
	
	public void thanksorderext() {
		String thankstext = TxtThanks.getText();
		String Actualtext = thankstext;
		String Expectedtext = "THANKS FOR YOUR ORDER, MADANS123";
		Assert.assertEquals(Actualtext, Expectedtext);
		System.out.println(thankstext);	
		
	
	}
	
	public void orderid() {
		String orderid = Orderid.getText();
		System.out.println(orderid);
		
	}
	
	public void homeBtn() {
		BtnHome.click();
	}
	
	public void logoPizzaBtn() {
    	BtnPizzalogo.click();
}
}
