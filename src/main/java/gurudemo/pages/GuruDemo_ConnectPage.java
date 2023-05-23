package gurudemo.pages;

import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.ExtentTest;

import gurudemo.base.GuruDemo_BaseUI2;

public class GuruDemo_ConnectPage extends GuruDemo_BaseUI2{
	public GuruDemo_ConnectPage(WebDriver driver, ExtentTest logger) {
		this.driver = driver;
		this.logger = logger;
	}
}