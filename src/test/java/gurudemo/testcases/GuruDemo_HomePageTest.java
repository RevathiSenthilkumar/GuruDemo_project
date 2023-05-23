package gurudemo.testcases;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import gurudemo.base.GuruDemo_BaseUI2;
import gurudemo.pages.GuruDemo_HomePage;
import gurudemo.utils.FileIO;

public class GuruDemo_HomePageTest extends GuruDemo_BaseUI2 {
	String[][] testdata;
public static WebDriver driver;

	@BeforeClass
	public void setUp() {
		driver = invokeBrowser();
		System.out.println("driver" + driver);
		openBrowser("WebsiteURL");
	}

	@DataProvider(name = "testdata") 
	public Object[][] testdata() {
		testdata = FileIO.datahandling("Sheet5");
		return testdata;

	}

	@Test(priority = 1, dataProvider = "testdata")
	public void userPassWordTest(String user_name, String pass_word) {

		GuruDemo_HomePage homepage = new GuruDemo_HomePage(driver, logger);
		
		homepage.enterUsername(user_name);

		homepage.enterPassword(pass_word);
		
		homepage.clickSubmit();
		 

	}
	
	
	
@Test
public void varify(){
	if (driver.getTitle().equalsIgnoreCase("Welcome: Mercury Tours")) {
		Assert.assertTrue(true);
	} else {
		Assert.assertTrue(false);

	}

}


	@AfterClass
	public void tearDown() {

		//driver.quit();
		

	}
	
	

	@AfterClass
	public void tearDown1() {

		driver.quit();
		

	}

}
