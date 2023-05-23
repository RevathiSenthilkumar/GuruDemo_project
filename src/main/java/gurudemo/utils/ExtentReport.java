package gurudemo.utils;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import gurudemo.base.GuruDemo_BaseUI2;

public class ExtentReport {
	public static ExtentReports extent;
	public static ExtentSparkReporter htmlReporter;

	public static ExtentReports getReportIntance() {
		String reportName = "TestReport" + GuruDemo_BaseUI2.TimeStamp + ".html";
		htmlReporter = new ExtentSparkReporter(
				System.getProperty("user.dir") + "/CustomReports_GuruDemo/" + reportName);

		htmlReporter.config().setDocumentTitle("Automation Report");
		htmlReporter.config().setReportName("GuruDemo Report");
		htmlReporter.config().setTheme(Theme.DARK);
		extent = new ExtentReports();
		extent.attachReporter(htmlReporter);
		return extent;
	}

}
