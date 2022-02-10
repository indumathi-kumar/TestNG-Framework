package com.edureka.pageObjects;

import java.util.Set;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.edureka.baseClass.BaseTestClass;

public class ConfirmationPage extends BaseTestClass  {
	@FindBy (xpath="//h1[@itemprop='name']")
	@CacheLookup
	WebElement hotelname_Verify;
	
	@FindBy (xpath="//a[text()='Location']")
	@CacheLookup
	WebElement Location;
	
	@FindBy (xpath="(//button[text()='Select '])[1]")
	@CacheLookup
	WebElement SelectRoom;
	
	@FindBy (xpath="//a[text()='Hotel Policies']")
	@CacheLookup
	WebElement HotelPolicies;


	@FindBy (xpath="//a[text()='Guest Reviews']")
	@CacheLookup
	WebElement GuestReviews;
	
	@FindBy (xpath="//a[text()='Room Options']")
	@CacheLookup
	WebElement RoomOptions;
	
	@FindBy (xpath="//a[text()='Amenities']")
	@CacheLookup
	WebElement Amenities;
	
	public ConfirmationPage()
	{
		PageFactory.initElements(driver, this);
	}

	JavascriptExecutor je = (JavascriptExecutor)driver;

	public void SwitchWindow(){
        String ParentWindow = driver.getWindowHandle();
        Set<String> childWindow = driver.getWindowHandles();
        for(String c : childWindow){
            if(!c.equals(ParentWindow)){
                driver.switchTo().window(c);
                break;
            }
        }

	}
	
	public String Location() {
		String txt = Location.getText();
		je.executeScript("arguments[0].click();",Location);
		return  txt;   	
				    	
	}
	
	public void SelectRoom() {
		je.executeScript("arguments[0].click();",SelectRoom);			    	
	}
	
	public String Amenities() {
		String txt = Amenities.getText();
		je.executeScript("arguments[0].click();",Amenities);
		return  txt;   				    	
	}	
	
	public String RoomOptions() {
		String txt = RoomOptions.getText();
		je.executeScript("arguments[0].click();",RoomOptions);
		return  txt;   				    	
	}	
	
	public String HotelPolicies() {
		String txt = HotelPolicies.getText();
		je.executeScript("arguments[0].click();",HotelPolicies);
		return  txt;   				    	
	}	
	
	public String GuestReviews() {
		String txt = GuestReviews.getText();
		je.executeScript("arguments[0].click();",GuestReviews);
		return  txt;   				    	
	}	
	

	public String hotelname_Verify() throws InterruptedException
	
	{	
		Thread.sleep(2000);
		String hname = hotelname_Verify.getText();
		return hname;
			    	
	}
	
}

