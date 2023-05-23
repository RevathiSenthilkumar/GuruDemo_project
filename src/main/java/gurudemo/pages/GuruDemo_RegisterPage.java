package gurudemo.pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.ExtentTest;

import gurudemo.base.GuruDemo_BaseUI2;

public class GuruDemo_RegisterPage extends GuruDemo_BaseUI2{
	public GuruDemo_RegisterPage(WebDriver driver, ExtentTest logger) {
		this.driver = driver;
		this.logger = logger;
	}

	By firstname = getLocator("FirstName_name");
	By lastname = getLocator("LastName_name");
	By phone = getLocator("Phone_name");
	By email = getLocator("Email_name");
	By address = getLocator("Address_name");
	By city = getLocator("City_name");
	By state = getLocator("State_name");
	By postalcode = getLocator("PostalCode_name");
	By country = getLocator("Country_xpath");
	By register = getLocator("registeration_xpath");
	By username_register = getLocator("UserName_Register_xpath");
	By password_register = getLocator("PassWord_Register_xpath");
	By confirmpassword_register = getLocator("ConfirmPassword_Register_xpath");
	By submit_register = getLocator("submit_Register_xpath");
	public void registerEnabled() {
		isElementPresent(register, Duration.ofSeconds(30));

	}

	public void firstnameEnabled() {
		
		isElementPresent(firstname, Duration.ofSeconds(100));
	}

	public void lastnameEnabled() {
	
		isElementPresent(lastname, Duration.ofSeconds(100));

	}

	public void phoneEnabled() {
		isElementPresent(phone, Duration.ofSeconds(100));

	}

	public void emailEnabled() {
		
		isElementPresent(email, Duration.ofSeconds(100));
	}

	public void addressEnabled() {
		
		isElementPresent(address, Duration.ofSeconds(100));
	}

	public void cityEnabled() {
		
		isElementPresent(city, Duration.ofSeconds(100));
	}

	public void stateEnabled() {

		isElementPresent(state, Duration.ofSeconds(100));
	}

	public void postalcodeEnabled() {

		isElementPresent(postalcode, Duration.ofSeconds(100));
	}

	public void countryEnabled() {

		isElementPresent(country, Duration.ofSeconds(100));
	}
	public void username_registerEnabled() {

		isElementPresent(username_register, Duration.ofSeconds(100));
	}

	public void password_registerEnabled() {

		isElementPresent(password_register, Duration.ofSeconds(100));
	}
	public void confirmpassword_registerEnabled() {

		isElementPresent(confirmpassword_register, Duration.ofSeconds(100));
	}
	public void submit_registerEnabled() {

		isElementPresent(submit_register, Duration.ofSeconds(100));
	}

	public void enterfirstname(String name) {
		sendText(firstname, name);

	}

	public void enterlastname(String last) {
		sendText(lastname, last);
	}
	public void enterphone(String phonenum) {
		sendText(phone, phonenum);

	}

	public void enteremail(String emailaddress) {
		sendText(email, emailaddress);
	}
	public void enteraddress(String user_name) {
		sendText(address, user_name);

	}
	public void entercity(String user_name) {
		sendText(city, user_name);

	}
	public void enterstate(String user_name) {
		sendText(state, user_name);

	}
	
	public void enterpostalcode(String postalcode1) {
		sendText(postalcode, postalcode1);

	}
	public void entercountry(String country1) {
		sendText(country, country1);

	}
	public void enterusername_register(String regist) {
		sendText(username_register, regist);

	}

	public void enterpassword_register(String pass_word) {
		sendText(password_register, pass_word);
	}
	public void enterconfirmpassword_register(String confi) {
		sendText(confirmpassword_register, confi);

	}
	public void clickRegisteration() {
		clickOn(register, Duration.ofSeconds(30));
	}
	public void clicksubmit() {
		clickOn(submit_register, Duration.ofSeconds(30));
	}
	
	
	
	
	
	
	
}
