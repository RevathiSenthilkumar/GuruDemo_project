package gurudemo.base;

import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import gurudemo.utils.DateUtils;
import gurudemo.utils.FileIO;

public class GuruDemo_BaseUI2 {
	public static WebDriver driver;
	public static Properties prop;
	public static String browser_choice;
	public static String TimeStamp = DateUtils.getTimeStamp();
	public static String[][] testdata;
	public static ExtentReports extent;
	public static ExtentSparkReporter htmlReporter;
	public static ExtentTest logger;

	public GuruDemo_BaseUI2() {
		prop = FileIO.initProperties();
	}

	/************************************ invoke Browser *************/
	/***
	 * selecting the browser from browser choice
	 * @return
	 */
	public static WebDriver invokeBrowser() {
		browser_choice = prop.getProperty("browserName");
		try {
			if (browser_choice.equalsIgnoreCase("firefox")) {
				driver = Browsersetup2.getFirefoxdriver();
			} else if (browser_choice.equalsIgnoreCase("edge")) {
				driver = Browsersetup2.getEdgedriver();
			} else if (browser_choice.equalsIgnoreCase("chrome")) {
				driver = Browsersetup2.getChromedriver();
			} else {
				throw new Exception("Invalid browser name provided invalid file");
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return driver;
	}

	/************************ open url ********************/
	public static void openBrowser(String websiteUrlKey) {

		try {
			driver.get(prop.getProperty(websiteUrlKey));
		} catch (Exception e) {

			e.printStackTrace();
		}
	}
//*************************Get By locator using Key*****************************************

	public static By getLocator(String locatorKey) {
		if (locatorKey.endsWith("_id")) {
			return By.id(prop.getProperty(locatorKey));
		}
		if (locatorKey.endsWith("_name")) {
			return By.name(prop.getProperty(locatorKey));
		}
		if (locatorKey.endsWith("_classname")) {
			return By.className(prop.getProperty(locatorKey));
		}
		if (locatorKey.endsWith("_xpath")) {
			System.out.println(prop.getProperty(locatorKey));
			return By.xpath(prop.getProperty(locatorKey));
		}
		if (locatorKey.endsWith("_css")) {
			System.out.println(prop.getProperty(locatorKey));
			return By.cssSelector(prop.getProperty(locatorKey));
		}

		if (locatorKey.endsWith("_linkText")) {
			return By.linkText(prop.getProperty(locatorKey));

		}
		if (locatorKey.endsWith("_partialLinkText")) {
			return By.partialLinkText(prop.getProperty(locatorKey));
		}
		if (locatorKey.endsWith("_tagName")) {
			return By.tagName(prop.getProperty(locatorKey));
		}
		return null;

	}

	/************** Check if an element is present *************/

	/************** Check if an element is present *************/
	public static boolean isElementPresent(By locator, Duration timeout) {
		try {
			new WebDriverWait(driver, Duration.ofSeconds(300))
					.until(ExpectedConditions.presenceOfElementLocated(locator));
			return true;

		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;

	}

	/************** Send text to an element *************/
	public static void sendText(By locator, String text) {
		try {
			new WebDriverWait(driver, Duration.ofSeconds(600))
					.until(ExpectedConditions.presenceOfElementLocated(locator));

			driver.findElement(locator).sendKeys(text);

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	/************** dropdown *************/
	public static void dropdown(By locator, String option) {
		try {
			new WebDriverWait(driver, Duration.ofSeconds(1200))
					.until(ExpectedConditions.presenceOfElementLocated(locator));
			WebElement dropdown = driver.findElement(locator);
			Select s = new Select(dropdown);
			s.selectByVisibleText(option);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	/************** click *************/
	public static void clickOn(By locator, Duration timeout) {

		try {
			new WebDriverWait(driver, timeout).until(ExpectedConditions.elementToBeClickable(locator));
			driver.findElement(locator).click();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/************** return *************/
	public static void back(By locator, String option) {
		try {
			new WebDriverWait(driver, Duration.ofSeconds(50))
					.until(ExpectedConditions.presenceOfElementLocated(locator));
			WebElement datefield = driver.findElement(locator);
			datefield.sendKeys(option);
			datefield.sendKeys(Keys.RETURN);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
