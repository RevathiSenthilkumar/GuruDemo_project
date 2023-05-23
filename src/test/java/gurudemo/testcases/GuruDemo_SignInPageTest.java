package gurudemo.testcases;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import gurudemo.base.GuruDemo_BaseUI2;
import gurudemo.pages.GuruDemo_FlightsPage;
import gurudemo.pages.GuruDemo_HomePage;
import gurudemo.pages.GuruDemo_RegisterPage;
import gurudemo.pages.GuruDemo_SignInPage;
import gurudemo.utils.FileIO;

public class GuruDemo_SignInPageTest extends GuruDemo_BaseUI2 {
	String[][] testdata;
	public WebDriver driver;

	@BeforeClass
	public void setUp() {

		driver = invokeBrowser();
		openBrowser("WebsiteURL");
	}

	@Test(priority = 1)
	public void check_SignInStatus() {
		GuruDemo_SignInPage signin = new GuruDemo_SignInPage(driver, logger);
		signin.username_signinEnabled();
		signin.password_signinEnabled();
		signin.submit_signinEnabled();
	}

	@Test(priority = 1)

	public void SinginTest() {
		GuruDemo_SignInPage signin = new GuruDemo_SignInPage(driver, logger);

		signin.clickSignOn();
		System.out.println(driver.getTitle());
		if (driver.getTitle().equalsIgnoreCase("Sign-on: Mercury Tours")) {
			Assert.assertTrue(true);
		} else {
			Assert.assertTrue(false);

		}

	}

	@DataProvider(name = "testdata")
	public Object[][] testdata() throws IOException {
		testdata = FileIO.datahandling("Sheet1");
		return testdata;

	}

	@Test(priority = 1, dataProvider = "testdata")
	public void userPassWordTest(String firstname, String lastname) {

		GuruDemo_SignInPage signin = new GuruDemo_SignInPage(driver, logger);
		signin.enterfirstname(firstname);
		signin.enterlastname(lastname);
		signin.clicksubmit_forSignOn();

		driver.quit();
	}
	@AfterClass
	public void tearDown1() {

		driver.quit();;

	}

}