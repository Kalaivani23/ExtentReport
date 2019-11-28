package com.stepDefinition;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.resources.BaseClass;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class FacebookStep extends BaseClass {

	@Given("^to launch facebook application$")
	public void to_launch_facebook_application() throws IOException {
		extentReportSetPath();
		extentReportCreateTest("Home Page");
		launchChromeBrowser("https://www.facebook.com/");
		extentReportINFO();
	}

	@Given("^verify url and title$")
	public void verify_url_and_title() throws IOException {
		if (driver.getCurrentUrl().contains("facebook")) {
			extentReportPASS();
		} else {
			extentReportFAIL();
		}
		if (driver.getTitle().contains("facebook")) {
			extentReportPASS();
		} else {
			extentReportFAIL();
		}

	}

	@When("^enter username and password$")
	public void enter_username_and_password() throws IOException {
		WebElement e = driver.findElement(By.id("email"));
		WebElement p = driver.findElement(By.id("pass"));
		e.sendKeys("Kalaivani");
		p.sendKeys("KV");
		if (e.getAttribute("value").equals("KalaiVani")) {
			extentReportPASS();
		} else {
			extentReportFAIL();
		}
		if (p.getAttribute("value").equals("KV")) {
			extentReportPASS();
		} else {
			extentReportFAIL();
		}
	}

	@When("^click loginbutton$")
	public void click_loginbutton() {
		extentReportCreateTest("Login Page");
		WebElement b = driver.findElement(By.id("loginbutton"));
		b.click();
	}

	@Then("^close application$")
	public void close_application() {
		driver.quit();
		extentFlush();
	}
}
