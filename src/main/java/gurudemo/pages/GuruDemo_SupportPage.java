package gurudemo.pages;

import java.io.File;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.ExtentTest;

import gurudemo.base.GuruDemo_BaseUI2;

public class GuruDemo_SupportPage  extends GuruDemo_BaseUI2{
	public GuruDemo_SupportPage(WebDriver driver, ExtentTest logger) {
		this.driver = driver;
		this.logger = logger;
	}
	By support = getLocator("support_xpath");
	By password = getLocator("password_css");

	public void clicksupport() {
		clickOn(support, Duration.ofSeconds(30));
	}
}