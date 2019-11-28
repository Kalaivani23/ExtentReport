package com.stepDefinition;

import java.io.IOException;

import com.objectRepository.EditionPage;
import com.resources.BaseClass;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AirCanadaStep extends BaseClass {
	public static EditionPage e;

	@Given("^User verify the url and title$")
	public void user_verify_the_url_and_title() {

		System.out.println(getURL());
		System.out.println(getTitle());
	}

	@Given("^User select edition \"([^\"]*)\"$")
	public void user_select_edition(String edition) {
		implicitlyWait();
		e = new EditionPage();
		if (edition.equals("CA-English")) {
			click(e.getBtnCAEdition());
		} else if (edition.equals("US-English")) {
			click(e.getBtnUSEdition());
		}
	}

	@Given("^User select the trip option, source, destination and date \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_select_the_trip_option_source_destination_and_date_and(String trip, String sou, String des,
			String date) {
		implicitlyWait();
		if (trip.equals("Oneway")) {
			click(e.getBtnOneWay());
			type(e.getTxtSource(), sou);
			click(e.getOptOrigin());
			type(e.getTxtDestination(), des);
			click(e.getOptDestination());
			click(e.getTxtDate());
			EditionPage.date(date);
		}
	}

	@When("^User select passenger count \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_select_passenger_count_and(String a, String ac, String y, String yc, String c, String cc, String i,
			String ic) throws InterruptedException {
		click(e.getTxtPax());
		implicitlyWait();
		EditionPage.paxCount(a, ac, y, yc, c, cc, i, ic);
	}

	@Then("^User click submit button$")
	public void user_click_submit_button() throws InterruptedException, IOException {
		Thread.sleep(10000);
		screenShot("G:\\AirCanadaScreenshot\\Homepage.jpeg");
		click(e.getBtnFind());
	}
}
