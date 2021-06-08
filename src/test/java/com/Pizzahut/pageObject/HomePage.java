package com.Pizzahut.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class HomePage {

	WebDriver ldriver;
	public HomePage(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
			
	}
	
	@FindBy(xpath = "/html/body/app-root/div[2]/app-home/app-header/div[2]/div/div[2]/div[4]/span/span[1]")
	WebElement Signin;
	
	@FindBy(xpath = "/html/body/app-root/div[2]/app-home/app-header/div[2]/div/div[2]/div[4]/span/span[3]")
	WebElement Register;
	
	@FindBy(id = "specificTimeId")
	WebElement CitynAreaSearch;
	
	@FindBy(id = "inputGroupSelect01")
	WebElement CitySelection;
	
	@FindBy(id = "pro_3")
	WebElement Cityid;
	
	@FindBy(xpath = "//*[@id=\"stre-customDate\"]/form/div[2]/input")
	WebElement AreaSelection;
	
	@FindBy(id = "suburb_AIRPORT")
	WebElement Areaid;
	
	@FindBy(xpath = "//*[@id=\"stre-customDate\"]/form/button")
	WebElement Findstore;
	
	@FindBy(xpath = "//*[@id=\"dropdownMenuLink\"]/span")
	WebElement Profilelink;
	
	@FindBy(xpath = "/html/body/app-root/div[2]/app-home/app-header/div[2]/div/div[2]/div[4]/div/div/a[3]")
	WebElement BtnLogout;
	
	
		
	public void signinlink() {
		Signin.click();
	}
	
	public void registerlink() {
		Register.click();
	}
	
	public void searchCitynArea() {
		CitynAreaSearch.click();
	}
	
	public void citySelection() {
		CitySelection.sendKeys("MUSCAT");
		CitySelection.click();
		Cityid.click();		
		}
	
	public void areaSelection() {
		AreaSelection.sendKeys("AIRPORT");
		Areaid.click();
	}
	
	public void findStore() {
		Findstore.click();
			}
	
    public void profileLink() {
	    Profilelink.click();
}
    
    public void logOutbtn() {
    	BtnLogout.click();
    	
    }
    
        
}
