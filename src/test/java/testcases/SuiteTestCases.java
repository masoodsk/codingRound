package testcases;

import org.testng.annotations.Test;

import PageObjects.FlightBooking;
import PageObjects.SignIn;
import testBase.testBase;
import utility.WaitForduration;

public class SuiteTestCases extends testBase {

	public SuiteTestCases() {
		super();
	}

	SignIn loginPage;
	FlightBooking objFlight;

	@Test(priority = 1)
	public void testLoginToApplication() {
		loginPage = new SignIn(driver);
		loginPage.fn_ClickonYourTrips();
		WaitForduration.Waitfor(1000);
		loginPage.fn_signbutton();
		loginPage.fn_Close();
		WaitForduration.Waitfor(1000);
		loginPage.fn_flighClick();
	}

	@Test(priority = 2)

	public void oneWayFlightBook() {

		objFlight = new FlightBooking(driver);
		objFlight.oneWaySelection();
		objFlight.Journey("Banglore", "Hyderabad");
		objFlight.fn_clickoncalendar();
	}

}
