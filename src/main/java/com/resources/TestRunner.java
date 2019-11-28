package com.resources;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/java", glue = "com.stepDefinition", plugin = "html:src/test/resources", dryRun = false, monochrome = true, strict = true, tags = {
		"@homepage" })

public class TestRunner {

	
}
