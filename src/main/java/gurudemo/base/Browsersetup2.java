package gurudemo.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;

public class Browsersetup2 {
	public static WebDriver driver;

	public static WebDriver getChromedriver() {
		 System.setProperty("webdriver.chrome.driver",
		 "C:\\Users\\revat\\JavaWorkspace\\GuruDemoFramework2\\Driver\\chromedriver.exe");
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remove-allow-origins=*");
		options.addArguments("--disable-notifications");
		//options.addArguments("--headless");

		driver = new ChromeDriver(options);

		driver.manage().window().maximize();

		return driver;

	}

	public static WebDriver getFirefoxdriver() {
		

		return null;
	}

	public static WebDriver getEdgedriver() {

		driver=new EdgeDriver();
		driver.manage().window().maximize();
		return driver;
	}

}
