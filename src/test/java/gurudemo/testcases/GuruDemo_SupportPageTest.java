package gurudemo.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import gurudemo.base.GuruDemo_BaseUI2;
import gurudemo.pages.GuruDemo_FlightsPage;
import gurudemo.pages.GuruDemo_SupportPage;

public class GuruDemo_SupportPageTest extends GuruDemo_BaseUI2 {
	String[][] testdata;
	public WebDriver driver;

	@BeforeClass
	public void setUp() {

		driver = invokeBrowser();
		openBrowser("WebsitefURL");
	}

	@Test(priority = 1)

	public void SupportTest() {
		GuruDemo_SupportPage supportPage = new GuruDemo_SupportPage(driver, logger);
		supportPage.clicksupport();

		if (driver.getTitle().equalsIgnoreCase("Under Construction: Mercury Tours")) {
			Assert.assertTrue(true);
		} else {
			Assert.assertTrue(false);

		}

	}
	@AfterClass
	public void tearDown1() {

		driver.quit();;

	}
}
