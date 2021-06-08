package com.Pizzahut.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MenuPage {

	WebDriver ldriver;
	public MenuPage(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);			
	}
	
	@FindBy(id = "Pizza")
	WebElement Pizza;
	
	@FindBy(xpath = "//*[@id=\"pills-tabContent\"]/div/div/div/div[3]/div/div[2]/div/button")
	WebElement AddtoCart;
	
	@FindBy(name = "button")
	WebElement BtnCheckout;
	
	public void Cat_Pizza(){
		Pizza.click();
	}
	
	public void addtoCart() {
		AddtoCart.click();
	}
	
	public void btnCheckout() {
		BtnCheckout.click();
	}
	
}
