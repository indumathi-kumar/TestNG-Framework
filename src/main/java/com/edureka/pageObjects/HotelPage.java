package com.edureka.pageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.edureka.baseClass.BaseTestClass;

public class HotelPage extends BaseTestClass{

	@FindBy (xpath="//h4[text()='India']")
	@CacheLookup
	WebElement countryRadioButton;
	
	@FindBy (xpath="//input[@id='downshift-1-input']")
	@CacheLookup
	WebElement PlaceInputBox;
	
	@FindBy (xpath="//ul[@id='downshift-1-menu']//li")
	@CacheLookup
	List<WebElement> dropdown;
	
	
	@FindBy (xpath="//input[@value='2 Guests in 1 Room ']")
	@CacheLookup
	WebElement Room;
	
	@FindBy (xpath="//span[text()='Adults']/following-sibling::div//span[text()='-']")
	@CacheLookup
	WebElement AdultCount;
	
	@FindBy (xpath="//button[text()='Done']")
	@CacheLookup
	WebElement Done;
	
	@FindBy (xpath="//button[@data-testid='searchHotelBtn']")
	@CacheLookup
	WebElement SearchHotels;
	
    JavascriptExecutor je = (JavascriptExecutor)driver;

	
	public HotelPage()
	{
		PageFactory.initElements(driver, this);
	}

	public String validateTitle()
	{
		return driver.getTitle();
	}

	public HotelPage countryRadioButton()
	{
		je.executeScript("arguments[0].click();",countryRadioButton);
        
		//countryRadioButton.click();
		return new HotelPage();
	}
	  /** To Wait Until Element to be Visible */
    public static void explicitWaitvisibilityOfElementLocated(By element, long timeInSeconds) {
        WebDriverWait elementToBeVisible = new WebDriverWait(driver, timeInSeconds);
        elementToBeVisible.until(ExpectedConditions.visibilityOfElementLocated(element));
    }

	
	
	
	public void selectFromPlaceDropdown(String Place) throws InterruptedException {
		PlaceInputBox.sendKeys(Place);
		Thread.sleep(5000);
		List<WebElement> place = dropdown;
		for (WebElement p : place){
            System.out.println(p.getText());
            if(p.getText().contains(Place)){
                p.click();
                break;
            }
        }
	}
	
	public void SelectAdultCount()
	{
		
		je.executeScript("arguments[0].click();",Room);
		je.executeScript("arguments[0].click();",AdultCount);
		je.executeScript("arguments[0].click();",Done);
	    	
	}
	
	public void SearchHotels()
	{
		
		je.executeScript("arguments[0].click();",SearchHotels);
	    	
	}
	
	
	
	
	
}
