package gurudemo.pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import gurudemo.base.GuruDemo_BaseUI2;

public class GuruDemo_HomePage extends GuruDemo_BaseUI2{
public static WebDriver driver;
		public static ExtentTest logger;

		public GuruDemo_HomePage(WebDriver driver,ExtentTest logger) {
			this.driver = driver;
			this.logger=logger;
		}

		By username = getLocator("username_xpath");
		By password = getLocator("password_xpath");
		By submit= getLocator("submit_xpath"); By home = getLocator("home_xpath");

		
		public void enterUsername(String user_name)   {
			sendText(username, user_name);
			
			//logger.log(Status.INFO,"username is entered in element locator");

		}

		public void enterPassword(String pass_Word) {
		
			sendText(password, pass_Word);
			//logger.log(Status.INFO,"password is entered in element");
		}

		public void clickPassword() {
			clickOn(password, Duration.ofSeconds(30));
		
		}
		public void clickSubmit() { clickOn(submit, Duration.ofSeconds(30)); }
		
}

		
	

