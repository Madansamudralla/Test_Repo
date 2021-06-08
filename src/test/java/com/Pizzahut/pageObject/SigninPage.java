package com.Pizzahut.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SigninPage {
	
	WebDriver ldriver;
	public SigninPage(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
		
	}
	
 @FindBy(id = "email-id")
 WebElement txtEmailorphnum;
 
 @FindBy(xpath = "//*[@id=\"pwrd\"]")
 WebElement txtPassword;
 
 @FindBy(xpath = "/html/body/app-root/div[2]/app-login/div/div[3]/div/div/div/div/div[2]/div/form/div[5]/div/button")
 WebElement btnLogin;
 
 public void setUserName(String uname) {
	 txtEmailorphnum.sendKeys(uname);
 }
 
 public void setPassword(String password) {
	 txtPassword.sendKeys(password);
	 
 }
 
 public void clicklogin() {
	 btnLogin.click();
 }
}

