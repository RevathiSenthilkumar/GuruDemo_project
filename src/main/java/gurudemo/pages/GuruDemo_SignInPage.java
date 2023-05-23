package gurudemo.pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;

import com.aventstack.extentreports.ExtentTest;

import gurudemo.base.GuruDemo_BaseUI2;

public class GuruDemo_SignInPage extends GuruDemo_BaseUI2 {
	public GuruDemo_SignInPage(WebDriver driver, ExtentTest logger) {
		this.driver = driver;
		this.logger = logger;
	}

	By sigin = getLocator("signOn_xpath");
	By username_signin = getLocator("username_name");
	By password_signin = getLocator("password_xpath");
	By submit_signin = getLocator("//input[@name='submit']");

	public void username_signinEnabled() {

		isElementPresent(username_signin, Duration.ofSeconds(100));
	}

	public void password_signinEnabled() {

		isElementPresent(password_signin, Duration.ofSeconds(100));
	}

	public void submit_signinEnabled() {

		isElementPresent(submit_signin, Duration.ofSeconds(100));
	}

	public void enterfirstname(String name) {
		sendText(username_signin, name);

	}

	public void enterlastname(String last) {
		sendText(password_signin, last);
	}
	public void clickSignOn() {
		clickOn(sigin, Duration.ofSeconds(30));
	}

	public void clicksubmit_forSignOn() {
		clickOn(submit_signin, Duration.ofSeconds(30));
	}

	@AfterMethod
	public void tearDown() {

		driver.quit();
		;

	}

	@AfterClass
	public void tearDown1() {

		driver.quit();
		;

	}

}
