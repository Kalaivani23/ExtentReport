package com.objectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.resources.BaseClass;

public class EditionPage extends BaseClass {

	public EditionPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "enCAEdition")
	private WebElement btnCAEdition;

	@FindBy(id = "enUSEdition")
	private WebElement btnUSEdition;

	@FindBy(xpath = "(//button[@type='submit'])[3]")
	private WebElement btnContinue;

	@FindBy(xpath = "//label[@for='oneWay']")
	private WebElement btnOneWay;

	@FindBy(xpath = "//input[@id='origin_O_0']")
	private WebElement txtSource;

	@FindBy(xpath = "//input[@id='destination_O_0']")
	private WebElement txtDestination;

	@FindBy(xpath = "//li[contains(@id,'Orgin')]")
	private WebElement optOrigin;

	@FindBy(xpath = "//li[contains(@id,'Destination')]")
	private WebElement optDestination;

	@FindBy(xpath = "//div[@data-dev-keyvent-id='returnDate']")
	private WebElement txtDate;

	@FindBy(xpath = "//input[@type='button']")
	private WebElement btnFind;

	@FindBy(xpath = "//div[@data-dev-keyvent-id='passengersInput']")
	private WebElement txtPax;

	public WebElement getTxtPax() {
		return txtPax;
	}

	public WebElement getBtnFind() {
		return btnFind;
	}

	public WebElement getTxtDestination() {
		return txtDestination;
	}

	public WebElement getOptOrigin() {
		return optOrigin;
	}

	public WebElement getOptDestination() {
		return optDestination;
	}

	public WebElement getTxtDate() {
		return txtDate;
	}

	public WebElement getBtnOneWay() {
		return btnOneWay;
	}

	public WebElement getTxtSource() {
		return txtSource;
	}

	public WebElement getBtnCAEdition() {
		return btnCAEdition;
	}

	public WebElement getBtnUSEdition() {
		return btnUSEdition;
	}

	public WebElement getBtnContinue() {
		return btnContinue;
	}
}
