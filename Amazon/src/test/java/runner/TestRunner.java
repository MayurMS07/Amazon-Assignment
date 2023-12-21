package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = {
		"src/test/resources/features/Amazon.feature", "src/test/resources/features/Amazon_Registration.feature" }, glue = {"stepdefinition", "hooks" }, plugin = { "pretty",
						"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:" }, monochrome = true)
public class TestRunner extends AbstractTestNGCucumberTests {

}