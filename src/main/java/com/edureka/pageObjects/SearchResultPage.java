package com.edureka.pageObjects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.edureka.baseClass.BaseTestClass;

public class SearchResultPage extends BaseTestClass {
	@FindBy (xpath="//span[text()='Pay At Hotel Available']")
	@CacheLookup
	WebElement PayatHotel;
	
	@FindBy (xpath="//span[text()='4.5']")
	@CacheLookup
	WebElement Ratings;
	
	@FindBy (xpath="//span[text()='₹2001 - ₹4000']")
	@CacheLookup
	WebElement Price;
	
	@FindBy (xpath="(//h4[@itemprop=\"name\"])[1]")
	@CacheLookup
	WebElement hotelname;
	
	JavascriptExecutor je = (JavascriptExecutor)driver;

	public SearchResultPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public String validateTitle()
	{
		return driver.getTitle();
	}

	public String PayatHotel()
	{	
		String txt = PayatHotel.getText();
		je.executeScript("arguments[0].click();",PayatHotel);
		return  txt;   	
	}
	
	public String Ratings()
	{	
		String txt = Ratings.getText();
		je.executeScript("arguments[0].click();",Ratings);
		return  txt;  	    	
	}
	
	public String Price()
	{	
		String txt = Price.getText();
		je.executeScript("arguments[0].click();",Price);
		return  txt;  	    	
	}
	
	public void clickonHotelName()
	{	
	
		je.executeScript("arguments[0].click();",hotelname);
			    	
	}
	
	public String HotelName() throws InterruptedException
	{	
        Thread.sleep(2000);

		String hname = hotelname.getText();
		return hname;
			    	
	}
	

}
