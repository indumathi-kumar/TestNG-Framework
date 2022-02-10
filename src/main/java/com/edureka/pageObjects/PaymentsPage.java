package com.edureka.pageObjects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.edureka.baseClass.BaseTestClass;

public class PaymentsPage extends BaseTestClass {
	@FindBy (xpath="//input[@placeholder='Enter First Name']")
	@CacheLookup
	WebElement FirstName;

	@FindBy (xpath="//input[@placeholder='Enter Last Name']")
	@CacheLookup
	WebElement LastName;

	@FindBy (xpath="//input[@placeholder='Enter Email Address']")
	@CacheLookup
	WebElement EmailAddress;

	@FindBy (xpath="//input[@placeholder='Enter Phone Number']")
	@CacheLookup
	WebElement PhoneNumber;

	@FindBy (xpath="//span[text()='Proceed To Payment Options']")
	@CacheLookup
	WebElement PaymentOption;
	
	@FindBy (xpath="//input[@name='cardnumber']")
	@CacheLookup
	WebElement CardNumber;
	
	@FindBy (xpath="//input[@name='ccname']")
	@CacheLookup
	WebElement CardName;
	
	@FindBy (xpath="//input[@name='cardExpiry']")
	@CacheLookup
	WebElement CardExpiry;
	
	@FindBy (xpath="(//input[@name='cardCVV'])[1]")
	@CacheLookup
	WebElement CardCVV;
	

	@FindBy (xpath="//p[text()='Address Line']/following-sibling::input")
	@CacheLookup
	WebElement AddressLine;
	
	@FindBy (xpath="//p[text()='Zip Code']/following-sibling::input")
	@CacheLookup
	WebElement ZipCode;
	
	@FindBy (xpath="//p[text()='City']/following-sibling::input")
	@CacheLookup
	WebElement City;
	
	@FindBy (xpath="//p[text()='State']/following-sibling::input")
	@CacheLookup
	WebElement State;
	

	@FindBy (xpath="(//button[@class='button green large citipatBtn btn payNowBtn'])[1]")
	@CacheLookup
	WebElement Paynow;
	
	@FindBy (xpath="//span[@class='grey lh1-5 ico14']")
	@CacheLookup
	WebElement PaymentError;
	
	
	
	JavascriptExecutor je = (JavascriptExecutor)driver;

	
	public PaymentsPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public String validateTitle()
	{
		return driver.getTitle();
	}
	
	public void fillUserDetails(String firstName,String lastName,String emailAddress, String phoneNumber){
		FirstName.sendKeys(firstName);
		LastName.sendKeys(lastName);
		EmailAddress.sendKeys(emailAddress);
		PhoneNumber.sendKeys(phoneNumber);
		PaymentOption.click();
	}
	
	public void fillCardDetails(String cardnumber, String ccname, String cardExpiry, String cvv) {
		CardNumber.sendKeys(cardnumber);
		CardName.sendKeys(ccname);
		CardExpiry.sendKeys(cardExpiry);
		CardCVV.sendKeys(cvv);
	}

	public void fillAddress(String addressLine, String zipCode, String city, String state) {
		AddressLine.sendKeys(addressLine);
		ZipCode.sendKeys(zipCode);
		City.sendKeys(city);
		State.sendKeys(state);
	}
	
	public void clickPayButton() {
		Paynow.click();	
	}
	
	public String PaymentError() {
		
		return PaymentError.getText();	
	}
	
}
