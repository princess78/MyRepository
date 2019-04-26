package skeleton;

import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefCart 
{
	WebDriver driver;
	@Given("URL of TestMeAppurl")
	public void url_of_TestMeAppurl()
    {
		 driver.get("http://10.232.237.143:443/TestMeApp/login.htm"); 
	}

	@When("user enters valid data for add cart")
	public void user_enters_valid_data_for_add_cart() 
	{
	 
	}

	@When("checkout for payment")
	public void checkout_for_payment() {


	}

	@When("fills transaction details")
	public void fills_transaction_details()
	{
	   
	}

	@Then("the product is successfully ordered")
	public void the_product_is_successfully_ordered() 
	{
	  
	}


}
