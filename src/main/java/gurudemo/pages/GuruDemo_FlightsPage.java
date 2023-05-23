package gurudemo.pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.aventstack.extentreports.ExtentTest;

import gurudemo.base.GuruDemo_BaseUI2;

public class GuruDemo_FlightsPage extends GuruDemo_BaseUI2 {
	public GuruDemo_FlightsPage(WebDriver driver, ExtentTest logger) {
		this.driver = driver;
		this.logger = logger;
	}

	By flights = getLocator("flights_xpath");
	By flightadd = getLocator("flightadd_xpath");
	By add = getLocator("add_xpath");
	By roundtrip = getLocator("roundtrip_css");
	By oneway = getLocator("OneWay_css");
	By passengers = getLocator("passenger_xpath");
	By departingfrom = getLocator("DepaturingFrom_xpath");
	By onmonth = getLocator("OnMonth_xpath");
	By ondate = getLocator("OnDate_xpath");
	By arrivingon = getLocator("ArrivingOn_css");
	By returningmonth = getLocator("ReturningMonth_css");
	By returningday = getLocator("ReturningDate_xpath");
	By economyclass = getLocator("EconomicClass_xpath");
	By bussinessclass = getLocator("BusinessClass_xpath");
	By firstclass = getLocator("FirstClass_xpath");
	By airline = getLocator("airlineUnifiedAirlines_xpath");
	By continuebt = getLocator("continue_xpath");

	public void clickFlights() {
		clickOn(flights, Duration.ofSeconds(30));
	}

	public void flightsEnabled() {
		isElementPresent(flights, Duration.ofSeconds(30));

	}

	public void flightsroundtripEnabled() {
		
		isElementPresent(roundtrip, Duration.ofSeconds(30));
	}

	public void flightspassengersEnabled() {
		
		isElementPresent(passengers, Duration.ofSeconds(30));

	}

	public void flightsonewayEnabled() {
		
		isElementPresent(oneway, Duration.ofSeconds(30));
	}

	public void flightsdepartingfromEnabled() {
		
		isElementPresent(departingfrom, Duration.ofSeconds(30));
	}

	public void flightsonmonthEnabled() {
		
		isElementPresent(onmonth, Duration.ofSeconds(30));
	}

	public void flightsondateEnabled() {
		
		isElementPresent(ondate, Duration.ofSeconds(30));
	}

	public void flightsarrivingonEnabled() {

		isElementPresent(arrivingon, Duration.ofSeconds(30));
	}

	public void flightsreturningmonthEnabled() {

		isElementPresent(returningmonth, Duration.ofSeconds(30));
	}

	public void flightsreturningdayEnabled() {

		isElementPresent(returningday, Duration.ofSeconds(30));
	}

	public void flightseconomyclassEnabled() {

		isElementPresent(economyclass, Duration.ofSeconds(30));
	}

	public void flightsbussinessclassEnabled() {

		isElementPresent(bussinessclass, Duration.ofSeconds(30));
	}

	public void flightsfirstclassEnabled() {

		isElementPresent(firstclass, Duration.ofSeconds(30));
	}

	public void flightsairlineEnabled() {

		isElementPresent(airline, Duration.ofSeconds(30));
	}

	public void clickflightaddClose() {
		clickOn(flightadd, Duration.ofSeconds(30));

	}

	public void clickRoundTrip() {
		clickOn(roundtrip, Duration.ofSeconds(30));
	}

	public void clickOneWay() {
		clickOn(oneway, Duration.ofSeconds(30));
	}

	public void clickcEconomyClass() {
		clickOn(economyclass, Duration.ofSeconds(30));
	}

	public void clickBussinessClass() {
		clickOn(bussinessclass, Duration.ofSeconds(30));
	}

	public void clickFirstClass() {
		clickOn(firstclass, Duration.ofSeconds(30));
	}

	public void clickcontinuebt() {
		clickOn(continuebt, Duration.ofSeconds(30));
	}

	public void clickpassengersDropDown() {

		clickOn(passengers, Duration.ofSeconds(30));
	}

	public void clickdepartingfromDropDown() {

		clickOn(departingfrom, Duration.ofSeconds(30));
	}

	public void clickonmonthDropDown() {

		clickOn(onmonth, Duration.ofSeconds(30));
	}

	public void clickondateDropDown() {

		clickOn(ondate, Duration.ofSeconds(30));
	}

	public void clickarrivingDropDown() {

		clickOn(arrivingon, Duration.ofSeconds(30));
	}

	public void clickreturning_monthDropDown() {

		clickOn(returningmonth, Duration.ofSeconds(30));
	}

	public void clickairlineDropDown() {

		clickOn(airline, Duration.ofSeconds(30));
	}

	public void clickreturning_dayDropDown() {

		clickOn(returningday, Duration.ofSeconds(30));
	}

	public void passengersDropDown(String passengeroption) {
		dropdown(passengers, passengeroption);

	}

	public void departingfromDropDown(String departingfromoption) {
		dropdown(departingfrom, departingfromoption);

	}

	public void onmonthDropDown(String onmonthoption) {
		dropdown(onmonth, onmonthoption);

	}

	public void ondateDropDown(String ondateoption) {
		dropdown(ondate, ondateoption);

	}

	public void arrivingDropDown(String arriving) {
		dropdown(arrivingon, arriving);

	}

	public void returning_monthDropDown(String returning_monthoption) {
		dropdown(returningmonth, returning_monthoption);

	}

	public void airlineDropDown(String airlineoption) {
		dropdown(airline, airlineoption);

	}

	public void returning_dayDropDown(String returning_dayoption) {
		dropdown(returningday, returning_dayoption);

	}

	public void DropDown(String option) {
		dropdown(passengers, option);

	}

	public void enter(String option) {
		dropdown(passengers, option);

	}

}
