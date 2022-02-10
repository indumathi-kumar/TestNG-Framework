package com.edureka.testCases;

import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.edureka.baseClass.BaseTestClass;
import com.edureka.pageObjects.ConfirmationPage;
import com.edureka.pageObjects.HotelPage;
import com.edureka.pageObjects.LandingPage;
import com.edureka.pageObjects.PaymentsPage;
import com.edureka.pageObjects.SearchResultPage;
import com.edureka.utility.BaseUtility;

import junit.framework.Assert;

public class TC_GoibiboHotelBooking_001 extends BaseTestClass {
	
	public LandingPage lp;
	public HotelPage hp;
	public SearchResultPage sp;
	public PaymentsPage pp;
	public ConfirmationPage cp;
	
	public TC_GoibiboHotelBooking_001()
	{
		super();
	}
	
	@BeforeMethod
	public void setUp()
	{
		initializeBrowser();
		lp = new LandingPage();
		hp = new HotelPage();
		sp = new SearchResultPage();
		pp = new PaymentsPage();
		cp = new ConfirmationPage();
	}
	
	@Test(priority = 1)
	public void searchHotelName() throws InterruptedException
	{
		String LandingPageName = lp.validateTitle();
		Reporter.log(LandingPageName + " is displayed");

		Assert.assertEquals(BaseUtility.TITLE_OF_DASHBOARD_PAGE, LandingPageName);
		lp.clickOnHotelLink();
		String HotelPageName = hp.validateTitle();
		Reporter.log(HotelPageName + " is displayed");
	
		
		//Assert.assertEquals(BaseUtility.TITLE_OF_DASHBOARD_PAGE, HotelPageName);
		hp.countryRadioButton();
		hp.selectFromPlaceDropdown("Ooty");
		hp.SelectAdultCount();
		hp.SearchHotels();
		
		Reporter.log( hp.validateTitle() + " page is displayed");
		
		
		
	}
	
	@Test(priority = 2)
	public void BookARoom() throws InterruptedException {
		String LandingPageName = lp.validateTitle();
		Reporter.log(LandingPageName + " is displayed");

		Assert.assertEquals(BaseUtility.TITLE_OF_DASHBOARD_PAGE, LandingPageName);
		lp.clickOnHotelLink();
		String HotelPageName = hp.validateTitle();
		Reporter.log(HotelPageName + " is displayed");
	
		
		hp.countryRadioButton();
		hp.selectFromPlaceDropdown("Ooty");
		hp.SelectAdultCount();
		hp.SearchHotels();
		
		Reporter.log( hp.validateTitle() + " page is displayed");
		sp.Price();
		Reporter.log(sp.Price()+ " filter is selected");
		sp.PayatHotel();
		Reporter.log(sp.PayatHotel()+ " filter is selected");
		sp.Ratings();
		Reporter.log(sp.Ratings()+ " filter is selected");
		
		sp.HotelName();
		Reporter.log(sp.HotelName() + " Hotel is selected");
		
		sp.clickonHotelName();
		
		cp.SwitchWindow();
		Reporter.log( hp.validateTitle() + " page is displayed");
		
		cp.hotelname_Verify();
		
		Reporter.log(cp.hotelname_Verify() + " Hotel name displayed correctly");
		
		cp.HotelPolicies();
		Reporter.log(cp.HotelPolicies() + " menu option displayed correctly");
		cp.Amenities();
		Reporter.log(cp.Amenities() + " menu option displayed correctly");
		cp.GuestReviews();
		Reporter.log(cp.GuestReviews() + " menu option displayed correctly");
			
		cp.RoomOptions();
		Reporter.log(cp.RoomOptions() + " menu option displayed correctly");
		
		cp.Location();
		Reporter.log(cp.Location() + " menu option displayed correctly");
		
		cp.SelectRoom();
		Reporter.log( hp.validateTitle() + " page is displayed");
		
		pp.fillUserDetails("Test","Automation", "Test@gmail.com", "9876543210");
		pp.fillCardDetails("6500120205944539", "Test", "01/25", "654");
		//pp.fillAddress("123 New Street", "100011", "New Delhi", "New Delhi");
		pp.clickPayButton();
		Reporter.log( hp.validateTitle() + " page is displayed");
		
		pp.PaymentError();
		
		Reporter.log(pp.PaymentError() + " is error message displayed");
		
		
	
	}

