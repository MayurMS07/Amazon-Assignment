package stepdefinition;

import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;

import com.Amazon.Amazon_AddtoCart;
import com.Amazon.Amazon_CartPage;
import com.Amazon.Amazon_List_Page;
import com.Amazon.Amazon_Search_Page;
import com.Amazon.Amazon_SelectStorePrice;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utility.SeleniumUtility;

public class Amazon_Search_Phone_TestCase extends SeleniumUtility {
	WebDriver driver;
	Amazon_Search_Page AmazonSearch = null;
	Amazon_List_Page AmazonList = null;
	Amazon_SelectStorePrice AmazonStorePrice = null;
	Amazon_AddtoCart AmazonCart = null;
	Amazon_CartPage Amazoncorretprice = null;
	Logger log;
	
	@Given("the user is on the home page")
	public void user_already_in_home_page() {
		log.info("**********user_already_in_Home_page() started**********");
		driver = setUp("chrome", "https://www.amazon.in/");
		if (driver == null)
			log.error("WebDriver not initialized");
		else
			log.info("WebDriver initialized, chrome browser opened");
		AmazonSearch = new Amazon_Search_Page(driver);
		AmazonList = new Amazon_List_Page(driver);
		AmazonStorePrice = new Amazon_SelectStorePrice(driver);
		AmazonCart = new Amazon_AddtoCart(driver);
	}

	@When("the user searches for {string}")
	public void the_user_searches_for(String string) {
		log.info("**********user_Search_Iphone_() started**********");
		AmazonSearch.Search();
		log.info("user in search bar search iphone");
	    throw new io.cucumber.java.PendingException();
	}

	@When("selects {string} from the search results")
	public void selects_from_the_search_results(String string) {
		log.info("**********click_on_navigation_bar() started**********");
		AmazonList.ClickonIphone();
		log.info("user clicked on Iphone15Pro");
	    throw new io.cucumber.java.PendingException();
	}

	@When("goes to the product details page")
	public void goes_to_the_product_details_page() {
		log.info("**********click_on_512Gb Model() started**********");
		AmazonStorePrice.SelectModel();
		log.info("user Select 512Gb model");
	    throw new io.cucumber.java.PendingException();
	}

	/*@When("selects and stores the price in a variable")
	public void selects_and_stores_the_price_in_a_variable() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}*/

	@When("adds the iPhone to the cart")
	public void adds_the_i_phone_to_the_cart() {
		log.info("**********click_on_AddtoCart Option() started**********");
		AmazonCart.AddtoCart();
		log.info("user clicked on Addtocart Option");
	    throw new io.cucumber.java.PendingException();
	}

	@Then("the iPhone should be in the user's cart with the correct price")
	public void the_i_phone_should_be_in_the_user_s_cart_with_the_correct_price() {
		log.info("**********Check_Correct_Price Option() started**********");
		Amazoncorretprice.cartwithcorretprice();
		log.info("user checked correct price");
	    throw new io.cucumber.java.PendingException();
	}	
}
