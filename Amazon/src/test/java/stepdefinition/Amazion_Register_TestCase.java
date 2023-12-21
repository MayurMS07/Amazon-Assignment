package stepdefinition;

import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.Amazon.Registration.Amazon_Register_Page;
import com.Amazon.Registration.Amazon_Register_Submit;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utility.SeleniumUtility;

public class Amazion_Register_TestCase extends SeleniumUtility{
	WebDriver driver;
	
	Amazon_Register_Page registerPage = null;
	Amazon_Register_Submit SubmitBtn = null;
	Logger log;
	
	@Given("the user is on the registration page")
	public void the_user_is_on_the_registration_page() {
		log.info("**********user_already_in_Registration_page() started**********");
		driver = setUp("chrome", "https://www.amazon.in/ap/register");
		if (driver == null)
			log.error("WebDriver not initialized");
		else
			log.info("WebDriver initialized, chrome browser opened");
		registerPage = new Amazon_Register_Page(driver);
	    throw new io.cucumber.java.PendingException();
	}

	@When("the user fills in the registration form with valid information")
	public void the_user_fills_in_the_registration_form_with_valid_information() {
		log.info("**********user_Fill_Form()**********");
		registerPage.registration();
		log.info("user Filled Form");
	    throw new io.cucumber.java.PendingException();
	}

	@When("submits the registration form")
	public void submits_the_registration_form() {
		log.info("**********user_click_on_verify_Mobile_Number()**********");
		SubmitBtn.submit();
		log.info("user clicked on verify mobile number");
	    throw new io.cucumber.java.PendingException();
	}

	@Then("the user should be successfully registered")
	public void the_user_should_be_successfully_registered() {
		log.info("**********user_verify_Login_with_pagetitle()**********");
		Assert.assertEquals(driver.getTitle(), "Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in");
		log.info("user Logged ins");
		throw new io.cucumber.java.PendingException();
	}

}
