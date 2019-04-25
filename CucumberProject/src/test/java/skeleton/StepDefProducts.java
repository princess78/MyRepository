package skeleton;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import Pages.AddProducts;
import Pages.RegistartionPages;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefProducts 
{
	WebDriver driver;
	@Before
	public void before()
	{
		driver=DriverUtility.getdriver("chrome");
		PageFactory.initElements(driver, AddProducts.class);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	}
	@Given("URL of TestMeApp")
	public void url_of_TestMeApp() 
	{
	  driver.get("http://10.232.237.143:443/TestMeApp/login.htm"); 
	}

	@When("admin enters the data for addProducts")
	public void admin_enters_the_data_for_addProducts() 
	{
		AddProducts.Username.sendKeys("admin");
		AddProducts.password.sendKeys("Password456");
		AddProducts.AddProduct.sendKeys("Gadgets");
		AddProducts.Cname.sendKeys("Laptops");
		AddProducts.SCname.sendKeys("HP laptops");
		
		
	}
	
	 

	@Then("admin add the product successfully")
	public void admin_add_the_product_successfully() {


	}

}
