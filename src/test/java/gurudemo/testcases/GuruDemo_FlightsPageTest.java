package gurudemo.testcases;

import static org.junit.Assert.assertTrue;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import gurudemo.base.GuruDemo_BaseUI2;
import gurudemo.pages.GuruDemo_FlightsPage;
import gurudemo.pages.GuruDemo_HomePage;
import gurudemo.pages.GuruDemo_RegisterPage;
import gurudemo.utils.FileIO;


public class GuruDemo_FlightsPageTest extends GuruDemo_BaseUI2{
	String[][] testdata;
	public WebDriver driver;

	@BeforeClass
	public void setUp() {

		driver = invokeBrowser();
		openBrowser("WebsitefURL");
	}
	@Test(priority = 1)

	public void FlightTest() {
		GuruDemo_FlightsPage flightsPage = new GuruDemo_FlightsPage(driver, logger);


		flightsPage.clickFlights();
		System.out.println(driver.getTitle());
		
		if(driver.getTitle().equalsIgnoreCase("Find a Flight: Mercury Tours:")) {
			  Assert.assertTrue(true);
			  }else {  Assert.assertTrue(false);
			  
			  }
	}

	@Test(priority = 2)
	public void check_flightStatus(){
		GuruDemo_FlightsPage flightsPage = new GuruDemo_FlightsPage(driver, logger);
		flightsPage.flightsEnabled();
		flightsPage.flightsonewayEnabled();
		flightsPage.flightspassengersEnabled();
		flightsPage.flightsdepartingfromEnabled();
		flightsPage.flightsonmonthEnabled();
		flightsPage.flightsondateEnabled();
		flightsPage.flightsarrivingonEnabled();
		flightsPage.flightsreturningmonthEnabled();
		flightsPage.flightsreturningdayEnabled();
		flightsPage.flightsbussinessclassEnabled();
		flightsPage.flightsairlineEnabled();
		
		
		
	}

	@Test(priority = 3)
	public void flights() {

		GuruDemo_FlightsPage flightsPage = new GuruDemo_FlightsPage(driver, logger);
		flightsPage.clickFlights();
		
		
		flightsPage.clickOneWay();
		
		flightsPage.clickpassengersDropDown();
		flightsPage.clickdepartingfromDropDown();
		flightsPage.clickdepartingfromDropDown();
		flightsPage.clickondateDropDown();
		flightsPage.clickarrivingDropDown();
		flightsPage.clickreturning_monthDropDown();
		flightsPage.clickreturning_dayDropDown();
		
		flightsPage.clickBussinessClass();
		
		flightsPage.clickairlineDropDown();
		
		flightsPage.clickcontinuebt();
		
	}
	
	

	@AfterTest
	public void tearDown() {

		driver.close();

	}

}
