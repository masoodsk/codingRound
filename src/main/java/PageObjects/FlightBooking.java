package PageObjects;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import testBase.testBase;

public class FlightBooking extends testBase {

	public WebDriver driver;

	@FindBy(xpath = "//*[@id='OneWay']")
	private WebElement onewayTrip;

	@FindBy(xpath = "//*[@id='RoundTrip']")
	private WebElement RoundTripselection;

	@FindBy(xpath = "//*[@id='MultiCity']")
	private WebElement multiCitySelection;

	@FindBy(xpath = "//*[@id='FromTag']")
	private WebElement fromway;

	@FindBy(xpath = "//*[@id='ToTag']")
	private WebElement Toway;

	@FindBy(xpath = "//*[@id='ORtrip']/section[2]/div[1]/dl/dd/div/a/i")
	private WebElement clickoncalendar;

	@FindBy(xpath = "//*[@id='ui-datepicker-div']/div[1]/table/tbody/tr[4]")
	public List<WebElement> olist;

	public void oneWaySelection() {
		onewayTrip.click();

	}

	public void RoundWaySelection() {
		if (RoundTripselection.isDisplayed()) {
			System.out.println("RoundTrip is Display");
			RoundTripselection.click();
		}
	}

	public void MultiSelection() {
		multiCitySelection.click();

	}

	public void Journey(String fromwayinput, String towayinput) {

		fromway.sendKeys(fromwayinput);
		fromway.sendKeys(Keys.ENTER);
		Toway.sendKeys(towayinput);
		fromway.sendKeys(Keys.TAB);
	}

	public void fn_clickoncalendar() {
		clickoncalendar.click();

	}

	public void fn_selectdates(String inputdates) {

		for(WebElement selectdays : olist) {
				
			if(selectdays.getText().equals(olist)) {
				driver.findElement()
			}
		}
	}

	public FlightBooking(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		testBase objBase = new testBase();
	}
}
