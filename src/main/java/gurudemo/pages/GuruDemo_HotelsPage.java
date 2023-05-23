package gurudemo.pages;

import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.ExtentTest;

import gurudemo.base.GuruDemo_BaseUI2;

public class GuruDemo_HotelsPage extends GuruDemo_BaseUI2{
	public GuruDemo_HotelsPage(WebDriver driver, ExtentTest logger) {
		this.driver = driver;
		this.logger = logger;
	}
	
}