	@Test(priority = 3)
	public void SelectHotelandVerifyHotelDetails() throws InterruptedException {
		String LandingPageName = lp.validateTitle();
		Reporter.log(LandingPageName + " is displayed");

		Assert.assertEquals(BaseUtility.TITLE_OF_DASHBOARD_PAGE, LandingPageName);
		lp.clickOnHotelLink();
		String HotelPageName = hp.validateTitle();
		Reporter.log(HotelPageName + " is displayed");
	
		
		hp.countryRadioButton();
		hp.selectFromPlaceDropdown("Ooty");
		hp.SelectAdultCount();
		hp.SearchHotels();
		
		Reporter.log( hp.validateTitle() + " page is displayed");
		
		sp.HotelName();
		Reporter.log(sp.HotelName() + " Hotel is selected");
		
		sp.clickonHotelName();
		
		cp.SwitchWindow();
		Reporter.log( hp.validateTitle() + " page is displayed");
		
		cp.hotelname_Verify();
		
		Reporter.log(cp.hotelname_Verify() + " Hotel name displayed correctly");
		
		cp.HotelPolicies();
		Reporter.log(cp.HotelPolicies() + " menu option displayed correctly");
		cp.Amenities();
		Reporter.log(cp.Amenities() + " menu option displayed correctly");
		cp.GuestReviews();
		Reporter.log(cp.GuestReviews() + " menu option displayed correctly");
			
		cp.RoomOptions();
		Reporter.log(cp.RoomOptions() + " menu option displayed correctly");
		
		cp.Location();
		Reporter.log(cp.Location() + " menu option displayed correctly");
		
		cp.SelectRoom();
		Reporter.log( hp.validateTitle() + " page is displayed");
		
		
	
	}
	
	@Test(priority = 4)
	public void SelectHotelBasedonFilterPreference() throws InterruptedException {
		String LandingPageName = lp.validateTitle();
		Reporter.log(LandingPageName + " is displayed");

		Assert.assertEquals(BaseUtility.TITLE_OF_DASHBOARD_PAGE, LandingPageName);
		lp.clickOnHotelLink();
		String HotelPageName = hp.validateTitle();
		Reporter.log(HotelPageName + " is displayed");
	
		
		//Assert.assertEquals(BaseUtility.TITLE_OF_DASHBOARD_PAGE, HotelPageName);
		hp.countryRadioButton();
		hp.selectFromPlaceDropdown("Ooty");
		hp.SelectAdultCount();
		hp.SearchHotels();
		
		Reporter.log( hp.validateTitle() + " page is displayed");
		sp.Price();
		Reporter.log(sp.Price()+ " filter is selected");
		sp.PayatHotel();
		Reporter.log(sp.PayatHotel()+ " filter is selected");
		sp.Ratings();
		Reporter.log(sp.Ratings()+ " filter is selected");
		
		sp.HotelName();
		Reporter.log(sp.HotelName() + " Hotel is selected");
		
		sp.clickonHotelName();
		
		cp.SwitchWindow();
		Reporter.log( hp.validateTitle() + " page is displayed");
		
		cp.hotelname_Verify();
		
		Reporter.log(cp.hotelname_Verify() + " Hotel name displayed correctly");
	
	
	}
	/*

	@Test(priority = 2)
	public void BookARoom() throws InterruptedException {
		String LandingPageName = lp.validateTitle();
		Reporter.log(LandingPageName + " is displayed");

		Assert.assertEquals(BaseUtility.TITLE_OF_DASHBOARD_PAGE, LandingPageName);
		lp.clickOnHotelLink();
		String HotelPageName = hp.validateTitle();
		Reporter.log(HotelPageName + " is displayed");
	
		
		//Assert.assertEquals(BaseUtility.TITLE_OF_DASHBOARD_PAGE, HotelPageName);
		hp.countryRadioButton();
		hp.selectFromPlaceDropdown("Ooty");
		hp.SelectAdultCount();
		hp.SearchHotels();
		
		Reporter.log( hp.validateTitle() + " page is displayed");
		sp.Price();
		Reporter.log(sp.Price()+ " filter is selected");
		sp.PayatHotel();
		Reporter.log(sp.PayatHotel()+ " filter is selected");
		sp.Ratings();
		Reporter.log(sp.Ratings()+ " filter is selected");
		
		sp.HotelName();
		Reporter.log(sp.HotelName() + " Hotel is selected");
		
		sp.clickonHotelName();
		
		cp.SwitchWindow();
		Reporter.log( hp.validateTitle() + " page is displayed");
		
		cp.hotelname_Verify();
		
		Reporter.log(cp.hotelname_Verify() + " Hotel name displayed correctly");
		
		cp.HotelPolicies();
		Reporter.log(cp.HotelPolicies() + " menu option displayed correctly");
		cp.Amenities();
		Reporter.log(cp.Amenities() + " menu option displayed correctly");
		cp.GuestReviews();
		Reporter.log(cp.GuestReviews() + " menu option displayed correctly");
			
		cp.RoomOptions();
		Reporter.log(cp.RoomOptions() + " menu option displayed correctly");
		
		cp.Location();
		Reporter.log(cp.Location() + " menu option displayed correctly");
		
		cp.SelectRoom();
		Reporter.log( hp.validateTitle() + " page is displayed");
		
		pp.fillUserDetails("Test","Automation", "Test@gmail.com", "9876543210");
		pp.fillCardDetails("5105105105105100", "Test", "01/25", "654");
		pp.fillAddress("123 New Street", "100011", "New Delhi", "New Delhi");
		pp.clickPayButton();
		Reporter.log( hp.validateTitle() + " page is displayed");
		
		pp.PaymentError();
		
		Reporter.log(pp.PaymentError() + " is error message displayed");
		
		
	
	}
	*/

	
	@AfterMethod
	public void testDown()
	{
		driver.quit();
	}
	
	

}
