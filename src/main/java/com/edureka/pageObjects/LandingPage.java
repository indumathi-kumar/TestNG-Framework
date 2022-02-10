package com.edureka.pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.edureka.baseClass.BaseTestClass;

public class LandingPage extends BaseTestClass {
	
	@FindBy (xpath="//a[text()='Hotels']")
	@CacheLookup
	WebElement HotelLink;
	
	public LandingPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public String validateTitle()
	{
		return driver.getTitle();
	}
	
	public HotelPage clickOnHotelLink()
	{
		HotelLink.click();
		return new HotelPage();
	}
	

}
