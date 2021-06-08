package com.Pizzahut.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PlaceOrderPage {

	WebDriver ldriver;
	public PlaceOrderPage(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);			
	}
	
	@FindBy(id = "remarks")
	WebElement Remarks;
	
	
	
	@FindBy(id = "pay_Cash")
	WebElement Cashpay;
	
	@FindBy(id = "kp-lgin")
	WebElement TermsnConditions;
	
	@FindBy(xpath = "//*[@id=\"placeorderbtn\"]")
	WebElement BtnPlaceorder;
	
	
	public void remarks_order(String remarks) {
		Remarks.sendKeys(remarks);
	}
	
	public void cashpayment() {
		Cashpay.click();
	}
	
	public void termsnConditions() {
		TermsnConditions.click();
	}
	
	public void placeOrderBtn() {
		BtnPlaceorder.click();
	}
	    
}
