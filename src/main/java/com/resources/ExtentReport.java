package com.resources;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class ExtentReport {

	WebDriver driver;

	@Test
	public void facebook() throws IOException {
		ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter(
				"C:\\Users\\hi\\eclipse-workspace\\KalaiVaniV\\AirCanadaProject\\target\\extent.html");
		ExtentReports extent = new ExtentReports();
		extent.attachReporter(htmlReporter);
		ExtentTest test = extent.createTest("Verify home page title", "Checking the title");
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\hi\\eclipse-workspace\\KalaiVaniV\\AirCanadaProject\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		test.log(Status.INFO, "Chrome Launched Successfully");
		driver.get("https://www.facebook.com/");
		test.log(Status.INFO, "URL Launched Successfully");
		test.pass("details",
				MediaEntityBuilder.createScreenCaptureFromPath("G:\\Kalai_Selenium\\Core java\\image.png").build());
		test.addScreenCaptureFromPath("G:\\Kalai_Selenium\\Core java\\image.png");
		extent.flush();
	}
}
