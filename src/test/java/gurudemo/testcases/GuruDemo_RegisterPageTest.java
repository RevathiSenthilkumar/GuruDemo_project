package gurudemo.testcases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import gurudemo.base.GuruDemo_BaseUI2;
import gurudemo.pages.GuruDemo_FlightsPage;
import gurudemo.pages.GuruDemo_HomePage;
import gurudemo.pages.GuruDemo_RegisterPage;
import gurudemo.utils.FileIO;

public class GuruDemo_RegisterPageTest {
	public class GuruDemo_HomePageTest extends GuruDemo_BaseUI2 {
		String[][] testdata;
		// public static WebDriver driver;

		@BeforeMethod
		public void setUp() {
			driver = invokeBrowser();
			System.out.println("driver" + driver);
			openBrowser("WebsiteRURL");
		}

		@Test(priority =2)
		public void check_RegisterationStatus(){
			GuruDemo_RegisterPage registerpage = new GuruDemo_RegisterPage(driver, logger);
			//registerpage.registerEnabled();
			registerpage.firstnameEnabled();
			registerpage.lastnameEnabled();
			registerpage.phoneEnabled();
			registerpage.emailEnabled();
			registerpage.addressEnabled();
			registerpage.cityEnabled();
			registerpage.stateEnabled();
			registerpage.postalcodeEnabled();
			registerpage.countryEnabled();
			registerpage.username_registerEnabled();
			registerpage.password_registerEnabled();
			registerpage.confirmpassword_registerEnabled();
			registerpage.submit_registerEnabled();
			
		
			
			
			
		}

		@Test(priority = 1)

		public void RegistrationTest() {
			GuruDemo_RegisterPage registerpage = new GuruDemo_RegisterPage(driver, logger);

			registerpage.clickRegisteration();
			
			if(driver.getTitle().equalsIgnoreCase("Register: Mercury Tours")) {
				  Assert.assertTrue(true);
				  }else {  Assert.assertTrue(false);
				  
				  }
		}

		@DataProvider(name = "testdata")
		public Object[][] testdata() throws IOException {
			testdata = FileIO.datahandling("Sheet4");
			return testdata;

		}

		@Test( dataProvider = "testdata", dependsOnMethods = "check_RegisterationStatus")
		public void userPassWordTest(String name, String last, String phon_e, String cit_y, String emai_l, String addres_s,
				String stat_e, String post, String countr, String user_name, String pass_word, String rigpass_word) {

			GuruDemo_RegisterPage registerpage = new GuruDemo_RegisterPage(driver, logger);

			registerpage.enterfirstname(name);
			registerpage.enterlastname(last);
			registerpage.enterphone(phon_e);
			registerpage.enteremail(emai_l);
			registerpage.enteraddress(addres_s);
			registerpage.entercity(cit_y);
			registerpage.enterstate(stat_e);
			registerpage.enterpostalcode(post);
			registerpage.entercountry(countr);
			registerpage.enterusername_register(user_name);
			registerpage.enterpassword_register(pass_word);
			registerpage.enterconfirmpassword_register(rigpass_word);
			registerpage.clicksubmit();
		}

		@AfterMethod
		public void tearDown() {

			driver.quit();;

		}

		@AfterClass
		public void tearDown1() {

			driver.quit();;

		}

	}
}
